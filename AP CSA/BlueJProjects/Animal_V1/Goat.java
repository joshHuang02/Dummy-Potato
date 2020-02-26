public class Goat
{
    //instance variables
    private int age;
    private boolean isAlive;
    
    private Mouth mouth;
    
    private Heart heart;
    
    private Ear rightEar;
    private Ear leftEar;
    
    private Leg backRightLeg;
    private Leg backLeftLeg;
    private Leg frontRightLeg;
    private Leg frontLeftLeg;
    
    private Brain brain;
    
    private Eye rightEye;
    private Eye leftEye;
    
    private Tail tail;
    
    //constructors
    public Goat(int age, boolean isAlive){
        this.age = age;
        this.isAlive = isAlive;
        
        mouth = new Mouth(2.0, true);
        
        heart = new Heart("red", true);
        
        rightEar = new Ear("huge", true);
        leftEar = new Ear("huge", true);
        
        backRightLeg = new Leg(3, true);
        backLeftLeg = new Leg(3, true);
        frontRightLeg = new Leg(3, true);
        frontLeftLeg = new Leg(3, true);
        
        brain = new Brain(5.0, true);
        
        rightEye = new Eye("Brown", true);
        leftEye = new Eye("Brown", true);
        
        tail = new Tail(4, true);
    }
    
    //methods
    
    public String chowSomeGrass()
    {
        if (this.isAlive)
        {
            
            return mouth.eat() + tail.wag() + brain.sendSignals() + heart.beat();
        }
        else return "The goat ain't even alive";
    }
    
    public String revive()
    {
        if (this.isAlive == false)
        {
            return this.heart.heal() + this.mouth.heal() + this.rightEar.heal() + this.leftEar.heal() + this.backRightLeg.heal() + this.backLeftLeg.heal() + this.frontLeftLeg.heal() + this.frontRightLeg.heal(); 
           
        }
        else return "The goat ain't even alive";
    }
    
    public String dash()
    {
        if (this.isAlive)
        {
            return mouth.eat() + tail.wag() + brain.sendSignals() + heart.beat() + backRightLeg.kick() + backLeftLeg.kick() + frontRightLeg.kick() + frontLeftLeg.kick();
           
        }
        else return "The goat ain't even alive";
    }
    
    public String listenUp()
    {
        if (this.isAlive)
        {
            return brain.sendSignals() + heart.beat() + rightEar.listenToMusic() + leftEar.listenToMusic();
        }
        else return "The goat ain't even alive";
    }
}
