
/**
 * Write a description of class Bunny here.
 *
 * @author Ivy Zhao
 * @version 01/07/20
 */
public class Bunny
{
    // instance variables
    private int bunnyAge;
    private Boolean bunnyIsAlive;
    
    private Brain brain;
    private Ear rightEar;
    private Ear leftEar;
    private Eye rightEye;
    private Eye leftEye;
    private Nose nose;
    private Mouth mouth;
    private Heart heart;
    private Arm rightArm;
    private Arm leftArm;
    private Leg rightLeg;
    private Leg leftLeg;
    private Tail tail;
    private Whiskers whiskers;
    
    // constructors
    public Bunny(int age, Boolean isAlive)
    {
        this.bunnyAge = age;
        this.bunnyIsAlive = isAlive;
        
        this.brain = new Brain(10.0, isAlive);
        this.rightEar = new Ear("3 in", isAlive);
        this.leftEar = new Ear("3 in", isAlive);
        this.rightEye = new Eye("black", isAlive);
        this.leftEye = new Eye("black", isAlive);
        this.nose = new Nose(!isAlive, 3);
        this.mouth = new Mouth(1.0, isAlive);
        this.whiskers = new Whiskers(4, isAlive);
        this.heart = new Heart("red", isAlive);
        this.rightArm = new Arm(2.0, isAlive);
        this.leftArm = new Arm(2.0, isAlive);
        this.rightLeg = new Leg(3, isAlive);
        this.leftLeg = new Leg(3, isAlive);
        this.tail = new Tail(1, isAlive);
    }
    
    // methods, accessors, mutators
    
    public String jump()
    {
        if(!heart.getIsWorking())
        {
            return "The bunny is dead:(";
        }
        return rightArm.wave() + " " + leftArm.wave() + " " + 
               rightLeg.kick() + " " + leftLeg.kick() + " " +
               heart.beat() + " So the bunny is jumped.";
    }
    
    public String consume()
    {
        if(!heart.getIsWorking())
        {
            return "The bunny is dead:(";
        }
        return brain.sendSignals() + " " + nose.breath() + " " +
               mouth.eat() + " " + heart.beat() + 
               "So the bunny is ready to consume.";
    }
    
    public String digHole()
    {
        if(!heart.getIsWorking())
        {
            return "The bunny is dead:(";
        }
        return rightEar.listenToMusic() + " " + leftEar.listenToMusic() + " " +
               rightEye.blink() + " " + leftEye.blink() + " " + 
               whiskers.pull() + " " + tail.wag() + " " + 
               "So the bunny can dig hole.";
    }
    
    public String sleep()
    {
        brain.heal();
        rightEar.heal();
        leftEar.heal();
        rightEye.heal();
        leftEye.heal();
        nose.clear();
        mouth.heal();
        whiskers.heal();
        heart.heal();
        rightArm.heal() ;
        leftArm.heal();
        rightLeg.heal();
        tail.heal();
        return "The bunny is healed.";
    }
    
    
}
