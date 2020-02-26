public class Heart {
    //instance variables
    private String color;
    private boolean isWorking;

    //constructor
    public Heart(String color, boolean isWorking) {
        this.color = color;
        this.isWorking = isWorking;
    }

    //method
    public String beat() {
        if(isWorking) {
            if(((int) (Math.random() * 100) + 1) > 50) {
                return heartAttack() + " The heart can not beat.";
            }
            return "The heart beats.";
        }
        else {
            return "The heart does not beat.";
        }
    }

    public String heartAttack() {
        this.isWorking = false;
        return "The heart is busted.";
    }

    public String heal() {
        if(isWorking) {
            return "The eye was already fine.";
        }
        else{
            this.isWorking = true;
            return "The eye is now working.";
        }
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setIsWorking (boolean isWorking) {
        this.isWorking = isWorking;
    }

    public boolean getIsWorking() {
        return this.isWorking;
    }
}