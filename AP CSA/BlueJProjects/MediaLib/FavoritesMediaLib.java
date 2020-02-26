
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main() {
        System.out.println("My Favorite Songs\n--------------");
        String token = MediaFile.readString();
        if (token == null) {
            token = "";
        }
        while (token.length() > 0) {
            String title = token.substring(0, token.indexOf("|"));
            String rating = token.substring(token.indexOf("|") + 1, token.indexOf("|", token.indexOf("|") + 1));
            token = token.substring(token.indexOf("|", token.indexOf("|") + 1) + 1);
            if (Integer.parseInt(rating) > 4) {
                System.out.println(title + " ("+ rating + ")");
            }
        }
        MediaFile.saveAndClose();

        //step 29 
        /*
        for (int i = 0; i < 100; i ++) {
        if (token.length() > 1) {
        String title = token.substring(0, token.indexOf("|"));
        String rating = token.substring(token.indexOf("|") + 1, token.indexOf("|", token.indexOf("|") + 1));
        token = token.substring(token.indexOf("|", token.indexOf("|") + 1) + 1);
        System.out.println(title + " ("+ rating + ")");
        }
        }
         */
    }
}
