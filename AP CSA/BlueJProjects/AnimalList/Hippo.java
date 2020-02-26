
public class Hippo extends Mammal
{
    private Tail tail;
    private Leg leg1;
    private Leg leg2;
    private Leg leg3;
    private Leg leg4;

    public Hippo (String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking, int leg1LengthInInches, boolean leg1IsWorking,int leg2LengthInInches, boolean leg2IsWorking,
    int leg3LengthInInches, boolean leg3IsWorking,int leg4LengthInInches, boolean leg4IsWorking,
    int tailLengthInCm, boolean tailIsWorking, String nameOfLeg1,String nameOfLeg2,String nameOfLeg3,String nameOfLeg4,
    String nameOfTail){
        super( name,  currentAge,  isAlive,  weightOfBrain, 
            rightEyeColor,  leftEyeColor,  nameOfNose,  noseIsWorking,  noseSensitivity,  leftEarSize, 
            rightEarSize,  mouthSizeInInches,  colorOfHeart, 
            nameOfRightEye,  nameOfLeftEye,  nameOfLeftEar,  nameOfRightEar,
            nameOfMouth,  leftEyeIsWorking,  rightEyeIsWorking,  leftEarIsWorking,  rightEarIsWorking,  mouthIsWorking,
            heartIsWorking);
        this.leg1 = new Leg(nameOfLeg1,leg1LengthInInches,leg1IsWorking);
        this.leg2 = new Leg(nameOfLeg2,leg2LengthInInches,leg2IsWorking);
        this.leg3 = new Leg(nameOfLeg3,leg3LengthInInches,leg3IsWorking);
        this.leg4 = new Leg(nameOfLeg4,leg4LengthInInches,leg4IsWorking);
        this.tail = new Tail(tailLengthInCm,tailIsWorking,nameOfTail);
    }

    public Hippo (String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, int leg1LengthInInches, int leg2LengthInInches, 
    int leg3LengthInInches, int leg4LengthInInches, 
    int tailLengthInCm,String nameOfLeg1,String nameOfLeg2,String nameOfLeg3,String nameOfLeg4,
    String nameOfTail){
        super( name,  currentAge,
            weightOfBrain,  rightEyeColor,  leftEyeColor, 
            noseSensitivity,  leftEarSize,  rightEarSize, 
            mouthSizeInInches,  colorOfHeart, nameOfRightEye, 
            nameOfLeftEye,  nameOfLeftEar,  nameOfRightEar,  nameOfMouth);
        this.leg1 = new Leg(nameOfLeg1,leg1LengthInInches,true);
        this.leg2 = new Leg(nameOfLeg2,leg2LengthInInches,true);
        this.leg3 = new Leg(nameOfLeg3,leg3LengthInInches,true);
        this.leg4 = new Leg(nameOfLeg4,leg4LengthInInches,true);
        this.tail = new Tail(tailLengthInCm,true,nameOfTail);
    }

    public String chomp(){
        if(this.getHeart().getIsWorking() && this.getMouth().getIsWorking()){
            return this.getMouth().eat()+ this.getHeart().beat() +" The mouth chomps down.";
        }
        else{
            return "Hippo is too injured to chomp.";
        } 
    }

    public String swim(){
        if(this.getLeg1().getIsWorking() && this.getLeg2().getIsWorking() && this.getLeg3().getIsWorking() && this.getLeg4().getIsWorking()){
            if(this.getHeart().getIsWorking()){
                return this.getLeg1().step()+"\n"+this.getLeg2().step()+"\n"+this.getLeg3().step()+
                "\n"+this.getLeg4().step()+"\n"+this.getTail().wag()+"\n"+this.getHeart().beat()+"\n"+"The hippo swims";
            }
            else{
                return "The hippo's heart is not working";
            }
        }
        else{
            return "The hippo is too injured to swim";
        }
    }

    public String sneeze(){
        if(this.getRightEye().getIsWorking() && this.getLeftEye().getIsWorking()){
            if(this.getHeart().getIsWorking()){
                return this.getRightEye().blink()+"\n"+this.getLeftEye().blink()+"\n"+this.getNose().breathe()+"\n"+"The hippo sneezed.";
            }
            else{
                return "The hippo's heart is not working";
            }
        }
        else{
            return "The hippo is too injured to sneeze";
        }
    }

    public String heal(){
        this.getRightEye().heal();
        this.getLeftEye().heal();
        this.getLeg1().heal();
        this.getLeg2().heal();
        this.getLeg3().heal();
        this.getLeg4().heal();
        this.getMouth().heal();
        this.getTail().heal();
        this.getHeart().heal();

        return "All of the hippo's parts were healed";
    }

    public String revive(){
        setIsAlive(true);
        this.getHeart().heal();
        return "The hippo is no longer brain-dead.";
    }

    public String injure(){
        this.getRightEye().injure();
        this.getLeftEye().injure();
        this.getLeg1().injure();
        this.getLeg2().injure();
        this.getLeg3().injure();
        this.getLeg4().injure();
        this.getMouth().injure();
        this.getTail().injure();
        this.getHeart().injure();
        setIsAlive(false);
        return "All of the hippo's parts were injured";
    }

    public Leg getLeg1(){
        return leg1;
    }

    public Leg getLeg2(){
        return leg1;
    }

    public Leg getLeg3(){
        return leg1;
    }

    public Leg getLeg4(){
        return leg1;
    }

    public Tail getTail(){
        return tail;   
    }

    public String weakAction(){
        return sneeze();
    }

    public String normalAction(){
        return swim();
    }

    public String strongAction(){
        return chomp();
    }

    public String toString(){
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

        message += ".\n   The right ear is "+ getRightEar().getSize()+" inches and is ";
        if(getRightEar().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n   The mouth is "+ getMouth().getMouthSizeInInches()+" inches and is ";
        if(getMouth().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n The tail is "+getTail().getLengthInCm()+" centimeters and is ";
        if(getTail().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n The first leg is "+getLeg1().getlengthInInches()+" inches and is ";
        if(getLeg1().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n The second leg is "+getLeg2().getlengthInInches()+" inches and is ";
        if(getLeg2().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n The third leg is "+getLeg3().getlengthInInches()+" inches and is ";
        if(getLeg3().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message += ".\n The fourth leg is "+getLeg4().getlengthInInches()+" inches and is ";
        if(getLeg4().getIsWorking())
            message += "working.";
        else
            message += "not working.";

        return message;
    }
}
