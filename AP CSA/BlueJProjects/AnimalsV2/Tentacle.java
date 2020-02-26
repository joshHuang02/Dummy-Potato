// Jason W. and Owen Y.
// FIXED: Issue with constructor
// FIXED: Issue with calling on super
// FIXED: Issue with keeping an unnecessary variable

public class Tentacle extends AnimalPart {
    // instance variables
    private String color;

    // constructors
    public Tentacle(String color, String name, boolean isWorking) {
        super(name, isWorking);
        this.color = color;
    }

    // methods, accessors, mutators
    public String constrict() {
        if (getIsWorking()) {
            if (((int) (Math.random() * 100) + 1) > 80) {
                return injure() + "The tentacle could not constrict.";
            }
            return "The tentacle constricts.";
        } else {
            if (((int) (Math.random() * 100) + 1) > 80) {
                return heal() + "The tentacle constricts.";
            }
            return "The tentacle could not constrict since it is missing.";
        }

    }

    @Override
    public String toString()
    {
        String toString = "The "+getNameOfPart()+" is "+color+". "+"\n";
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
        return constrict();
    }

    @Override
    public String injure() {
        setIsWorking(true);
        return "The tentacle was cut off.";
    }

    @Override
    public String heal() {
        if (getIsWorking()) {
            return "The tentacle is still attatched.";
        } else {
            setIsWorking(true);
            return "The tentacle grew back.";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
