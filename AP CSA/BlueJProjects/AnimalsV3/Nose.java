// Josh H. and Jack C. 
// FIXED: Issue with action1
// Removed constructor

/**
 * Write a description of class Nose here.
 *
 * @author Josh Huang
 * @version 1/6/2020
 */
public class Nose extends AnimalPart
{
    private int sensitivity;
    private String allergyChance;

    public Nose(int sensitivity) {
        super("nose", true);
        if (sensitivity < 1) {
            this.sensitivity = 1;
            this.allergyChance = "low";
        } else if (sensitivity > 3) {
            this.sensitivity = 3;
            this.allergyChance = "high";
        } else {
            this.sensitivity = sensitivity;
            this.allergyChance = "medium";
        }
    }

    public Nose(String name, int sensitivity) {
        super(name, true);
        if (sensitivity < 1) {
            this.sensitivity = 1;
            this.allergyChance = "low";
        } else if (sensitivity > 3) {
            this.sensitivity = 3;
            this.allergyChance = "high";
        } else {
            this.sensitivity = sensitivity;
            this.allergyChance = "medium";
        }    
    }

    public Nose(String name, boolean isWorking, int sensitivity) {
        super(name, isWorking);
        if (sensitivity < 1) {
            this.sensitivity = 1;
            this.allergyChance = "low";
        } else if (sensitivity > 3) {
            this.sensitivity = 3;
            this.allergyChance = "high";
        } else {
            this.sensitivity = sensitivity;
            this.allergyChance = "medium";
        }    
    }

    @Override
    public String action1() {
        return breathe();
    }

    public String breathe() {
        if (getIsWorking()) {
            int chance = (int)(Math.random() * 100 + 1);
            switch (sensitivity) {
                case 1:
                return chanceOfallergy(90);
                case 2:
                return chanceOfallergy(70);
                case 3:
                return chanceOfallergy(50);
            }
            return "Sensitivity Error";
        } else {
            return "Its nose is working and its having a hard time breathing";
        }
    }

    @Override
    public String toString() {
        String message = "";
        if (getIsWorking()) {
            message += "The nose is working. ";
        } else {
            message += "The nose is not working. ";
        }
        message += "It has a " + allergyChance + " chance of getting alergic and getting stuffed. ";

        //message += "The nose
        return message;
    }

    @Override
    public String injure() {
        return super.injure() + "The nose is not working. ";
    }

    private String chanceOfallergy(int chance) {
        if ((int)(Math.random() * 100 + 1) > chance) {
            return injure() + "It has sensitive nose and is having a hard time breathing. ";
        } else {
            return "It breathes fine. ";
        }
    }
}
