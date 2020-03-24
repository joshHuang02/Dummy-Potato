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
        while (Math.min(blackPieceCount, whitePieceCount) != 0) {
            if (blackTurn) {
                System.out.print("BLACK Turn: ");
            } else {
                System.out.print("WHITE Turn: ");
            }
            String move = scan.nextLine();
            if (move.equals("exit"))
                break;
            switch (move) {
                case "":
                    System.out.println("Please type coordiates");
                    break;
                case "restart":
                    System.out.println("Game restarted. ");
                    newBoard();
                    break;
                default:
                    if (!move.matches("[0-9]+") || move.length() != 4) {
                        System.out.println("Invalid Coordinates");
                    } else {
                        if (movePiece((int) move.charAt(0) - 48, (int) move.charAt(1) - 48, (int) move.charAt(2) - 48,
                                (int) move.charAt(3) - 48)) {
                            blackTurn = !blackTurn;
                        }
                        for (int i = 0; i < 8; i++) {
                            if ("WHITE".equals(board[0][i]))
                                board[0][i] = "WKING";
                            if ("BLACK".equals(board[7][i]))
                                board[7][i] = "BKING";
                        }
                    }
                    break;
            }
            printBoard();
        }
        if (blackPieceCount == 0) {
            System.out.println("WHITE wins!");
        } else {
            System.out.println("BLACK wins!");
        }
    };

    public static boolean movePiece(int x0, int y0, int xf, int yf) {
        if (Math.abs(xf - x0) < 3 && Math.abs(yf - y0) < 3 && Math.max(Math.max(Math.max(x0, xf), y0), yf) <= 7
                && Math.min(Math.min(Math.min(x0, xf), y0), yf) >= 0) {
            boolean squareIsNotOwnPiece = board[x0][y0] != board[xf][yf];
            boolean moveIsDiagonal = (x0 != xf && y0 != yf);
            boolean initialSquareIsOccupied = board[x0][y0] != null;
            if (squareIsNotOwnPiece && moveIsDiagonal && initialSquareIsOccupied) {
                // implements rule that jump must be made if jump is possible
                ArrayList<String> requiredJumps = new ArrayList<>();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        ArrayList<Integer> availableJumps = availableJumps(i, j);
                        if (board[i][j] != null && availableJumps.size() != 0) {
                            for ( int coordiate : availableJumps) {
                                requiredJumps.add(Integer.toString(i) + Integer.toString(j) + Integer.toString(coordiate));
                            }
                        }
                    }
                }

                if (!((board[x0][y0].equals("BLACK") && blackTurn) || (board[x0][y0].equals("BKING") && blackTurn)
                        || (board[x0][y0].equals("WHITE") && !blackTurn)
                        || (board[x0][y0].equals("WKING") && !blackTurn))) {
                    System.out.println(
                            "Only BLACK pieces can be moved on BLACK Turn and only WHITE pieces can be moved on WHITE Turn");
                    return false;
                } else if (Math.abs(xf - x0) <= 1 && Math.abs(yf - y0) <= 1 && board[xf][yf] == null) {
                    if (requiredJumps.size() != 0) {
                        System.out.print("You must pick one of these move(s): ");
                        System.out.println(Arrays.toString(requiredJumps.toArray()));
                        return false;
                    }
                    ArrayList<Integer> availableMoves = availableMoves(x0, y0);
                    if (availableMoves.contains(xf * 10 + yf)) {
                        board[xf][yf] = board[x0][y0];
                        board[x0][y0] = null;
                        // implements rule that jumps must be chained if another jump is possible
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                if (board[i][j] != null && i != xf && j != yf && availableJumps(i, j).size() != 0) {
                                    // System.out.println(Arrays.toString(availableJumps(i, j).toArray()));
                                    return false;
                                }
                            }
                        }
                    } else {
                        System.out.println("Illegal move");
                        return false;
                    }
                } else {
                    ArrayList<Integer> availableJumps = availableJumps(x0, y0);
                    if (availableJumps.contains(xf * 10 + yf)) {
                        board[xf][yf] = board[x0][y0];
                        board[x0][y0] = null;
                        board[(x0 + xf) / 2][(y0 + yf) / 2] = null;
                        if (blackTurn) {
                            whitePieceCount--;
                        } else {
                            blackPieceCount--;
                        }
                        // implements rule that jumps must be chained if another jump is possible
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                if (board[i][j] != null && availableJumps(i, j).size() != 0) {
                                    // System.out.println(Arrays.toString(availableJumps(i, j).toArray()));
                                    return false;
                                }
                            }
                        }
                    } else {
                        System.out.println("Illegal move");
                        return false;
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

    private static ArrayList<Integer> availableMoves(int x0, int y0) {
        ArrayList<Integer> availableMoves = new ArrayList<Integer>();
        if (blackTurn) {
            // checks the left side move
            if (x0 < 7 && y0 > 0 && board[x0 + 1][y0 - 1] == null)
                availableMoves.add((x0 + 1) * 10 + (y0 - 1));
            // check right side move
            if (x0 < 7 && y0 < 7 && board[x0 + 1][y0 + 1] == null)
                availableMoves.add((x0 + 1) * 10 + (y0 + 1));
            // if piece if a king then check backwards moves
            if ("KING".equals(board[x0][y0].substring(1))) {
                if (x0 > 0 && y0 > 0 && board[x0 - 1][y0 - 1] == null)
                    availableMoves.add((x0 - 1) * 10 + (y0 - 1));
                if (x0 > 0 && y0 < 7 && board[x0 - 1][y0 + 1] == null)
                    availableMoves.add((x0 - 1) * 10 + (y0 + 1));
            }
        } else {
            if (x0 > 0 && y0 > 0 && board[x0 - 1][y0 - 1] == null)
                availableMoves.add((x0 - 1) * 10 + (y0 - 1));
            if (x0 > 0 && y0 < 7 && board[x0 - 1][y0 + 1] == null)
                availableMoves.add((x0 - 1) * 10 + (y0 + 1));
            if ("KING".equals(board[x0][y0].substring(1))) {
                if (x0 < 7 && y0 > 0 && board[x0 + 1][y0 - 1] == null)
                    availableMoves.add((x0 + 1) * 10 + (y0 - 1));
                if (x0 < 7 && y0 < 7 && board[x0 + 1][y0 + 1] == null)
                    availableMoves.add((x0 + 1) * 10 + (y0 + 1));
            }
        }
        return availableMoves;
    }

    private static ArrayList<Integer> availableJumps(int x0, int y0) {
        ArrayList<Integer> availableJumps = new ArrayList<Integer>();
        if (blackTurn) {
            if ("BLACK".equals(board[x0][y0])) {
                if (x0 < 6 && y0 > 1 && ("WHITE".equals(board[x0 + 1][y0 - 1]) || "WKING".equals(board[x0 + 1][y0 - 1]))
                        && board[x0 + 2][y0 - 2] == null)
                    availableJumps.add((x0 + 2) * 10 + (y0 - 2));

                if (x0 < 6 && y0 < 6 && ("WHITE".equals(board[x0 + 1][y0 + 1]) || "WKING".equals(board[x0 + 1][y0 + 1]))
                        && board[x0 + 2][y0 + 2] == null)
                    availableJumps.add((x0 + 2) * 10 + (y0 + 2));

            } else if ("BKING".equals(board[x0][y0])) {
                if (x0 > 1 && y0 > 1 && ("WHITE".equals(board[x0 - 1][y0 - 1]) || "WKING".equals(board[x0 - 1][y0 - 1]))
                        && board[x0 - 2][y0 - 2] == null)
                    availableJumps.add((x0 - 2) * 10 + (y0 - 2));

                if (x0 > 1 && y0 < 6 && ("WHITE".equals(board[x0 - 1][y0 + 1]) || "WKING".equals(board[x0 - 1][y0 + 1]))
                        && board[x0 - 2][y0 + 2] == null)
                    availableJumps.add((x0 - 2) * 10 + (y0 + 2));
            }
        } else {
            if ("WHITE".equals(board[x0][y0])) {
                if (x0 > 1 && y0 > 1 && ("BLACK".equals(board[x0 - 1][y0 - 1]) || "BKING".equals(board[x0 - 1][y0 - 1]))
                        && board[x0 - 2][y0 - 2] == null)
                    availableJumps.add((x0 - 2) * 10 + (y0 - 2));
                if (x0 > 1 && y0 < 6 && ("BLACK".equals(board[x0 - 1][y0 + 1]) || "BKING".equals(board[x0 - 1][y0 + 1]))
                        && board[x0 - 2][y0 + 2] == null)
                    availableJumps.add((x0 - 2) * 10 + (y0 + 2));
            } else if ("WKING".equals(board[x0][y0])) {
                if (x0 < 6 && y0 > 1 && ("BLACK".equals(board[x0 + 1][y0 - 1]) || "BKING".equals(board[x0 + 1][y0 - 1]))
                        && board[x0 + 2][y0 - 2] == null)
                    availableJumps.add((x0 + 2) * 10 + (y0 - 2));
                if (x0 < 6 && y0 < 6 && ("BLACK".equals(board[x0 + 1][y0 + 1]) || "BKING".equals(board[x0 + 1][y0 + 1]))
                        && board[x0 + 2][y0 + 2] == null)
                    availableJumps.add((x0 + 2) * 10 + (y0 + 2));
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
        blackTurn = true;
    }
}
