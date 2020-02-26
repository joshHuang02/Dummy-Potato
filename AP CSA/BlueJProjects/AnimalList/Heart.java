// Edmond You and Andrew Tarng
// FIXED: Issue with not linking isWorking in first constructor 

public class Heart extends AnimalPart
{
    //instance variables
    private String color;

    //constructor
    public Heart(String color, boolean isWorking) {
        super("heart", isWorking);
        this.color = color;
    }

    public Heart(String color)
    {
        super("heart", true);
        this.color = color;
    }

    //method
    public String beat() {
        if(getIsWorking()) {
            if(((int) (Math.random() * 100) + 1) > 50) {
                return heartAttack() + " The heart can not beat.";
            }
            return "The " + getNameOfPart() + " beats.";
        }
        else {
            return "The " + getNameOfPart() + " does not beat.";
        }
    }

    public String heartAttack() {
        setIsWorking(false);
        return "The " + getNameOfPart() + " is busted.";
    }

    @Override
    public String heal() {
        if(getIsWorking()) {
            return "The " + getNameOfPart() + " was already fine.";
        }
        else{
            setIsWorking(true);
            return "The  " + getNameOfPart() + " is now working.";
        }
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setIsUsable (boolean isWorking) {
        setIsWorking(getIsWorking());
    }

    public boolean getIsUsable() {
        return getIsWorking();
    }

    @Override
    public String toString()
    {
        return "TEST";
    }
}