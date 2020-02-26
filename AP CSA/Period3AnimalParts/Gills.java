public class Gills
{
    //instance variables
    private int length; 
    private boolean isUsable;

    //constructors(s)
    public Gills(int length, boolean isUsable){
        this.length = length;
        this.isUsable = isUsable;
    }

    public Gills(int length)
    { 
        this.length = length;
        this.isUsable = true; 
    }

    //methods, accessors, and mutators

    public String breathe()
    {if (isUsable)
        {
            if (((int) (Math.random() * 100)+1) > 90)
            {
                return injure() + " The gill can not breathe.";
            }
            return "The gill breathes.";
        }
        else 
        {
            return "The gill does not breathe.";
        }
    }

    public String injure()
    {
        this.isUsable = false;  
        return "The gill is bleeding and cannot breathe.";
    }

    public String heal()
    {
        if (isUsable)
        {
            return "The gill was already fine.";
        }
        else
        {
            this.isUsable = true;
            return "The gill is now breathing.";
        }
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return this.length;
    }

    public String setIsUsable(boolean isUsable)
    {
        this.isUsable = isUsable;
        if(isUsable)
            return "The gill is working and can breathe.";
        else 
            return "The gill is bleeding and cannot breathe."; 
    }

    public boolean getIsUsable()
    {
        return this.isUsable;
    }
}

