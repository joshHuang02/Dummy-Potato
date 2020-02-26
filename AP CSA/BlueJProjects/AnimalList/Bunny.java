
public class Bunny extends Mammal 
{
    // instance variables
    private Arm rightArm;
    private Arm leftArm;
    private Leg rightLeg;
    private Leg leftLeg;
    private Tail tail;
    private Whisker rightWhisker;
    private Whisker leftWhisker;

    // constructors

    public Bunny (String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, 
    int noseSensitivity, String leftEarSize, String rightEarSize, double mouthSizeInInches, 
    String colorOfHeart, double rightArmLengthInInches, double leftArmLengthInInches, 
    int rightLegLengthInInches, int leftLegLengthInInches, int rightWhiskerLengthInCm, 
    int leftWhiskerLengthInCm, int tailLengthInCm)
    {
        super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, 
            nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, 
            colorOfHeart, "right eye", "left eye", "left ear", "right ear", "mouth", isAlive, 
            isAlive, isAlive, isAlive,isAlive, isAlive);
        this.rightArm = new Arm("right arm", rightArmLengthInInches, isAlive);
        this.leftArm = new Arm("left arm", leftArmLengthInInches, isAlive);
        this.rightLeg = new Leg("right leg", rightLegLengthInInches, isAlive);
        this.leftLeg = new Leg("left leg", rightLegLengthInInches, isAlive);
        this.tail = new Tail(tailLengthInCm, isAlive, "tail");
        this.rightWhisker = new Whisker(rightWhiskerLengthInCm, isAlive);
        this.leftWhisker = new Whisker(leftWhiskerLengthInCm, isAlive);

    }

    public Bunny (String name, double currentAge, double weightOfBrain, String rightEyeColor, 
    String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, 
    String leftEarSize, String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    double rightArmLengthInInches, double leftArmLengthInInches, int rightLegLengthInInches, 
    int leftLegLengthInInches, int rightWhiskerLengthInCm, int leftWhiskerLengthInCm, 
    int tailLengthInCm)
    {
        super(name, currentAge, true, weightOfBrain, rightEyeColor, leftEyeColor, 
            nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, 
            mouthSizeInInches, colorOfHeart, "right eye", "left eye", "left ear", "right ear", 
            "mouth", true, true, true, true, true, true);
        this.rightArm = new Arm("right arm", rightArmLengthInInches, true);
        this.leftArm = new Arm("left arm", leftArmLengthInInches, true);
        this.rightLeg = new Leg("right leg", rightLegLengthInInches, true);
        this.leftLeg = new Leg("left leg", rightLegLengthInInches, true);
        this.tail = new Tail(tailLengthInCm, true, "tail");
        this.rightWhisker = new Whisker(rightWhiskerLengthInCm, true);
        this.leftWhisker = new Whisker(leftWhiskerLengthInCm, true);

    }

    // methods

    @Override
    public String weakAction()
    {
        return jump();
    }

    @Override
    public String normalAction()
    {
        return consume();
    }

    @Override
    public String strongAction()
    {
        return digHole();
    }

    @Override
    public String revive()
    {
        setIsAlive(true);
        getBrain().setIsWorking(true);
        getRightEar().setIsWorking(true);
        getLeftEar().setIsWorking(true);
        getRightEye().setIsWorking(true);
        getLeftEye().setIsWorking(true);
        getNose().setIsWorking(true);
        getMouth().setIsWorking(true);
        rightWhisker.setIsWorking(true);
        leftWhisker.setIsWorking(true);
        getHeart().setIsWorking(true);
        rightArm.setIsWorking(true) ;
        leftArm.setIsWorking(true);
        rightLeg.setIsWorking(true);
        tail.setIsWorking(true);
        return "The bunny is healed.";
    }

    @Override
    public String toString()
    {
        String message = "This "+getName()+" is ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";

        message += ".\n   Brain weighs "+ getBrain().getWeightInPounds() +" lbs and is ";
        if(getBrain().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The" + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The" + getRightEye().getNameOfPart() + "is "+ getRightEye().getColor() +" and is ";
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

        message += ".\n   The left ear is "+ getLeftEar().getSize() +" inches and is ";
        if(getLeftEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right ear is "+ getRightEar().getSize() +" inches and is ";
        if(getRightEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The mouth is "+ getMouth().getMouthSizeInInches()+" inches and is ";
        if(getMouth().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right arm is "+ rightArm.getLengthInInches()+ " inches and is ";
        if(rightArm.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left arm is "+ leftArm.getLengthInInches()+ " inches and is ";
        if(leftArm.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right leg is "+ rightLeg.getlengthInInches()+ " inches and is ";
        if(rightLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left leg is "+ leftLeg.getlengthInInches()+ " inches and is ";
        if(leftLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right whisker is "+ rightWhisker.getLengthInCm()+ " cm and is ";
        if(rightWhisker.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left whisker is "+ leftWhisker.getLengthInCm()+ " cm and is ";
        if(leftWhisker.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }

    // Methods: getters and setters

    public Arm getRightArm(){
        return rightArm;
    }

    public Arm getLeftArm(){
        return leftArm;
    }
    
    public Leg getRightLeg(){
        return rightLeg;
    }
    
    public Leg getLeftLeg(){
        return leftLeg;
    }
    
    public Tail getTail(){
        return tail;
    }
    
    public Whisker getRightWhisker(){
        return rightWhisker;
    }
    
    public Whisker getLeftWhisker(){
        return leftWhisker;
    }
    
    public String jump()
    {
        if(!getHeart().getIsWorking())
        {
            return "The bunny is dead:(";
        }
        return rightArm.wave() + " " + leftArm.wave() + " " + 
        rightLeg.getIsWorking() + " " + leftLeg.getIsWorking() + " " +
        getHeart().beat() + " So the bunny is jumped.";
    }

    public String consume()
    {
        if(!getHeart().getIsWorking())
        {
            return "The bunny is dead:(";
        }
        return getBrain().sendSignals() + " " + getNose().getIsWorking() + " " +
        getMouth().eat() + " " + getHeart().beat() + 
        "So the bunny is ready to consume.";
    }

    public String digHole()
    {
        if(!getHeart().getIsWorking())
        {
            return "The bunny is dead:(";
        }
        return getRightEar().listenToMusic() + " " + getLeftEar().listenToMusic() + " " +
        getRightEye().blink() + " " + getLeftEye().blink() + " " + 
        rightWhisker.pull() + " " + leftWhisker.pull() + " " + tail.wag() + " " + 
        "So the bunny can dig hole.";
    }

}
