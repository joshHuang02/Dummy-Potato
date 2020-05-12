public class Theater

{

    private Seat[][] theaterSeats;

    /**
     * Constructs a Theater object, as described in part (a).
     * 
     * Precondition: seatsPerRow > 0; tier1Rows > 0; tier2Rows >= 0
     * 
     */

    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows) {
        this.theaterSeats = new Seat[tier1Rows + tier2Rows][seatsPerRow];
        for (int i = 0; i < tier1Rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                theaterSeats[i][j] = Seat(true, 1);
            }
        }
        for (int i = tier1Rows; i < tier2Rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                theaterSeats[i][j] = Seat(true, 2);
            }
        }
    }

    /**
     * Returns true if a seat holder was reassigned from the seat at fromRow,
     * fromCol
     * 
     * to the seat at toRow, toCol; otherwise it returns false, as described in part
     * (b).
     * 
     * Precondition: fromRow, fromCol, toRow, and toCol represent valid row and
     * 
     * column positions in the theater.
     * 
     * The seat at fromRow, fromCol is not available.
     * 
     */

    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) {
        return false;
    }

}