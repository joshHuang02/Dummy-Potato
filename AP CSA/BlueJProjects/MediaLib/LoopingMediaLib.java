import java.io.*; 
/**
 * Loops over the medialib entries
 *
 * @author Josh Huang
 * @version 10/23/2019
 */ 
public class LoopingMediaLib {
    public static void main() {
        String songInfo = MediaFile.readString();
        while (songInfo != null) {
            System.out.print("Title: " + songInfo.substring(0, songInfo.indexOf("|")) + " ");
            System.out.print("Rating: " + songInfo.substring(songInfo.indexOf("|") + 1) + "\n");
            songInfo = MediaFile.readString();
        }
        MediaFile.saveAndClose();
    }
}
