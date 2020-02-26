public class Gorilla{
    //instance variables
    private String name;
    private int age;
    private double heightInFeet;
    private boolean alive;
    private Heart heart;
    Brain brain;
    Leg rightLeg;
    Leg leftLeg;
    Eye leftEye;
    Eye rightEye;
    Mouth mouth;
    Nose nose;
    Ear leftEar;
    Ear rightEar;
    Arm leftArm;
    Arm rightArm;
    //contructors
    public Gorilla(String name, int age, double heightInFeet){
        this.name = name;
        this.age = age;
        alive = true;
        this.heightInFeet = heightInFeet;
        heart = new Heart("red", true);
        brain = new Brain(9, true);
        rightLeg = new Leg(3, true);
        leftLeg = new Leg(3, true);
        leftEye = new Eye("leftEye", "red", true);
        rightEye = new Eye("rightEye", "red", true);
        mouth = new Mouth(5, true);
        nose = new Nose(false, 5);
        leftEar = new Ear("big", true);
        rightEar = new Ear("big", true);
        leftArm = new Arm(3, true);
        rightArm = new Arm(3, true);
    }
    public Gorilla(){
        name = "gorilla";
        age = 10;
        alive = true;
        heightInFeet = 5.5;
        heart = new Heart("red", true);
        brain = new Brain(9, true);
        rightLeg = new Leg(3, true);
        leftLeg = new Leg(3, true);
        leftEye = new Eye("leftEye", "red", true);
        rightEye = new Eye("rightEye", "red", true);
        mouth = new Mouth(5, true);
        nose = new Nose(false, 5);
        leftEar = new Ear("big", true);
        rightEar = new Ear("big", true);
        leftArm = new Arm(3, true);
        rightArm = new Arm(3, true);
    }
    //methods
    public String die(){
        alive = false;
        heart.setIsWorking(false);
        brain.setIsWorking(false);
        rightLeg.setIsUsable(false);
        leftLeg.setIsUsable(false);
        leftEye.setIsUsable(false);
        rightEye.setIsUsable(false);
        mouth.setIsUsable(false);
        nose.alergic();
        leftEar.setIsUsable(false);
        rightEar.setIsUsable(false);
        leftArm.setIsWaveable(false);
        rightArm.setIsWaveable(false);
        return "The gorilla died";
    }
    public String heal(){
        alive = true;
        heart.setIsWorking(true);
        brain.setIsWorking(true);
        rightLeg.setIsUsable(true);
        leftLeg.setIsUsable(true);
        leftEye.setIsUsable(true);
        rightEye.setIsUsable(true);
        mouth.setIsUsable(true);
        nose.alergic();
        leftEar.setIsUsable(true);
        rightEar.setIsUsable(true);
        leftArm.setIsWaveable(true);
        rightArm.setIsWaveable(true);
        return "The gorilla is back to full health";
    }
    public String blink(){
        if(alive){
            if(leftEye.getIsUsable() && rightEye.getIsUsable()){
                leftEye.blink();
                rightEye.blink();
            }else{
                return "The gorilla can't blink";
            }
        }
        return "The gorilla is dead ,it cannot blink";
    }
    public String stubToe(boolean fatal, String leg){ // leg parameter should be lower case
        if(alive){
            if(leg.equals("left")){
                if(fatal){
                    leftLeg.injure();
                    this.die();
                    return "the gorillas accident was fatal";
                }else{
                    leftLeg.injure();
                    return "the gorillas accident was not fatal";
                }
            }else if(leg.equals("right")){
                if(fatal){
                    rightLeg.injure();
                    this.die();
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
    public String feast(){
        for(int i = 0; i < 3; i++){
            mouth.eat();
            heart.beat();
        }
        if(heart.getIsWorking()){
            return "The gorilla feasted";
        }else{
            this.die();
            return "the gorilla had a heartattack and died";
        }
    }
}