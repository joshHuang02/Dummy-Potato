// Liam M. and Peter H.
// FIXED: Issue with having isUsable
// FIXED: Issue with calling on super (should always be called as good practice)
// FIXED: Issue with action1
// Removed 2 constructors

public class Stinger extends AnimalPart{
    //instance variables
    private boolean hasVenom;
    private int lengthInMM;
    //constructors
    public Stinger(boolean isWorking, boolean hasVenom, int lengthInMM, String nameOfPart){
        super(nameOfPart, isWorking);
        this.hasVenom = hasVenom;
        this.lengthInMM = lengthInMM;
    }
    //getters, setters, and methods
    public boolean getHasVenom(){
        return hasVenom;
    }

    public void setHasVenom(boolean hasVenom){
        this.hasVenom = hasVenom;
    }

    public int getLengthInMM(){
        return lengthInMM;
    }

    public void setLengthInMM(int lengthInMM){
        this.lengthInMM= lengthInMM;
    }

    public String sting(){
        if(getIsWorking() && hasVenom){
            setIsWorking(false);
            hasVenom = false;
            return "The animal has used sting";
        }else{
            return "The animal can't use sting";
        }
    }

    @Override
    public String action1(){
        return sting();
    }

    @Override
    public String injure(){
        setIsWorking(false);
        return "The stinger is no longer working";
    }

    @Override
    public String heal(){
        if(!getIsWorking()){
            setIsWorking(true);
            return "The stinger is now usable";
        }else{
            return "The stinger was already usable";
        }
    }

    @Override
    public String toString(){
        String message = "";
        message += "The " + getNameOfPart() + " is ";
        if(getIsWorking()){
            message += "working fine";
        }else{
            message += "not working";
        }
        return message;
    }
}

