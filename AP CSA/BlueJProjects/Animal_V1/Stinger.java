public class Stinger{
    //instance variables
    private boolean isUsable;
    private boolean hasVenom;
    private int lengthInMM;
    //constructors
    public Stinger(boolean isUsable, boolean hasVenom, int lengthInMM){
        this.isUsable = isUsable;
        this.hasVenom = hasVenom;
        this.lengthInMM = lengthInMM;
    }
    public Stinger(boolean isUsable, boolean hasVenom){
        this.isUsable = isUsable;
        this.hasVenom = hasVenom;
        lengthInMM = 1;
    }
    public Stinger(){
        isUsable = true;
        hasVenom = true;
        lengthInMM = 1;
    }
    //getters, setters, and methods
    public boolean getIsUsable(){
        return isUsable;
    }
    public void setIsUsable(boolean isUsable){
        this.isUsable = isUsable;
    }
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
    public String injure(){
        isUsable = false;
        return "The stinger is broken";
    }
    public String heal(){
        if(!isUsable){
            isUsable = true;
            return "The stinger is now usable";
        }else{
            return "The stinger was already usable";
        }
    }
    public String sting(){
        if(isUsable && hasVenom){
            isUsable = false;
            hasVenom = false;
            return "The animal has used sting";
        }else{
            return "The animal can't use sting";
        }
    }
    }

