/**
 * Contain all of your favorite media items, each category of media will be its own class
 *
 * @author Josh Huang
 * @version 8/22/2019
 */
public class MediaLib {
    public static void main (String[] args) {
        System.out.println("Welcome to your Media Library");
        System.out.println("This will contain all of your favorite media items like names of songs and movies.\n");
        
        Song song1 = new Song();
        Movie movie1 = new Movie();
        Book book1 = new Book();
        
        //setting
        song1.setTitle("Johnny B. Goods");
        song1.setRating(666);
        song1.setLengthMin(-4.55);
        movie1.setTitle("Iron Man");
        movie1.setRating(10);
        movie1.setGenre("Action");
        book1.setTitle("Yo That's Whack!");
        book1.setRating(7);
        book1.setPages(420);
        
        //testing
        System.out.println("Song1 Name: " + song1.getTitle());
        System.out.println("Song1 Rating: " + song1.getRating());
        System.out.println("Song1 Length: " + song1.getLengthMin());
        System.out.println();
        System.out.println("Movie1 Name: " + movie1.getTitle());
        System.out.println("Movie1 Rating: " + movie1.getRating());
        System.out.println("Movie1 Genre: " + movie1.getGenre());
        System.out.println();
        System.out.println("Book1 Name: " + book1.getTitle());
        System.out.println("Book1 Rating: " + book1.getRating());
        System.out.println("Book1 Pages: " + book1.getPages());
    }
}
