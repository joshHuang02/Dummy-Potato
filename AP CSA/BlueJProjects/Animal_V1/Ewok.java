public class Ewok
{
    // instance variable(s)
    private Ear leftEar;
    private Ear rightEar;
    private Eye leftEye;
    private Eye rightEye;
    private Nose nose;
    private Mouth mouth;
    private Brain brain;
    private Arm leftArm;
    private Arm rightArm;
    private Leg leftLeg;
    private Leg rightLeg;
    private Heart heart;
    private String name;
    private int currentAge;
    
    // constructor(s)
    public Ewok(String name, int currentAge)
    {
        this.name = name;
        this.currentAge = currentAge;
        this.leftEye = new Eye("blue");
        this.rightEye = new Eye("green");
        this.leftEar = new Ear("big floppy");
        this.rightEar = new Ear("small");
        this.nose = new Nose(3);
        this.mouth = new Mouth(5.0, false);
        this.heart = new Heart("black", true);
        this.brain = new Brain(1.5);
        this.leftArm = new Arm(18.0);
        this.rightArm = new Arm(17.0);
        this.leftLeg = new Leg(30);
        this.rightLeg = new Leg(30);
        
        
    }
    
    public Ewok(String name, int currentAge, boolean isAlive)
    {
        this.name = name;
        this.currentAge = currentAge;
        this.leftEye = new Eye("left eye", "blue", isAlive);
        this.rightEye = new Eye("right eye", "green", isAlive);
        this.leftEar = new Ear("big floppy", isAlive);
        this.rightEar = new Ear("small", isAlive);
        this.nose = new Nose(!isAlive, 3);
        this.mouth = new Mouth(5.0, isAlive);
        this.heart = new Heart("black", isAlive);
        this.brain = new Brain(1.5, isAlive);
        this.leftArm = new Arm(18.0, isAlive);
        this.rightArm = new Arm(17.0, isAlive);
        this.leftLeg = new Leg(30, isAlive);
        this.rightLeg = new Leg(30, isAlive);
        
        
    }
    
    
    
    // method(s)
    public String blink()
    {
        if(!this.heart.getIsWorking())
        {
        return "The animal is dead.";
    }
        return this.leftEye.blink() + "\n " + this.rightEye.blink() + " " +
        this.heart.beat() + " " + this.brain.sendSignals();
    }
    
    public String panic()
    {
        if(!this.heart.getIsWorking())
        return "The animal is dead.";
        
        return this.leftLeg.kick() + " " + this.rightLeg.kick() +
        this.leftArm.wave() + " " + this.rightArm.wave() + " " +
        this.heart.beat() + " " + this.brain.sendSignals();
    }
    
    public void visitHospital()
    {
        this.leftEye.heal();
        this.rightEye.heal();
        this.leftEar.heal();
        this.rightEar.heal();
        this.nose.clear();
        this.mouth.heal();
        this.heart.heal();
        this.brain.heal();
        this.leftArm.heal();
        this.rightArm.heal();
        this.leftLeg.heal();
        this.rightLeg.heal();
    }
}
