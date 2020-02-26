
/**
 * A child class of Mammal, create an object of class pig.
 *
 * @author Cecilia Li
 * @version 1/24/2020
 */
public class Pig extends Mammal
{
    private Tail tail;
    private Leg leftFrontLeg;
    private Leg leftBackLeg;
    private Leg rightFrontLeg;
    private Leg rightBackLeg;
    
    public Pig(String name,double age, boolean isAlive, double weightOfBrain, String rightEyeColor, boolean leftFrontLegIsWorking, boolean rightFrontLegIsWorking, boolean rightBackLegIsWorking, boolean leftBackLegIsWorking, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking,boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking, boolean heartIsWorking,String leftEyeColor, String nameOfNose, boolean noseIsWorking,int noseSensitivity, int lengthOfLeftFrontLeLegInInches, String nameOfLeftFrontLeg, int lengthOfRightFrontLegInInches, String nameOfRightFrontLeg, String nameOfRightBackLeg, boolean tailIsWorking, int lengthOfLeftBackLegInInches, String nameOfLeftBackLeg, int lengthOfTailInCm, String nameOfTail, int lengthOfRightBackLegInInches, int lengthOfLeftFrontLegInInches, String leftEarSize, String rightEarSize, double mouthSizeInInches,String colorOfHeart, String nameOfRightEye)
    {
        super(name, age, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfRightEar, nameOfLeftEar, nameOfMouth, leftEyeIsWorking, rightEyeIsWorking, leftEarIsWorking, rightEarIsWorking, mouthIsWorking, heartIsWorking);
        Tail tail = new Tail(lengthOfTailInCm, tailIsWorking, nameOfTail);
        Leg leftFrontLeg = new Leg(nameOfLeftFrontLeg, lengthOfLeftFrontLegInInches, leftFrontLegIsWorking);
        Leg leftBackLeg = new Leg(nameOfLeftBackLeg, lengthOfLeftBackLegInInches, leftBackLegIsWorking);
        Leg rightFrontLeg = new Leg(nameOfRightFrontLeg, lengthOfRightFrontLegInInches, rightFrontLegIsWorking);
        Leg rightBackLeg = new Leg(nameOfRightBackLeg, lengthOfRightBackLegInInches, rightFrontLegIsWorking);
    }
    
    public Pig(String name,double age, double weightOfBrain, String rightEyeColor, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth, String leftEyeColor, String nameOfNose, int noseSensitivity, int lengthOfLeftFrontLeLegInInches, String nameOfLeftFrontLeg, int lengthOfRightFrontLegInInches, String nameOfRightFrontLeg, String nameOfRightBackLeg, int lengthOfLeftBackLegInInches, String nameOfLeftBackLeg, int lengthOfTailInCm, String nameOfTail, int lengthOfRightBackLegInInches, int lengthOfLeftFrontLegInInches, String leftEarSize, String rightEarSize, double mouthSizeInInches,String colorOfHeart, String nameOfRightEye)
    {
        super(name, age, weightOfBrain, rightEyeColor, leftEyeColor, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth);
        Tail tail = new Tail(lengthOfTailInCm, true, nameOfTail);
        Leg leftFrontLeg = new Leg(nameOfLeftFrontLeg, lengthOfLeftFrontLegInInches);
        Leg leftBackLeg = new Leg(nameOfLeftBackLeg, lengthOfLeftBackLegInInches);
        Leg rightFrontLeg = new Leg(nameOfRightFrontLeg, lengthOfRightFrontLegInInches);
        Leg rightBackLeg = new Leg(nameOfRightBackLeg, lengthOfRightBackLegInInches);
    }
    
    //methods
    public Tail getTail(){
        return tail;
    }
    
    public Leg getLeftFrontLeg(){
        return leftFrontLeg;
    }
    
    public Leg getRightFrontLeg(){
        return rightFrontLeg;
    }
    
    public Leg getLeftBackLeg(){
        return leftBackLeg;
    }
    
    public Leg getRightBackLeg(){
        return rightBackLeg;
    }
    
    @Override
    public String weakAction(){
        return blink();
    }
    
    @Override
    public String normalAction(){
        return eat();
    }
    
    @Override
    public String strongAction(){
        return run();
    }
    
    @Override
    public String revive(){
        setIsAlive(true);
        return "The pig is now alive";
    }
    
    private String blink(){
        if(getHeart().getIsWorking()){
            return getRightEye().blink() + " " + getLeftEye().blink();}
        else{
            return getName() + " is dead.";}
    }

    private String toTheHospital(){
        return getHeart().heal()+tail.heal()+getMouth().heal()+getRightEar().heal()+getLeftEar().heal()+getBrain().heal()+
        getRightEye().heal()+getLeftEye().heal()+leftFrontLeg.heal()+leftBackLeg.heal()+rightFrontLeg.heal()+rightBackLeg.heal()
        +getNose().heal();
    }

    private String run(){
        String back = "";
        back += getHeart().beat() + "\n";
        if(getHeart().getIsWorking()){
            back += leftFrontLeg.action1() + "\n" + leftBackLeg.action1() + "\n" + rightFrontLeg.action1() + "\n" + rightBackLeg.action1();
        }
        else{
            back += getName() + " is dead.";
        }
        return back;
    }
    
    private String eat(){
        String back = "";
        back += getHeart().beat()+ "\n";
        if(getHeart().getIsWorking()){
            back += getMouth().action1();
        }
        else{
            back += getName() + " is dead.";
        }
        return back;  
    }
}
