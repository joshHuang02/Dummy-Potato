public class Elephant extends Mammal
{
    private Tail tail;
    private Leg leg1;
    private Leg leg2;
    private Leg leg3;
    private Leg leg4;
    private Trunk trunk;
    
    
    
    /*public Elephant(){
        nose = new Nose(false,4);
        tail = new Tail(100,true);
        leg1 = new Leg(100, true);
        leg2 = new Leg(100, true);
        leg3 = new Leg(100, true);
        leg4 = new Leg(100, true);
        ear1 = new Ear("Large", true);
        ear2 = new Ear("Large", true);
        eye1 = new Eye("brown",true);
        eye2 = new Eye("brown",true);
        mouth = new Mouth(36,true);
        trunk = new Trunk("grey", true);
        heart = new Heart("red", true);
        brain = new Brain(20, true);
    }*/
   
    public Elephant (String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking, String nameOfLeg1, String nameOfLeg2, String nameOfLeg3,
    String nameOfLeg4, int legLength, int tailLengthInCm, String trunkColor, boolean legIsWorking,
    boolean tailIsWorking, boolean trunkIsWorking, String nameOfTail){
    super( name,  currentAge,  isAlive,  weightOfBrain, 
     rightEyeColor,  leftEyeColor,  nameOfNose,  noseIsWorking,  noseSensitivity,  leftEarSize, 
     rightEarSize,  mouthSizeInInches,  colorOfHeart, 
     nameOfRightEye,  nameOfLeftEye,  nameOfLeftEar,  nameOfRightEar,
     nameOfMouth,  leftEyeIsWorking,  rightEyeIsWorking,  leftEarIsWorking,  rightEarIsWorking,  mouthIsWorking,
     heartIsWorking);
     // String name, double currentAge, boolean isAlive, double weightOfBrain, 
    // String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    // String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    // String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    // String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    // boolean heartIsWorking
    this.leg1 = new Leg(nameOfLeg1,legLength,legIsWorking);
    this.leg2 = new Leg(nameOfLeg2,legLength,legIsWorking);
    this.leg3 = new Leg(nameOfLeg3,legLength,legIsWorking);
    this.leg4 = new Leg(nameOfLeg4,legLength,legIsWorking);
    this.tail = new Tail(tailLengthInCm,tailIsWorking,nameOfTail);
    this.trunk = new Trunk(50,trunkColor,trunkIsWorking);
    }
    
    public Elephant (String name, double currentAge,
    double weightOfBrain, String rightEyeColor, String leftEyeColor,String nameOfNose, 
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar, String nameOfMouth, String nameOfLeg,
    int legLength, int tailLengthInCm, String trunkColor, String nameOfLeg1, String nameOfLeg2, String nameOfLeg3,
    String nameOfLeg4, String nameOfTail ){
    super( name,  currentAge,  true,  weightOfBrain, 
     rightEyeColor,  leftEyeColor,  nameOfNose,  true,  noseSensitivity,  leftEarSize, 
     rightEarSize,  mouthSizeInInches,  colorOfHeart, 
     nameOfRightEye,  nameOfLeftEye,  nameOfLeftEar,  nameOfRightEar,
     nameOfMouth,  true,  true,  true,  true,  true,
     true);
    this.leg1 = new Leg(nameOfLeg1,legLength, true);
    this.leg2 = new Leg(nameOfLeg2,legLength, true);
    this.leg3 = new Leg(nameOfLeg3,legLength, true);
    this.leg4 = new Leg(nameOfLeg4,legLength,true);
    this.tail = new Tail(tailLengthInCm,true, nameOfTail);
    this.trunk = new Trunk(50, trunkColor, true);
    }
    public String attack(){
        return "The elephant attacked" + "\n" + leg1.step() + "\n"
        + trunk.swing() + "\n" + leg2.step() + "\n" + leg3.step() 
        + "\n" + leg4.step() + "\n" + getHeart().beat() + "\n" 
        + getBrain().sendSignals();
    }
    
    public String guard(){
        if(((int)(Math.random()*100) +1)>80){
            return this.getBrain().injure() + "\n" 
            + " The elephant could not guard itself";
        }
        
        return "The elephant became alert of its surroundings" + "\n" + this.getLeftEye().blink()
        + "\n" + this.getRightEye().blink() + "\n" + this.getLeftEar().listenToMusic() + "\n" + this.getRightEar().listenToMusic() 
        + "\n" + tail.wag();
    }
    
    public String eat(){
        /*if(((int)(Math.random()*100) +1)>80){
            return heart.heartAttack() + "\n" 
            + " The elephant collapsed";
        }*/
        
        if (!this.getHeart().getIsWorking()){
            return "the heart stopped working";
        }
        
        if(((int)(Math.random()*100) +1)>80){
            return getNose().heal() + "\n" + getTail().heal() + "\n" + getLeg1().heal()
            + "\n" + getLeg2().heal() + "\n" + getLeg3().heal() + "\n" + getLeg4().heal()
            + "\n" + getLeftEye().heal() + "\n" + getRightEye().heal() + "\n" + getLeftEar().heal()
            + "\n" + getRightEar().heal() + "\n" + getMouth().heal() + "\n" + getTrunk().heal()
            + "\n" + getHeart().heal() + "\n" + getBrain().heal()
            + " The elephant was healed";
        }
        
        return "The elephant started to eat" + "\n" + trunk.swing() + "\n" 
        + getMouth().eat() + "\n" + getNose().breathe();
    }
    
    @Override
    public String toString()
    {
        String message = "This "+getName()+" is ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";
        
        message += ".\n   Brain weighs "+ getBrain().getWeightInPounds()+" lbs and is ";
        if(getBrain().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The" + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The" + getRightEye().getNameOfPart() + "is "+ getRightEye().getColor() +" and is ";
        if(getRightEye().getIsWorking())
            message += "working.";
        else
            message += "not working.";   
       
        message += ".\n   The heart is "+ getHeart().getColor()+" and is ";
        if(getHeart().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The nose is ";
        if(getNose().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The left ear is "+ getLeftEar().getSize()+" inches and is ";
        if(getLeftEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The right ear is "+getRightEar().getSize()+" inches and is ";
        if(getRightEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The mouth is "+ getMouth().getMouthSizeInInches()+" inches and is ";
        if(getMouth().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   The leg1 is "+ getLeg1().getlengthInInches()+" inches and is ";
        if(getLeg1().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   The leg2 is "+ getLeg2().getlengthInInches()+" inches and is ";
        if(getLeg2().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   The leg3 is "+ getLeg3().getlengthInInches()+" inches and is ";
        if(getLeg3().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   The leg4 is "+ getLeg4().getlengthInInches()+" inches and is ";
        if(getLeg4().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        message += ".\n   The tail is "+ getTail().getLengthInCm()+" Cm and is ";
        if(getTail().getIsWorking())
            message += "working.";
        else
            message += "not working.";
            
        message += ".\n   The trunk is "+ getTrunk().getTrunkLength()+" inches and is ";
        if(getTrunk().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }
    
    public Trunk getTrunk()
    {
        return trunk;
    }
    public Tail getTail()
    {
        return tail;
    }
    public Leg getLeg1()
    {
        return leg1;
    }
    public Leg getLeg2()
    {
        return leg2;
    }
    public Leg getLeg3()
    {
        return leg3;
    }
    public Leg getLeg4()
    {
        return leg4;
    }
    public String weakAction(){
        return attack();
    }
    public String normalAction(){
        return guard();
    }
    public String strongAction(){
        return eat();
    }
    public String heal(){
        return eat();
    }
    



    
}