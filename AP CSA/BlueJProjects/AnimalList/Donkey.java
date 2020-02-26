
public class Donkey extends Mammal
{
  // instance variables
  private Tail tail;
  private Leg frontRightLeg;
  private Leg frontLeftLeg;
  private Leg backRightLeg;
  private Leg backLeftLeg;

  // constructors
  public Donkey (String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking, int lengthOfTail, boolean tailIsWorking, String nameOfTail, int lengthOfFrontRightLeg, int lengthOfFrontLeftLeg, int lengthOfBackRightLeg, int lengthOfBackLeftLeg,
    String nameOfFrontRightLeg, String nameOfBackRightLeg, String nameOfFrontLeftLeg, String nameOfBackLeftLeg, boolean frontRightLegIsWorking
    , boolean frontLeftLegIsWorking, boolean backLeftLegIsWorking, boolean backRightLegIsWorking) {
      super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, 
      mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth, leftEyeIsWorking, rightEyeIsWorking,
      leftEarIsWorking, rightEarIsWorking, mouthIsWorking, heartIsWorking);
      this.tail = new Tail(lengthOfTail, tailIsWorking, nameOfTail);
      this.frontRightLeg = new Leg(nameOfFrontRightLeg, lengthOfFrontRightLeg, frontRightLegIsWorking);
      this.frontLeftLeg = new Leg(nameOfFrontLeftLeg, lengthOfFrontLeftLeg, frontLeftLegIsWorking);
      this.backRightLeg = new Leg(nameOfBackRightLeg, lengthOfBackRightLeg, backRightLegIsWorking);
      this.backLeftLeg = new Leg(nameOfBackLeftLeg, lengthOfBackLeftLeg, backRightLegIsWorking);
    }
  
    public Donkey (String name, double currentAge, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, int lengthOfTail, String nameOfTail, int lengthOfFrontRightLeg, int lengthOfFrontLeftLeg, int lengthOfBackRightLeg, int lengthOfBackLeftLeg,
    String nameOfFrontRightLeg, String nameOfBackRightLeg, String nameOfFrontLeftLeg, String nameOfBackLeftLeg) {
      super(name, currentAge, weightOfBrain, rightEyeColor, leftEyeColor, noseSensitivity, leftEarSize, rightEarSize, 
      mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth);
      this.tail = new Tail(lengthOfTail, true, nameOfTail);
      this.frontRightLeg = new Leg(nameOfFrontRightLeg, lengthOfFrontRightLeg, true);
      this.frontLeftLeg = new Leg(nameOfFrontLeftLeg, lengthOfFrontLeftLeg, true);
      this.backRightLeg = new Leg(nameOfBackRightLeg, lengthOfBackRightLeg, true);
      this.backLeftLeg = new Leg(nameOfBackLeftLeg, lengthOfBackLeftLeg, true);
    }
  

  // methods
  public Tail getTail() {
    return this.tail;
  }

  public Leg getFrontRightLeg() {
    return this.frontRightLeg;
  }

  public Leg getFrontLeftLeg() {
    return this.frontLeftLeg;
  }

  public Leg getBackRightLeg() {
    return this.backRightLeg;
  }

  public Leg getBackLeftLeg() {
    return this.backLeftLeg;
  }
  
  public String gallop() {

        if (!getHeart().getIsWorking() || !getBrain().getIsWorking()) {
            return "The donkey is dead!";
        }
        
        return "First Leg: " + this.frontRightLeg.step() + "\n" + "Second Leg: " + this.frontLeftLeg.step() + "\n" + "Third Leg: " + this.backRightLeg.step() + "\n" + "Fourth Leg: " + this.backLeftLeg.step() + "\n" + "Heart: " + this.getHeart().beat() + "\n" + "Brain: " + this.getBrain().sendSignals(); 
  }
  
  public String eat() {
        if (!getHeart().getIsWorking() || !getBrain().getIsWorking()) {
            return "The donkey is dead!";
        }
        
        return "Mouth: " + this.getMouth().eat() + "\n" + "Heart: " + this.getHeart().beat() + "\n" + "Brain: " + this.getBrain().sendSignals();
  }
  
  public String wag() {
        if (!getHeart().getIsWorking() || !getBrain().getIsWorking()) {
            return "The donkey is dead!";
        }
        
        return this.tail.wag() + " " + this.getHeart().beat() + " " + this.getBrain().sendSignals();
  }
  
  public String visitHospital() {
        setIsAlive(true);
        return getBrain().heal() + "/n" +
        getHeart().heal() + "/n" +
        getMouth().heal() + "/n" +
        getNose().heal() + "/n" +
        this.tail.heal() + "/n" +
        getLeftEar().heal() + "/n" +
        getRightEar().heal() + "/n" +
        getLeftEye().heal() + "/n" +
        getRightEye().heal() + "/n" +
        this.frontRightLeg.heal() + "/n" +
        this.frontLeftLeg.heal() + "/n" +
        this.backRightLeg.heal() + "/n" +
        this.backLeftLeg.heal();
    }
  
  @Override
  public String weakAction() {
      return gallop();
  }
  
  @Override
  public String normalAction() {
      return eat();
  }
  
  @Override
  public String strongAction() {
      return wag();
  }
  
  @Override
  public String revive() {
      return visitHospital();
  }
  
  public String injure() {
      return getHeart().injure() + "\n" + getBrain().injure() + "\n" + getMouth().injure() + getNose().injure() + "\n" 
      + this.tail.injure() + "\n" + getLeftEar().injure() + "\n" + getRightEar().injure() + "\n" + getLeftEye().injure() + "\n"
      + getRightEye().injure() + "\n" + this.frontRightLeg.injure() + "\n" + this.frontLeftLeg.injure() + "\n" 
      + this.backRightLeg.injure() + "\n" + this.backLeftLeg.injure();
    }
  
  @Override
  public String toString() {
      String message = super.toString();
      message += ".\n   Front Right Leg weighs "+ this.frontRightLeg.getlengthInInches()+" inches and is ";
        if(this.frontRightLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   Front Left Leg is "+ this.frontLeftLeg.getlengthInInches()+" inches and is ";
        if(this.frontLeftLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   Back Right Leg is "+ this.backRightLeg.getlengthInInches()+" inches and is ";
        if(this.backRightLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   Back Left Leg is "+ this.backLeftLeg.getlengthInInches()+" inches and is ";
        if(this.backLeftLeg.getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   Tail is "+ this.tail.getLengthInCm()+" Cms and is ";
        if(this.tail.getIsWorking())
            message += "working.";
        else
            message += "not working.";
      return message;
        }
}