
/**
 * Write a description of class RandomNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumber
{
    public static void main() {
        int i = 0;
        int delay = 30;
        String result;
        String word = "Hello World";
        System.out.println("Hello World length is " + "Hello World".length());
        while (i < 30) {
            int x = (int) (Math.random() * (word.length() + 1));
            //result = word.substring(x);
            result = word.substring(0, x);
            
            System.out.println(result);
            
            i ++;
            //ignore the delay function below
            try {
                Thread.sleep(delay);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
