public class Eye
{
    // instance variables
    private String color;
    private boolean isUsable;
    private String name;
    
    // constructor(s)
    public Eye(String color, boolean isUsable)
    {
        this.color = color;
        this.isUsable = isUsable;
        this.name = "Eye";
    }
    
    public Eye(String name, String color, boolean isUsable)
    {
        this.color = color;
        this.isUsable = isUsable;
        this.name = name;
    }
    
    public Eye(String color)
    {
        this.color = color;
        this.isUsable = true;
        this.name = "Eye";
    }
    
    // methods, accessors, and mutators
    
    public String blink()
    {
        if(isUsable)
        {
            if(((int) (Math.random()*100)+1)>90)
            {
                return injure() + " The "+this.name+" can not blink.";
                
            }
            return "The "+this.name+" blinks";
        }
        else
        {
            return "The "+this.name+" does not blink";
        }
        
    }
    
    public String injure()
    {
        this.isUsable = false;
        return "The "+this.name+" is busted";
    }
    
    public String heal()
    {
        if(isUsable)
        return "The "+this.name+" was already fine.";
        else{
            this.isUsable = true;
            return "The "+this.name+" is now working";
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
    
    public String setIsUsable(boolean isUsuable)
    {
        this.isUsable = isUsable;
        if(isUsable)
            return "The "+this.name+" is working now";
        else
            return "The "+this.name+" is busted";
    }
    
    public boolean getIsUsable()
    {
        return this.isUsable;
    }
    
}
