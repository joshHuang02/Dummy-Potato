
/**
 * Write a description of class Ostrich here.
 *
 * @author (Lauren Lee)
 * @version (1/8/2020)
 */
public class Ostrich
{
    // instance(s)
    private String name;
    private Beak beak;
    private Brain brain;
    private Ear leftEar;
    private Ear rightEar;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Leg leftLeg;
    private Leg rightLeg;
    private Mouth mouth;
    private Nose nose;
    
    // constructor(s)
    public Ostrich(String name) 
    {
        this.name = name;
        this.beak = new Beak(60.0, true);
        this.brain = new Brain(80.0, true);
        this.leftEar = new Ear("60", true);
        this.rightEar = new Ear("70", true);
        this.leftEye = new Eye("green", true);
        this.rightEye = new Eye("green", true);
        this.heart = new Heart("red", true);
        this.leftLeg = new Leg(80, true);
        this.rightLeg = new Leg(70, true);
        this.mouth = new Mouth(70.0, true);
        this.nose = new Nose(true, 1);
    }
    
    // method(s), accessor(s), & mutator(s)
    public String run()
    {
       if (heart.getIsWorking()) 
       {
           return this.leftLeg.kick() + "\n" + this.rightLeg.kick() + "\n" +
           this.brain.sendSignals() + "\n" + this.nose.breath() + "\n" +
           this.heart.beat();
       }
       else 
       {
           return "The heart does not beat.";
       }
    }
    
    public String hear()
    {
       if (heart.getIsWorking()) 
       {
           return this.leftEar.listenToMusic() + "\n" + this.rightEar.listenToMusic()
           + "\n" + this.heart.beat();
       }
       else 
       {
           return "The animal is dead.";
       }
    }
    
    public String feed()
    {
       if (heart.getIsWorking()) 
       {
           return this.mouth.eat() + "\n" + this.heart.beat();
       }
       else 
       {
           return "The animal is no longer alive.";
       }
    }
    
    public String heal()
    {
       return beak.heal() + "\n" + brain.heal() + "\n" + leftEar.heal() + "\n" + 
       rightEar.heal() + "\n" + leftEye.heal() + "\n" + rightEye.heal() + "\n" +
       heart.heal() + "\n" + leftLeg.heal() + "\n" + rightLeg.heal() + "\n" +
       mouth.heal();
    }
}
