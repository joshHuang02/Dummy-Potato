/**
 * Write a description of class Penguin here.
 *
 * @author Alyssa Wu
 * @version 1/24/2020
 */
public class Penguin extends Bird
{
    private Nose nose;
    private Tail tail;
    
    public Penguin(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String nameOfLeftEye, String colorOfLeftEye,boolean leftEyeIsWorking, 
    String nameOfRightEye, String colorOfRightEye, boolean rightEyeIsWorking, double lengthOfBeak,boolean beakIsWorking, String colorOfHeart, boolean   heartIsWorking, 
    boolean leftWingIsWorking, String colorOfLeftWing, boolean rightWingIsWorking, String colorOfRightWing, String nameOfLeftLeg, int lengthOfLeftLeg, 
    boolean leftLegIsWorking, String nameOfRightLeg, int lengthOfRightLeg, boolean rightLegIsWorking, String nameOftail, int lengthOfTailInCm, boolean tailIsWorking, 
    int noseSensitivity, String nameOfNose, boolean noseIsWorking)
    {
    super(name, currentAgeInYears, isAlive, weightOfBrain, nameOfLeftEye, colorOfLeftEye, leftEyeIsWorking, 
    nameOfRightEye, colorOfRightEye, rightEyeIsWorking, lengthOfBeak, beakIsWorking, colorOfHeart, heartIsWorking, 
    leftWingIsWorking, colorOfLeftWing, rightWingIsWorking, colorOfRightWing, nameOfLeftLeg, lengthOfLeftLeg, 
    leftLegIsWorking, nameOfRightLeg, lengthOfRightLeg, rightLegIsWorking);
    }
    
    public Penguin(String name, double currentAgeInYears, double weightOfBrain, String nameOfLeftEye, String colorOfLeftEye, 
    String nameOfRightEye, String colorOfRightEye, double lengthOfBeak, String colorOfHeart,  String colorOfLeftWing, 
    String colorOfRightWing, String nameOfLeftLeg, int lengthOfLeftLeg, String nameOfRightLeg, int lengthOfRightLeg, String nameOfTail, int lengthOfTailInCm,
    int noseSensitivity, String nameOfNose)
    {
    super(name, currentAgeInYears, weightOfBrain, nameOfLeftEye, colorOfLeftEye, 
    nameOfRightEye, colorOfRightEye, lengthOfBeak, colorOfHeart, 
    colorOfLeftWing, colorOfRightWing, nameOfLeftLeg, lengthOfLeftLeg, 
    nameOfRightLeg, lengthOfRightLeg);
    }  
    
    public String weakAction()
    {
        return swim();
    }
    
    public String normalAction()
    {
        return waddle();
    }
    
    public String strongAction()
    {
        return eat();
    }
    
    @Override
    public String revive()
    {
        return goToHospital();
    }
    
    public Tail getTail(){
        return tail;
    }
    
    public Nose getNose(){
        return nose;
    }
    
    public String toString()
    {
        String message = getName() + " is a bird and is currently ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";
        message += ".\n   Brain: weighs "+ getBrain().getWeightInPounds() +" lbs and is ";

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
        message += ".\n   The beak is "+ getBeak().getLengthInCm() +" cm long and is ";

        if(getBeak().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The heart is "+ getHeart().getColor() +" and is ";

        if(getHeart().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left wing is ";

        if(getLeftWing().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right wing is ";

        if(getRightWing().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left leg is "+ getRightLeg().getlengthInInches() + " inches long ";

        if(getLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right leg is " + getRightLeg().getlengthInInches() + " inches long ";

        if(getRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The nose is ";
        
        if(getNose().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n    The tail is " + getTail().getLengthInCm();
            
        if(getTail().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        return message;   
    }
    
    public String swim()
    {
        getBrain().sendSignals();
        getHeart().beat();
        String message = "";
        if(!(getBrain().getIsWorking()) || !(getHeart().getIsWorking()))
        {
            return "Unfortunately, " + getName() + " is already dead.";
        }
        message = message + " \nLeft wing: " + getLeftWing().flap();
        message = message + " \nRight wing: " + getRightWing().flap();
        message = message + " \n" + getBeak().peck();
        message = message + " \nLeft leg: " + getLeftLeg().action1();
        message = message + " \nRight leg: " + getRightLeg().action1();
        message = message + " \n" + getTail().wag();
        if(getLeftWing().getIsWorking() && getRightWing().getIsWorking() && getBeak().getIsWorking() && getLeftLeg().getIsWorking() && getRightLeg().getIsWorking())
        {
            return message + "\n" + getName() + " is now swimming.";
        }
        return message +"\n" + getName() + " cannot swim.";
    }
    
    public String waddle()
    {
        getBrain().sendSignals();
        getHeart().beat();
        String message = "";
        if(!(getBrain().getIsWorking()) || !(getHeart().getIsWorking()))
        {
            return "Unfortunately, " + getName() + " is already dead.";
        }
        message = message + " \nLeft leg: " + getLeftLeg().action1();
        message = message + " \nRight leg: " + getRightLeg().action1();
        if(getLeftLeg().getIsWorking() && getRightLeg().getIsWorking())
        {
            return message + "\n" + getName() + " is now waddling.";
        }
        return message + "\n" + getName() + " cannot waddle.";
    }
    
    public String eat()
    {
        getBrain().sendSignals();
        getHeart().beat();
        String message = "";
        if(!(getBrain().getIsWorking()) || !(getHeart().getIsWorking()))
        {
            return "Unfortunately, " + getName() + " is already dead.";
        }
        message = message + " \n" + getBeak().action1();
        message = message + " \nLeft eye: " + getLeftEye().action1();
        message = message + " \nRight eye: " + getRightEye().action1();
        message = message + " \n" + getNose().action1();
        if(getBeak().getIsWorking() && getLeftEye().getIsWorking() && getRightEye().getIsWorking() && getNose().action1().equals("Sensitivity Error"))
        {
            return message + "\n" + getName() + " is now eating.";
        }
        return message + "\n" + getName() + " cannot eat.";
    }
    
    public String goToHospital()
    {
        String healed = "";
        healed = getBrain().heal() + "\n" + getBeak().heal() + "\nLeft eye: " + getLeftEye().heal() + "\nRight eye: " + 
        getRightEye().heal() + "\n" + getHeart().heal() + "\nLeft leg: " + getLeftLeg().heal() + "\nRight leg: " + getRightLeg().heal() + 
        "\n" + getNose().heal() + "\n" + getTail().heal() + "\nLeft wing: " + getLeftWing().heal() + "\nRight wing: " +
        getRightWing().heal();
        return healed;
    }
}
