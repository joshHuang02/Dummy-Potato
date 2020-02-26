
public class Panda extends Mammal
{
    //instance variables
    private Tail tail;
    private Leg rightLeg;
    private Leg leftLeg;
    private Arm rightArm;
    private Arm leftArm;
    
    //constructors
    public Panda(String name, double currentAge, boolean isAlive, double weightOfBrain,
        String rightEyeColor, String leftEyeColor, String noseName, boolean noseIsWorking, int noseSensitivity, String leftEarSize,
        String rightEarSize, double mouthSizeInInches, String colorOfHeart, String nameOfRightEye,
        String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth, 
        boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
        boolean heartIsWorking, int tailLengthInCm, int rightLegLength, int leftLegLength, double rightArmLength, double leftArmLength, String rightLegName, 
        String leftLegName, String rightArmName, String leftArmName, String tailName, boolean tailIsWorking, boolean rightLegIsWorking, 
        boolean leftLegIsWorking, boolean rightArmIsWorking, boolean leftArmIsWorking){
        super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, noseName, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, 
        mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth, leftEyeIsWorking, rightEyeIsWorking, 
        leftEarIsWorking, rightEarIsWorking, mouthIsWorking, heartIsWorking);
        this.tail = new Tail(tailLengthInCm, tailIsWorking, tailName);
        this.rightLeg = new Leg(rightLegName, rightLegLength, rightLegIsWorking);
        this.leftLeg = new Leg(leftLegName, leftLegLength, leftLegIsWorking);
        this.rightArm = new Arm(rightArmName, rightArmLength, rightArmIsWorking);
        this.leftArm = new Arm(leftArmName, leftArmLength, leftArmIsWorking);
    }
    public Panda(String name, double currentAge, double weightOfBrain, String rightEyeColor, String leftEyeColor, int noseSensitivity,
        String leftEarSize, String rightEarSize, double mouthSizeInInches, String colorOfHeart, int tailLengthInCm, int rightLegLength, int leftLegLength,
        double rightArmLength, double leftArmLength){
        super(name, currentAge, true, weightOfBrain, rightEyeColor, leftEyeColor, "nose", true, noseSensitivity, leftEarSize, rightEarSize,
        mouthSizeInInches, colorOfHeart, "right eye", "left eye", "left ear", "right ear", "mouth", true, true, true, true, true, true);
        this.tail = new Tail(tailLengthInCm, true, "tail");
        this.rightLeg = new Leg("right leg", rightLegLength, true);
        this.leftLeg = new Leg("left leg", leftLegLength, true);
        this.rightArm = new Arm("right arm", rightArmLength, true);
        this.leftArm = new Arm("left arm", leftArmLength, true); 
    }
    
    //methods
    @Override
    public String revive(){
        if(getIsAlive()){
            return getName() + " is already alive :/";
        }
        else{
            setIsAlive(true);
            return getName() + " is now alive!";
        }
    }
    
    public String kill(){
        if(!getIsAlive()){
            return getName() + " is already dead! Stop defiling a corpse you sicko!";
        }
        else{
            setIsAlive(false);
            return getName() + " is now dead. Why would you... you are a detestable monster";
        }
    }
    
    @Override
    public String weakAction(){
        if(!getIsAlive()){
            return getName() + " is dead and cannot throw a tantrum! \n\n";
        }
        else{
            return getName() + " is attempting to throw a tantrum! \n" + leftArm.action1() + rightArm.action1() + "\n" + leftLeg.action1() + "\n" + 
            rightLeg.action1() + "\n" + tail.action1() + "\n" + getHeart().beat() + "\n" + 
            getRightEye().action1() + "\n" + getLeftEye().action1() + "\n" + getBrain().action1() + "\n\n";
        }
    }
    
    @Override
    public String normalAction(){
        if(!getIsAlive()){
            return getName() + " is dead and cannot listen to visitor music and eat their food! \n\n";
        }
        else{
            return getName() + " is attempting to listen to visitor music and eat their food!\n" + getRightEar().action1() + "\n" + getLeftEar().action1() + "\n" +  
            getMouth().action1() + "\n" + getHeart().action1() + "\n" + getNose().action1() + "\n" + getBrain().action1() + "\n\n";
        }
    }
    
    @Override
    public String strongAction(){
        if(!getIsAlive()){
            return getName() + " is dead ... How can you expect a dead panda to dance you sicko!!\n\n";
        }
        else{
            if(((int) (Math.random() * 10000) + 1) <= 1){
                setIsAlive(false);
                return "The panda choked trying to satisfying your disgusting desires and died!\n\n";
            }
            else{
                return getName() + " is attempting to dance while eating... why would you make anyone do something like this!" + "\n" +
                leftArm.action1() + rightArm.action1() + getNose().action1() + "\n" + getMouth().action1() + "\n" +
                leftLeg.action1() + rightLeg.action1() + getBrain().action1() + "\n\n";
            }
        }
    }
    
    @Override
    public String toString()
    {
        String message = "This " + getName() + " is ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";
        
        message += ".\n   Brain weighs " + getBrain().getWeightInPounds() + " lbs and is ";
        if(getBrain().getIsWorking())
            message += "working";
        else
            message += "not working";
        
        message += ".\n   The" + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking())
            message += "working";
        else
            message += "not working.";
        
        message += ".\n   The" + getRightEye().getNameOfPart() + "is " + getRightEye().getColor() + " and is ";
        if(getRightEye().getIsWorking())
            message += "working";
        else
            message += "not working";   
       
        message += ".\n   The heart is " + getHeart().getColor()+ " and is ";
        if(getHeart().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The nose is ";
        if(getNose().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The left ear is " + getLeftEar().getSize()+ " inches and is ";
        if(getLeftEar().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The right ear is " + getRightEar().getSize()+ " inches and is ";
        if(getRightEar().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The mouth is " + getMouth().getMouthSizeInInches()+ " inches and is ";
        if(getMouth().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The tail is " + tail.getLengthInCm() + " centimeters and is ";
        if(tail.getIsWorking())
            message += "working";
        else
            message += "not working";
            
        message += ".\n   The right leg is " + rightLeg.getlengthInInches() + " inches and is ";
        //getLengthInInches is not correctly formatted in Leg class
        if(rightLeg.getIsWorking())
            message += "working";
        else
            message += "not working";
        
        message += ".\n   The left leg is " + leftLeg.getlengthInInches() + " inches and is ";
        if(leftLeg.getIsWorking())
            message += "working";
        else
            message += "not working";
            
        message += ".\n   The right arm is " + rightArm.getLengthInInches() + " inches and is ";
        if(rightArm.getIsWorking())
            message += "working";
        else
            message += "not working";
            
        message += ".\n   The left arm is " + leftArm.getLengthInInches() + " inches and is ";
        if(leftArm.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        return message;
    }
    
    //getters
    public Tail getTail(){
        return this.tail;
    }
    public Leg getRightLeg(){
        return this.rightLeg;
    }
    public Leg getLeftLeg(){
        return this.leftLeg;
    }
    public Arm getRightArm(){
        return this.rightArm;
    }
    public Arm getLeftArm(){
        return this.leftArm;
    }
}
    