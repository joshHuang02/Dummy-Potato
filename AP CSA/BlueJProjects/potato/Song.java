
/**
 * Song objects containing rating, title, and length
 *
 * @author Josh Huang
 * @version 8/28/2019
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double lengthMin;

    /**
     * Constructor for objects of class Song defining rating, title, and length
     * 
     */
    public Song(){
        // initialise instance variables
        rating = 0;
        title = "";
        lengthMin = 0.0;
    }
    
    public void setRating(int rating) {
        if (rating < 0) {
            this.rating = 0;
        } else if (rating > 10) {
            this.rating = 10;
        } else {
            this.rating = rating;
        }
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setLengthMin(double lengthMin) {
        if (lengthMin < 0) {
            this.lengthMin = 0;
        } else {
            this.lengthMin = lengthMin;
        }
    }
    
    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
    
    public double getLengthMin() {
        return lengthMin;
    }
}
