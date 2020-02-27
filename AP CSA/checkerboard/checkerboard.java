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
            
            board[xf][yf] = board[x0][y0];
            board[x0][y0] = null;
        } else {
            System.out.println("Illegal move. ");
        }
    }
}