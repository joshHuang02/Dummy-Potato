public class Shark extends Fish
{
    //variables
    private Nose nose;
    
    //constructors
    Shark(String colorEye, int lengthGillInCm, int lengthMouthInInches, String colorHeart,
    int lengthTailInCm, String name, double currentAgeInYears, double weightOfBrain, boolean isAlive, boolean isWorking, int noseSensitivity) {
        super(colorEye, lengthGillInCm, lengthMouthInInches, colorHeart, lengthTailInCm, name, currentAgeInYears, weightOfBrain, isAlive, isWorking);
        this.nose = new Nose("nose", isWorking, noseSensitivity);
    }

    Shark(int lengthGillInCm, int lengthMouthInInches, int lengthTailInCm, String name, double
    currentAgeInYears, double weightOfBrain, int noseSensitivity) {
        super("black", lengthGillInCm, lengthMouthInInches, "red", lengthTailInCm, name, currentAgeInYears, weightOfBrain, true, true);
        this.nose = new Nose("nose", true, noseSensitivity);
    }

    //methods
    public Nose getNose() {
        return this.nose;
    }

    @Override
    public String weakAction() {
        return swim();
    }

    @Override
    public String normalAction() {
        return blink();
    }

    @Override
    public String strongAction() {
        return feast();
    }
    
    @Override
    public String revive() {
        return regenerate();
    }
    
    public String swim() {
        String response;
        String finStatus;
        getRightPectoralFin().swim();
        getLeftPectoralFin().swim();
        getRightDorsalFin().swim();
        getLeftDorsalFin().swim();
        if (getRightPectoralFin().getIsWorking() == true && getLeftPectoralFin().getIsWorking() == true && getRightDorsalFin().getIsWorking() == true && getLeftDorsalFin().getIsWorking() == true) {
            finStatus = "All fins are working, and the " + getName() + " is swimming.";
        }
        else {
            finStatus = "One or more fins are not working, and the " + getName() + " cannot swim.";
        }
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking()) {
            response = "The animal is dead.";
        }
        else {
            response = getRightGill().breathe() + "\n" + getLeftGill().breathe() + "\n" + getTail().wag() + "\n" + finStatus + "\n" + getNose().breathe() + "\n" + getHeart().beat() + "\n" + getBrain().sendSignals();
        }
        return response;
    }

    public String blink() {
        String response;
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking()) {
            response = "The animal is dead.";
        }
        else {
            response = getRightEye().blink() + "\n" + getLeftEye().blink() + "\n" + getHeart().beat() + "\n" + getBrain().sendSignals();
        }
        return response;
    }

    public String feast() {
        String response;
        String finStatus;
        getRightPectoralFin().swim();
        getLeftPectoralFin().swim();
        getRightDorsalFin().swim();
        getLeftDorsalFin().swim();
        if (getRightPectoralFin().getIsWorking() == true && getLeftPectoralFin().getIsWorking() == true && getRightDorsalFin().getIsWorking() == true && getLeftDorsalFin().getIsWorking() == true) {
            finStatus = "All fins are working, and the " + getName() + " is swimming.";
        }
        else {
            finStatus = "One or more fins are not working, and the " + getName() + " cannot swim.";
        }
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking()) {
            response = "The animal is dead.";
        }
        else {
            response = getRightGill().breathe() + "\n" + getLeftGill().breathe() + "\n" + getTail().wag() + "\n" + finStatus +  "\n" + getMouth().eat() + "\n" + getHeart().beat() + "\n" + getBrain().sendSignals();
        }
        return response;
    }

    public String regenerate() {
        getRightEye().heal();
        getLeftEye().heal();
        getRightGill().heal();
        getLeftGill().heal();
        getMouth().heal();
        getNose().heal();
        getHeart().heal();
        getBrain().heal();
        getTail().heal();
        getRightPectoralFin().heal();
        getLeftPectoralFin().heal();
        getRightDorsalFin().heal();
        getLeftDorsalFin().heal();
        return "The " + getName() + " has been healed and all parts are working fine.";
    }
    
    @Override
    public String toString() {
        String message = "";
        message += super.toString();
        
        message += "\n" + "The " + getBrain().getNameOfPart() + " is " + getBrain().getWeightInPounds()+" lbs and is ";
        if(getBrain().getIsWorking()) {
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        message += "\n" + "The " + getLeftEye().getNameOfPart() + " is "+ getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        message += "\n" + "The " + getRightEye().getNameOfPart() + " is "+ getRightEye().getColor() +" and is ";
        if(getRightEye().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }
            
        message += "\n" + "The " + getRightGill().getNameOfPart() + " is "+ getRightGill().getLengthInCm() + " cm long and is ";
        if(getRightGill().getIsWorking()) {
            message += "working.";
        }
        else {
            message += "not working.";
        }
       
        message += "\n" + "The " + getLeftGill().getNameOfPart() + " is "+ getLeftGill().getLengthInCm() + " cm long and is ";
        if(getLeftGill().getIsWorking()) {
            message += "working.";
        }
        else {
            message += "not working.";
        }

        message += "\n" + "The " + getMouth().getNameOfPart() +" is " + getMouth().getMouthSizeInInches()+" inches and is ";
        if(getMouth().getIsWorking()) {
            message += "working.";
        }
        else {
            message += "not working.";
        }
            
        message += "\n" + "The " + getHeart().getNameOfPart() + " is " + getHeart().getColor()+" and is ";
        if(getHeart().getIsWorking()) {
            message += "working.";
        }
        else {
            message += "not working.";
        }

         message += "\n" + "The " + getTail().getNameOfPart() + " is " + getTail().getLengthInCm()+" and is ";
        if(getTail().getIsWorking()) {
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        message += "\n" + "The " + getRightPectoralFin().getNameOfPart() + " is ";
        if(getRightPectoralFin().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        message += "\n" + "The " + getLeftPectoralFin().getNameOfPart() + " is ";
        if(getLeftPectoralFin().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        message += "\n" + "The " + getRightDorsalFin().getNameOfPart() + " is ";
        if(getRightDorsalFin().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        message += "\n" + "The " + getLeftDorsalFin().getNameOfPart() + " is ";
        if(getLeftDorsalFin().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }

        message += "\n" + "The " + getNose().getNameOfPart() + " is ";
        if(getNose().getIsWorking()){
            message += "working.";
        }
        else {
            message += "not working.";
        }
        
        return message;
    }
}

