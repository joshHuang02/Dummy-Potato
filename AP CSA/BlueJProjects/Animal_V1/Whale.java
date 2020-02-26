public class Whale
{
    private String name; 
    private boolean isAlive;
    private Eye leftEye;
    private Eye rightEye;
    private Mouth mouth;
    private Tail tail;
    private Heart heart;
    private Nose nose;
    private Ear leftEar;
    private Ear rightEar;
    private Brain brain;
    private Arm leftArm;
    private Arm rightArm;
    public Whale(String name,boolean isAlive){
        this.name = name;
        this.isAlive = isAlive;
        leftEye = new Eye("blue");
        rightEye = new Eye("blue");
        mouth = new Mouth(22.0, true);
        heart = new Heart("red", false);
        brain = new Brain(34.0);
        leftArm = new Arm(37.0);
        rightArm = new Arm(36.5);
        tail = new Tail(97, true);
        nose = new Nose(false, 3);
        leftEar = new Ear("small");
        rightEar = new Ear("small");
        
    }
    public Whale(String name){
        this.name = name;
        this.isAlive = true;
        leftEye = new Eye("blue");
        rightEye = new Eye("blue");
        mouth = new Mouth(22.0, true);
        heart = new Heart("red", false);
        brain = new Brain(34.0);
        leftArm = new Arm(37.0);
        rightArm = new Arm(36.5);
        tail = new Tail(97, true);
        nose = new Nose(false, 3);
        leftEar = new Ear("small");
        rightEar = new Ear("small");
        /*
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.mouth = mouth;
        this.heart = heart;
        this.brain = brain;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.tail = tail;
        this.nose = nose;
        this.leftEar = leftEar;
        this.rightEar = rightEar;
         */
    }

    public String flee(){
        if (this.heart.getIsWorking()){
            return this.brain.sendSignals() + " " + this.tail.wag() + " " + this.leftArm.wave() + " " + this.rightArm.wave() + 
            " " + this.heart.beat() + " " + " The whale is running away";
        }
        return "Sorry, the whale is dead";
    }

    public String enjoyLife(){
        if (this.heart.getIsWorking()){
            return this.brain.sendSignals() + " " + this.leftEar.listenToMusic() + " " + this.rightEar.listenToMusic() + " " + this.leftEye.blink() + this.rightEye.blink() +
            this.tail.wag() + " The whale is chilling"; 
        }
        return "Sorry, the whale is dead";
    }

    public String snack(){
        if (this.heart.getIsWorking()){
            return this.mouth.eat() + " " + this.tail.wag() + " " + this.brain.sendSignals() + " The whale is happily feasting on its snack";   
        }
        return "Sorry, the whale is dead";
    }

    public String fullRestore(){
        return this.heart.heal() + " " + this.brain.heal() + " " + this.leftEye.heal() + " " + this.rightEye.heal() + " " + this.leftArm.heal() + " " + this.rightArm.heal()
        + " " + this.mouth.heal() + " " + this.tail.heal() + " " + this.nose.clear() + " " + this.leftEar.heal() + " " + this.rightEar.heal()
        + " The Whale is fully revived";
    }
    
    public void setName (String name) {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setIsAlive (boolean isAlive) {
        this.isAlive = isAlive;
    }
    public boolean getIsAlive()
    {
        return this.isAlive;
    }
}
