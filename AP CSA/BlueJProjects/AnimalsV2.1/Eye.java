// Victor Lu
// Removed constructor

public class Eye extends AnimalPart
{
    // instance variables
    private String color;

    // constructor(s)
    public Eye(String name, String color, boolean isWorking)
    {
        super(name, isWorking);
        this.color = color;
    }

    // methods, accessors, and mutators
    @Override
    public String action1()
    {
        return blink();
    }

    @Override
    public String toString()
    {
        String message = "";

        message += "The "+getNameOfPart()+" is ";
        if(getIsWorking())
            message += "working";
        else
            message += "not working";
        return message;
    }

    public String blink()
    {
        if(getIsWorking())
        {
            if(((int) (Math.random()*100)+1)>90)
            {
                return injure() + " The "+getNameOfPart()+" can not blink.";

            }
            return "The "+getNameOfPart()+" blinks";
        }
        else
        {
            return "The "+getNameOfPart()+" does not blink";
        }

    }

    public String injure()
    {
        setIsWorking(false);
        return "The "+getNameOfPart()+" is busted";
    }

    public String heal()
    {
        if(getIsWorking())
            return "The "+getNameOfPart()+" was already fine.";
        else{
            setIsWorking(true);
            return "The "+getNameOfPart()+" is now working";
        }
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }


}
