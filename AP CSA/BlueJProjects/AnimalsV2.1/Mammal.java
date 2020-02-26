
public class Mammal extends Animal
{
    //instance variable
    private Nose nose;
    private Eye leftEye;
    private Eye rightEye;
    private Ear leftEar;
    private Ear rightEar;
    private Mouth mouth;
    private Heart heart;
    
    //constructors
    public Mammal (String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking){
        super(name, currentAge, isAlive, weightOfBrain);
        this.nose = new Nose(nameOfNose, noseIsWorking, noseSensitivity);
        this.leftEye = new Eye(nameOfLeftEye, leftEyeColor, leftEyeIsWorking);
        this.rightEye = new Eye(nameOfRightEye, rightEyeColor, rightEyeIsWorking);
        this.leftEar = new Ear(leftEarSize, nameOfLeftEar, leftEarIsWorking);
        this.rightEar = new Ear(rightEarSize, nameOfRightEar, rightEarIsWorking);
        this.mouth = new Mouth(nameOfMouth, mouthSizeInInches, mouthIsWorking);
        this.heart = new Heart(colorOfHeart, heartIsWorking);
    }
    
    public Mammal (String name, double currentAge,
    double weightOfBrain, String rightEyeColor, String leftEyeColor, 
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth){
        super(name, currentAge, true, weightOfBrain);
        this.nose = new Nose(noseSensitivity);
        this.leftEye = new Eye(nameOfLeftEye, leftEyeColor, true);
        this.rightEye = new Eye(nameOfRightEye, rightEyeColor, true);
        this.leftEar = new Ear(leftEarSize, nameOfLeftEar, true);
        this.rightEar = new Ear(rightEarSize, nameOfRightEar, true);
        this.mouth = new Mouth(nameOfMouth, mouthSizeInInches, true);
        this.heart = new Heart(colorOfHeart, true);
    }
    
    //Methods
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
        
        message += ".\n   The" + leftEye.getNameOfPart() + "is "+ leftEye.getColor() +" and is ";
        if(leftEye.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The" + rightEye.getNameOfPart() + "is "+ rightEye.getColor() +" and is ";
        if(rightEye.getIsWorking())
            message += "working.";
        else
            message += "not working.";   
       
        message += ".\n   The heart is "+ heart.getColor()+" and is ";
        if(heart.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The nose is ";
        if(nose.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left ear is "+ leftEar.getSize()+" inches and is ";
        if(leftEar.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right ear is "+ rightEar.getSize()+" inches and is ";
        if(rightEar.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The mouth is "+ mouth.getMouthSizeInInches()+" inches and is ";
        if(mouth.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }
    
    public Heart getHeart()
    {
        return heart;
    }
    public Nose getNose()
    {
        return nose;
    }
    public Mouth getMouth()
    {
        return mouth;
    }
    public Eye getLeftEye()
    {
        return leftEye;
    }
    public Eye getRightEye()
    {
        return rightEye;
    }
    public Ear getLeftEar()
    {
        return leftEar;
    }
    public Ear getRightEar()
    {
        return rightEar;
    }
    
    
}


