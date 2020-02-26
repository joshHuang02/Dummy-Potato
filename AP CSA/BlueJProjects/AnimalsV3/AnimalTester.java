public class AnimalTester
{
    // instance variables - replace the example below with your own
    public static void main() {
        Dog sprinter = new Dog ("sprinter", 1.5, true, 1.1,  "RGB", "Rainbow", 2, "Hughmongus", "Giant", 6.9, 
                "violet", "sniffer", "light sensor", "proton impactor", "righty", "lefty", "thigh", "limb",
                "chungus", "stick", "swiper", 4, 9, 9, 9, 9, false);
        // while (sprinter.getBrain().getIsWorking()) {
        // System.out.println(sprinter);
        // System.out.println(sprinter.weakAction());
        // System.out.println(sprinter.normalAction());
        // System.out.println(sprinter.strongAction());
        // System.out.println("\n\n\n");
        // }

        // System.out.println("Is die");
        Jellyfish blobby = new Jellyfish ("Blobby", 1.2, true, .1, "consumer", 6.9, true, "rainbow");

        // while (blobby.getIsAlive()) {
        // System.out.println(blobby);
        // System.out.println(blobby.weakAction());
        // System.out.println(blobby.normalAction());
        // System.out.println(blobby.strongAction());
        // }

        // System.out.println("Is Die");
        // System.out.println(blobby.revive());

        // while (blobby.getIsAlive()) {
        // System.out.println(blobby);
        // System.out.println(blobby.weakAction());
        // System.out.println(blobby.normalAction());
        // System.out.println(blobby.strongAction());
        // }
        System.out.println(blobby);
        System.out.println(blobby.weakAction());
        System.out.println(blobby.normalAction());
        System.out.println(blobby.strongAction());
        System.out.println(blobby);
        System.out.println(blobby.revive());
        System.out.println(blobby);
        // blobby.setIsAlive(false);
        // System.out.println(blobby);
        // System.out.println(blobby.weakAction());
        // System.out.println(blobby.normalAction());
        // System.out.println(blobby.strongAction());
        // System.out.println(blobby.revive());
        // System.out.println(blobby);
        // System.out.println(blobby.weakAction());
        // System.out.println(blobby.normalAction());
        // System.out.println(blobby.strongAction());
    }
    /*
     * String name, double currentAge, boolean isAlive, double weightOfBrain, String rightEyeColor, 
     * String leftEyeColor, int noseSensitivity, String leftEarSize, String rightEarSize, 
     * double mouthSizeInInches, String colorOfHeart, String nameOfNose, String nameOfRightEye, 
     * String nameOfLeftEye, String nameOfRightEar, String nameOfLeftEar, String nameOfBackRightLeg, 
    String nameOfFrontRightLeg, String nameOfBackLeftLeg, String nameOfFrontLeftLeg, String nameOfTail,
    int lengthOfTailInCm, int lengthOfBackRightLegInInches, int lengthOfBackLeftLegInInches, 
    int lengthOfFrontRightLegInInches, int lengthOfFrontLeftLegInInches, 
    boolean tailIsWorking
     */
}
