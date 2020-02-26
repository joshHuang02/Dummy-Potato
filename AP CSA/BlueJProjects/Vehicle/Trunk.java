public class Trunk extends CarComponent
{
    private int diameterInFeet;

    public Trunk(int diameterInFeet)
    {
        super("trunk", true, 10);
        this.diameterInFeet = diameterInFeet;
    }

    public Trunk(String nameOfComponent, int diameterInFeet, boolean isWorking, double chanceOfFailure)
    {
        super(nameOfComponent, isWorking, chanceOfFailure);
        this.diameterInFeet = diameterInFeet;
    }

    @Override
    public String toString()
    {
        String message = "";
        message += "The " + getNameOfComponent() + " is ";
        if(getIsWorking())
        {
            message += "opening.";
        }
        else
        {
            message += "not opening.";
        }
        return message;
    }

    @Override
    public String action1()
    {
        return open();
    }

    @Override
    public String action2()
    {
        return close();
    }

    public String open()
    {
        if (getIsWorking())
        {           
            if (!super.conditionalCheck())
            {
                return damage() + "The " + getNameOfComponent() + " can not open."; 
            }
            return "The " + getNameOfComponent() + " opens.";             
        }
        else
        {
            return "The " + getNameOfComponent() + " does not open.";
        }
    }

    public String close()
    {
        if (getIsWorking())
        {           
            if (!super.conditionalCheck())
            {
                return damage() + "The " + getNameOfComponent() + " can not close."; 
            }
            return "The " + getNameOfComponent() + " closes.";             
        }
        else
        {
            return "The " + getNameOfComponent() + " does not close.";
        }
    }

    @Override
    public String damage()
    {
        setIsWorking(false);
        return "The " + getNameOfComponent() + " is broken and cannot open or close.";
    }

    @Override
    public String fix()
    {
        if (getIsWorking())
        {
            return "The " + getNameOfComponent() + " was already fine.";
        }
        else
        {
            setIsWorking(true);
            return "The " + getNameOfComponent() + " is now opening and closing.";
        }
    }

    public int getdiameterInFeet()
    {
        return this.diameterInFeet;
    }

    public void setdiameterInFeet(int diameterInFeet)
    {
        this.diameterInFeet = diameterInFeet;
    }
}