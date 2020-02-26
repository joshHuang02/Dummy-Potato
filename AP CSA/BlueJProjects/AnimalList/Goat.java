public class Goat extends Mammal
{
    //instance variables


    
    private Leg backRightLeg;
    private Leg backLeftLeg;
    private Leg frontRightLeg;
    private Leg frontLeftLeg;
    

    
    private Tail tail;
    
    //constructors
    Goat(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking){
            super(name,  currentAge,  isAlive,  weightOfBrain, 
     rightEyeColor, leftEyeColor,  nameOfNose,  noseIsWorking, noseSensitivity,  leftEarSize, 
     rightEarSize,  mouthSizeInInches, colorOfHeart, 
    nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar,
    nameOfMouth, leftEyeIsWorking, rightEyeIsWorking, leftEarIsWorking, rightEarIsWorking, mouthIsWorking,
    heartIsWorking);
    }
    
    Goat(String name, double currentAge,
    double weightOfBrain, String rightEyeColor, String leftEyeColor, 
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth){
     super( name, currentAge,
     weightOfBrain, rightEyeColor, leftEyeColor, 
    noseSensitivity,  leftEarSize,  rightEarSize, 
    mouthSizeInInches, colorOfHeart,nameOfRightEye, 
    nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth);
    }
   /* public Goat(int age, boolean isAlive){
        this.age = age;
        this.isAlive = isAlive;
        
        mouth = new Mouth(true);
        
        heart = new Heart("red", true);
        
        rightEar = new Ear("huge","rightEar", true);
        leftEar = new Ear("huge","leftEar", true);
        
        nose = new Nose(1);
        
        backRightLeg = new Leg("backRightLeg", 3);
        backLeftLeg = new Leg("backLeftLeg", 3);
        frontRightLeg = new Leg("frontRightLeg", 3);
        frontLeftLeg = new Leg("frontLeftLeg", 3);
        
        brain = new Brain(5.0, true);
        
        rightEye = new Eye("Brown", true);
        leftEye = new Eye("Brown", true);
        
        tail = new Tail(4, true);
    }
    */
    //methods
    
    public String chowSomeGrass()
    {
       if (this.getIsAlive())
        {
            
            return getMouth().eat() + getTail().wag() + getBrain().getIsWorking() + getHeart().beat();
        }
        else return "The goat ain't even alive";
        
    }
    
    public String revive()
    {
        if (this.getIsAlive() == false)
        {
            return this.getHeart().heal() + this.getMouth().heal() + this.getRightEar().heal() + this.getLeftEar().heal() + this.backRightLeg.heal() + this.backLeftLeg.heal() + this.frontLeftLeg.heal() + this.frontRightLeg.heal(); 
           
        }
        else return "The goat ain't even alive";
    }
    
    public String dash()
    {
        if (this.getIsAlive())
        {
            return getMouth().eat() + getTail().wag() + getBrain().getIsWorking() + getHeart().beat() + getBackRightLeg().step() + getBackLeftLeg().step() + getFrontRightLeg().step() + getFrontLeftLeg().step();
           
        }
        else return "The goat ain't even alive";
    }
    
    
    public String listenUp()
    {
        if (this.getIsAlive())
        {
            return getBrain().getIsWorking() + getHeart().beat() + getRightEar().listenToMusic() + getLeftEar().listenToMusic();
        }
        else return "The goat ain't even alive";
    }
    
    @Override
    public String toString()
    {
        String message = "";
        message += super.toString();
        return message;
    }
    
    @Override
    public String weakAction()
    {
        return chowSomeGrass();
    }
    
    @Override
    public String normalAction()
    {
        return dash();
    }
    
    @Override
    public String strongAction()
    {
        return listenUp();
    }
    
    public Tail getTail()
    {
        return this.tail;
    }
    
    public Leg getBackRightLeg()
    {
        return this.backRightLeg;
    }
    
    public Leg getBackLeftLeg()
    {
        return this.backLeftLeg;
    }
    
    public Leg getFrontRightLeg()
    {
        return this.frontRightLeg;
    }
    
    public Leg getFrontLeftLeg()
    {
        return this.frontLeftLeg;
    }
}
