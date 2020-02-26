/**
 * Write a description of class Manatee here.
 *
 * @author (Timothy Wu)
 * @version (1/24)
 */
public class Manatee extends Mammal
{
    private Whisker rightWhisker;
    private Whisker leftWhisker;
    private Tail tail;

    public Manatee(String name, double currentAge, boolean isAlive, 
    double weightOfBrain,
    String rightEyeColor, String leftEyeColor, String nameOfNose, 
    boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, 
    String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, 
    boolean leftEarIsWorking, boolean rightEarIsWorking, 
    boolean mouthIsWorking,boolean heartIsWorking, int lengthInCm,
    boolean rightWhiskerIsWorking, boolean leftWhiskerIsWorking, boolean tailIsWorking,
    String nameOfTail)
    {
        super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, 
            leftEyeColor, nameOfNose, noseIsWorking, noseSensitivity, leftEarSize,
            rightEarSize, mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye,
            nameOfLeftEar, nameOfRightEar, nameOfMouth, leftEyeIsWorking, rightEyeIsWorking,
            leftEarIsWorking, rightEarIsWorking, mouthIsWorking, heartIsWorking
        );
        this.rightWhisker = new Whisker( lengthInCm, true); 
        this.leftWhisker = new Whisker( lengthInCm, true); 
        this.tail = new Tail( lengthInCm, true, nameOfTail);  

    }

    public Manatee (String name, double currentAge,
    double weightOfBrain, String rightEyeColor, String leftEyeColor,
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, 
    String nameOfMouth,  int lengthInCm, String nameOfTail)
    { super(name, currentAge, weightOfBrain, rightEyeColor, leftEyeColor,
        noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, colorOfHeart,
        nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth);
        this.rightWhisker = new Whisker(  lengthInCm, true); 
        this.leftWhisker = new Whisker(  lengthInCm, true); 
        this.tail = new Tail( lengthInCm, true, nameOfTail);    

    }

    @Override 
    public String toString(){
        String message = super.toString();
        message += ".\n   The left whisker is "+ getLeftWhisker().getLengthInCm()+" cm and is ";
        if(getLeftWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right whisker is "+ getRightWhisker().getLengthInCm()+" cm and is ";
        if(getRightWhisker().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The tail is "+getTail().getLengthInCm()+" centimeters long and is ";
        if(getTail().getIsWorking())
            message += "working";
        else
            message += "not working";
            
            return message;
    }

    public Whisker getLeftWhisker()
    {
        return this.leftWhisker;
    }

    public Whisker getRightWhisker()
    {
        return this.rightWhisker;
    }

    public Tail getTail()
    {
        return this.tail;
    }

    @Override
    public String weakAction()
    {
        return swim();
    }

    @Override
    public String normalAction()
    {
        return eat();
    }

    @Override
    public String strongAction()
    {
        return sleep();
    }

    public String swim() 
    { if(!getHeart().getIsWorking() || !getBrain().getIsWorking() 
        || !getTail().getIsWorking())
        {
            return getName()+ " is dead and cannot swim.";
        }
        return getName() + " swims. " + getHeart().beat() + " " + getBrain().sendSignals() + " " + getTail().wag();
    }

    public String eat()
    {
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking() || !getMouth().getIsWorking() || !getRightWhisker().getIsWorking() || getLeftWhisker().getIsWorking() 
        || !getMouth().getIsWorking())
        {
            return getName()+ " is dead and cannot eat.";
        }
        return getName() + " eats." + getHeart().beat() + " " + getBrain().sendSignals() + " "  + " " 
        + getMouth().eat();
    }

    public String sleep() 
    {
        if( !getHeart().getIsWorking() || !getBrain().getIsWorking() || !getMouth().getIsWorking() || !getRightWhisker().getIsWorking() || getLeftWhisker().getIsWorking()
        || !getMouth().getIsWorking())
        {
            return getName()+ " is dead and cannot sleep.";
        }
        return getName() +" sleeps." + getHeart().beat() + " " + getBrain().sendSignals() + " " + getTail().wag();

    }

    @Override
    public String revive()
    {
        setIsAlive(true);
        goToHospital();
        return getName() + " has been brought back to life.";
    }

    public String goToHospital()
    {
        return getLeftEye().heal() + " " + getRightEye().heal() + " " + getHeart().heal() + " " + getBrain().heal() + " " + 
        getLeftWhisker().heal() + " " + getRightWhisker().heal() + " " + getMouth().heal() + " " + getTail().heal();
    }
}
