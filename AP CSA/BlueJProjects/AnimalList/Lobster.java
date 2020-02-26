
// issue with rightEye
// arthropod created two leftEye objects
public class Lobster extends Arthropod
{
   //instance variables
   private Tail tail;
   private Gill gill; 
   private Leg leftLeg2;
   private Leg leftLeg3;
   private Leg leftLeg4;
   private Leg leftLeg5;
   private Leg rightLeg2;
   private Leg rightLeg3;
   private Leg rightLeg4;
   private Leg rightLeg5;
   
   //constructors
   public Lobster(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String nameOfAntenna, String antennaType,
    double antennaLengthInCm, String nameOfEye, String colorOfEye, boolean isWorkingEye, String nameOfLeg, int legLengthInInches,
    boolean isWorkingLeg, String colorOfHeart, String nameOfMouth, int mouthSizeInInches, boolean isWorkingMouth, String nameOfTail, 
    int tailLength, boolean tailIsWorking, String nameOfGill, int gillLengthInCm, boolean gillIsWorking)
   {
       super(name, currentAgeInYears, isAlive, weightOfBrain, nameOfAntenna, antennaType, antennaLengthInCm, nameOfEye, colorOfEye,
        isWorkingEye, nameOfLeg, legLengthInInches, isWorkingLeg, colorOfHeart, nameOfMouth, mouthSizeInInches, isWorkingMouth);
       tail = new Tail(tailLength, tailIsWorking, nameOfTail);
       gill = new Gill(nameOfGill, gillLengthInCm, gillIsWorking);
       leftLeg2 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       leftLeg3 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       leftLeg4 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       leftLeg5 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       rightLeg2 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       rightLeg3 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       rightLeg4 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
       rightLeg5 = new Leg(nameOfLeg, legLengthInInches, isWorkingLeg);
   }
   public Lobster(String name, double currentAgeInYears, double weightOfBrain, String nameOfAntenna, String antennaType,
    double antennaLengthInCm, String nameOfEye, String colorOfEye, String nameOfLeg, int legLengthInInches, String colorOfHeart, 
    String nameOfMouth, int mouthSizeInInches, String nameOfTail, int tailLength, String nameOfGill, int gillLengthInCm)
   {
       super(name, currentAgeInYears, true, weightOfBrain, nameOfAntenna, antennaType, antennaLengthInCm, nameOfEye, colorOfEye,
        true, nameOfLeg, legLengthInInches, true, colorOfHeart, nameOfMouth, mouthSizeInInches, true);
       tail = new Tail(tailLength, true, nameOfTail);
       gill = new Gill(nameOfGill, gillLengthInCm, true);
       leftLeg2 = new Leg(nameOfLeg, legLengthInInches, true);
       leftLeg3 = new Leg(nameOfLeg, legLengthInInches, true);
       leftLeg4 = new Leg(nameOfLeg, legLengthInInches, true);
       leftLeg5 = new Leg(nameOfLeg, legLengthInInches, true);
       rightLeg2 = new Leg(nameOfLeg, legLengthInInches, true);
       rightLeg3 = new Leg(nameOfLeg, legLengthInInches, true);
       rightLeg4 = new Leg(nameOfLeg, legLengthInInches, true);
       rightLeg5 = new Leg(nameOfLeg, legLengthInInches, true);
   }
   
   //methods
   public Tail getTail()
   {
       return this.tail;
   }
   
   public Gill getGill()
   {
       return this.gill;
   }
   
   public Leg getLeftLeg2()
   {
       return this.leftLeg2;
   }
   
   public Leg getLeftLeg3()
   {
       return this.leftLeg3;
   }
   
   public Leg getLeftLeg4()
   {
       return this.leftLeg4;
   }
   
   public Leg getLeftLeg5()
   {
       return this.leftLeg5;
   }
   
   public Leg getRightLeg2()
   {
       return this.rightLeg2;
   }
   
   public Leg getRightLeg3()
   {
       return this.rightLeg3;
   }
   
   public Leg getRightLeg4()
   {
       return this.rightLeg4;
   }
   
   public Leg getRightLeg5()
   {
       return this.rightLeg5;
   }
   
   public String eat()
   {
       if (!getIsAlive())
           return "The lobster is dead";
       if (!getHeart().getIsWorking() || !getBrain().getIsWorking())
           return "The lobster is dead";
           
       if (!getMouth().getIsWorking())
           return "The mouth does not work";
       return getHeart().beat() + "\n" + getBrain().action1() + "\n" + getMouth().action1();
           
   }
   
