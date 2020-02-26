public class Gorilla extends Mammal{
    // instance variables
    private double heightInFeet;
    private Arm leftArm;
    private Arm rightArm;
    private Leg leftLeg;
    private Leg rightLeg;

    public Gorilla(String name, double currentAge, boolean isAlive, double weightOfBrain, 
    String rightEyeColor, String leftEyeColor, String nameOfNose, boolean noseIsWorking, int noseSensitivity, String leftEarSize, 
    String rightEarSize, double mouthSizeInInches, String colorOfHeart, 
    String nameOfRightEye, String nameOfLeftEye, String nameOfLeftEar, String nameOfRightEar,
    String nameOfMouth, boolean leftEyeIsWorking, boolean rightEyeIsWorking, boolean leftEarIsWorking, boolean rightEarIsWorking, boolean mouthIsWorking,
    boolean heartIsWorking, double leftArmLength, double rightArmLength, int leftLegLength, int rightLegLength, String leftArmName, String rightArmName, boolean leftArmIsWorking, boolean rightArmIsWorking,
    String leftLegName, String rightLegName) {
        super(name, currentAge, isAlive, weightOfBrain, rightEyeColor, leftEyeColor, nameOfNose, noseIsWorking, noseSensitivity, leftEarSize, rightEarSize,
            mouthSizeInInches, colorOfHeart, nameOfRightEye, nameOfLeftEye, nameOfLeftEar, nameOfRightEar, nameOfMouth, leftEyeIsWorking, rightEyeIsWorking, leftEarIsWorking,
            rightEarIsWorking, mouthIsWorking, heartIsWorking);
        leftArm = new Arm(leftArmName, leftArmLength, leftArmIsWorking);
        rightArm = new Arm(rightArmName, rightArmLength, rightArmIsWorking);
        leftLeg = new Leg(leftLegName, leftLegLength);
        rightLeg = new Leg(rightLegName, rightLegLength);
    }

    public String run(){
        for(int i = 0; i < 3; i++){
            rightLeg.step();
            leftLeg.step();
        }
        return "The gorilla ran 3 steps";
    }
    public String stubToe(boolean fatal, String leg){ // leg parameter should be lower case
        if(getIsAlive()){
            if(leg.equals("left")){
                if(fatal){
                    leftLeg.injure();
                    setIsAlive(false);
                    return "the gorillas accident was fatal";
                }else{
                    leftLeg.injure();
                    return "the gorillas accident was not fatal";
                }
            }else if(leg.equals("right")){
                if(fatal){
                    rightLeg.injure();
                    setIsAlive(false);
                    return "the gorillas accident was fatal";
                }else{
                    rightLeg.injure();
                    return "the gorillas accident was not fatal";
                }
            }else{
                return "please enter a leg";
            }
        }else{
            return "The gorilla is alreaddy dead";
        }
    }
    public String heal(){
        rightLeg.heal();
        leftLeg.heal();
        leftArm.heal();
        rightArm.heal();
        return "The gorilla is back to full health";
    }

    public String blink(){

        if(getLeftEye().getIsWorking() && getRightEye().getIsWorking()){
            getLeftEye().blink();
            getRightEye().blink();
        }else{
            return "The gorilla can't blink";
        }
        return "the gorilla can't blink";
    }

    public String feast(){
        for(int i = 0; i < 3; i++){
            getMouth().eat();
            getHeart().beat();
        }
        if(getHeart().getIsWorking()){
            return "The gorilla feasted";
        }else{
            getHeart().setIsUsable(false);
            return "the gorilla had a heartattack and died";
        }
    }

    @Override
    public String weakAction() {
        return this.run();
    }

    @Override
    public String normalAction() {
        return this.blink();
    }

    @Override
    public String strongAction() {
        return this.feast();
    }

    @Override
    public String revive() {
        return this.heal();
    }

    @Override
    public String toString() {
        return "leftLegLength: " + leftLeg.getlengthInInches() + ", rightLegLength: " + rightLeg.getlengthInInches() + ", lefArmLength: " + leftArm.getLengthInInches() + ", rightArmLength: " + rightArm.getLengthInInches();
    }
}