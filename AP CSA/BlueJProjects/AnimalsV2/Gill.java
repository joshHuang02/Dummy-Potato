// Timothy Wu and Justin Zhang
// FIXED: Issue with not using a singular class name
// Removed constructor

public class Gill extends AnimalPart
{
    //instance variables
    private int lengthInCm; 

    //constructors(s)
    public Gill(String name, int lengthInCm, boolean isWorking)
    { 
        super(name, isWorking);
        this.lengthInCm = lengthInCm;
    }

    //methods, accessors, and mutators

    @Override
    public String toString()
    {
        String message = "";
        message += "The " + getNameOfPart() + " is ";
        if(getIsWorking())
        {
            message += "breathing.";
        }
        else
        {
            message += "not breathing.";
        }
        return message;
    }

    @Override
    public String action1()
    {
        return breathe();
    }

    public String breathe()
    {if (getIsWorking())
        {
            if (((int) (Math.random() * 100)+1) > 90)
            {
                return injure() + " The " + getNameOfPart() + " can not breathe.";
            }
            return "The " + getNameOfPart() + " breathes.";
        }
        else 
        {
            return "The " + getNameOfPart() + " does not breathe.";
        }
    }

    public String injure()
    {
        setIsWorking(false);  
        return "The " + getNameOfPart() + " is bleeding and cannot breathe.";
    }

    public String heal()
    {
        if (getIsWorking())
        {
            return "The " + getNameOfPart() + " was already fine.";
        }
        else
        {
            setIsWorking(true);
            return "The " + getNameOfPart() + " is now breathing.";
        }
    }

    public void setLengthInCm(int lengthInCm)
    {
        this.lengthInCm = lengthInCm;
    }

    public int getLengthInCm()
    {
        return this.lengthInCm;
    }
}

