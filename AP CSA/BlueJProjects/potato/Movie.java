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

    /**
     * Constructor for objects of class Movie defining rating, title, and genre
     */
    public Movie(){
        // initialise instance variables
        rating = 0;
        title = "";
        genre = "";
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
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
}