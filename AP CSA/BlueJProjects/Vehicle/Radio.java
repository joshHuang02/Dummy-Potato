public class Radio extends CarComponent
{
    private int numberOfSpeaker;
    private boolean circuitBoardIsWorking;
    private boolean speakerIsWorking;

    public Radio(int numberOfSpeaker, boolean speakerIsWorking, boolean circuitBoardIsWorking, boolean isWorking, String nameOfComponent, double minutesUsedWithoutRest){
        super(nameOfComponent, isWorking);
        this.numberOfSpeaker = numberOfSpeaker;
        this.speakerIsWorking = speakerIsWorking;
        this.circuitBoardIsWorking = circuitBoardIsWorking;
    }
    
    public Radio(int numberOfSpeaker, boolean speakerIsWorking, boolean circuitBoardIsWorking){
        super("radio", true);
        this.numberOfSpeaker = numberOfSpeaker;
        this.speakerIsWorking = speakerIsWorking;
        this.circuitBoardIsWorking = circuitBoardIsWorking;
    }
    
    @Override
    public String toString(){
        String message = "";
        if(getIsWorking()) {
            message += "The " + getNameOfComponent() + " is working.\n";
        }
        else {
            message += "The " + getNameOfComponent() + " is not working.\n"; 
        }
        if(numberOfSpeaker == 1){
            message += "   The " + getNameOfComponent() + " has one speaker.\n";
        }
        else{
            message += "   The " + getNameOfComponent() + " has " + numberOfSpeaker + " speakers.\n";
        }
        if(speakerIsWorking){
            message += "   The speaker of the " + getNameOfComponent() + " is working.\n";
        }
        else{
            message += "   The speaker of the " + getNameOfComponent() + " is not working.\n";
        }
        if(circuitBoardIsWorking){
            message += "   The circuit board of the " + getNameOfComponent() + " is working.\n";
        }
        else{
            message += "   The circuit board of the " + getNameOfComponent() + " is not working.\n";
        }
        
        return message;
    }
    
    @Override
    public String action1(){
        return playMusicForThirtyMinutes();
    }
    
    @Override
    public String action2(){
        return playNewsForThirtyMinutes();
    }
    
    
    public String playMusicForThirtyMinutes(){
        if(getIsWorking() && circuitBoardIsWorking && speakerIsWorking) {
           if(!super.conditionalCheck()){
               return "The " + getNameOfComponent() + " failed to play music.\n";
           }
           else{
               return "The " + getNameOfComponent() + " played music.\n";
           }
        }
        else{
            return "The " + getNameOfComponent() + " cannot play music.\n";
        }
    }
    
    public String playNewsForThirtyMinutes(){
        if(getIsWorking() && circuitBoardIsWorking && speakerIsWorking){
           if(!super.conditionalCheck()){
               return "The " + getNameOfComponent() + " failed to play the news.\n";
           }
           else{
               return "The " + getNameOfComponent() + " played the news.\n";
           }
        }
        else{
            return "The " + getNameOfComponent() + " cannot play the news.\n";
        }
    }
    
    @Override
    public String damage(){
        this.circuitBoardIsWorking = false;
        this.speakerIsWorking = false;
        setIsWorking(false);
        return "The radio is now not working";
    }
    
    @Override
    public String fix(){
        this.circuitBoardIsWorking = true;
        this.speakerIsWorking = true;
        setIsWorking(true);
        return "The radio is now working";
    }
    
    public void setNumberOfSpeaker(int number){
        this.numberOfSpeaker = number;
    }
    public int getNumberOfSpeaker(){
        return this.numberOfSpeaker;
    }
    
    public void setCircuitBoardIsWorking(boolean working){
        this.circuitBoardIsWorking = working;
    }
    public boolean getCircuitBoeardIsWorking(){
        return this.circuitBoardIsWorking;
    } 
    
    public void setSpeakerIsWorking(boolean working){
        this.speakerIsWorking = working;
    }
    public boolean getSpeakerIsWorking(){
        return this.speakerIsWorking;
    } 
}
