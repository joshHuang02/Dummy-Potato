
/**
 * Write a description of class Nose here.
 *
 * @author Josh Huang
 * @version 1/6/2020
 */
public class Nose
{
    private boolean stuffed;
    private int sensitivity;

    public Nose(boolean stuffed, int sensitivity) {
        this.stuffed = stuffed;
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
        stuffed = false;
    }

    public String alergic() {
        this.stuffed = true;
        return "The animal is sick and its nose is stuffed.";
    }

    public String clear() {
        stuffed = false;
        return "The animal's nose has been cleared.";
    }

    public String breath() {
        if (!stuffed) {
            int chance = (int)(Math.random() * 100 + 1);
            switch (sensitivity) {
                case 1:
                return chanceOfAlergy(90);
                case 2:
                return chanceOfAlergy(70);
                case 3:
                return chanceOfAlergy(50);
            }
            return "Sensitivity Error";
        } else {
            return "Its nose is stuffed and its having a hard time breathing";
        }
    }

    private String chanceOfAlergy(int chance) {
        if ((int)(Math.random() * 100 + 1) > chance) {
            return alergic() + "It has sensitive nose and is having a hard time breathing.";
        } else {
            return "It breathes fine.";
        }
    }
}
