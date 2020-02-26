
/**
 * Write a description of class friedPotato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class friedPotato {
    public static void main() {
        int x = 69;
        int delay = 30;

        for(int i = 0; i < 421; i++) {
            try {
                Thread.sleep(delay);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            switch(i) {
                case 351:
                System.out.println(i + " + " + x + " = " + (x + i) + "\nNice! Snoope Dogg would be proud");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                break;
                case 69:
                System.out.println(i + " Nice");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                delay = 10;
                break;
                case 51:
                System.out.println("Area " + i);
                break;
                case 420:
                System.out.println(i + " lol");
                x++;
                break;
                default:
                System.out.println(i);
            }
        }
    }
}
