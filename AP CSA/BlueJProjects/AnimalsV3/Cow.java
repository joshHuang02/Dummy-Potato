public class Cow extends Mammal
{
    // instance variables - replace the example below with your own
    private Tail tail;
    private Leg rightForeleg;
    private Leg leftForeleg;
    private Leg rightHindleg;
    private Leg leftHindleg;

    /**
     * Constructor for objects of class Cow
     */
    public Cow(double age, int tailLengthInCm, int rightForelegLengthInCm, int leftForelegLengthInCm, 
                int rightHindlegLengthInCm, int leftHindlegLengthInCm, 
                String name, boolean isAlive, double weightOfBrain,
                String rightEyeColor, String leftEyeColor,
                int noseSensitivity, String leftEarSize,
                String rightEarSize, double mouthSizeInInches, 
                String colorOfHeart, String nameOfLeftEye, String nameOfLeftEar,
                String nameOfRightEar, String nameOfMouth)
    {
        super(name, age, isAlive, weightOfBrain, rightEyeColor, leftEyeColor,
        "nose" , isAlive, noseSensitivity, leftEarSize,
        rightEarSize, mouthSizeInInches, colorOfHeart,
        "right eye" , nameOfLeftEye, nameOfLeftEar, nameOfRightEar,
        nameOfMouth, isAlive, isAlive, isAlive, isAlive, isAlive,
        isAlive);
        this.tail = new Tail(tailLengthInCm, isAlive, "tail");
        this.rightForeleg = new Leg("right Foreleg", rightForelegLengthInCm, isAlive);
        this.leftForeleg = new Leg("left Foreleg", leftForelegLengthInCm, isAlive);
        this.rightHindleg = new Leg("right Hindleg", rightHindlegLengthInCm, isAlive);
        this.leftHindleg = new Leg("left Hindleg", leftHindlegLengthInCm, isAlive);
    }
    
    public Cow(double age, int tailLengthInCm, int rightForelegLengthInCm, int leftForelegLengthInCm, 
                int rightHindlegLengthInCm, int leftHindlegLengthInCm, 
                String name, double weightOfBrain,
                String rightEyeColor, String leftEyeColor,
                int noseSensitivity, String leftEarSize,
                String rightEarSize, double mouthSizeInInches, 
                String colorOfHeart, String nameOfLeftEye, String nameOfLeftEar,
                String nameOfRightEar, String nameOfMouth)
    {
        super(name, age, true, weightOfBrain, rightEyeColor, leftEyeColor,
        "nose" , true, noseSensitivity, leftEarSize,
        rightEarSize, mouthSizeInInches, colorOfHeart,
        "right eye" , nameOfLeftEye, nameOfLeftEar, nameOfRightEar,
        nameOfMouth, true, true, true, true, true, true);
        this.tail = new Tail(tailLengthInCm, true, "tail");
        this.rightForeleg = new Leg("right Foreleg", rightForelegLengthInCm, true);
        this.leftForeleg = new Leg("left Foreleg", leftForelegLengthInCm, true);
        this.rightHindleg = new Leg("right Hindleg", rightHindlegLengthInCm, true);
        this.leftHindleg = new Leg("left Hindleg", leftHindlegLengthInCm, true);
    }
    
    @Override
    public String revive()
    {
        setIsAlive(true);
        tail.setIsWorking(true);
        rightForeleg.setIsWorking(true);
        rightHindleg.setIsWorking(true);
        leftForeleg.setIsWorking(true);
        leftHindleg.setIsWorking(true);
        getBrain().setIsWorking(true);
        getNose().setIsWorking(true);
        getLeftEye().setIsWorking(true);
        getRightEye().setIsWorking(true);
        getHeart().setIsWorking(true);
        getMouth().setIsWorking(true);
        getLeftEar().setIsWorking(true);
        getRightEar().setIsWorking(true);
        return "The cow is now alive again; all parts working";
    }
    
    @Override
    public String toString()
    {
        String message = super.toString();
        message += ".\n   The" + tail.getNameOfPart() + "is "+ tail.getLengthInCm() +" and is ";
        if(tail.getIsWorking())
            message += "working";
        else
            message += "not working";
        message += ".\n   The" + rightForeleg.getNameOfPart() + "is "+ rightForeleg.getlengthInInches() +" and is ";
        if(rightForeleg.getIsWorking())
            message += "working";
        else
            message += "not working";
        message += ".\n   The" + leftForeleg.getNameOfPart() + "is "+ leftForeleg.getlengthInInches() +" and is ";
        if(leftForeleg.getIsWorking())
            message += "working";
        else
            message += "not working";
        message += ".\n   The" + rightHindleg.getNameOfPart() + "is "+ rightHindleg.getlengthInInches() +" and is ";
        if(rightHindleg.getIsWorking())
            message += "working";
        else
            message += "not working";
        message += ".\n   The" + leftHindleg.getNameOfPart() + "is "+ leftHindleg.getlengthInInches() +" and is ";
        if(leftHindleg.getIsWorking())
            message += "working";
        else
            message += "not working";
        return message;
    }
    
    @Override
    public String weakAction()
    {
        return step();
    }
    
    @Override
    public String normalAction()
    {
        return eat();
    }
    
    @Override
    public String strongAction()
    {
        return panic();
    }
    
    
    public Leg getRightForeleg()
    {
        return rightForeleg;
    }
    
    public Leg getLeftForeleg()
    {
        return leftForeleg;
    }
    
    public Leg getRightHindleg()
    {
        return rightHindleg;
    }
    
    public Leg getLeftHindleg()
    {
        return leftHindleg;
    }
    
    public Tail getTail()
    {
        return tail;
    }
    
    public String step(){
        if(getHeart().getIsWorking()){
            rightHindleg.step();
            leftForeleg.step();
            leftHindleg.step();
            return rightForeleg.step();
        }else{
            return "The cow cannot step since it is dead";
        }
    }
    
    public String eat(){
        if(getHeart().getIsWorking()){
            getBrain().sendSignals();                                                
            return getMouth().eat();
        }else{
            setIsAlive(false);
            return "The cow does not eat because it is dead";
        }
    }
    
    public String panic(){
        if(getHeart().getIsWorking()){
            getLeftEye().blink();
            getRightEye().blink();
            getBrain().sendSignals();
            getLeftEar().injure();
            return getRightEar().injure() + tail.wag() + getNose().breathe() + getMouth().eat() + getHeart().heartAttack();
        }else{
            setIsAlive(false);
            return "The cow died before it can panic";
        }
    }
    
}
