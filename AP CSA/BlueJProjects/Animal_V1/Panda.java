public class Panda
{
    // instance variables
    
    private Ear rightEar;
    private Ear leftEar;
    private Eye rightEye;
    private Eye leftEye;
    private Brain brain;
    private Heart heart;
    private Leg rightLeg;
    private Leg leftLeg;
    private Mouth mouth;
    private Nose nose;
    private Tail tail;
    private Arm rightArm;
    private Arm leftArm;
    boolean bambooFound;
    
    //constructors
    
    public Panda(boolean isAlive, String earSize, String eyeColor, double brainWeight, String heartColor, int legLength, double mouthSize, int noseSensitivity, int tailLength, double armLength){
       this.rightEar = new Ear(earSize, isAlive);
       this.leftEar = new Ear(earSize, isAlive);
       this.rightEye = new Eye(eyeColor, isAlive);             
       this.leftEye = new Eye(eyeColor, isAlive);     
       this.brain = new Brain(brainWeight, isAlive);
       this.heart = new Heart(heartColor, isAlive);
       this.rightLeg = new Leg(legLength, isAlive);
       this.leftLeg = new Leg(legLength, isAlive);
       this.mouth = new Mouth(mouthSize, isAlive);
       this.nose = new Nose(!isAlive, noseSensitivity);
       this.tail = new Tail(tailLength, isAlive);
       this.rightArm = new Arm(armLength, isAlive);
       this.leftArm = new Arm(armLength, isAlive);
    }
    
    public Panda(boolean isAlive){
       this.rightEar = new Ear("small", isAlive);
       this.leftEar = new Ear("small", isAlive);
       this.rightEye = new Eye("black", isAlive);             
       this.leftEye = new Eye("black", isAlive);     
       this.brain = new Brain(30.0, isAlive);
       this.heart = new Heart("red", isAlive);
       this.rightLeg = new Leg(10, isAlive);
       this.leftLeg = new Leg(10, isAlive);
       this.mouth = new Mouth(5, isAlive);
       this.nose = new Nose(!isAlive, 1);
       this.tail = new Tail(15, isAlive);
       this.rightArm = new Arm(20.0, isAlive);
       this.leftArm = new Arm(20.0, isAlive);
    }
    
    
    // methods, accessors, and mutators
    
    public String findBamboo(){
        if (!heart.getIsWorking()){
            return "The panda cannot find bamboo as it is dead";
        }
        else if(rightEye.getIsUsable() || leftEye.getIsUsable()){
            if (((int) (Math.random() * 100) + 1) > 10){
                if(rightLeg.getIsUsable() && leftLeg.getIsUsable()){
                    if(((int) (Math.random() * 1000) + 1) <= 1){
                        this.heart.setIsWorking(false);
                        setAllFunctionsFalse();
                        return "The panda obtained the bamboo but had a cardiac arrest and died";
                    }
                    bambooFound = true;
                    return "The panda walks to the bamboo and successfully obtains it";
                }
                else if(rightLeg.getIsUsable() || leftLeg.getIsUsable()){
                    if(((int) (Math.random() * 1000) + 1) <= 50){
                        this.heart.setIsWorking(false);
                        setAllFunctionsFalse();
                        return "The panda limped to the bambooo but had a cardiac arrest and died";
                    }
                    bambooFound = true;
                    return "The panda limps on one leg to the bamboo and successfully obtains it";
                }
                else{
                    bambooFound = false;
                    return "The delicious bambooo temps you as you can see it but cannot get to it.";
                }
            }
            else{
                bambooFound = false;
                return "No bamboo was found.";
            }
        }
        else{
            bambooFound = false;
            return "Both eyes of the Panda cannot see, thus it cannot find bamboo.";
        }
    }
    
    public String throwATantrum(){
        return leftArm.wave() + rightArm.wave() + "\n" + leftLeg.kick() + rightLeg.kick() + "\n" +
        tail.wag() + heart.beat() + "\n" + rightEye.blink() + leftEye.blink() + "\n" + brain.sendSignals();
    }
   
    public String visitorMusicAndEatTheirFood(){
        return rightEar.listenToMusic() + leftEar.listenToMusic() + "\n" + mouth.eat() + 
        heart.beat() +"\n" + nose.breath() + brain.sendSignals();
    }
    
    public String danceWhileEating(){
        if (((int) (Math.random() * 100000) + 1) <= 1){
            setAllFunctionsFalse();
            return "The panda choked during his performance and died";
        }
        return leftArm.wave() + rightArm.wave() + "\n" + nose.breath() + mouth.eat() + "\n" +
        leftLeg.kick() + rightLeg.kick() + "\n" + brain.sendSignals();
    }
    
    
    public String healThePanda(){
        return rightEar.heal() + leftEar.heal() + "\n" + rightEye.heal() + leftEye.heal() + "\n" + brain.heal() + "\n" +
        rightLeg.heal() + leftLeg.heal() + "\n" + mouth.heal() + nose.clear() + "\n" + tail.heal() + "\n" +
        rightArm.heal() + leftArm.heal() + "\n" + "The panda is all healed. "; 
    }
    
    public void setAllFunctionsFalse(){
        this.heart.setIsWorking(false);
        this.rightEar.setIsUsable(false);
        this.leftEar.setIsUsable(false);
        this.rightEye.setIsUsable(false);
        this.rightEye.setIsUsable(false);
        this.brain.setIsWorking(false);
        this.rightLeg.setIsUsable(false);
        this.leftLeg.setIsUsable(false);
        this.mouth.setIsUsable(false);
        this.nose.setIsStuffed(true);
        this.tail.setIsWorking(false);
        this.rightArm.setIsWaveable(false);
        this.leftArm.setIsWaveable(false);
    }
}
