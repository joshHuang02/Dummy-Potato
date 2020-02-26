/**
 * Jellyfish can eat, be afraid, and hunt
 *
 * @author Josh Huang  
 * @version 1/24/2020
 */
public class Jellyfish extends Cnidaria
{
    public Jellyfish(String name, double currentAgeInYears, boolean isAlive, 
    double weightOfBrain, String nameOfMouth, double mouthSizeInInches, 
    boolean mouthIsWorking, String tentaclesColor) {
        super(name, currentAgeInYears, isAlive, weightOfBrain,nameOfMouth, 
        mouthSizeInInches,  mouthIsWorking, tentaclesColor);
    }

    public Jellyfish(String name, double currentAgeInYears, double weightOfBrain, 
    String nameOfMouth, double mouthSizeInInches, boolean mouthIsWorking, 
    String tentaclesColor) {
        super(name, currentAgeInYears, true, weightOfBrain, nameOfMouth, mouthSizeInInches,
        mouthIsWorking, tentaclesColor);
    }

    @Override 
    public String weakAction() {
        return fear();
    }

    @Override
    public String normalAction() {
        return eatWithTentacles();
    }

    @Override
    public String strongAction() {
        return hunt();
    }

    public String eatWithTentacles(){
        int workingTentacles = 0;
        for (int i = 0; i < super.getTentacles().length; i++) {
            boolean working = super.getTentacles()[i].getIsWorking();
            if (working == true)
                workingTentacles ++;
        }

        if (workingTentacles > 6) {
            return super.getMouth().eat();
        } else {
            return "The jellyfish does not have enogh tentacles to eat";
        }
    }

    /**
     * Jellyfish displays fear by curing its tentacles
     *
     * @return each tentacle curling
     */
    public String fear() {
        String curl = "";
        for (int i = 0; i < super.getTentacles().length; i++) {
            curl += super.getTentacles()[i].constrict() + "\n";
        }
        return "The jellyfish is curled up due to fear\n" + curl;
    }

    /**
     * Jellyfish attempts to hunt with tentacles and then eat
     *
     * @return whether or not the Jellyfish can eat and if each tentacle attacked
     */
    public String hunt() {
        String attack = "";
        for (int i = 0; i < super.getTentacles().length; i++) {
            attack += super.getTentacles()[i].constrict() + "\n";
        }
        return attack + eatWithTentacles();
    }

    @Override
    public String toString() {
        return super.toString() + "Jellyfish is the only animal in the Cnidaria class";
    }
    
    /**
     * revive the Jellyfish
     *
     * @return String confirming if Jellyfish has been healed
     */
    @Override
    public String revive() {
        super.revive();
        for (int i = 0; i < super.getTentacles().length; i++) {
            super.getTentacles()[i].heal();
        }
        super.getMouth().heal();
        return "The jellyfish is now healthy";
    }
}
