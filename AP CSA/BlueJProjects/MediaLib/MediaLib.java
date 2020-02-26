
/**
 * Contain all of your media items, each category of media will be its own class
 *
 * @author Josh Huang
 * @version 8/22/2019
 */
public class MediaLib {
    public static void main () {
        double totalCost = 0.0;
        double avgCost;
        double avgRating;
        int numSongs = 0;
        int rating = 0;
        //introducion
        System.out.println("Welcome to your Media Library");
        System.out.println("This will contain all of your favorite media items like names of songs and movies.\n");

        //creating objects
        Song song1 = new Song(1, "One", .99, 7);
        numSongs ++;
        totalCost += song1.getPrice();
        rating += song1.getRating();

        Song song2 = new Song(2, "Two", 1.29, 4);
        numSongs ++;
        totalCost += song2.getPrice();
        rating += song2.getRating();

        Song song3 = new Song(3, "Three", .99, 5);
        numSongs ++;
        totalCost += song3.getPrice();
        rating += song3.getRating();

        Song song4 = new Song(4, "Four", 1.29, 6);
        numSongs ++;
        totalCost += song4.getPrice();
        rating += song4.getRating();

        Song song5 = new Song(5, "Five", .99, 9);
        numSongs ++;
        totalCost += song5.getPrice();
        rating += song5.getRating();

        Song song6 = new Song(6, "Six", 1.29, 8);
        numSongs ++;
        totalCost += song6.getPrice();
        rating += song6.getRating();

        Song song7 = new Song(7, "Seven", .99, 9);
        numSongs ++;
        totalCost += song7.getPrice();
        rating += song7.getRating();

        Song song8 = new Song(8, "Eight", .99, 4);
        Song song9 = new Song(9, "Nine", .99, 8);
        Song song10 = new Song(10, "Ten", .99, 5);

        //saving name and rating of songs
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());
        MediaFile.writeString(song8.getTitle() + "|" + song8.getRating());
        MediaFile.writeString(song9.getTitle() + "|" + song9.getRating());
        MediaFile.writeString(song10.getTitle() + "|" + song10.getRating());
        MediaFile.saveAndClose();

        /*
        //Caculations for Song
        totalCost = Math.round(totalCost * 100.0) / 100.0;
        avgCost = Math.round(totalCost / numSongs * 100.0) / 100.0;
        avgRating = Math.round((double)rating / numSongs * 100.0) / 100.0;

        Movie movie1 = new Movie("Movie1", 97);
        Movie movie2 = new Movie("Movie2", 134);
        Movie movie3 = new Movie("Movie3", 199);

        //Book book1 = new Book();

        //testing
        System.out.println("Total Price: " + totalCost + " Dollars");
        System.out.println("Average Price: " + avgCost + " Dollars");
        System.out.println("Average Rating: " + avgRating + "/10");
        System.out.println();
        System.out.println("Movie1 Length: " + movie1.displayLengthMin());
        System.out.println("Movie2 Length: " + movie2.displayLengthMin());
        System.out.println("Movie3 Length: " + movie3.displayLengthMin());

        System.out.println("Song1 Name: " + song1.getTitle());
        System.out.println("Song1 Rating: " + song1.getRating() + "/10");
        System.out.println("Song1 Length: " + song1.getLengthMin());
        System.out.println("Song1 Price: " + song1.getPrice() + " dollars");
        System.out.println("Number of Songs: " + numSongs);
        System.out.println();

        System.out.println("Song1 Name: " + song2.getTitle());
        System.out.println("Song1 Rating: " + song2.getRating() + "/10");
        System.out.println("Song1 Length: " + song2.getLengthMin());
        System.out.println("Song1 Price: " + song2.getPrice() + " dollars");
        System.out.println("Number of Songs: " + numSongs);
        System.out.println();
        System.out.println("Movie1 Name: " + movie1.getTitle());
        System.out.println("Movie1 Rating: " + movie1.getRating() + "/10");
        System.out.println("Movie1 Genre: " + movie1.getGenre());
        System.out.println("Movie1 Length: " + movie1.displayLengthMin());
        System.out.println();

        System.out.println("Book1 Name: " + book1.getTitle());
        System.out.println("Book1 Rating: " + book1.getRating() + "/10");
        System.out.println("Book1 Pages: " + book1.getPages());
         */
    }
}
