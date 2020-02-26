// Nicholas T. and Jesse C.
// FIXED: Issue with length without unit of measure
// FIXED: Issue with not giving options to change the name
// FIXED: Issue with getters and setters missing for lengthInCm
// Removed 3 constructors

public class Antenna extends AnimalPart{
    // initialize
    private String type;
    private double lengthInCm;
    // construct

    // If you really need this to be true just heal the antenna
    public Antenna(String name, String type, double lengthInCm){
        super(name, false);
        this.type = type;
        this.lengthInCm = lengthInCm;
    }

    // methods and accessors
    public void setLengthInCm(double lengthInCm)
    {
        this.lengthInCm = lengthInCm;
    }

    public double getLengthInCm()
    {
        return this.lengthInCm;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    // mutators
    public String sense() {
        if (getIsWorking()) {
            if (((int)(Math.random() * 100 + 1) < (lengthInCm * 10.0)))
            {
                return injure() + " You cannot sense.";
            }
            return "You sense.";
        }
        else
        {
            return "You do not sense. Your " + getNameOfPart() + " is broken.";
        }
    }

    @Override
    public String injure() {
        setIsWorking(false);
        return "The fruit flies have destroyed your " + getNameOfPart() + ".";
    }

    @Override
    public String heal() {
        if (getIsWorking()) {
            return "There is no need to heal. The fruit flies have spared your antenna ... for now.";
        } else {
            setIsWorking(true);
            return "You have successfully healed your " + getNameOfPart() + ".";
        }
    }

    @Override
    public String toString(){
        String working;
        if (getIsWorking()){
            working = "is";
        }
        else{
            working = "is not";
        }

        return "Your " + getNameOfPart() + " type is " + this.type + ". The " + getNameOfPart() + " " + working + " " + "working";
    }

    @Override
    public String action1(){
        return sense();
    }
}

