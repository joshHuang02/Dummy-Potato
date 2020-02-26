public class Donkey
{
    //instance variables
    private String name;
    private int age;
    private Brain brain;
    private Heart heart;
    private Mouth mouth;
    private Nose nose;
    private Tail tail;
    private Ear leftEar;
    private Ear rightEar;
    private Eye leftEye;
    private Eye rightEye;
    private Leg frontRightLeg;
    private Leg frontLeftLeg;
    private Leg backRightLeg;
    private Leg backLeftLeg;
    boolean functional;
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Donkey (String name, int age, boolean functional) {
        this.name = name;
        this.age = age;
         brain = new Brain(3.0, functional);
         heart = new Heart("pink", functional);
         mouth = new Mouth(10, functional);
         nose = new Nose(functional, 1);
         tail = new Tail(17, functional);
         leftEar = new Ear("large", functional);
         rightEar = new Ear("large", functional);
         leftEye = new Eye("yellow", functional);
         rightEye = new Eye("blue", functional);
         frontRightLeg = new Leg(24, functional);
         frontLeftLeg = new Leg(24, functional);
         backRightLeg = new Leg(24, functional);
         backLeftLeg = new Leg(24, functional);
    }
    
    public String gallop() {

        if (!heart.getIsWorking() || !brain.getIsWorking()) {
            return name + " is dead!";
        }
        
        return "First Leg: " + this.frontRightLeg.kick() + "\n" + "Second Leg: " + this.frontLeftLeg.kick() + "\n" + "Third Leg: " + this.backRightLeg.kick() + "\n" + "Fourth Leg: " + this.backLeftLeg.kick() + "\n" + "Heart: " + this.heart.beat() + "\n" + "Brain: " + this.brain.sendSignals(); 
    }
    
    public String eat() {
        if (!heart.getIsWorking() || !brain.getIsWorking()) {
            return name + " is dead!";
        }
        
        return "Mouth: " + this.mouth.eat() + "\n" + "Heart: " + this.heart.beat() + "\n" + "Brain: " + this.brain.sendSignals();
    }
    
    public String wag() {
        if (!heart.getIsWorking() || !brain.getIsWorking()) {
            return name + " is dead!";
        }
        
        return this.tail.wag() + " " + this.heart.beat() + " " + this.brain.sendSignals();
    }
    
    public void visitHospital() {
        brain.heal();
        heart.heal();
        mouth.heal();
        nose.clear();
        tail.heal();
        leftEar.heal();
        rightEar.heal();
        leftEye.heal();
        rightEye.heal();
        frontRightLeg.heal();
        frontLeftLeg.heal();
        backRightLeg.heal();
        backLeftLeg.heal();
    }
}
