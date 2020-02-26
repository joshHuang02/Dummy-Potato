/**
 * Write a description of class FrysBank here.
 *
 * @author Josh Huang
 * @version 11/5/2019
 */
public class FrysBank
{
    public static void main () {
        double balance = 0.93;
        for (int i = 1; i <= 1000; i ++) {
            balance *= 1.0225;
        }
        System.out.println(balance);
    }
}
