
/**
 * Test if animal code works
 *
 * @author Josh Huang
 * @version 1/24/2020
 */
public class AnimalTester
{
    public static void main() {
    Jellyfish bob = new Jellyfish("Bob", 2.4, true, 2.4, "mouth 1", 2.4, true, "black");
    Jellyfish robert = new Jellyfish("Robert", 2.4, 2.4, "mouth 1", 2.4, true, "black");
    
    //constructor 1
    
    System.out.println("\nWeak Action fear:\n"+ bob.weakAction());
    System.out.println("\nNormal Action eat:\n"+ bob.normalAction());
    System.out.println("\nStrong Action hunt:\n"+ bob.strongAction());
    System.out.println("\nTo String:\n"+ bob.toString());
    System.out.println("\nRevive:\n"+ bob.revive());
    System.out.println("\nTo String Again:\n"+ bob.toString());
    System.out.println();
    
    //constructor 2
    System.out.println(robert.weakAction());
    System.out.println(robert.normalAction());
    System.out.println(robert.strongAction());
    System.out.println(robert.toString());
    System.out.println(robert.revive());
    System.out.println(robert.toString());
    /*
     * String name, double currentAgeInYears, boolean isAlive, 
    double weightOfBrain, String nameOfMouth, double mouthSizeInInches, 
    boolean mouthIsWorking, String tentaclesColor
     */
}
}
