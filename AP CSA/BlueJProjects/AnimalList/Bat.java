
public class Bat extends Mammal{
    //instance variables
    private Wing leftWing;
    private Wing rightWing;
    private Leg leftLeg;
    private Leg rightLeg;
    private Tail tail;

    // constructors
    public Bat(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking, String leftWingColor, String rightWingColor, boolean leftWingIsWorking, boolean rightWingIsWorking, String leftWingName, String rightWingName, String leftLegName, String rightLegName, boolean leftLegIsWorking, boolean rightLegIsWorking, int leftLegLengthInInches, int rightLegLengthInInches, String nameOfTail, boolean tailIsWorking, int lengthOfTailInInches){
        super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth, leftEyeIsWorking, rightEyeIsWorking, leftEarIsWorking, rightEarIsWorking, mouthIsWorking, heartIsWorking);
        this.leftWing = new Wing(leftWingName, leftWingIsWorking, leftWingColor);
        this.rightWing = new Wing(rightWingName, rightWingIsWorking, rightWingColor);
        this.leftLeg = new Leg(leftLegName, leftLegLengthInInches, leftLegIsWorking);
        this.rightLeg = new Leg(rightLegName, rightLegLengthInInches, rightLegIsWorking);
        this.tail = new Tail(lengthOfTailInInches, tailIsWorking, nameOfTail);
    }

     public Bat (String name, double currentAge,
    double weightOfBrain, String rightEyeColor, String leftEyeColor, 
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth, String leftWingColor, String rightWingColor, boolean leftWingIsWorking, boolean rightWingIsWorking, String leftWingName, String rightWingName, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean mouthIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, String leftLegName, String rightLegName, boolean leftLegIsWorking, boolean rightLegIsWorking, int leftLegLengthInInches, int rightLegLengthInInches, String nameOfTail, boolean tailIsWorking, int lengthOfTailInInches, boolean heartIsWorking){
        super(name, currentAge, weightOfBrain, rightEyeColor, leftEyeColor, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth);
        this.leftWing = new Wing(leftWingName, leftWingIsWorking, leftWingColor);
        this.rightWing = new Wing(rightWingName, rightWingIsWorking, rightWingColor);
        this.leftLeg = new Leg(leftLegName, leftLegLengthInInches, leftLegIsWorking);
        this.rightLeg = new Leg(rightLegName, rightLegLengthInInches, rightLegIsWorking);
        this.tail = new Tail(lengthOfTailInInches, tailIsWorking, nameOfTail);
    }


    //methods
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

        message += ".\n   The" + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";
        if(super.getLeftEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The" + super.getRightEye().getNameOfPart() + "is "+ super.getRightEye().getColor() +" and is ";
        if(super.getRightEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";   

        message += ".\n   The heart is "+ getHeart().getColor()+" and is ";
        if(super.getHeart().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The nose is ";
        if(super.getNose().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left ear is "+ super.getLeftEar().getSize()+" inches and is ";
        if(super.getLeftEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right ear is "+ super.getRightEar().getSize()+" inches and is ";
        if(super.getRightEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The mouth is "+ super.getMouth().getMouthSizeInInches()+" inches and is ";
        if(super.getMouth().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n The left wing is ";
        if(leftWing.getIsWorking())
        {
            message += "working.";
        }
        else 
        {
            message += "not working.";
        }

        message += ".\n The right wing is ";
        if(rightWing.getIsWorking())
        {
            message += "working.";
        }
        else 
        {
            message += "not working.";
        }

        message += ".\n The right leg is ";
        if(rightLeg.getIsWorking())
        {
            message += "working.";
        }
        else 
        {
            message += "not working.";
        }

        message += ".\n The left leg is ";
        if(leftLeg.getIsWorking())
        {
            message += "working.";
        }
        else 
        {
            message += "not working.";
        }

        message += ".\n The tail is ";
        if(tail.getIsWorking())
        {
            message += "working.";
        }
        else 
        {
            message += "not working.";
        }

        return message;
    }

    @Override
    public String weakAction()
    {
        return fly();
    }

    @Override
    public String normalAction()
    {
        return findFood();
    }

    @Override
    public String strongAction()
    {
        return suckBlood();
    }
    
    @Override
    public String revive()
    {
        return heal();
    }

    public String fly()
    {
        if(super.getHeart().getIsWorking() && super.getBrain().getIsWorking())
        {
            if(rightWing.getIsWorking() && leftWing.getIsWorking())
            {
                return "The bat can fly.";
            }
            else
            {
                return "The bat cannot fly.";
            }
        }
        else
        {
            return "The bat is dead.";
        }
    }

    public String findFood()
    {
        if(super.getHeart().getIsWorking() && super.getBrain().getIsWorking())
        {
            if(super.getRightEye().getIsWorking() && super.getLeftEye().getIsWorking())
            {
                return "The bat is able to find food.";
            }
            else
            {
                return "The bat cannot find food and has died.";
            }
        }
        else
        {
            return "The bat is dead.";
        }
    }

    public String suckBlood()
    {
        if(super.getHeart().getIsWorking() && super.getBrain().getIsWorking())
        {
            if(super.getMouth().getIsWorking())
            {
                return "The bat can suck blood.";
            }
            else
            {
                return "The bat cannot suck blood.";
            }
        }
        else
        {
            return "The bat is dead.";
        }
    }
    
    public String heal()
    {
       return "The bat is healed"; 
    }

    public Tail getTail()
    {
        return tail;
    }

    public Wing getRightWing()
    {
        return rightWing;
    }

    public Wing getLeftWing()
    {
        return leftWing;
    }

    public Leg getRightLeg()
    {
        return rightLeg;
    }

    public Leg getLeftLeg()
    {
        return leftLeg;
    }

}