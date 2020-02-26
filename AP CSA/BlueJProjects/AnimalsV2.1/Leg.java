// Chris Gaw and Lauren Lee
// FIXED: Issue with not calling on super in constructor 

/**
 * Used to create obejcts of Leg
 * 
 * @author Chris Gaw and Lauren Lee
 * @version 1/14/2020
 */
public class Leg extends AnimalPart{
    //instance(s)
    private int lengthInInches;
    //constructor(s)
    public Leg(String name,int lengthInInches)
    {
        super(name, true);
        this.lengthInInches = lengthInInches;
    }

    public Leg(String name,int lengthInInches, boolean isWorking)
    {
        super(name, isWorking);
        this.lengthInInches = lengthInInches;
    }
    //method(s)
    public void setlengthInInches(int lengthInInches)
    {
        this.lengthInInches = lengthInInches;
    }

    public int getlengthInInches()
    {
        return lengthInInches;
    }

    @Override
    public String injure()
    {
        setIsWorking(false);
        return "The leg is broken.";
    }

    @Override
    public String heal()
    {
        if(getIsWorking()) {
            return "The leg was already working.";
        }
        else {
            setIsWorking(true);
            return "The leg is no longer broken.";
        }
    }

    public String step() 
    {
        if(getIsWorking()){
            if(((int)(Math.random()*100)+1)>90){
                setIsWorking(false);
                return injure()+" The leg can no longer move.";
            }
            else {
                return "The leg moved.";
            }
        }
        else {
            return "The leg can not move.";
        }
    }

    @Override
    public String action1(){
        return step();
    }

    @Override
    public String toString(){
        String message=getNameOfPart();
        if(getIsWorking()){
            message+=" is working. ";
        } else{
            message+=" is not working. ";
        }
        message+="The length in inches of "+getNameOfPart()+" is "+lengthInInches+".";
        return message;
    }
}