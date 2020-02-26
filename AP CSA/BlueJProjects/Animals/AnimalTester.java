
/**
 * Write a description of class AnimalTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalTester
{
    public static void main() {
        Jellyfish jellyfish = new Jellyfish();
        System.out.println();
        System.out.println("Eating:\n" + jellyfish.eatWithTentacles() + "\n");
        System.out.println("Spitting:\n" + jellyfish.spit() + "\n");
        System.out.println("Constricting each tentacle and attempting to eat:\n" + jellyfish.hunt() + "\n");
        System.out.println("Heal the jelyfish:\n" + jellyfish.heal() + "\n");
        System.out.println("Jellyfish curls:\n" + jellyfish.fear() + "\n");
        /*
        Nose nose = new Nose(1);
        for (int i = 0; i < 10; i++) {
        System.out.println(nose.breath());
        }

        System.out.println();
        Eye rightEye = new Eye("blue");
        Eye leftEye = new Eye("blue", false);
        System.out.println(leftEye.blink());
        for (int i = 0; i < 10; i++) {
        System.out.println(rightEye.blink());
        }
         */
    }
}
