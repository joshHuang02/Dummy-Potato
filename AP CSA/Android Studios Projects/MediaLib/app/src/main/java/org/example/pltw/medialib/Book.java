package org.example.pltw.medialib;

/**
 * Book object containing rating, title, and pages
 *
 * @author Josh Huang
 * @version 8/28/2019
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int pages;

    /**
     * Constructor for objects of class Book, defines rating, title, and pages
     */
    public Book(){
        // initialise instance variables
        rating = 0;
        title = "";
        pages = 0;
    }

    public Book(String title, int rating) {
        this.title = title;
        this.rating = rating;
        this.pages = 0;
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

    public void setPages(int pages) {
        if (pages <= 0) {
            this.pages = 0;
            System.out.println("Alert: Your Book has no Pages\n");
        } else {
            this.pages = pages;
        }
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
