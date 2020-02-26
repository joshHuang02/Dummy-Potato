
public class checkerboard {
    private static String[][] board = new String[8][8];

    public static void main(String[] args) {
        System.out.println();
        newBoard();
    };

    public static void newBoard() {
        for (int i = 1; i < 8; i += 2) {
            board[0][i] = "BLACK";
            board[2][i] = "BLACK";
        }
        for (int i = 0; i < 8; i += 2) {
            board[1][i] = "BLACK";
        }
        for (int i = 0; i < 8; i += 2) {
            board[5][i] = "WHITE";
            board[7][i] = "WHITE";
        }
        for (int i = 1; i < 8; i += 2) {
            board[6][i] = "WHITE";
        }

        for (String[] row : board) {
            for (String s : row) {
                if (s == null) {
                    System.out.print("|     |");
                } else {
                    System.out.print("|" + s + "|");
                }
                System.out.println();
            }
        }
    }

}