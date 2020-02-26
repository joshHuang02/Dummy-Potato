 

public class Whale extends Mammal
{
    private Tail tail;
    private Arm leftArm;
    private Arm rightArm;

    public Whale(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking, int length, int lengthInCm, boolean isWorking, String nameOfPart, int lengthInInches){
        super(name, currentAge, isAlive, weightOfBrain, 
            rightEyeColor, leftEyeColor, nameOfNose, noseIsWorking, noseSensitivity,  leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart, nameOfRightEye,  nameOfLeftEye,  nameOfLeftEar,  nameOfRightEar,
            nameOfMouth, leftEyeIsWorking,  rightEyeIsWorking, leftEarIsWorking, rightEarIsWorking,  mouthIsWorking,
            heartIsWorking);
        this.tail = new Tail(lengthInCm, isWorking, nameOfPart);
        this.leftArm = new Arm(name, lengthInInches, isWorking);
        this.rightArm = new Arm(name, lengthInInches, isWorking);
    }

    public Whale(String name, double currentAge, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, int lengthInCm, boolean isWorking, String nameOfPart, int lengthInInches){
        super(name, currentAge,
            weightOfBrain, rightEyeColor,leftEyeColor, 
            noseSensitivity, leftEarSize, rightEarSize, 
            mouthSizeInInches,  colorOfHeart, nameOfRightEye, 
            nameOfLeftEye, nameOfLeftEar,nameOfRightEar,nameOfMouth);
        this.tail = new Tail(lengthInCm, isWorking, nameOfPart);
        this.leftArm = new Arm(name, lengthInInches, isWorking);
        this.rightArm = new Arm(name, lengthInInches, isWorking);
    }

    @Override
    public String weakAction()
    {
        return flee();
    }

    @Override
    public String normalAction()
    {
        return enjoyLife();
    }

    @Override
    public String strongAction()
    {
        return snack();
    }

    @Override
    public String revive()
    {
        return fullRestore();
    }

    public String flee(){
        if (getHeart().getIsWorking()){
            return getBrain().sendSignals() + " " + getTail().wag() + " " + getLeftArm().wave() + " " + getRightArm().wave() + 
            " " + getHeart().beat() + " " + " The whale is running away";
        }
        return "Sorry, the whale is dead";
    }

    public String enjoyLife(){
        if (getHeart().getIsWorking()){
            return getBrain().sendSignals() + " " + getLeftEar().listenToMusic() + " " + getRightEar().listenToMusic() + " " + getLeftEye().blink() + getRightEye().blink() +
            getTail().wag() + " The whale is chilling"; 
        }
        return "Sorry, the whale is dead";
    }

    public String snack(){
        if (getHeart().getIsWorking()){
            return getMouth().eat() + " " + getTail().wag() + " " + getBrain().sendSignals() + " The whale is happily feasting on its snack";   
        }
        return "Sorry, the whale is dead";
    }

    public String fullRestore(){
        return getHeart().heal() + " " + getBrain().heal() + " " + getLeftEye().heal() + " " + getRightEye().heal() + " " + getLeftArm().heal() + " " + getRightArm().heal()
        + " " + getMouth().heal() + " " + getTail().heal() + " " + getNose().breathe() + " " + getLeftEar().heal() + " " + getRightEar().heal() + " The Whale is fully revived";
    }

    @Override
    public String toString(){
        String message = "";
        message += super.toString();
        return message;
    }

    public Tail getTail(){
        return tail;
    }

    public Arm getLeftArm(){
        return leftArm;
    }

    public Arm getRightArm(){
        return rightArm;
    }
}

