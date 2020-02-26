public class AnimalPart
{
    private String nameOfPart;
    private boolean isWorking;
    
    //Constructor
    public AnimalPart(String nameOfPart)
    {
        
        this.isWorking = true;
        this.nameOfPart = nameOfPart;
        
    }
    
    
    public AnimalPart(String nameOfPart, boolean isWorking)
    {
        this.isWorking = isWorking;
        this.nameOfPart = nameOfPart;
    }
    
    //Methods
    @Override
    public String toString()
    {
        return "parent class";
    }
    
    public String action1()
    {
        return "no action";
    }
    
    public String injure()
    {
        this.isWorking = false;
        return "";
        
    }
    
    public String heal()
    {
        this.isWorking = true;
        return "";
    }
    
    
    public void setNameOfPart(String nameOfPart)
    {
        this.nameOfPart = nameOfPart;
    }
    
    public void setIsWorking(boolean isWorking)
    {
        this.isWorking = isWorking;
    }
    
    public String getNameOfPart()
    {
        return this.nameOfPart;
    }
    
    public boolean getIsWorking()
    {
        return this.isWorking;
    }
}
