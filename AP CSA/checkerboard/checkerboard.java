import java.util.*;

public class checkerboard {
    private static String[][] board = new String[8][8];
    private static int blackPieceCount = 12;
    private static int whitePieceCount = 12;
    private static boolean blackTurn = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        System.out.println();
        newBoard();
        printBoard();
        while (true) {
            if (blackTurn) {
                System.out.print("BLACK Turn: ");
            } else {
                System.out.print("WHITE Turn: ");
            }
            String move = scan.nextLine();
            if (move.equals("exit")) {
                break;
            } else if (move.equals("restart")) {
                System.out.println("Game restarted. ");
                newBoard();
            } else {
                if (move.matches("[0-9]+") && move.length() != 4) {
                    System.out.println("Invalid Coordinates");
                } else {
                    if (movePiece((int) move.charAt(0) - 48, (int) move.charAt(1) - 48, (int) move.charAt(2) - 48,
                            (int) move.charAt(3) - 48)) {
                        blackTurn = !blackTurn;
                    }
                }
            }
            printBoard();
        }
        scan.close();
    };

    public static boolean movePiece(int x0, int y0, int xf, int yf) {
        if (Math.abs(xf - x0) < 3 && Math.abs(yf - y0) < 3 && Math.max(Math.max(Math.max(x0, xf), y0), yf) <= 7
                && Math.min(Math.min(Math.min(x0, xf), y0), yf) >= 0) {
            boolean squareIsNotOwnPiece = board[x0][y0] != board[xf][yf];
            boolean moveIsDiagonal = (x0 != xf && y0 != yf);
            boolean initialSquareIsOccupied = board[x0][y0] != null;
            if (squareIsNotOwnPiece && moveIsDiagonal && initialSquareIsOccupied) {
                if (!((board[x0][y0].equals("BLACK") && blackTurn) || (board[x0][y0].equals("WHITE") && !blackTurn))) {
                    System.out.println(
                            "Only BLACK pieces can be moved on BLACK Turn and only WHITE pieces can be moved on WHITE Turn");
                    return false;
                } else if (Math.abs(xf - x0) < 2 && Math.abs(yf - y0) < 2 && board[xf][yf] == null) {
                    board[xf][yf] = board[x0][y0];
                    board[x0][y0] = null;
                } else {
                    boolean[] availableJumps = canJump(x0, y0);
                    switch (board[x0][y0]) {
                        case "BLACK":
                            if (xf - x0 > 0 && yf - y0 < 0 && availableJumps[0] == true) {
                                board[xf][yf] = board[x0][y0];
                                board[x0][y0] = null;
                            } else if (xf - x0 > 0 && yf - y0 > 0 && availableJumps[1] == true) {
                                board[xf][yf] = board[x0][y0];
                                board[x0][y0] = null;
                            } else {
                                System.out.println("Cannot jump");
                                return false;
                            }
                            break;
                        case "WHITE":
                            if (xf - x0 < 0 && yf - y0 < 0 && availableJumps[0] == true) {
                                board[xf][yf] = board[x0][y0];
                                board[x0][y0] = null;
                            } else if (xf - x0 < 0 && yf - y0 > 0 && availableJumps[1] == true) {
                                board[xf][yf] = board[x0][y0];
                                board[x0][y0] = null;
                            } else {
                                System.out.println("Cannot jump");
                                return false;
                            }
                            break;
                    }
                }
            } else {
                System.out.println("Illegal move. ");
                return false;
            }
        } else {
            System.out.println("Invalid coordinates. ");
            return false;
        }
        return true;
    }

    private static boolean[] canJump(int x0, int y0) {
        boolean[] availableJumps = { false, false };
        if (x0 < 6 && x0 > 1) {
            if ("BLACK".equals(board[x0][y0]) && "WHITE".equals(board[x0 + 1][y0 - 1])
                    && board[x0 + 2][y0 - 2] == null) {
                availableJumps[0] = true;
            } else if ("WHITE".equals(board[x0][y0]) && "BLACK".equals(board[x0 + 1][y0 - 1])
                    && board[x0 - 2][y0 - 2] == null) {
                availableJumps[0] = true;
            }
            if ("BLACK".equals(board[x0][y0]) && "WHITE".equals(board[x0 + 1][y0 + 1])
                    && board[x0 + 2][y0 + 2] == null) {
                availableJumps[1] = true;
            } else if ("WHITE".equals(board[x0][y0]) && "BLACK".equals(board[x0 - 1][y0 + 1])
                    && board[x0 - 2][y0 + 2] == null) {
                availableJumps[1] = true;
            }

        }
        return availableJumps;
    }

    private static void printBoard() {
        System.out.println("     0     1     2     3     4     5     6     7   ");
        System.out.println("  _________________________________________________");
        int rowNum = 0;
        for (String[] row : board) {
            System.out.println("  |     |     |     |     |     |     |     |     |");
            System.out.print(rowNum + " ");
            for (String s : row) {
                if (s == null) {
                    System.out.print("|     ");
                } else {
                    System.out.print("|" + s + "");
                }
            }
            System.out.print("|");
            if (rowNum == 3) {
                System.out.print(" BLACK Pieces: " + blackPieceCount);
            } else if (rowNum == 4) {
                System.out.print(" WHITE Pieces: " + whitePieceCount);
            }
            System.out.println();
            System.out.println("  |_____|_____|_____|_____|_____|_____|_____|_____|");
            rowNum++;
        }
    }

    public static void newBoard() {
        for (int i = 1; i < 8; i += 2) {
            board[0][i] = "BLACK";
            board[2][i] = "BLACK";
            board[3][i] = null;
            board[4][i] = null;
        }
        for (int i = 0; i < 8; i += 2) {
            board[1][i] = "BLACK";
            board[3][i] = null;
            board[4][i] = null;
        }
        for (int i = 0; i < 8; i += 2) {
            board[5][i] = "WHITE";
            board[7][i] = "WHITE";
        }
        for (int i = 1; i < 8; i += 2) {
            board[6][i] = "WHITE";
        }
        blackPieceCount = 12;
        whitePieceCount = 12;
    }
}
