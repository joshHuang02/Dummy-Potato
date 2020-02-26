// Jason W. and Owen Y.
// FIXED: Issue with constructor
// FIXED: Issue with calling on super
// FIXED: Issue with keeping an unnecessary variable

public class Trunk extends AnimalPart {
    // instance variables
    private int trunkLength;

    // constructors
    public Trunk(int trunkLength, String name, boolean isWorking) {
        super(name, isWorking);
        this.trunkLength = trunkLength;
    }

    // methods, accessors, mutators
    public String swing() {
        if (getIsWorking()) {
            if (((int) (Math.random() * 100) + 1) > 80) {
                return injure() + "The trunk could not be lifted.";
            }
            return "The trunk was swung.";
        } else {
            if (((int) (Math.random() * 100) + 1) > 80) {
                return heal() + "The trunk was swung.";
            }
            return "The trunk could not swing because it was injured.";
        }

    }

    @Override
    public String toString()
    {
        String toString = "The "+getNameOfPart()+" is "+trunkLength+". "+"\n";
        if(getIsWorking()){
            toString+="The "+getNameOfPart()+" is working."+"\n";  
        }
        else{
            toString += "The "+getNameOfPart()+" is not working."+"\n";
        }
        return toString;
    }

    @Override
    public String action1(){
        return swing();
    }

    @Override
    public String injure() {
        setIsWorking(true);
        return "The trunk was injured.";
    }

    @Override
    public String heal() {
        if (getIsWorking()) {
            return "The trunk is still healthy.";
        } else {
            setIsWorking(true);
            return "The trunk was healed.";
        }
    }

    public void setTrunkLength(int trunkLength) {
        this.trunkLength = trunkLength;
    }

    public int getTrunkLength() {
        return this.trunkLength;
    }

}
