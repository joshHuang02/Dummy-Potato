
/**
 * Write a description of class Giraffe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Giraffe extends Mammal
{
   private Leg leftBackLeg;
   private Leg rightBackLeg;
   private Leg leftFrontLeg;
   private Leg rightFrontLeg;
   private Tail tail;
   public Giraffe(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking,int legLengthInInches,int tailLengthInCm,String leftBackLegName, String rightBackLegName, String leftFrontLegName, String rightFrontLegName, String tailName){
        super(name,currentAge,isAlive,weightOfBrain, 
    rightEyeColor,leftEyeColor,nameOfNose,noseIsWorking,noseSensitivity,leftEarSize, 
    rightEarSize,mouthSizeInInches,colorOfHeart, 
    nameOfRightEye,nameOfLeftEye,nameOfLeftEar,nameOfRightEar,
    nameOfMouth,leftEyeIsWorking,rightEyeIsWorking,leftEarIsWorking,rightEarIsWorking,mouthIsWorking,
    heartIsWorking);
    leftBackLeg= new Leg(leftBackLegName,legLengthInInches,isAlive);
    rightBackLeg= new Leg(rightBackLegName,legLengthInInches,isAlive);
    leftFrontLeg= new Leg(leftFrontLegName,legLengthInInches,isAlive);
    rightFrontLeg= new Leg(rightFrontLegName,legLengthInInches,isAlive);
    tail= new Tail(tailLengthInCm,isAlive,tailName);
    }
    public Giraffe(String name, double currentAge,
    double weightOfBrain, String rightEyeColor, String leftEyeColor, 
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth,int legLengthInInches,int tailLengthInCm,String leftBackLegName, String rightBackLegName, String leftFrontLegName, String rightFrontLegName, String tailName){
        super(name,currentAge,
    weightOfBrain,rightEyeColor,leftEyeColor, 
    noseSensitivity, leftEarSize,rightEarSize, 
    mouthSizeInInches,colorOfHeart,nameOfRightEye, 
    nameOfLeftEye,nameOfLeftEar,nameOfRightEar,nameOfMouth);
    leftBackLeg= new Leg(leftBackLegName,legLengthInInches,true);
    rightBackLeg= new Leg(rightBackLegName,legLengthInInches,true);
    leftFrontLeg= new Leg(leftFrontLegName,legLengthInInches,true);
    rightFrontLeg= new Leg(rightFrontLegName,legLengthInInches,true);
    tail= new Tail(tailLengthInCm,true,tailName);
    }
    @Override
    public String revive(){
        setIsAlive(true);
        getNose().setIsWorking(true);
        getHeart().setIsWorking(true);
        getBrain().setIsWorking(true);
        getMouth().setIsWorking(true);
        getRightEye().setIsWorking(true);
        getLeftEye().setIsWorking(true);
        getLeftEar().setIsWorking(true);
        getRightEar().setIsWorking(true);
        leftBackLeg.setIsWorking(true);
        rightBackLeg.setIsWorking(true);
        leftFrontLeg.setIsWorking(true);
        rightFrontLeg.setIsWorking(true);
        tail.setIsWorking(true);
        return "The Mammal Gods have revived "+getName();
    }
    @Override
    public String toString(){
        String msg=getName()+" is currently ";
        if(getIsAlive()){
            msg+=getCurrentAgeInYears()+" years old and doing well";
        } else{
            msg+=" dead... May "+getName()+" rest in peace";
        }
        return msg;
    }
    @Override
    public String weakAction(){
        return blink();
    }
    @Override
    public String normalAction(){
        return walk();
    }
    @Override
    public String strongAction(){
        return findFood();
    }
     public String blink(){
        getBrain().sendSignals();
        getHeart().beat();
        if(getHeart().getIsWorking()&&getBrain().getIsWorking()){
        getRightEye().blink();
        getLeftEye().blink();
            if(getRightEye().getIsWorking()&&getLeftEye().getIsWorking())
            return getName()+" blinked";
            return "Your eyes were damaged when trying to blink";
    }
        return getName()+" cannot blink, because your dead";
    }
    public String findFood(){
        getBrain().sendSignals();
        getHeart().beat();
        if(getHeart().getIsWorking()&&getBrain().getIsWorking()){
        getNose().breathe();
        getLeftEar().listenToMusic();
        getRightEar().listenToMusic();
        if(getRightEar().getIsWorking()||getLeftEar().getIsWorking()||getNose().getIsWorking()){
            walks();
            if(!(leftFrontLeg.getIsWorking()&&rightFrontLeg.getIsWorking()&&rightBackLeg.getIsWorking()&&leftBackLeg.getIsWorking()))
            return getName()+" found food but could not walk to it";
            getMouth().eat();
            if(getMouth().getIsWorking()){
            return getName()+" got to the food but could not eat it";
            } else{
                return getName()+" were successfully able to obtain food";
            }
        } else{
            return getName()+" could not find food";
        }
        }
        return "Your dead, you do not need food";
    }
    public String walk(){
        getBrain().sendSignals();
        getHeart().beat();
        if(getHeart().getIsWorking()&&getBrain().getIsWorking()){
        leftFrontLeg.step();
        rightFrontLeg.step();
        leftBackLeg.step();
        rightBackLeg.step();
        if(leftFrontLeg.getIsWorking()&&rightFrontLeg.getIsWorking()&&leftBackLeg.getIsWorking()&&rightBackLeg.getIsWorking()){
            return getName()+" walked to your destination";
        } else{
            tail.setIsWorking(false);
            return "One of your legs is broken, so "+getName()+" trips and injures his tail";
        }
    }
    return getName()+" cannot walk, because he is dead";
    }
    private void walks(){
        leftFrontLeg.step();
        rightFrontLeg.step();
        leftBackLeg.step();
        rightBackLeg.step();
    }
    public Leg getLeftBackLeg(){
        return leftBackLeg;
    }
    public Leg getRightBackLeg(){
        return rightBackLeg;
    }
    public Leg getLefFrontLeg(){
        return leftFrontLeg;
    }
    public Leg getRightFrontLeg(){
        return rightFrontLeg;
    }
    public Tail getTail(){
        return tail;
    }
}
