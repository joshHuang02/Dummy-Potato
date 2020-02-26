
public class Lobster
{
    //instance variables
    private Brain brain;
    private Eye leftEye;
    private Eye rightEye;
    private Mouth mouth;
    private Heart heart;
    private Antenna leftLongAntenna;
    private Antenna rightLongAntenna;
    private Antenna leftShortAntenna;
    private Antenna rightShortAntenna;
    private Gills gills;
    private Tail tail;
    private Leg legs[];
    //constructors
    public Lobster(String name, int age)
    {
        this.brain = new Brain(5.0);
        this.leftEye = new Eye("left eye", "black", true);
        this.rightEye = new Eye("right eye", "black", true);
        this.mouth = new Mouth(4.0, true);
        this.heart = new Heart("blue", true);
        this.leftLongAntenna = new Antenna("touch");
        this.rightLongAntenna = new Antenna("touch");
        this.leftShortAntenna = new Antenna("smell");
        this.rightShortAntenna = new Antenna("smell");
        this.gills = new Gills(1);
        this.tail = new Tail(13, true);
        legs = new Leg[10];
        for(int i = 0; i<legs.length ; i++)
            this.legs[i] = new Leg(3);                  
    }
    
    //methods
    public String blinkEyes()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            leftEye.setIsUsable(false);
            rightEye.setIsUsable(false);
            return "The lobster is dead";
        }
        else
            return leftEye.blink() + "\n" + rightEye.blink();
    }
    
    public String sendSignals()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            brain.setIsWorking(false);
            return "The lobster is dead";
        }
        else
            return brain.sendSignals();
    }
    
    public String eat()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            mouth.setIsUsable(false);
            return "The lobster is dead";
        }
        return mouth.eat();
    }
    
    public String beat()
    {
        if(brain.getIsWorking() == false)
        {
            heart.setIsWorking(false);
            return "The lobster is dead";
        }
        return heart.beat();
    }
    
    public String sense()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            leftLongAntenna.setCanSense(false);
            rightLongAntenna.setCanSense(false);
            leftShortAntenna.setCanSense(false);
            rightShortAntenna.setCanSense(false);
            return "The lobster is dead";
        }
        else
        return leftLongAntenna.sense() + "\n" +
        rightLongAntenna.sense() + "\n" +
        leftShortAntenna.sense() + "\n" +
        rightShortAntenna.sense();
                   
    }
    
    public String breathe()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            gills.setIsUsable(false);
            return "The lobster is dead";
        }
        else
            return gills.breathe();
    }
    
    public String wag()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            tail.setIsWorking(false);
            return "The lobster is dead";
        }
        return tail.wag();
    }
    
    public String walk()
    {
        if(heart.getIsWorking() == false || brain.getIsWorking() == false)
        {
            for (int i = 0; i < legs.length; i++)
            {
                legs[i].setIsUsable(false);
            }
            return "The lobster is dead";
        }
        else
        {
            for (int i = 0; i < legs.length; i++)
            {
                return legs[i].kick();
            }
            return "";
        }
    }
    public String regenerate()
    {
        this.leftEye.heal();
        this.rightEye.heal();
        this.brain.heal(); 
        this.mouth.heal();
        this.heart.heal(); 
        this.leftLongAntenna.retrieve();
        this.rightLongAntenna.retrieve();
        this.leftShortAntenna.retrieve();
        this.rightShortAntenna.retrieve();
        this.gills.heal();
        this.tail.heal();
        for (int i = 0; i < legs.length; i++)
            {
                this.legs[i].heal();
            }
        return "The lobster has been revived";
    }
}
