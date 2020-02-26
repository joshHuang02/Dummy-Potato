// Eva Luo and Phillip Zhou
// FIXED: Issue with name of getter and setter
// FIXED: Issue with name of constructor local variables
// Removed constructor

public class Tail extends AnimalPart{
    private int lengthInCm; 

    public Tail(int lengthInCm, boolean isWorking, String nameOfPart){
        super(nameOfPart, isWorking);
        this.lengthInCm = lengthInCm; 
    }

    public String wag(){
        if (getIsWorking()){
            return getNameOfPart() + " wags."; 
        }
        else{
            return getNameOfPart() + " cannot wag.";
        }

    }

    @Override
    public String action1(){
        return wag();  
    }

    @Override
    public String injure(){
        setIsWorking(false); 
        return "You broke its" + getNameOfPart() + ".";
    }

    @Override
    public String heal(){
        setIsWorking(true); 
        return "you gave " + getNameOfPart() +" a healing potion." + getNameOfPart() +" is working now!";
    }

    @Override
    public String toString(){
        String message = "The " + getNameOfPart() + " is "; 
        if(getIsWorking()){
            message+= "working. \n"; 
        }else{
            message+= "not working. \n"; 
        }
        message+= "The name of the " + getNameOfPart() + " is " + getNameOfPart() + ".\n"; 
        message+= "The length in centimeter of the " + getNameOfPart() + " is " + lengthInCm;
        return message; 
    }

    public int getLengthInCm(){
        return lengthInCm; 
    }

    public void setLengthInCm(int lengthInCm){
        this.lengthInCm = lengthInCm;
    }

}