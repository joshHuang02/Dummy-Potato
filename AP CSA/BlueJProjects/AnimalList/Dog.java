public class Dog extends Mammal
{
    //instance variables
    private Leg frontLeftLeg;
    private Leg backLeftLeg;
    private Leg frontRightLeg;
    private Leg backRightLeg;
    private Tail tail;

    //constructors
    public Dog(String name, double currentAge, boolean isAlive, double weightOfBrain, String rightEyeColor, String leftEyeColor, 
    int noseSensitivity, String leftEarSize, String rightEarSize, double mouthSizeInInches, String colorOfHeart, String nameOfNose, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfRightEar, String nameOfLeftEar, String nameOfBackRightLeg, 
    String nameOfFrontRightLeg, String nameOfBackLeftLeg, String nameOfFrontLeftLeg, String nameOfTail, int lengthOfTailInCm, 
    int lengthOfBackRightLegInInches, int lengthOfBackLeftLegInInches, int lengthOfFrontRightLegInInches, int lengthOfFrontLeftLegInInches, 
    boolean tailIsWorking)
    {
        super(name, currentAge, isAlive, weightOfBrain, 
            rightEyeColor, leftEyeColor, nameOfNose, true, noseSensitivity, leftEarSize, 
            rightEarSize, mouthSizeInInches, colorOfHeart, 
            nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar,
            "mouth", true, true, true, true, 
            true, true);
        this.backRightLeg = new Leg(nameOfBackRightLeg, lengthOfBackRightLegInInches, isAlive);
        this.frontRightLeg = new Leg(nameOfFrontRightLeg, lengthOfFrontRightLegInInches, isAlive);
        this.backLeftLeg = new Leg(nameOfBackLeftLeg, lengthOfBackLeftLegInInches, isAlive);
        this.frontLeftLeg = new Leg(nameOfFrontLeftLeg, lengthOfFrontLeftLegInInches, isAlive);
        this.tail = new Tail(lengthOfTailInCm, isAlive, nameOfTail);
    }

    public Dog(String name, double currentAge, double weightOfBrain, String rightEyeColor, String leftEyeColor, int noseSensitivity, String leftEarSize, String rightEarSize, double mouthSizeInInches, String colorOfHeart, String nameOfNose, String nameOfRightEye, String nameOfLeftEye, String nameOfRightEar, String nameOfLeftEar, String nameOfBackRightLeg, String nameOfFrontRightLeg, String nameOfBackLeftLeg, String nameOfFrontLeftLeg, String nameOfTail, int lengthOfTailInCm, int lengthOfBackRightLegInInches, int lengthOfBackLeftLegInInches, int lengthOfFrontRightLegInInches, int lengthOfFrontLeftLegInInches, boolean tailIsWorking)
    {
        super(name, currentAge, weightOfBrain, rightEyeColor, leftEyeColor, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart, nameOfNose, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar);
        this.backRightLeg = new Leg(nameOfBackRightLeg, lengthOfBackRightLegInInches, true);
        this.frontRightLeg = new Leg(nameOfFrontRightLeg, lengthOfFrontRightLegInInches, true);
        this.backLeftLeg = new Leg(nameOfBackLeftLeg, lengthOfBackLeftLegInInches, true);
        this.frontLeftLeg = new Leg(nameOfFrontLeftLeg, lengthOfFrontLeftLegInInches, true);
        this.tail = new Tail(lengthOfTailInCm, true, nameOfTail);
    }
    //methods
    public Leg getFrontLeftLeg()
    {
        return this.frontLeftLeg;
    }

    public Leg getBackLeftLeg()
    {
        return this.backLeftLeg;
    }

    public Leg getFrontRightLeg()
    {
        return this.frontRightLeg;
    }

    public Leg getBackRightLeg()
    {
        return this.backRightLeg;
    }

    public Tail getTail()
    {
        return this.tail;
    }
    
    @Override
    public String revive()
    {
        return getBrain().heal() + "\n" + 
        getHeart().heal() + "\n" + 
        getLeftEye().heal() + "\n" + 
        getRightEye().heal() + "\n" + 
        this.frontLeftLeg.heal() + "\n" + 
        this.backLeftLeg.heal() + "\n" + 
        this.frontRightLeg.heal() + "\n" + 
        this.backRightLeg.heal() + "\n" + 
        this.tail.heal() + "\n" + 
        getMouth().heal() + "\n" + 
        getLeftEar().heal() + "\n" + 
        getRightEar().heal() + "\n" + 
        getNose().heal();
    }

    public String injure()
    {
        return getNose().injure() + "/n" + getLeftEye().injure() + "/n" + getRightEye().injure() + "/n" + getLeftEar().injure() + "/n" + 
        getRightEar().injure() + "/n" + getMouth().injure() + "/n" + getHeart().injure() + "/n" + getFrontLeftLeg().injure() + "/n" + 
        getBackLeftLeg().injure() + "/n" + getFrontRightLeg().injure() + "/n" + getBackRightLeg().injure(); 
    }

    @Override
    public String toString()
    {
        String message = "";
        message += super.toString();
        message += ".\n   The leg is "+ getBackLeftLeg().getlengthInInches()+" inches and is ";
        if(getBackLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The leg is "+ getFrontLeftLeg().getlengthInInches()+" inches and is ";
        if(getFrontLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The leg is "+ getBackRightLeg().getlengthInInches()+" inches and is ";
        if(getBackRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The leg is "+ getFrontRightLeg().getlengthInInches()+" inches and is ";
        if(getFrontRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The tail is "+ getTail().getLengthInCm()+" cms and is ";
        if(getTail().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        return message;
    }

    public String run()
    {
        if(!getHeart().getIsWorking()) {
            return "The animal is dead.";
        }
        return this.frontLeftLeg.step() + " " + this.backLeftLeg.step() + " " + this.frontRightLeg.step() + " " + this.backRightLeg.step() + " " + getHeart().beat() + " " + getBrain().sendSignals();
    }

    public String dinner()
    {
        if(!getHeart().getIsWorking()) {
            return "The animal is dead.";
        }
        return getNose().breathe() + " " + getMouth().eat() + " " + this.tail.wag() + " " + getHeart().beat() + " " + getBrain().sendSignals();

    }

    public String goCrazy()
    {
        if(!getHeart().getIsWorking()) {
            return "The animal is dead.";
        }

        return getBrain().sendSignals() + " " + getHeart().beat() + " " + getLeftEye().blink() + " " + getRightEye().blink() + " " + this.frontLeftLeg.step() + " " + this.backLeftLeg.step() + " " + 
        this.frontRightLeg.step() + " " + this.backRightLeg.step() + " " + this.tail.wag() + " " + getMouth().eat() + " " + getLeftEar().listenToMusic() + " " + getRightEar().listenToMusic() + " " + getNose().breathe();

    }

    @Override
    public String weakAction()
    {
        return this.run();
    }

    @Override
    public String normalAction()
    {
        return this.dinner();
    }

    @Override
    public String strongAction()
    {
        return this.goCrazy();
    }

}