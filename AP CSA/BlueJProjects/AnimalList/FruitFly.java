public class FruitFly extends Arthropod{
  private Leg hindLeftLeg;
  private Leg hindRightLeg;
  private Leg frontLeftLeg;
  private Leg frontRightLeg;
  private Wing rightWing;
  private Wing leftWing;
  public FruitFly(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String nameOfAntenna, String antennaType, double antennaLengthInCm,
   String nameOfEye, String colorOfEye, boolean isWorkingEye, String nameOfLeg, int legLengthInInches, boolean isWorkingLeg, String colorOfHeart, String nameOfMouth, int mouthSizeInInches, boolean isWorkingMouth, String wingName, boolean isWorkingWing, String wingColor){
    super(name, currentAgeInYears, isAlive, weightOfBrain,nameOfAntenna, antennaType, antennaLengthInCm, nameOfEye, colorOfEye, isWorkingEye, nameOfLeg, legLengthInInches, isWorkingLeg, colorOfHeart, nameOfMouth, mouthSizeInInches, isWorkingMouth);
    hindLeftLeg = new Leg(name, legLengthInInches, isWorkingLeg);
    hindRightLeg = new Leg(name, legLengthInInches, isWorkingLeg);
    frontLeftLeg = new Leg(name, legLengthInInches, isWorkingLeg);
    frontRightLeg = new Leg(name, legLengthInInches, isWorkingLeg);
    rightWing = new Wing(wingName, isWorkingWing, wingColor);
    leftWing = new Wing(wingName, isWorkingWing, wingColor);

  }
  public String checkSurroundings(){
    if (!((getHeart().getIsUsable()) || getBrain().getIsWorking())){
      return ("The fly is dead, thank the stars.");
    }
    return getLeftAntenna().sense() + getRightAntenna().sense() + getRightEye().blink() + getLeftEye().blink() + getHeart().beat() + getBrain().sendSignals();
  }
  public String searchForFood(){
    if (!((getHeart().getIsUsable()) || getBrain().getIsWorking())){
      return ("The fly is dead, don't bother searching.");
    }
    return getLeftLeg().step() + getRightLeg().step() + getHindLeftLeg().step() + getHindRightLeg().step() + getFrontLeftLeg().step() + getFrontRightLeg().step() + getLeftEye().blink() + getRightEye().blink() + getHeart().beat() + getBrain().sendSignals() + getRightWing().flap() + getLeftWing().flap();
  }
  public String liquidateAndConsumeAVictim(){
    if (!((getHeart().getIsUsable()) || getBrain().getIsWorking())){
      return "The fly is dead, be glad someone will die another day.";
    }
    return getBrain().sendSignals() + getHeart().beat() + getMouth().eat() + getLeftEye().blink() + getRightEye().blink() + " Congratulations, you got someone killed. Not only did they die a very painful death, they also died by a fruit fly. You should be ashamed of yourself.";
  }
  @Override
  public String weakAction(){
    return checkSurroundings();
  }
  @Override
  public String normalAction(){
    return searchForFood();
  }
  @Override
  public String strongAction(){
    return liquidateAndConsumeAVictim();
  }
  @Override
  public String revive(){
    setIsAlive(true);
    return getBrain().heal() + getHeart().heal() + getLeftEye().heal() + getRightEye().heal() + getLeftWing().heal() + getRightWing().heal() + getLeftLeg().heal() + getRightLeg().heal() + getHindLeftLeg().heal() + getHindRightLeg().heal() + getFrontLeftLeg().heal() + getFrontRightLeg().heal() + getLeftAntenna().heal() + getRightAntenna().heal() + getMouth().heal() + "The fruit fly has healed. Mercy be upon us, for we have fallen";
  }
  /* For some reason there were no getters or setters for Wing so I had to make do.
  */
  public String toString(){
    String message = "";
    message += super.toString();
    message += "\n   Hind Left Leg: is "+ getHindLeftLeg().getlengthInInches() +" inches long and is ";       
        if(getHindLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
    message += "\n   Hind Right Leg: is "+ getHindRightLeg().getlengthInInches() +" inches long and is ";       
        if(getHindRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
    message += "\n  Front Left Leg: is "+ getFrontLeftLeg().getlengthInInches() +" inches long and is ";       
        if(getFrontLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
    message += "\n  Front Right Leg: is "+ getFrontRightLeg().getlengthInInches() +" inches long and is ";       
        if(getFrontRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
    message += "\n   Left Wing is ";
        if(getLeftWing().getIsWorking())
            message += "working.";
        else
            message += "not working.";
   message += "\n   Right Wing is ";       
        if(getRightWing().getIsWorking())
            message += "working.";
        else
            message += "not working.";
  return message;
  }
  public Leg getHindLeftLeg(){
    return this.hindLeftLeg;
  }
  public Leg getHindRightLeg(){
    return this.hindRightLeg;
  }
  public Leg getFrontLeftLeg(){
    return this.frontLeftLeg;
  }
  public Leg getFrontRightLeg(){
    return this.frontRightLeg;
  }
  public Wing getLeftWing(){
    return this.leftWing;
  }
  public Wing getRightWing(){
    return this.rightWing;
  }
}