public class Dog
{
    private String name;
    private boolean isWorking;
    private Brain brain;
    private Heart heart;
    private Eye leftEye;
    private Eye rightEye;
    private Leg frontLeftLeg;
    private Leg backLeftLeg;
    private Leg frontRightLeg;
    private Leg backRightLeg;
    private Tail tail;
    private Mouth mouth;
    private Ear leftEar;
    private Ear rightEar;
    private Nose nose;

    public Dog(String name, boolean isAlive) {
        this.name = name;
        brain = new Brain(50.0, isAlive);
        heart = new Heart("red", isAlive);
        leftEye = new Eye("blue", isAlive);
        rightEye = new Eye("blue", isAlive);
        frontLeftLeg = new Leg(5, isAlive);
        backLeftLeg = new Leg(5, isAlive);
        frontRightLeg = new Leg(5, isAlive);
        backRightLeg = new Leg(5, isAlive);
        tail = new Tail(10, isAlive);
        mouth = new Mouth(3, isAlive);
        leftEar = new Ear("big", isAlive);
        rightEar = new Ear("big", isAlive);
        nose = new Nose(isAlive, 1);
    }

    public String run(){
        if(!this.heart.getIsWorking()) {
            return "The animal is dead.";
        }
        return this.frontLeftLeg.kick() + " " + this.backLeftLeg.kick() + " " + this.frontRightLeg.kick() + " " + this.backRightLeg.kick() + " " + this.heart.beat() + " " + this.brain.sendSignals();
    }

    public String dinner() {
        if(!this.heart.getIsWorking()) {
            return "The animal is dead.";
        }
        return this.nose.breath() + " " + this.mouth.eat() + " " + this.tail.wag() + " " + this.heart.beat() + " " + this.brain.sendSignals();
    }
    
    public String goCrazy() {
        if(!this.heart.getIsWorking()) {
            return "The animal is dead.";
        }
        
        return this.brain.sendSignals() + " " + this.heart.beat() + " " + this.leftEye.blink() + " " + this.rightEye.blink() + " " + this.frontLeftLeg.kick() + " " + this.backLeftLeg.kick() + " " + 
        this.frontRightLeg.kick() + " " + this.backRightLeg.kick() + " " + this.tail.wag() + " " + this.mouth.eat() + " " + this.leftEar.listenToMusic() + " " + this.rightEar.listenToMusic() + " " + this.nose.breath();
    }
    
    public void revive() {
        this.brain.heal();
        this.heart.heal();
        this.leftEye.heal();
        this.rightEye.heal();
        this.frontLeftLeg.heal();
        this.backLeftLeg.heal();
        this.frontRightLeg.heal();
        this.backRightLeg.heal();
        this.tail.heal();
        this.mouth.heal();
        this.leftEar.heal();
        this.rightEar.heal();
        this.nose.clear();
    }
}
