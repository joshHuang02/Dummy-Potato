
/**
 * Manipulating MediaLib songs with arrays
 *
 * @author Josh Huang
 * @version 11/15/19
 */
public class ArrayMediaLib
{
    public static void main() {
        System.out.println("\n------------------Task 4 to 10--------------------------");
        String[] share = {"J", "Jo", "Ja", "Jd", "Ji"};
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(share[i]);
            } catch (Exception e) {}
        }

        System.out.println("\n------------------Task 11 to 14--------------------------");
        int[] daysBtwnPurchase = {2, 3, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int days : daysBtwnPurchase) {
            total += days;
        }
        System.out.println(total / daysBtwnPurchase.length);

        //System.out.println("\n------------------Task 15 to 16--------------------------");
        Song[] topTenSongs = {new Song("The Twist"), new Song("Smooth"),
                new Song("Mack The Knife"), new Song("How Do I Live"),
                new Song("Party Rock Anthem"), new Song("I Gotta  Feeling"),
                new Song("Macarena"), new Song("You Light Up My Life"),
                new Song("Hey Jude"), new Song("We Belong Together")};        

        System.out.println("\n------------------Task 17 to 21--------------------------");
        //change array
        System.out.println("\n--Before--");

        for (Song changeSong : topTenSongs) {
            //changeSong.setTitle("test");
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
        /*
        for (int i = 0; i < topTenSongs.length; i++) {
        topTenSongs[i] = new Song("test");
        }
         */

        System.out.println("\n--After--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }

        System.out.println("\n------------------Task 22 to 24--------------------------");
        int songIndex = 0;
        for (Song currentSong : topTenSongs) {
            if (songIndex % 3 == 0) {
                currentSong.setPrice(.99);
            } else {
                currentSong.setPrice(1.29);
            }
            songIndex ++;
        }

        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle() + ", " + showSong.getPrice());
        }

        System.out.println("\n------------------Task 26 to 27--------------------------");
        System.out.println("[Half the Array]");
        for (int i = 0; i < (topTenSongs.length + 1) / 2; i++) {
            System.out.println(topTenSongs[i].getTitle() + ", " + topTenSongs[i].getPrice());
        }
        System.out.println("\n[Every other Element for-loo]p");
        for (int i = 0; i < topTenSongs.length; i += 2) {
            System.out.println(topTenSongs[i].getTitle() + ", " + topTenSongs[i].getPrice());
        }
        System.out.println("\n[Every other element for-each-loop]");
        songIndex = 0;
        for (Song showEveryOther : topTenSongs) {
            if (songIndex % 2 == 0) {
                System.out.println(showEveryOther.getTitle() + ", " + showEveryOther.getPrice());
            }
            songIndex ++;
        }
    }
}