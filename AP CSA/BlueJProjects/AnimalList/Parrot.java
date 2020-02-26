
public class Parrot extends Bird
{

    public Parrot(String name, double currentAgeInYears, boolean isAlive, double weightOfBrainInPounds, String nameOfLeftEye, String colorOfLeftEye,boolean leftEyeIsWorking, 
    String nameOfRightEye, String colorOfRightEye, boolean rightEyeIsWorking, double lengthOfBeakInCm,boolean beakIsWorking, String colorOfHeart, boolean heartIsWorking, 
    boolean leftWingIsWorking, String colorOfLeftWing, boolean rightWingIsWorking, String colorOfRightWing, String nameOfLeftLeg, int lengthOfLeftLegInInches, 
    boolean leftLegIsWorking, String nameOfRightLeg, int lengthOfRightLegInInches, boolean rightLegIsWorking){
        super(name,currentAgeInYears,isAlive,weightOfBrainInPounds, nameOfLeftEye, colorOfLeftEye, leftEyeIsWorking, nameOfRightEye, colorOfRightEye, 
        rightEyeIsWorking, lengthOfBeakInCm, beakIsWorking, colorOfHeart, heartIsWorking, leftWingIsWorking, colorOfLeftWing, rightWingIsWorking, 
        colorOfRightWing, nameOfLeftLeg, lengthOfLeftLegInInches, leftLegIsWorking, nameOfRightLeg, lengthOfRightLegInInches, rightLegIsWorking);
    }
    
    public Parrot(String name, double currentAgeInYears, double weightOfBrainInPounds, String nameOfLeftEye, String colorOfLeftEye, 
    String nameOfRightEye, String colorOfRightEye, double lengthOfBeakInCm, String colorOfHeart,  String colorOfLeftWing, 
    String colorOfRightWing, String nameOfLeftLeg, int lengthOfLeftLegInInches, String nameOfRightLeg, int lengthOfRightLegInInches){
        super(name,currentAgeInYears,weightOfBrainInPounds, nameOfLeftEye, colorOfLeftEye, nameOfRightEye, colorOfRightEye, 
        lengthOfBeakInCm, colorOfHeart,colorOfLeftWing, colorOfRightWing, nameOfLeftLeg, lengthOfLeftLegInInches,  nameOfRightLeg, lengthOfRightLegInInches);
    }
    
    @Override
    public String weakAction(){
        return fly();
    }
    @Override
    public String normalAction(){
        return eat(); 
    }
    @Override
    public String strongAction(){
        return attack(); 
    }
   
    
    @Override
    public String toString()
    {
        String message = getName() + " is a parrot and is currently ";
        if(getIsAlive())
            message += "alive.";
        else
            message += "dead.";
        message += "\n   The " + getBrain().getNameOfPart()+ " is " + getBrain().getWeightInPounds() +" lbs and is ";

        if(getBrain().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += "\n   The" + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";

        if(getLeftEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += "\n   The" + getRightEye().getNameOfPart() + "is "+ getRightEye().getColor() +" and is ";

        if(getRightEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";   
        message += "\n   The beak is "+ getBeak().getLengthInCm() +" cm long and is ";

        if(getBeak().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += "\n   The heart is "+ getHeart().getColor() +" and is ";

        if(getHeart().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += "\n   The " + getLeftWing().getNameOfPart() + " is ";

        if(getLeftWing().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += "\n   The " + getRightWing().getNameOfPart() + " is ";

        if(getRightWing().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += "\n   The " + getLeftLeg().getNameOfPart() + " is "+ getLeftLeg().getlengthInInches() + " inches long ";

        if(getLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += "\n   The " + getRightLeg().getNameOfPart() + " is "+ getRightLeg().getlengthInInches() + " inches long ";

        if(getRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }
    
     @Override 
    public String revive(){
        setIsAlive(true);
        return heal() + "The parrot is alive now!";
    }
    
    public String heal(){
        return getLeftEye().heal() + "\n"+ getRightEye().heal() +"\n"+ getHeart().heal() +"\n"+ getBrain().heal() +"\n"
        + getBeak().heal() +"\n"+  getLeftLeg().heal()+"\n" + getRightLeg().heal() +"\n"+ getLeftWing().heal() 
        +"\n"+ getRightWing().heal() +"\n"; 
    }
    
    public String fly(){
        if(getHeart().getIsWorking() && getIsAlive()){
            return getName() + " is trying to fly! \n" + getLeftLeg().action1() + "\n" + getRightLeg().action1() + "\n" + getLeftWing().action1() 
            + "\n" + getRightWing().action1() + "\n"
            + getBrain().action1() + "\n" + getHeart().action1() + "\n"; 
        }else{
            return getName() + " the parrot is dead :^(";
        }

    }
    
    public String eat(){
        if(getHeart().getIsWorking() && getIsAlive()){
            return getName() + " is trying to eat! \n" + getBeak().action1() + "\n"+ getBrain().action1() + "\n" + getHeart().action1() + "\n"; 
        }else{
            return getName() + " the parrot is dead :^(";
        }
    }

    public String attack(){
        if(getHeart().getIsWorking() && getIsAlive()){
            return getName() + " is trying to attack! \n" + getLeftLeg().action1() + "\n" + getRightLeg().action1() + "\n" + getBeak().action1()+
            "\n" + getLeftEye().action1() + "\n" 
            + getRightEye().action1() + "\n"+ getLeftWing().action1() + "\n" + 
            getRightWing().action1() + "\n"+ getBrain().action1() + "\n" + getHeart().action1() + "\n"; 
        }else{
            return getName() + " the parrot is dead :^(";
        }
    }

}
