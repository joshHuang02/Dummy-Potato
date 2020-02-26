// Anoushka B. and Alyssa W.
// FIXED: Issue with not having unit of measure for length (changed to inches)
// FIXED: Issue with not allowing constructor to set the name
// FIXED: Issue with action1
// Removed constructor

public class Arm extends AnimalPart {
    //instance variables
    private double lengthInInches;

    //constructors
    public Arm(String name, double lengthInInches, boolean isWorking){
        super(name ,isWorking);
        this.lengthInInches = lengthInInches;
    } 

    //methods, accessors, mutators
    @Override
    public String toString(){
        String message = "";
        message+="The " + getNameOfPart() + " is ";
        if(getIsWorking()){
            message += "working";
            return message + "\n";
        }
        else {
            message+="not working";
            return message+ "\n";

        }
    }

    @Override
    public String action1()
    {
        return wave();
    }

    public String wave()
    {
        if (getIsWorking())
        {
            if (((int) (Math.random() * 100) + 1) > 60)
            {
                return injure() + "The arm cannot wave."+ "\n";
            }
            return "The arm waves." +"\n";
        }
        else
        {
            return "The arm is not waving."+ "\n";
        }
    }

    @Override
    public String injure()
    {
        setIsWorking(false);
        return "The arm is broken."+ "\n";
    }

    @Override
    public String heal()
    {
        if (getIsWorking())
        {
            return "The arm was already able to wave." + "\n";
        }
        else 
        {
            setIsWorking(true);
            return "The arm is now able to wave."+"\n";
        }
    }

    public void setLengthInInches(double lengthInInches)
    {
        this.lengthInInches = lengthInInches;
    }

    public double getLengthInInches()
    {
        return lengthInInches; 
    }
}