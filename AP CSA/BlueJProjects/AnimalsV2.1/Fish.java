//Chelsea Wu and Justin Zhang
public class Fish extends Animal {

    //instance variables

    private Eye rightEye;
    private Eye leftEye;
    private Gill rightGill;
    private Gill leftGill;
    private Mouth mouth;
    private Heart heart;
    private Tail tail;
    private Fin rightPectoralFin;
    private Fin leftPectoralFin;
    private Fin rightDorsalFin;
    private Fin leftDorsalFin;

    //constructors
    public Fish(String colorEye, int lengthGillInCm, int lengthMouthInInches, String colorHeart, int lengthTailInCm, String name, double currentAgeInYears, double weightOfBrain, boolean isAlive, boolean isWorking) {
        super(name, currentAgeInYears, isAlive, weightOfBrain);
        this.rightEye = new Eye("rightEye", colorEye, isWorking);
        this.leftEye = new Eye("leftEye", colorEye, isWorking);
        this.rightGill = new Gill("rightGill", lengthGillInCm, isWorking);
        this.leftGill = new Gill("leftGill", lengthGillInCm, isWorking);
        this.mouth = new Mouth("mouth", lengthMouthInInches, isWorking);
        this.heart = new Heart(colorHeart, isWorking);
        this.tail = new Tail(lengthTailInCm, isWorking, "tail");
        this.rightPectoralFin = new Fin("Right Pectoral", isWorking);
        this.leftPectoralFin = new Fin("Left Pectoral", isWorking);
        this.rightDorsalFin = new Fin("Right Dorsal", isWorking);
        this.leftDorsalFin = new Fin("Left Dorsal", isWorking);

    }

    public Fish(int lengthGillInCm, int lengthMouthInInches, int lengthTailInCm, String name, double currentAgeInYears, double weightOfBrain) {
        super(name, currentAgeInYears, true, weightOfBrain);
        this.rightEye = new Eye("rightEye", "black", true);
        this.leftEye = new Eye("leftEye", "black", true);
        this.rightGill = new Gill("rightGill", lengthGillInCm, true);
        this.leftGill = new Gill("leftGill", lengthGillInCm, true);
        this.mouth = new Mouth("mouth", lengthMouthInInches, true);
        this.heart = new Heart("red", true);
        this.tail = new Tail(lengthTailInCm, true, "tail");
        this.rightPectoralFin = new Fin("Right Pectoral", true);
        this.leftPectoralFin = new Fin("Left Pectoral", true);
        this.rightDorsalFin = new Fin("Right Dorsal", true);
        this.leftDorsalFin = new Fin("Left Dorsal", true);
    }

    //methods
    public Eye getRightEye() {
        return this.rightEye;
    }

    public Eye getLeftEye() {
        return this.leftEye;
    }

    public Gill getRightGill() {
        return this.rightGill;
    }

    public Gill getLeftGill() {
        return this.leftGill;
    }

    public Mouth getMouth() {
        return this.mouth;
    }

    public Heart getHeart() {
        return this.heart;
    }

    public Tail getTail() {
        return this.tail;
    }

    public Fin getRightPectoralFin() {
        return this.rightPectoralFin;
    }
    
    public Fin getLeftPectoralFin() {
        return this.leftPectoralFin;
    }
    
    public Fin getRightDorsalFin() {
        return this.rightDorsalFin;
    }
    
    public Fin getLeftDorsalFin() {
        return this.leftDorsalFin;
    }
    
    @Override
    public String toString()
    {
        String message = "";
        message += "The " + getName() + " is ";
        if(getIsAlive())
        {
            message += "living.";
        }
        else
        {
            message += "not living.";
        }
        return message;
    }
    
}