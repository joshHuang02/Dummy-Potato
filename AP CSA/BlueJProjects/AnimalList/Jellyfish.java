/**
 * Jellyfish can eat, be afraid, and hunt
 *
 * @author Josh Huang  
 * @version 1/24/2020
 */
public class Jellyfish extends Cnidaria
{
    //private Brain brain;
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
        return "The Jellyfish " + super.getName() + fear();
    }

    @Override
    public String normalAction() {
        return "The Jellyfish " + super.getName() + eatWithTentacles();
    }

    @Override
    public String strongAction() {
        return "The Jellyfish " + super.getName() + hunt();
    }

    /**
     * Jellyfish displays fear by curing its tentacles
     *
     * @return each tentacle constricting
     */
    public String fear() {
        String brain = super.getBrain().sendSignals();
        int workingTentacles = 0;
        String tentacleFails= "";
        //Need to add in constrict action
        for (int i = 0; i < super.getTentacles().length; i++) {
            String constrict = "";
            if (super.getTentacles()[i].getIsWorking()) constrict = super.getTentacles()[i].constrict();
            if (constrict.equals("The tentacle was cut off.The tentacle could not constrict.")) tentacleFails += "   Tentacle " + (i + 1) + ": " + constrict + "\n";
            if (super.getTentacles()[i].getIsWorking()) workingTentacles ++;
        }
        if (brain.equals("The brain has sent signals.")) {
            //String tentaclesStatus = brain + "\n" + tentacleFails + super.getName() + " has " + workingTentacles + " working tentacles." + "\n" + super.getName();
            return " is curled up due to fear\n" + tentacleFails;
        } else {
            super.setIsAlive(false);
            for (int i = 0; i < super.getTentacles().length; i++) {
                super.getTentacles()[i].injure();
            }
            super.getMouth().injure();
            return super.getName() + " is brain dead and cannot perform any actions.\n" + tentacleFails;
        }
    }

    public String eatWithTentacles(){
        String brain = super.getBrain().sendSignals();
        int workingTentacles = 0;
        String tentacleFails= "";
        //Need to add in constrict action
        for (int i = 0; i < super.getTentacles().length; i++) {
            String constrict = "";
            if (super.getTentacles()[i].getIsWorking()) constrict = super.getTentacles()[i].constrict();
            if (constrict.equals("The tentacle was cut off.The tentacle could not constrict.")) tentacleFails += "   Tentacle " + (i + 1) + ": " + constrict + "\n";
            if (super.getTentacles()[i].getIsWorking()) workingTentacles ++;
        }
        if (brain.equals("The brain has sent signals.")) {

            //String tentaclesStatus = brain + "\n" + tentacleFails + super.getName() + " has " + workingTentacles + " working tentacles." + "\n" + super.getName();

            if (workingTentacles > 6) {
                return " has enough tentacles to eat and " + super.getMouth().eat() + "\n" + tentacleFails;
            } else {
                return " does not have enough tentacles to eat.\n" + tentacleFails;
            }
        } else {
            super.setIsAlive(false);
            for (int i = 0; i < super.getTentacles().length; i++) {
                super.getTentacles()[i].injure();
            }
            super.getMouth().injure();
            return super.getName() + " is brain dead and cannot perform any actions.\n" + tentacleFails;
        }
    }

    /**
     * Jellyfish attempts to hunt with tentacles and then eat
     *
     * @return whether or not the Jellyfish can eat and if each tentacle attacked
     */
    public String hunt() {
        String brain = super.getBrain().sendSignals();
        int workingTentacles = 0;
        //Need to add in constrict action
        for (int i = 0; i < super.getTentacles().length; i++) {
            if (super.getTentacles()[i].getIsWorking()) workingTentacles ++;
        }
        if (brain.equals("The brain has sent signals.")) {

            //String tentaclesStatus = brain + "\n" + super.getName() + " has " + workingTentacles + " working tentacles." + "\n" + super.getName();

            return super.getName() + " attacks with " + workingTentacles + " working tentacles and " + super.getName() + eatWithTentacles();
        } else {
            super.setIsAlive(false);
            for (int i = 0; i < super.getTentacles().length; i++) {
                super.getTentacles()[i].injure();
            }
            super.getMouth().injure();
            return super.getName() + " is dead and cannot perform any actions.\n" + eatWithTentacles();
        }
    }

    @Override
    public String toString() {
        String message = "Jellyfish " + super.getName() + " toString:\n" + super.toString() + "\nJellyfish is the only animal in the Cnidaria class and has " 
            + super.getTentacles()[1].getColor() + " tentacles. " + "\n";
        if (super.getMouth().getIsWorking() && super.getBrain().getIsWorking()) {
            message += super.getName() + " has a working mouth and a working brain.";
        } else if (!super.getMouth().getIsWorking() && !super.getBrain().getIsWorking()) {
            message += super.getName() + "'s mouth and brain are both not working, so it is dead. ";
        } else if (!super.getMouth().getIsWorking()) {
            message += super.getName() + "'s mouth is not working but its brain is working. ";
        } else {
            message += super.getName() + "'s mouth is working but its brain is not working, so it is dead. ";
        }
        return message + "\n";
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
        return "Jellyfish " + super.getName() + " is now healthy. \n";
    }
}