   public String sense()
   {
       if (!getIsAlive())
           return "The lobster is dead";
       if (!getHeart().getIsWorking() || !getBrain().getIsWorking())
           return "The lobster is dead";
      
       return getHeart().beat() + "\n" + getBrain().action1() + "\n" + getGill().action1() + "\n" + getLeftEye().action1() 
       + "\n" + getRightEye().action1()  + "\n" + getLeftAntenna().action1() + "\n" + getRightAntenna().action1();
   }
   
   public String walk()
   {
       
       if (!getIsAlive())
           return "The lobster is dead";
       if (!getHeart().getIsWorking() || !getBrain().getIsWorking())
           return "The lobster is dead";
           
       return getHeart().beat() + "\n" + getBrain().action1() + "\n" + getTail().action1() + "\n" + getLeftLeg().action1() + "\n" + getRightLeg().action1()
        + "\n" + getLeftLeg().action1() + "\n" + getLeftLeg2().action1() + "\n" + getLeftLeg3().action1() + "\n" + getLeftLeg4().action1()
        + "\n" + getLeftLeg5().action1() + "\n" + getRightLeg2().action1() + "\n" + getRightLeg3().action1() + "\n" + getRightLeg4().action1()
        + "\n" + getRightLeg5().action1();
   }

   public String injure()
   {
       
       return getHeart().injure() + "\n" + getBrain().injure() + "\n" + getGill().injure() + "\n" + getLeftAntenna().injure()
        + "\n" + getRightAntenna().injure() + "\n" + getMouth().injure() + "\n" + getLeftEye().injure() + "\n" + getRightEye().injure()
        + "\n" + getLeftLeg().injure() + "\n" + getRightLeg().injure() + "\n" + getTail().injure() + "\n" + getLeftLeg2().injure() 
        + "\n" + getLeftLeg3().injure() + "\n" + getLeftLeg4().injure() + "\n" + getLeftLeg5().injure() + "\n" + getRightLeg2().injure() 
        + "\n" + getRightLeg3().injure() + "\n" + getRightLeg4().injure() + "\n" + getRightLeg5().injure();
       
   }


   public String revive()
   {
       setIsAlive(true);
       getHeart().heal();
       getBrain().heal();
       getGill().heal();
       getLeftAntenna().heal();
       getRightAntenna().heal();
       getMouth().heal();
       getLeftEye().heal();
       getRightEye().heal();
       getLeftLeg().heal();
       getRightLeg().heal();
       getTail().heal();
       getLeftLeg2().heal(); 
       getLeftLeg3().heal();
       getLeftLeg4().heal();
       getLeftLeg5().heal();
       getRightLeg2().heal(); 
       getRightLeg3().heal();
       getRightLeg4().heal();
       getRightLeg5().heal();
       
       return "All the animal parts have been healed";
   }

   @Override
   public String weakAction()
   {
       return eat();
   }
   
   @Override
   public String normalAction()
   {
       return sense();
   }
   
   @Override
   public String strongAction()
   {
       return walk(); 
   }
   
   @Override
   public String toString()
   {
        String message = "";
        message += super.toString();

        message += "\n   Tail: is "+getTail().getLengthInCm()+" cm long and is ";
        if(getTail().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += "\n   Gill: is "+getGill().getLengthInCm()+" cm long and is ";
        if(getGill().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += "\n   Left Leg 2: is "+getLeftLeg2().getlengthInInches()+" inches long and is ";
        if(getLeftLeg2().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Left Leg 3: is "+getLeftLeg3().getlengthInInches()+" inches long and is ";
        if(getLeftLeg3().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Left Leg 3: is "+getLeftLeg3().getlengthInInches()+" inches long and is ";
        if(getLeftLeg3().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Left Leg 4: is "+getLeftLeg4().getlengthInInches()+" inches long and is ";
        if(getLeftLeg4().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Left Leg 5: is "+getRightLeg5().getlengthInInches()+" inches long and is ";
        if(getRightLeg5().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Right Leg 2: is "+getRightLeg2().getlengthInInches()+" inches long and is ";
        if(getRightLeg2().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Right Leg 3: is "+getRightLeg3().getlengthInInches()+" inches long and is ";
        if(getRightLeg3().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Right Leg 3: is "+getRightLeg3().getlengthInInches()+" inches long and is ";
        if(getRightLeg3().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Right Leg 4: is "+getRightLeg4().getlengthInInches()+" inches long and is ";
        if(getRightLeg4().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
            message += "\n   Right Leg 5: is "+getRightLeg5().getlengthInInches()+" inches long and is ";
        if(getRightLeg5().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        return message;
   }
   
   
   
   
   
}
