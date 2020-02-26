public class Arthropod extends Animal{
  //instance variables
  private Antenna leftAntenna;
  private Antenna rightAntenna;
  private Eye leftEye;
  private Eye rightEye;
  private Leg leftLeg;
  private Leg rightLeg;
  private Heart heart;
  private Mouth mouth;
  //constructors 
  public Arthropod(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String nameOfAntenna, String antennaType, double antennaLengthInCm,
   String nameOfEye, String colorOfEye, boolean isWorkingEye, String nameOfLeg, int legLengthInInches, boolean isWorkingLeg, String colorOfHeart, String nameOfMouth, int mouthSizeInInches, boolean isWorkingMouth)
  {
    super(name, currentAgeInYears, isAlive, weightOfBrain);
    leftAntenna = new Antenna(nameOfAntenna, antennaType, antennaLengthInCm);
    rightAntenna = new Antenna(nameOfAntenna, antennaType, antennaLengthInCm);
    leftEye = new Eye(nameOfEye, colorOfEye, isWorkingEye);
    rightEye = new Eye(nameOfEye, colorOfEye, isWorkingEye);
    leftLeg = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
    rightLeg = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
    heart = new Heart(colorOfHeart, isAlive);
    mouth = new Mouth(nameOfMouth, mouthSizeInInches, isWorkingMouth);
  }
  public Arthropod(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain){
    super(name, currentAgeInYears, isAlive, weightOfBrain);
    leftAntenna = new Antenna("leftAntenna", "curved" , 1.0);
    rightAntenna = new Antenna("rightAntenna", "curved", 1.0);
    leftEye = new Eye("leftEye","black", true);
    rightEye = new Eye("rightEye","black", true);
    leftLeg = new Leg("leg", 1);
    rightLeg = new Leg("leg", 1);
    heart = new Heart("red");
    mouth = new Mouth("mouth", 1.0, true);
  }
  //methods
  
  @Override
  public String toString()
  {
    String message = "This " + getName() + " is currently ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";    
        message += ".\n   Left Antenna: type is " + getLeftAntenna().getType()
        + "\n   Right Antenna: type is " + getRightAntenna().getType(); 

        message += ".\n   Left Eye: color is "+ getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   Right Eye: color is "+ getRightEye().getColor() +" and is ";
        if(getRightEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";      

        message += "\n   Brain: weighs "+ getBrain().getWeightInPounds() +" lbs and is ";
        if(getBrain().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += "\n   Left Leg: is "+ getLeftLeg().getlengthInInches() +" inches long and is ";       
        if(getLeftLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += "\n   Right Leg: is "+ getRightLeg().getlengthInInches() +" inches long and is ";       
        if(getRightLeg().getIsWorking())
            message += "working.";
        else
            message += "not working.";    
        
        message += "\n   Heart: color is "+getHeart().getColor()+" and is ";
        if(getIsAlive())
            message += "working.";
        else
            message += "not working.";

        message += "\n   Mouth: is "+getMouth().getMouthSizeInInches()+" inches long and is ";
        if(getMouth().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
  }

  //getters and setters
  public Antenna getLeftAntenna()
  {
    return this.leftAntenna;
  }
  public Antenna getRightAntenna()
  {
    return this.rightAntenna;
  }
  public Eye getLeftEye()
  {
    return this.leftEye;
  }
  public Eye getRightEye()
  {
    return this.rightEye;
  }
  public Leg getLeftLeg()
  {
    return this.leftLeg;
  }
  public Leg getRightLeg()
  {
    return this.rightLeg;
  }
  public Mouth getMouth()
  {
    return this.mouth;
  }
  public Heart getHeart()
  {
    return this.heart;
  }
}