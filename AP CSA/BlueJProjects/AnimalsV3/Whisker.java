// Lucas W. and Ivy Z.
// FIXED: Issue with not using a singular class name
// FIXED: Issue with length without unit of measure
// FIXED: Issue with super not used correctly
// FIXED: Issue with missing getter and setter
/**
 * Write a description of class Whiskers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Whisker extends AnimalPart
{
    private int lengthInCm;

    
    public Whisker(int lengthlengthInCm, boolean isWorking){
        super("whisker", isWorking);
        this.lengthInCm = lengthInCm;
    }

    public String pull(){
        if(getIsWorking())
        {    
            return "The whisker gets pulled but not plucked out";
        }
        else
            return "The whisker gets plucked out";      
    }

    @Override
    public String injure(){
        setIsWorking(false);
        return "The whisker is out";
    }

    @Override
    public String heal(){
        if(getIsWorking())
            return "The whisker is already fine";
        else{
            setIsWorking(true);
            return "The whisker can be pulled now";
        }
    }

    @Override
    public String toString()
    {
        String i ="";
        if(getIsWorking()){
            i += "working";
        }else{
            i+= "not working";
        }
        return "The " +getNameOfPart()+" is " + i;
    }

    @Override
    public String action1(){
        return pull();
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
