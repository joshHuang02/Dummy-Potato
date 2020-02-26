import java.util.*;
/**
 * This class will encode and decode a message by simply scrambling the strings
 *
 * @author Josh Huang
 * @version 9/19/2019
 */
public class SimpleEncoding
{
    public static void main() {
        System.out.println("My Encoding Messages");
        while (true) {
            System.out.println(encode());
            System.out.println();
            try {
                Thread.sleep(300);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static String encode() {
        //getting input
        System.out.println("Input a message of more than 10 characters to encode or type exit");
        boolean invalid = true;
        String message = UserInput();
        while (invalid) {
            if (message.equals("exit")) {
                System.exit(0);
            } else if (message.length() < 10) {
                System.out.println("You must enter a message of more than 10 characters!");
                message = UserInput();
            } else {
                invalid = false;
            }
        }

        //setting strings
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";
        String last = "";
        String encoded = "";

        int interval = (int)(message.length() / 10);
        int start = 0;

        try {
            a = message.substring(start,interval);
            start = interval;
            interval += interval;
            b = message.substring(start,interval);
            start = interval;
            interval += interval;
            c = message.substring(start,interval);
            start = interval;
            interval += interval;
            d = message.substring(start,interval);
            start = interval;
            interval += interval;
            e = message.substring(start,interval);
            start = interval;
            interval += interval;
            f = message.substring(start,message.length());
        } catch (Exception error) {
            if (last == "") {
                last = message.substring(start, message.length());
                //System.out.print(last);
            }
        }

        //concatnating results
        if (b != "") {
            encoded += b;
        }
        if (a != "") {
            encoded += a;
        }
        if (e != "") {
            encoded += e;
        }
        if (f != "") {
            encoded += f;
        }
        if (d != "") {
            encoded += d;
        }
        if (c != "") {
            encoded += c;
        }
        encoded += last;
        return encoded;
    }

    public static String UserInput() {
        UserInput message1 = new UserInput();
        return message1.getString();
    }
}
