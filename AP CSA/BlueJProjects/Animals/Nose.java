
/**
 * Write a description of class Nose here.
 *
 * @author Josh Huang
 * @version 1/6/2020
 */
public class Nose
{
    private boolean clear;
    private int sensitivity;

    public Nose(boolean clear, int sensitivity) {
        this.clear = clear;
        if (sensitivity < 1) {
            this.sensitivity = 1;
        } else if (sensitivity > 3) {
            this.sensitivity = 3;
        } else {
            this.sensitivity = sensitivity;
        }
    }

    public Nose(int sensitivity) {
        this.sensitivity = sensitivity;
        clear = true;
    }

    public String alergic() {
        this.clear = false;
        return "The animal is sick and its nose is stuffed.";
    }

    public String clear() {
        clear = true;
        return "The animal's nose has been cleared.";
    }

    public String breath() {
        if (clear) {
            int chance = (int)(Math.random() * 100 + 1);
            switch (sensitivity) {
                case 1:
                return chanceOfAllergy(90);
                case 2:
                return chanceOfAllergy(70);
                case 3:
                return chanceOfAllergy(50);
            }
            return "Sensitivity Error";
        } else {
            return "Its nose is stuffed and it's having a hard time breathing";
        }
    }

    private String chanceOfAllergy(int chance) {
        if ((int)(Math.random() * 100 + 1) > chance) {
            return alergic() + "It has sensitive nose and is having a hard time breathing.";
        } else {
            return "It breathes fine.";
        }
    }
    
    public boolean getIsClear() {
        return this.clear;
    }
}
