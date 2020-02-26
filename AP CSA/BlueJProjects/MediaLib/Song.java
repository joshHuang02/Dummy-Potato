/**
 * Song objects containing rating, title, and length
 *
 * @author Josh Huang
 * @version 8/28/2019
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int songNum;
    private int rating;
    private String title;
    private double lengthMin;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Song defining rating, title, and length
     * @param title Accpets a string and price Accpects a double
     */
    public Song(){
        // initialise instance variables
        rating = 0;
        title = "";
        lengthMin = 0.0;
        price = 0.0;
        favorite = false;
    }
    
    /**
     * This constructor sets the song's title, price and rating
     * @param title Accepts a String
     * @param price Accepts a double
     * @param rating Accepts a int
     */
    public Song(int songNum, String title, double price, int rating) {
        this.songNum = songNum;
        this.title = title;
        this.price = price;
        this.rating =rating;
    }
    
    public Song(String title) {
        this.title = title;
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

    /**
     * This constructor sets the price of the Song
     * @param price Accepts a double for the price of the song
     */
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    /**
     * Version set
     * This method makes the song either a favorite or not
     */
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    /**
     * Version hard code
     * This method sets a song as a favorited song
     */
    public void addToFavorites() {
        this.favorite = true;
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

    /**
     * This method returns the price of the song 
     */
    public double getPrice() {
        return price;
    }
}
