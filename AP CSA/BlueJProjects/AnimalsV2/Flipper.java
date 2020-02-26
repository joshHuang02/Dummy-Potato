// Sue Ruan
// FIXED: Issue with super 
// FIXED: Issue with public void setLength(double l) 
// Removed constructor

public class Flipper extends AnimalPart
{
    private double length;

    public Flipper(String nameOfPart,boolean isWorking,double length)
    {
        super(nameOfPart, isWorking); 
        this.length = length;
    }

    @Override
    public String heal()
    {
        if(getIsWorking()){
            return"The "+getNameOfPart()+" was already fine.";
        }
        else{
            setIsWorking(true);
            return"The "+getNameOfPart()+" is now working.";
        }
    }

    @Override
    public String injure()
    {
        setIsWorking(false);
        return "The "+getNameOfPart()+" is injured.";
    }

    @Override 
    public String action1()
    {
        return paddle(); 
    }

    @Override
    public String toString()
    {
        String message="";
        message +="The "+getNameOfPart()+" is";
        if(getIsWorking()){
            message +=" working";
        }
        else{
            message +=" not working";
        }
        return message;
    }

    public String paddle()
    {
        if(getIsWorking())
        {
            if(((int)(Math.random()*100)+1)>90)
            {
                return injure()+"and the "+getNameOfPart()+" can not paddle.";
            }
            return "The "+getNameOfPart()+" paddles";
        }
        else{
            return "The "+getNameOfPart()+" does not paddle.";
        }
    }

    public void setLength(double length)
    {
        this.length=length;
    }

    public double getLength()
    {
        return length;
    }
}