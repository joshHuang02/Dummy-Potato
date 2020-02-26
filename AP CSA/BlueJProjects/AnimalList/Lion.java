
/**
 * Write a description of class Lion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lion extends Mammal
{
       //instance variables
    private Leg leftFrontLeg;
    private Leg leftBackLeg;
    private Leg rightFrontLeg;
    private Leg rightBackLeg;
    private Tail tail;
    private Whisker firstRightWhisker;
    private Whisker firstLeftWhisker;
    private Whisker secondRightWhisker;
    private Whisker secondLeftWhisker;
    
    
    //brain, heart, 2 eyes, 2 ears, nose, mouth are extended
    //Constructors
    public Lion(String name, double currentAge, boolean isAlive, 
    double weightOfBrain, String rightEyeColor, String leftEyeColor,
    int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, 
    String colorOfHeart, String nameOfRightEye, String nameOfLeftEye, 
    String nameOfLeftEar, String nameOfRightEar, 
    int lengthOfLeftFrontLegInInches, int lengthOfLeftBackLegInInches,
    int lengthOfRightFrontLegInInches,int lengthOfRightBackLegInInches, 
    String nameOfLeftFrontLeg, String nameOfLeftBackLeg, 
    String nameOfRightFrontLeg, String nameOfRightBackLeg, 
    int lengthOfFirstRightWhiskerInCentimeters, 
    int lengthOfFirstLeftWhiskerInCentimeters,
    int lengthOfSecondRightWhiskerInCentimeters, 
    int lengthOfSecondLeftWhiskerInCentimeters,
    String nameOfFirstRightWhisker,
    String nameOfFirstLeftWhisker,  
    String nameOfSecondRightWhisker,
    String nameOfSecondLeftWhisker,
    int tailLengthInCentimeters){
        super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, 
            leftEyeColor, "nose",isAlive, noseSensitivity, leftEarSize, rightEarSize, 
            mouthSizeInInches, colorOfHeart, nameOfRightEye,nameOfLeftEye,
            nameOfLeftEar, nameOfRightEar, "mouth", isAlive, isAlive, isAlive, isAlive, isAlive, isAlive);
            // String name, double currentAge, boolean isAlive, double weightOfBrain, 
    // String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    // String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    // String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    // String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    // boolean heartIsWorking
        this.tail = new Tail(tailLengthInCentimeters,isAlive,"tail");
        this.leftFrontLeg = new Leg(nameOfLeftFrontLeg,lengthOfLeftFrontLegInInches,
            isAlive);
        this.leftBackLeg = new Leg(nameOfLeftBackLeg,lengthOfLeftBackLegInInches,
            isAlive);
        this.rightFrontLeg = new Leg(nameOfRightFrontLeg,lengthOfRightFrontLegInInches,
            isAlive);
        this.rightBackLeg = new Leg(nameOfRightBackLeg,lengthOfRightBackLegInInches,
            isAlive);
        this.firstRightWhisker = new Whisker(lengthOfFirstRightWhiskerInCentimeters,isAlive);
        this.firstLeftWhisker = new Whisker(lengthOfFirstLeftWhiskerInCentimeters,isAlive); 
        this.secondRightWhisker = new Whisker(lengthOfSecondRightWhiskerInCentimeters,isAlive);
        this.secondLeftWhisker = new Whisker(lengthOfSecondLeftWhiskerInCentimeters,isAlive);
    }
    
    public Lion(String name, double currentAge, 
    double weightOfBrain, String rightEyeColor, String leftEyeColor,
    int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, 
    String colorOfHeart, String nameOfRightEye, String nameOfLeftEye, 
    String nameOfLeftEar, String nameOfRightEar, 
    int lengthOfLeftFrontLegInInches, int lengthOfLeftBackLegInInches,
    int lengthOfRightFrontLegInInches,int lengthOfRightBackLegInInches, 
    String nameOfLeftFrontLeg, String nameOfLeftBackLeg, 
    String nameOfRightFrontLeg, String nameOfRightBackLeg, 
    int lengthOfFirstRightWhiskerInCentimeters, 
    int lengthOfFirstLeftWhiskerInCentimeters,
    int lengthOfSecondRightWhiskerInCentimeters, 
    int lengthOfSecondLeftWhiskerInCentimeters,
    String nameOfFirstRightWhisker,
    String nameOfFirstLeftWhisker,  
    String nameOfSecondRightWhisker,
    String nameOfSecondLeftWhisker,
    int tailLengthInCentimeters ){
          super(name, currentAge, true, weightOfBrain, rightEyeColor, 
            leftEyeColor, "nose",true, noseSensitivity, leftEarSize, rightEarSize, 
            mouthSizeInInches, colorOfHeart, nameOfRightEye,nameOfLeftEye,
            nameOfLeftEar, nameOfRightEar, "mouth", true, true, true, true, true, true);
        this.tail = new Tail(tailLengthInCentimeters,true,"tail");
        this.leftFrontLeg = new Leg(nameOfLeftFrontLeg,lengthOfLeftFrontLegInInches,
           true);
        this.leftBackLeg = new Leg(nameOfLeftBackLeg,lengthOfLeftBackLegInInches,
            true);
        this.rightFrontLeg = new Leg(nameOfRightFrontLeg,lengthOfRightFrontLegInInches,
           true);
        this.rightBackLeg = new Leg(nameOfRightBackLeg,lengthOfRightBackLegInInches,
            true);
        this.firstRightWhisker = new Whisker(lengthOfFirstRightWhiskerInCentimeters,true);
        this.firstLeftWhisker = new Whisker(lengthOfFirstLeftWhiskerInCentimeters,true); 
        this.secondRightWhisker = new Whisker(lengthOfSecondRightWhiskerInCentimeters,true);
        this.secondLeftWhisker = new Whisker(lengthOfSecondLeftWhiskerInCentimeters,true);
    }


    //Don't know what to do for 2nd constructor
    //Methods

    @Override
    public String toString()
    {
        String message = "";
        message+= super.toString();

        message += ".\n   The first right Whisker is "+ firstRightWhisker.getLengthInCm()+" centimeters and is ";    
        if(firstRightWhisker.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The first left Whisker is "+ firstLeftWhisker.getLengthInCm()+" centimeters and is ";    
        if(firstLeftWhisker.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The second right Whisker is "+ secondRightWhisker.getLengthInCm()+" centimeters and is ";    
        if(secondRightWhisker.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The second left Whisker is "+ secondLeftWhisker.getLengthInCm()+" centimeters and is ";    
        if(secondLeftWhisker.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left front leg is "+ leftFrontLeg.getlengthInInches()+" inches and is ";    
        if(leftFrontLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left back leg is "+ leftBackLeg.getlengthInInches()+" inches and is ";    
        if(leftBackLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right front leg is "+ rightFrontLeg.getlengthInInches()+" inches and is ";    
        if(rightFrontLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The right back leg is "+ rightBackLeg.getlengthInInches()+" inches and is ";    
           if(rightBackLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            return message;
            
    }
    
    public String pounce(){
       rightFrontLeg.action1();   
       leftFrontLeg.action1();
       rightBackLeg.action1();
       leftBackLeg.action1();
       getHeart().action1();
       tail.action1();
       getBrain().action1();
        //kicks legs, uses heart, wags tail, eyes, brain, ears
        if(!getHeart().getIsWorking()|| !getBrain().getIsWorking()){
            return getName() + " is dead." +"\n";
        }
        if(!rightFrontLeg.getIsWorking() || !rightBackLeg.getIsWorking() || !leftFrontLeg.getIsWorking()||!leftBackLeg.getIsWorking()){
            return getName() + " cannot pounce (the legs don't work)."+"\n";
        }
        if(!getRightEar().getIsWorking()){
            return getName() + " cannot pounce (cannot hear prey move)."+"\n";
        }
        return getName() + " can pounce" + "\n";   
    }
    
    public String sniff(){
        getMouth().action1();
        getHeart().action1();
        getBrain().action1();
        getNose().action1();

    if(!getHeart().getIsWorking() || !getBrain().getIsWorking())
            return getName() + " is dead."+"\n";
    if(!getNose().getIsWorking()){   
        return getName() + " cannot sniff out prey."+"\n";
    }
    return getName() + " can sniff"+"\n";
    }
    
    public String lookForPrey(){
        getBrain().action1();
        getHeart().action1();
        getRightEar().action1(); //lion needs to listen for movement of prey
        getLeftEar().action1();
        firstRightWhisker.action1();
        secondRightWhisker.action1();
        firstLeftWhisker.action1();
        secondLeftWhisker.action1();//whiskers allow lions to see in the dark, so that it can see the prey it sniffs
        getRightEye().action1();
        getLeftEye().action1();

        if(!this.getRightEye().getIsWorking() || !this.getLeftEye().getIsWorking()){

            return "The animal cannot look for prey because one or both of it's eyes don't work."+"\n";

        }
        if(!this.getHeart().getIsWorking() || !this.getBrain().getIsWorking()){
            return "The animal is dead."+"\n";
        }     
        return getName() + " can look for prey."+"\n";
    }
    public String goToVet(){
        
        this.leftFrontLeg.heal();
        getLeftBackLeg().heal();
        getRightBackLeg().heal();
        getRightFrontLeg().heal();
        getTail().heal(); 
        getMouth().heal();
        getRightEye().heal();
        getLeftEye().heal();
        getHeart().heal();
        firstRightWhisker.heal();
        firstLeftWhisker.heal();
        secondRightWhisker.heal();
        secondLeftWhisker.heal();
        getBrain().heal();
        getRightEar().heal();
        getLeftEar().heal();
        getNose().heal();
        setIsAlive(true);
        return getName() + " is healed" +"\n";
    }
    
    @Override
    public String weakAction(){
        return sniff();
    }
    
    @Override
    public String normalAction(){
        return lookForPrey();
    }
    
    @Override 
    public String strongAction(){
       return pounce();
    }
    
    @Override 
    public String revive(){
       return goToVet();
    }
    
    
    //getter methods
    
   
    public Leg getLeftFrontLeg(){
        return this.leftFrontLeg;
    }
     public Leg getLeftBackLeg(){
      return this.leftBackLeg;
    }
    public Leg getRightFrontLeg(){
        return this.rightFrontLeg;
    }
    public Leg getRightBackLeg(){
        return this.rightBackLeg;
    }
    public Tail getTail(){
        return this.tail;
    }
    public Whisker getFirstRightWhisker(){
        return this.firstRightWhisker;
    }
    public Whisker getFirstLeftWhisker(){
        return this.firstLeftWhisker;
    }
    public Whisker getSecondRightWhisker(){
        return this.secondRightWhisker;
    }
     public Whisker getSecondLeftWhisker(){
        return this.secondLeftWhisker;
    }
 
   
}
