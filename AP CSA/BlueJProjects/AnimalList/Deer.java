public class Deer extends Mammal
{
    private Tail tail;
    private Leg leftForeLeg;
    private Leg rightForeLeg;
    private Leg leftHindLeg;
    private Leg rightHindLeg;
    
    public Deer(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, 
    int noseSensitivity, String leftEarSize, String rightEarSize, double mouthSizeInInches, 
    String colorOfHeart, String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, 
    String nameOfRightEar,String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, 
    boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,boolean heartIsWorking,
    
    int lengthOfTailInCm, boolean tailIsWorking, 
    int lengthOfLeftForeLegInInChes, int lengthOfRightForeLegInInChes,
    int lengthOfLeftHindLegInInChes, int lengthOfRightHindLegInInChes)
    {
     super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, 
     nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize, mouthSizeInInches, 
     colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth, 
     leftEyeIsWorking, rightEyeIsWorking, leftEarIsWorking, rightEarIsWorking, mouthIsWorking,
     heartIsWorking);
     Tail tail=new Tail(lengthOfTailInCm,tailIsWorking,"tail");
     Leg leftForeLeg = new Leg("left fore leg",lengthOfLeftForeLegInInChes);
     Leg rightForeLeg = new Leg("right fore leg",lengthOfRightForeLegInInChes);
     Leg leftHindLeg = new Leg("left hind leg",lengthOfLeftHindLegInInChes);
     Leg rightindLeg = new Leg("right hind leg",lengthOfRightHindLegInInChes);
       
    }
    
    public Deer(String name, double currentAgeInYears,
    double weightOfBrain, String rightEyeColor, String leftEyeColor, 
    int noseSensitivity, String leftEarSize, String rightEarSize, 
    double mouthSizeInInches, String colorOfHeart,String nameOfRightEye, 
    String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    
    int lengthOfTailInCm, boolean tailIsWorking,
    int lengthOfLeftForeLegInInChes, int lengthOfRightForeLegInInChes,
    int lengthOfLeftHindLegInInChes, int lengthOfRightHindLegInInChes)
    {
       super(name,currentAgeInYears,weightOfBrain, 
       rightEyeColor,leftEyeColor, noseSensitivity,leftEarSize, 
       rightEarSize,mouthSizeInInches,colorOfHeart,nameOfRightEye, 
       nameOfLeftEye,nameOfLeftEar,nameOfRightEar, "mouth");
       Tail tail=new Tail(lengthOfTailInCm,tailIsWorking,"tail");
       Leg leftForeLeg = new Leg("left fore leg",lengthOfLeftForeLegInInChes);
       Leg rightForeLeg = new Leg("right fore leg",lengthOfRightForeLegInInChes);
       Leg leftHindLeg = new Leg("left hind leg",lengthOfLeftHindLegInInChes);
       Leg rightindLeg = new Leg("right hind leg",lengthOfRightHindLegInInChes);
       
    }
    
    @Override
    public String weakAction()
    {
        return run();
    }
    @Override
    public String normalAction()
    {
        return eat();
    }
    @Override
    public String strongAction()
    {
        return attack();
    }
    public String toString()
    {
        String message="";
        message+=super.toString();
        
        message+= "\n Left fore leg is "+ leftForeLeg.getlengthInInches()+" inches and is ";
        if(leftForeLeg.getIsWorking()){
            message+="working";
        }
        else{
            message+="not working";
        }
        
        message+= "\n Right fore leg is "+ rightForeLeg.getlengthInInches()+" inches and is ";
        if(rightForeLeg.getIsWorking()){
            message+="working";
        }
        else{
            message+="not working";
        }
        
        message+= "\n Left hind leg is "+ leftHindLeg.getlengthInInches()+" inches and is ";
        if(leftHindLeg.getIsWorking()){
            message+="working";
        }
        else{
            message+="not working";
        }
        
        message+= "\n Right hind leg is "+ rightHindLeg.getlengthInInches()+" inches and is ";
        if(rightHindLeg.getIsWorking()){
            message+="working";
        }
        else{
            message+="not working";
        }
        
        message+= "\n Tail is "+ tail.getLengthInCm()+" cm and is ";
        if(tail.getIsWorking()){
            message+="working";
        }
        else{
            message+="not working";
        }
        
        return message;
    }
    @Override
    public String revive()
    {
        setIsAlive(true);
        return heal() + "The deer is alive now";
    }
    
    public String heal()
    {
        return getHeart().heal() + "\n" + getBrain().heal() +"\n" + getMouth().heal() 
        + "\n" + getLeftEye().heal() + "\n" + getRightEye().heal()
        +"\n" + tail.heal() +  "\n" + getLeftEar().heal() 
        +"\n"+ getRightEar().heal() +"\n"+ leftForeLeg.heal() +"\n"+ rightForeLeg.heal()
        +"\n" + leftHindLeg.heal()+"\n"+ rightHindLeg.heal() + "\n" ;
        // getNose().chanceOfallergy()+ "\n" +
    }
    
    public String run()
    {
        if(!getHeart().getIsWorking()){
            return "The getHeart() stopped working";
        }
        return getHeart().action1() + "\n" + getBrain().action1() + "\n" + getLeftEye().action1()
        + "\n"+ getRightEye().action1()+ "\n" + leftForeLeg.action1()
        + "\n" + rightForeLeg.action1()+ "\n" + leftHindLeg.action1()
        + "\n" + rightHindLeg.action1()+ "\n";
    }
    
    public String eat()
    {
        if(!this.getHeart().getIsWorking()){
            return "The getHeart() stopped working";
        }
        return getHeart().action1() + "\n" + getBrain().action1() + "\n" + getLeftEye().action1()
        + "\n"+ getRightEye().action1()+ "\n" + getMouth().action1()
        + "\n" + getNose().action1()+ "\n";
    }
    
    public String attack()
    {
        if(!this.getHeart().getIsWorking()){
            return "The getHeart() stopped working";
        }
        return getHeart().action1() + "\n" + getBrain().action1() + "\n" + getLeftEye().action1()
        + "\n"+ getRightEye().action1()+ "\n" + leftForeLeg.action1()
        + "\n" + rightForeLeg.action1()+ "\n" + leftHindLeg.action1()
        + "\n" + rightHindLeg.action1()+ "\n" + getLeftEar().action1() 
        + "\n" + getRightEar().action1()+ "\n";
    }
    
    
    public Leg getLeftForeLeg()
    {
        return leftForeLeg;
    }
    public Leg getRightForeLeg()
    {
        return rightForeLeg;
    }
    public Leg getLeftHindLeg()
    {
        return leftHindLeg;
    }
    public Leg getRightHindLeg()
    {
        return rightHindLeg;
    }
    public Tail tail()
    {
        return tail;
    }
}
