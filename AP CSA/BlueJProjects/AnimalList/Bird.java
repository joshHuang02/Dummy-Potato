/**********************************************
 * THIS IS PARENT CLASS OF ALL BIRDS
 *
 * @author Eva Luo, Alyssa Wu, Lauren Lee
 * @version 1/22/2020
 *********************************************/
public class Bird extends Animal
{
    private Eye leftEye; 
    private Eye rightEye; 
    private Beak beak; 
    private Heart heart; 
    private Wing leftWing;
    private Wing rightWing;
    private Leg leftLeg; 
    private Leg rightLeg; 

    public Bird(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String nameOfLeftEye, String colorOfLeftEye,boolean leftEyeIsWorking, 
    String nameOfRightEye, String colorOfRightEye, boolean rightEyeIsWorking, double lengthOfBeak,boolean beakIsWorking, String colorOfHeart, boolean   heartIsWorking, 
    boolean leftWingIsWorking, String colorOfLeftWing, boolean rightWingIsWorking, String colorOfRightWing, String nameOfLeftLeg, int lengthOfLeftLeg, 
    boolean leftLegIsWorking, String nameOfRightLeg, int lengthOfRightLeg, boolean rightLegIsWorking){
        super(name,currentAgeInYears,isAlive,weightOfBrain);

        leftEye = new Eye(nameOfLeftEye, colorOfLeftEye, leftEyeIsWorking); 
        rightEye = new Eye(nameOfRightEye, colorOfRightEye, rightEyeIsWorking);

        beak = new Beak(lengthOfBeak, beakIsWorking); 

        heart = new Heart(colorOfHeart, heartIsWorking);

        leftWing = new Wing("left wing", leftWingIsWorking, colorOfLeftWing);
        rightWing = new Wing("right wing", rightWingIsWorking, colorOfRightWing);

        leftLeg = new Leg(nameOfLeftLeg, lengthOfLeftLeg, leftLegIsWorking);
        rightLeg = new Leg(nameOfRightLeg, lengthOfRightLeg, rightLegIsWorking);
    }
    
    public Bird(String name, double currentAgeInYears, double weightOfBrain, String nameOfLeftEye, String colorOfLeftEye, 
    String nameOfRightEye, String colorOfRightEye, double lengthOfBeak, String colorOfHeart,  String colorOfLeftWing, 
    String colorOfRightWing, String nameOfLeftLeg, int lengthOfLeftLeg, String nameOfRightLeg, int lengthOfRightLeg){
        super(name,currentAgeInYears,true,weightOfBrain);

        leftEye = new Eye(nameOfLeftEye, colorOfLeftEye, true); 
        rightEye = new Eye(nameOfRightEye, colorOfRightEye, true);

        beak = new Beak(lengthOfBeak, true); 

        heart = new Heart(colorOfHeart, true);

        leftWing = new Wing("left wing", true, colorOfLeftWing);
        rightWing = new Wing("right wing", true, colorOfRightWing);

        leftLeg = new Leg(nameOfLeftLeg, lengthOfLeftLeg, true);
        rightLeg = new Leg(nameOfRightLeg, lengthOfRightLeg, true);
    }
    
    @Override
    public String toString()
    {
        String message = getName() + " is a parrot and is currently ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";
        message += ".\n   Brain: weighs "+ getBrain().getWeightInPounds() +" lbs and is ";

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
        message += ".\n   The beak is "+ beak.getLengthInCm() +" cm long and is ";

        if(beak.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The heart is "+ heart.getColor() +" and is ";

        if(heart.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left wing is ";

        if(leftWing.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right wing is ";

        if(rightWing.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left leg is "+ rightLeg.getlengthInInches() + " inches long ";

        if(leftLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right leg is " + rightLeg.getlengthInInches() + " inches long ";

        if(rightLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }
    
    public Eye getLeftEye(){
        return leftEye;
    }
    public Eye getRightEye(){
        return rightEye;
    }
    public Beak getBeak(){
        return beak;
    }
    public Wing getLeftWing(){
        return leftWing;
    }
    public Wing getRightWing(){
        return leftWing;
    }
    public Heart getHeart(){
        return heart;
    }
    public Leg getLeftLeg(){
        return leftLeg;
    }
    public Leg getRightLeg(){
        return rightLeg;
    }
}