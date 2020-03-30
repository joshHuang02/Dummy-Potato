import java.util.*;

public class checkerboard {
    // board elements
    private static String[][] board = new String[8][8];
    // count of pieces remaining on the baord for each side
    private static int blackPieceCount = 12;
    private static int whitePieceCount = 12;
    // this keeps track of turns to determine possible moves
    private static boolean blackTurn = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        System.out.println();
        newBoard();
        printBoard();
        // while none of the scores are 0, run the game, prints the board at the the end
        // of each loop
        while (Math.min(blackPieceCount, whitePieceCount) != 0) {
            if (blackTurn) {
                System.out.print("BLACK Turn: ");
            } else {
                System.out.print("WHITE Turn: ");
            }
            String move = scan.nextLine();
            // switch to see what the input string is
            switch (move) {
                // restarts the game
                case "restart":
                    System.out.println("Game restarted. ");
                    newBoard();
                    break;
                // type "help" to see all your possible moves
                case "help":
                    System.out.print("You have these possible move(s): ");
                    System.out.println(Arrays.toString(allPossibleMoves().toArray()));
                    break;
                // default is when you give a coordinate
                default:
                    // coordinates can only be numeber and be only 4 characters long
                    if (!move.matches("[0-9]+") || move.length() != 4) {
                        System.out.println("Invalid Coordinates");
                    } else {
                        // call move piece. If move piece returns true, then switch turns
                        // Note: will not switch turns when another jump is possible
                        if (movePiece((int) move.charAt(0) - 48, (int) move.charAt(1) - 48, (int) move.charAt(2) - 48,
                                (int) move.charAt(3) - 48)) {
                            blackTurn = !blackTurn;
                        }
                        // when a piece reach the other side of the board, make it a king
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
        // when a side runs out of pieces, the other side wins, also ends the program
        if (blackPieceCount == 0) {
            System.out.println("WHITE wins!");
        } else {
            System.out.println("BLACK wins!");
        }
    };

    private static boolean movePiece(int x0, int y0, int xf, int yf) {
        // checks if the initial square is correct color based on what turn it is
        if (!(("BLACK".equals(board[x0][y0]) && blackTurn) || ("BKING".equals(board[x0][y0]) && blackTurn)
                || ("WHITE".equals(board[x0][y0]) && !blackTurn) || ("WKING".equals(board[x0][y0]) && !blackTurn))) {
            System.out.println(
                    "Only BLACK pieces can be moved on BLACK Turn and only WHITE pieces can be moved on WHITE Turn");
            return false;
        }
        ArrayList<String> allPossibleMoves = allPossibleMoves();
        // makes the coordinates into string for matching
        String moveCoordinates = Integer.toString(x0) + Integer.toString(y0) + Integer.toString(xf)
                + Integer.toString(yf);
        // if move is a step (move by one square) and is a possible move
        if (Math.abs(xf - x0) <= 1 && Math.abs(yf - y0) <= 1 && allPossibleMoves.contains(moveCoordinates)) {
            board[xf][yf] = board[x0][y0];
            board[x0][y0] = null;
            return true;
            // else if move is a jump (over opponent piece) and is a possible move
        } else if (allPossibleMoves.contains(moveCoordinates)) {
            board[xf][yf] = board[x0][y0];
            board[x0][y0] = null;
            board[(x0 + xf) / 2][(y0 + yf) / 2] = null; // makes the piece that was jumped over into null
            // decrese opponent piece count by one
            if (blackTurn) {
                whitePieceCount--;
            } else {
                blackPieceCount--;
            }

            // else if final coordinates are out of bounds
        } else {
            System.out.println("Illegal move, type 'help' for all possible moves");
            return false;
        }
        // implements rule that jumps must be chained if another jump is possible
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null && availableJumps(i, j).size() != 0) {
                    return false; // returning false will NOT switch turns
                }
            }
        }
        return true; // returning true will switch turns
    }

    // finds all possible moves of every one of your piece based on turn
    private static ArrayList<String> allPossibleMoves() {
        // possibleMoves stores all possible moves as String coordinates (includes
        // initial and final coordinates)
        ArrayList<String> possibleMoves = new ArrayList<>();
        // for loop every square to see if there is any available jumps
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ArrayList<String> availableJumps = availableJumps(i, j);
                if (board[i][j] != null && availableJumps.size() != 0) {
                    for (String coordiate : availableJumps) {
                        possibleMoves.add(Integer.toString(i) + Integer.toString(j) + coordiate);
                    }
                }
            }
        }
        // if there is no jumps (because you must jump if there is a possible jump)
        if (possibleMoves.size() == 0) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    ArrayList<String> availableMoves = availableSteps(i, j);
                    if (board[i][j] != null && availableMoves.size() != 0) {
                        for (String coordiate : availableMoves) {
                            possibleMoves.add(Integer.toString(i) + Integer.toString(j) + coordiate);
                        }
                    }
                }
            }
        }
        // reverses the order of the help array to make it more readable for black side
        if (blackTurn)
            Collections.reverse(possibleMoves);
        return possibleMoves;
    }

    // all possible steps (move by one square) from initial coordinates
    private static ArrayList<String> availableSteps(int x0, int y0) {
        ArrayList<String> availableMoves = new ArrayList<>();
        // if is black turn and initial square is black piece
        if (blackTurn && ("BLACK".equals(board[x0][y0]) || "BKING".equals(board[x0][y0]))) {
            // checks the left side move
            if (x0 < 7 && y0 > 0 && board[x0 + 1][y0 - 1] == null)
                availableMoves.add(Integer.toString(x0 + 1) + Integer.toString(y0 - 1));
            // check right side move
            if (x0 < 7 && y0 < 7 && board[x0 + 1][y0 + 1] == null)
                availableMoves.add(Integer.toString(x0 + 1) + Integer.toString(y0 + 1));
            // if piece if a king then check backwards moves
            if ("BKING".equals(board[x0][y0])) {
                // check left side
                if (x0 > 0 && y0 > 0 && board[x0 - 1][y0 - 1] == null)
                    availableMoves.add(Integer.toString(x0 - 1) + Integer.toString(y0 - 1));
                // check right side
                if (x0 > 0 && y0 < 7 && board[x0 - 1][y0 + 1] == null)
                    availableMoves.add(Integer.toString(x0 - 1) + Integer.toString(y0 + 1));
            }
        } else if (!blackTurn && ("WHITE".equals(board[x0][y0]) || "WKING".equals(board[x0][y0]))) {
            if (x0 > 0 && y0 > 0 && board[x0 - 1][y0 - 1] == null)
                availableMoves.add(Integer.toString(x0 - 1) + Integer.toString(y0 - 1));
            if (x0 > 0 && y0 < 7 && board[x0 - 1][y0 + 1] == null)
                availableMoves.add(Integer.toString(x0 - 1) + Integer.toString(y0 + 1));
            if ("WKING".equals(board[x0][y0])) {
                if (x0 < 7 && y0 > 0 && board[x0 + 1][y0 - 1] == null)
                    availableMoves.add(Integer.toString(x0 + 1) + Integer.toString(y0 - 1));
                if (x0 < 7 && y0 < 7 && board[x0 + 1][y0 + 1] == null)
                    availableMoves.add(Integer.toString(x0 + 1) + Integer.toString(y0 + 1));
            }
        }
        return availableMoves;
    }

    // all possible jumps (jump over opponent piece) from initial coordinates
    private static ArrayList<String> availableJumps(int x0, int y0) {
        ArrayList<String> availableJumps = new ArrayList<>();
        if (blackTurn) {
            if ("BLACK".equals(board[x0][y0]) || "BKING".equals(board[x0][y0])) {
                if (x0 < 6 && y0 > 1 && ("WHITE".equals(board[x0 + 1][y0 - 1]) || "WKING".equals(board[x0 + 1][y0 - 1]))
                        && board[x0 + 2][y0 - 2] == null)
                    availableJumps.add(Integer.toString(x0 + 2) + Integer.toString(y0 - 2));

                if (x0 < 6 && y0 < 6 && ("WHITE".equals(board[x0 + 1][y0 + 1]) || "WKING".equals(board[x0 + 1][y0 + 1]))
                        && board[x0 + 2][y0 + 2] == null)
                    availableJumps.add(Integer.toString(x0 + 2) + Integer.toString(y0 + 2));
            }
            if ("BKING".equals(board[x0][y0])) {
                if (x0 > 1 && y0 > 1 && ("WHITE".equals(board[x0 - 1][y0 - 1]) || "WKING".equals(board[x0 - 1][y0 - 1]))
                        && board[x0 - 2][y0 - 2] == null)
                    availableJumps.add(Integer.toString(x0 - 2) + Integer.toString(y0 - 2));

                if (x0 > 1 && y0 < 6 && ("WHITE".equals(board[x0 - 1][y0 + 1]) || "WKING".equals(board[x0 - 1][y0 + 1]))
                        && board[x0 - 2][y0 + 2] == null)
                    availableJumps.add(Integer.toString(x0 - 2) + Integer.toString(y0 + 2));
            }
        } else {
            if ("WHITE".equals(board[x0][y0]) || "WKING".equals(board[x0][y0])) {
                if (x0 > 1 && y0 > 1 && ("BLACK".equals(board[x0 - 1][y0 - 1]) || "BKING".equals(board[x0 - 1][y0 - 1]))
                        && board[x0 - 2][y0 - 2] == null)
                    availableJumps.add(Integer.toString(x0 - 2) + Integer.toString(y0 - 2));
                if (x0 > 1 && y0 < 6 && ("BLACK".equals(board[x0 - 1][y0 + 1]) || "BKING".equals(board[x0 - 1][y0 + 1]))
                        && board[x0 - 2][y0 + 2] == null)
                    availableJumps.add(Integer.toString(x0 - 2) + Integer.toString(y0 + 2));
                System.out.println(x0 - 2);
            }
            if ("WKING".equals(board[x0][y0])) {
                if (x0 < 6 && y0 > 1 && ("BLACK".equals(board[x0 + 1][y0 - 1]) || "BKING".equals(board[x0 + 1][y0 - 1]))
                        && board[x0 + 2][y0 - 2] == null)
                    availableJumps.add(Integer.toString(x0 + 2) + Integer.toString(y0 - 2));
                if (x0 < 6 && y0 < 6 && ("BLACK".equals(board[x0 + 1][y0 + 1]) || "BKING".equals(board[x0 + 1][y0 + 1]))
                        && board[x0 + 2][y0 + 2] == null)
                    availableJumps.add(Integer.toString(x0 + 2) + Integer.toString(y0 + 2));
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

    // old movePiece
    private static boolean oldMovePiece(int x0, int y0, int xf, int yf) {
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
                        ArrayList<String> availableJumps = availableJumps(i, j);
                        if (board[i][j] != null && availableJumps.size() != 0) {
                            for (String coordiate : availableJumps) {
                                requiredJumps.add(Integer.toString(i) + Integer.toString(j) + coordiate);
                            }
                        }
                    }
                }

                if (!((board[x0][y0].equals("BLACK") && blackTurn) || (board[x0][y0].equals("BKING") && blackTurn)
                        || (board[x0][y0].equals("WHITE") && !blackTurn)
                        || (board[x0][y0].equals("WKING") && !blackTurn))) {
                    System.out.println(
                            "Only BLACK pieces can be moved on BLACK Turn and only WHITE pieces can bemoved on WHITE Turn");
                    return false;
                } else if (Math.abs(xf - x0) <= 1 && Math.abs(yf - y0) <= 1 && board[xf][yf] == null) {
                    if (requiredJumps.size() != 0) {
                        System.out.print("You must pick one of these move(s): ");
                        System.out.println(Arrays.toString(requiredJumps.toArray()));
                        return false;
                    }
                    ArrayList<String> availableMoves = availableSteps(x0, y0);
                    if (availableMoves.contains(Integer.toString(xf) + Integer.toString(yf))) {
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
                    ArrayList<String> availableJumps = availableJumps(x0, y0);
                    if (availableJumps.contains(Integer.toString(xf) + Integer.toString(yf))) {
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
}
