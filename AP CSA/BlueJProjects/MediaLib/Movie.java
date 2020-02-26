/**
 * Movie objects containing rating, title, and genre
 *
 * @author Josh Huang
 * @version 8/28/2019
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private String genre;
    private int lengthMin;

    /**
     * Constructor for objects of class Movie defining rating, title, and genre
     */
    public Movie(){
        // initialise instance variables
        rating = 0;
        title = "";
        genre = "";
        lengthMin = 0;
    }
    
    public Movie(String title, int lengthMin) {
        this.title = title;
        this.lengthMin = lengthMin;
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
        if (title == "Iron Man") {
            this.rating = 10;
        }
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setLengthMin(int lengthMin) {
        this.lengthMin = lengthMin;
    }
    
    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getLengthMin() {
        return lengthMin;
    }
    
    public String displayLengthMin() {
        int hours = 0;
        int minutes = 0;
        hours = this.lengthMin / 60;
        minutes = this.lengthMin % 60;
        if (hours == 1) {
            return hours + "Hour and " + minutes + " Minutes";
        } else {
            return hours + " Hours and " + minutes + " Minutes";
        }
    }
}