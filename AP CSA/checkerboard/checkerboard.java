import java.util.*;

public class checkerboard {
    private static String[][] board = new String[8][8];

    public static void main(String[] args) {
        int[][] b = new int[7][2];
        for (int[] a : b) {
            for (int i : a) {
                System.out.print(i);
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        System.out.println();
        newBoard();
        printBoard();
        while (true) {
            String move = scan.nextLine();
            if (move.equals("exit")) {
                break;
            } else if (move.equals("restart")) {
                System.out.println("Game restarted. ");
                newBoard();
            } else {
                if (move.length() != 4) {
                    System.out.println("Invalid Coordinates");
                } else {
                    movePiece((int) move.charAt(0) - 48, (int) move.charAt(1) - 48, (int) move.charAt(2) - 48,
                            (int) move.charAt(3) - 48);
                }
            }
            printBoard();
        }
        scan.close();

    };

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
            System.out.println("|");
            System.out.println("  |_____|_____|_____|_____|_____|_____|_____|_____|");
            rowNum++;
        }
    }

    public static void movePiece(int x0, int y0, int xf, int yf) {
        boolean checkSquareIsOccupied = board[x0][y0] != board[xf][yf];
        boolean checkDiagonalMove = x0 != xf && y0 != yf;
        boolean checkMoveInRange = Math.abs(xf - x0) < 3 && Math.abs(yf - y0) < 3;
        if (checkSquareIsOccupied && checkDiagonalMove && checkMoveInRange) {
            if (Math.abs(xf - x0) < 2 && Math.abs(yf - y0) < 2) {
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
                        }
                        break;
                }
            }
        } else {
            System.out.println("Illegal move. ");
        }
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
}
