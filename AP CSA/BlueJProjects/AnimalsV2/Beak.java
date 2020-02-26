// Kenzo Khowdee and Tim Deng
// FIXED: Issue with isWorking being present
// FIXED: Issue with not calling on super
// FIXED: Issue with not identifying unit of measure for length
// FIXED: Issue with action1

/**
 * Write a description of class Beak here.
 *
 * @author Kenzo Khowdee Tim Deng
 * @version 1/14/2020
 */
public class Beak extends AnimalPart
{
    //instance variables
    private double lengthInCm;
    //constructors
    public Beak(double lengthInCm, boolean isWorking){
        super("beak", isWorking);
        this.lengthInCm = lengthInCm;
    }

    public Beak(double lengthInCm){
        super("beak", true);
        this.lengthInCm = lengthInCm;
    }
    //methods, accessors, mutators
    public String action1()
    {
        return peck();
    }

    public String peck()
    {
        if (getIsWorking()){
            if((int)(Math.random() * 100) + 1 > 70){
                return injure() + "The beak cannot peck";
            }
            return "The beak pecks";   
        }
        else{
            return "The beak does not peck";   
        }
    }

    public String injure()
    {
        setIsWorking(false);
        return "The beak is injured " + getNameOfPart();
    }

    public String heal()
    {
        if (getIsWorking()){
            setIsWorking(true);   
            return "The beak was already fine";
        }
        else{
            return "The beak is now working";
        }
    }

    public String toString(){
        String message = "";
        message += "The " +getNameOfPart() + " is ";
        if(getIsWorking()){
            message+= "alive and working.";
        }
        else{
            message+= "dead and broken.";
        }
        return message;
    }

    public void setLengthInCm(double lengthInCm){
        this.lengthInCm = lengthInCm;
    }

    public double getLengthInCm(){
        return this.lengthInCm;   
    }
}
