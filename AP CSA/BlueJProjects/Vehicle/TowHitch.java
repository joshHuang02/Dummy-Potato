//created by Josh Huang for use in semi truck
public class TowHitch extends CarComponent {
    private double hitchSizeInInches;
    private boolean hitchIsAttached;

    public TowHitch(String name, double hitchSizeInInches, boolean hitchIsAttached, boolean isWorking,
            double chanceOfFailure) {
        super(name, isWorking, chanceOfFailure);
        this.hitchSizeInInches = hitchSizeInInches;
        this.hitchIsAttached = hitchIsAttached;
    }

    public TowHitch(boolean hitchIsAttached , double chanceOfFailure) {
        super("tow hitch", true, chanceOfFailure);
        this.hitchSizeInInches = 26;
        this.hitchIsAttached = hitchIsAttached;
    }

    @Override
    public String toString() {
        String message = "The " + getNameOfComponent() + " is ";
        if (getIsWorking()) {
            message += "working and ";
            if (hitchIsAttached)
                message += "attached to a trailer. ";
            else
                message += "not attaced to a trailer. ";
        } else {
            message += "not working. ";
        }
        return message;
    }

    @Override
    public String damage() {
        setIsWorking(false);
        return "The " + getNameOfComponent() + " stopped working and is unable to brake. ";
    }

    @Override
    public String fix() {
        if (getIsWorking()) {
            return "The " + getNameOfComponent() + " was already working. ";
        } else {
            setIsWorking(true);
            return "The " + getNameOfComponent() + " is now working. ";
        }
    }

    @Override
    public String action1() {
        return attachHitch();
    }

    @Override
    public String action2() {
        return detachHitch();
    }

    public String attachHitch() {
        if (getIsWorking()) {
            if (hitchIsAttached)
                return "The " + getNameOfComponent() + " was already attached. ";
            if (!super.conditionalCheck())
                return damage();
            hitchIsAttached = true;
            return "The " + getNameOfComponent() + " attaches to the trailer. ";
        } else {
            return "The " + getNameOfComponent() + " is not working. ";
        }
    }

    public String detachHitch() {
        if (getIsWorking()) {
            if (!hitchIsAttached)
                return "The " + getNameOfComponent() + " was already detached. ";
            if (!super.conditionalCheck())
                return damage();
            hitchIsAttached = false;
            return "The " + getNameOfComponent() + " detaches from the trailer. ";
        } else {
            return "The " + getNameOfComponent() + " is not working. ";
        }
    }

    public void setHitchSizeInInches(double hitchSizeInInches) {
        this.hitchSizeInInches = hitchSizeInInches;
    }

    public void setHitchIsAttached(boolean hitchIsAttached) {
        this.hitchIsAttached = hitchIsAttached;
    }

    public double getHitchSizeInInches() {
        return hitchSizeInInches;
    }

    public boolean getHitchIsAttached() {
        return hitchIsAttached;
    }
}