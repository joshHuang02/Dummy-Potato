import java.util.Scanner;
/**
 * This class takes a user input to encode
 *
 * @author Josh Huang
 * @version 9/19/2019
 */
public class UserInput
{
    public static String getString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
