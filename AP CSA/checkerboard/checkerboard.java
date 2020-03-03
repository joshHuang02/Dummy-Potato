import java.util.*;

public class checkerboard {
    private static String[][] board = new String[8][8];

    public static void main(String[] args) {
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
                printBoard();
            } else {
                movePiece((int) move.charAt(0) - 48, (int) move.charAt(1) - 48, (int) move.charAt(2) - 48,
                        (int) move.charAt(3) - 48);
                printBoard();
            }
        }

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
                boolean ableToJump = false;
                if (xf-x0 > 0 && yf-y0 > 0 && board[xf-1][yf-1] != board[x0][y0] && board[xf-1][yf-1] != null) {
                    ableToJump = true;
                } else if (xf-x0 < 0 && yf-y0 > 0 && board[xf+1][yf-1] != board[x0][y0] && board[xf+1][yf-1] != null) {
                    ableToJump = true;
                } else if (xf-x0 > 0 && yf-y0 < 0 && board[xf-1][yf+1] != board[x0][y0] && board[xf-1][yf+1] != null) {
                    ableToJump = true;
                } else if (xf-x0 < 0 && yf-y0 < 0 && board[xf+1][yf+1] != board[x0][y0] && board[xf+1][yf+1] != null) {
                    ableToJump = true;
                }
                if (ableToJump) {
                    board[xf][yf] = board[x0][y0];
                    board[x0][y0] = null;
                } else {
                    System.out.println("Cannot jump. ");
                }
            }
            
        } else {
            System.out.println("Illegal move. ");
        }
    }

    private static boolean canJump(int x0, int y0) {
        if (board[x0][y0].equals("BLACK")) {
            // ArrayList<Boolean> availableJumps = new ArrayList<Boolean>();
            int availableJumps = 0;
            try {
                String bottomLeft = board[x0-1][y0-1];
                String jumpLeft = board[x0-2][y0-2];
            } catch(Exception e) {}
        
            String bottomRight = board[x0+1][y0-1];
            String jumpRight = board[x0+2][y0-2];
            // if (bottomRight.equals("WHITE") && jumpRight == null) availableJumps++;
            // if (bottomLeft.equals("WHITE") && jumpLeft == null) availableJumps++;
        }
        return true;
    }
}
