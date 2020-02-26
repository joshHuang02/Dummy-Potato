public class Cat extends Mammal
{
    // instance variables - replace the example below with your own
    private Leg frontLeftLeg;
    private Leg frontRightLeg;
    private Leg backLeftLeg;
    private Leg backRightLeg;
    private Tail tail;
    private Whisker topRightWhisker;
    private Whisker middleRightWhisker;
    private Whisker bottomRightWhisker;
    private Whisker topLeftWhisker;
    private Whisker middleLeftWhisker;
    private Whisker bottomLeftWhisker;


    public Cat(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEar, String nameOfLeftEar, String nameOfLeftEye, String nameOfRightEye,
    String nameOfBackLeftLeg, String nameOfBackRightLeg, String nameOfFrontRightLeg, String nameOfFrontLeftLeg, int lengthOfLeg, int lengthOfTail,
    String nameOfTail, boolean tailIsWorking, int lengthOfWhisker, boolean whiskerIsWorking)
    {
        super(name,currentAge,isAlive,weightOfBrain, 
        rightEyeColor,leftEyeColor, "Nose", true,noseSensitivity,leftEarSize, 
        rightEarSize, mouthSizeInInches, colorOfHeart, 
        nameOfRightEye,nameOfLeftEye, nameOfLeftEar, nameOfRightEar,
        "Mouth", true,true,true,true,true,true);
        this.frontLeftLeg = new Leg(nameOfFrontLeftLeg, lengthOfLeg);
        this.frontRightLeg = new Leg(nameOfFrontRightLeg, lengthOfLeg);
        this.backLeftLeg = new Leg(nameOfBackLeftLeg, lengthOfLeg);
        this.backRightLeg = new Leg(nameOfBackRightLeg, lengthOfLeg);
        this.tail = new Tail(lengthOfTail, tailIsWorking, nameOfTail);
        this.topRightWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.middleRightWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.bottomRightWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.topLeftWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.middleLeftWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.bottomLeftWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
    }
    public Cat(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEar, String nameOfLeftEar, String nameOfRightEye, String nameOfLeftEye,
    String nameOfBackLeftLeg, String nameOfBackRightLeg, String nameOfFrontRightLeg, 
    String nameOfFrontLeftLeg, boolean frontLeftLegIsWorking, boolean frontRightLegIsWorking, boolean backLeftLegIsWorking,
    boolean backRightLegIsWorking,
    int lengthOfLeg, int lengthOfTail,
    String nameOfTail, boolean tailIsWorking, int lengthOfWhisker, boolean whiskerIsWorking)
    {
        super(name,currentAge,isAlive,weightOfBrain, 
        rightEyeColor,leftEyeColor, "Nose", true,noseSensitivity,leftEarSize, 
        rightEarSize, mouthSizeInInches, colorOfHeart, 
        nameOfRightEye,nameOfLeftEye, nameOfLeftEar, nameOfRightEar,
        "Mouth", true,true,true,true,true,true);
        this.frontLeftLeg = new Leg(nameOfFrontLeftLeg, lengthOfLeg, frontLeftLegIsWorking);
        this.frontRightLeg = new Leg(nameOfFrontRightLeg, lengthOfLeg, frontRightLegIsWorking);
        this.backLeftLeg = new Leg(nameOfBackLeftLeg, lengthOfLeg, backLeftLegIsWorking);
        this.backRightLeg = new Leg(nameOfBackRightLeg, lengthOfLeg,backRightLegIsWorking);
        this.tail = new Tail(lengthOfTail, tailIsWorking, nameOfTail);
        this.topRightWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.middleRightWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.bottomRightWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.topLeftWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.middleLeftWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
        this.bottomLeftWhisker = new Whisker(lengthOfWhisker, whiskerIsWorking);
    }
    public Leg getFrontLeftLeg()
    {
        return this.frontLeftLeg;
    }
    public Leg getFrontRightLeg()
    {
        return this.frontRightLeg;
    }
    public Leg getBackLeftLeg()
    {
        return this.frontLeftLeg;
    }
    public Leg getBackRightLeg()
    {
        return this.frontRightLeg;
    }
    public Tail getTail()
    {
        return this.tail;
    }
    public Whisker getTopRightWhisker()
    {
        return this.topRightWhisker;
    }
    public Whisker getMiddleRightWhisker()
    {
        return this.middleRightWhisker;
    }
    public Whisker getBottomRightWhisker()
    {
        return this.bottomRightWhisker;
    }
    public Whisker getTopLeftWhisker()
    {
        return this.topLeftWhisker;
    }
    public Whisker getMiddleLeftWhisker()
    {
        return this.middleLeftWhisker;
    }
    public Whisker getBottomLeftWhisker()
    {
        return this.bottomLeftWhisker;
    }
    @Override
    public String toString()
    {
         String message = "This "+getName()+" is ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";
        
        message += ".\n   Brain weighs "+ getBrain().getWeightInPounds()+" lbs and is ";
        if(getBrain().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The " + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The " + getRightEye().getNameOfPart() + "is "+ getRightEye().getColor() +" and is ";
        if(getRightEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";   
       
        message += ".\n   The heart is "+ getHeart().getColor()+" and is ";
        if(getHeart().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The nose is ";
        if(getNose().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left ear is "+ getLeftEar().getSize()+" inches and is ";
        if(getLeftEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right ear is "+ getRightEar().getSize()+" inches and is ";
        if(getRightEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The mouth is "+ getMouth().getMouthSizeInInches()+" inches and is ";
        if(getMouth().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The front left leg is "+ getFrontLeftLeg().getlengthInInches()+" inches and is ";
        if(getFrontLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The front right leg is "+ getFrontRightLeg().getlengthInInches()+" inches and is ";
        if(getFrontRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The back left leg is "+ getBackLeftLeg().getlengthInInches()+" inches and is ";
        if(getBackLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The back right leg is "+ getBackRightLeg().getlengthInInches()+" inches and is ";
        if(getBackRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The tail is "+ getTail().getLengthInCm()+" centimeters and is ";
        if(getTail().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The top right whisker is "+ getTopRightWhisker().getLengthInCm()+" centimeters and is ";
        if(getTopRightWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The middle right whisker is "+ getMiddleRightWhisker().getLengthInCm()+" centimeters and is ";
        if(getMiddleRightWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The bottom right whisker is "+ getBottomRightWhisker().getLengthInCm()+" centimeters and is ";
        if(getBottomRightWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The top left whisker is "+ getTopLeftWhisker().getLengthInCm()+" centimeters and is ";
        if(getTopLeftWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The middle left whisker is "+ getMiddleLeftWhisker().getLengthInCm()+" centimeters and is ";
        if(getMiddleLeftWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The bottom left whisker is "+ getBottomLeftWhisker().getLengthInCm()+" centimeters and is ";
        if(getBottomLeftWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }
    @Override
    public String weakAction()
    {
        return sniff();
    }
    @Override
    public String normalAction()
    {
        return eat();
    }
    @Override
    public String strongAction()
    {
        return pounce();
    }    
    public String eat()
    {
        String action = getHeart().beat() + "\n" + getBrain().sendSignals() + "\n" + getMouth().eat();
        if(!(getHeart().getIsWorking()) || !(getBrain().getIsWorking()))
        {
            return getName() + " is dead";
        }
        else if(!getMouth().getIsWorking())
        {
            return "The mouth is injured";
        }
        else
        {
            return action;
        }
    }
    public String sniff()
    {
        String action = getHeart().beat() + "\n" + getBrain().sendSignals() + "\n" + getNose().breathe();;
        if(!(getHeart().getIsWorking()) || !(getBrain().getIsWorking()))
        {
            return getName() + " is dead";
        }
        else if(!(getNose().getIsWorking()))
        {
            return "The nose is stuffed";
        }
        else
        {
            return action;
        }
        
    }
    public String pounce()
    {
        String action = getHeart().beat() + "\n" + getBrain().sendSignals() + "\n" + getBackRightLeg().step() + "\n" + getBackLeftLeg().step() + "\n" + getFrontRightLeg().step()+ "\n" + getFrontLeftLeg().step();
        if(!(getHeart().getIsWorking()) || !(getBrain().getIsWorking()))
        {
            return getName() + " is dead";
        }
        else if(!(getMouth().getIsWorking()))
        {
            return "The mouth is injured";
        }
        else
        {
            return action;
        }
    }
     public String visitVet()
    {
        getBrain().heal();
        getLeftEar().heal();
        getRightEar().heal();
        getLeftEye().heal();
        getRightEye().heal();
        getMouth().heal();
        getBackRightLeg().heal();
        getBackLeftLeg().heal();
        getFrontRightLeg().heal();
        getFrontLeftLeg().heal();
        getTail().heal();
        getTopRightWhisker().heal();
        getMiddleRightWhisker().heal();
        getBottomRightWhisker().heal();
        getTopLeftWhisker().heal();
        getMiddleLeftWhisker().heal();
        getBottomLeftWhisker().heal();
        getHeart().heal();
        getNose().heal();
        return getName() + " was healed.";
    }
    @Override
    public String revive()
    {
        setIsAlive(true);
        return visitVet();
    }
}
