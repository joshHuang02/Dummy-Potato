public class Cat
{
    private String name;
    private int age;
    private Brain brain; //getter was added
    private Ear leftEar;
    private Ear rightEar;
    private Eye leftEye;
    private Eye rightEye;
    private Mouth mouth;
    private Leg rightBackLeg;
    private Leg leftBackLeg;
    private Leg rightFrontLeg;
    private Leg leftFrontLeg;
    private Tail tail;
    private Whiskers whiskers;
    private Heart heart;
    private Nose nose; //getter was added
    
    public Cat(String name,int age,boolean isAlive)
    {
        this.name = name;
        this.age = age;
        this.brain = new Brain(25,isAlive);
        this.leftEar = new Ear("3 inches", isAlive);
        this.rightEar = new Ear("3 inches", isAlive);
        this.leftEye = new Eye("green", isAlive);
        this.rightEye = new Eye("blue", isAlive);
        this.mouth = new Mouth(1,isAlive);
        this.rightBackLeg = new Leg(6,isAlive);
        this.leftBackLeg = new Leg(6,isAlive);
        this.rightFrontLeg = new Leg(6,isAlive);
        this.leftFrontLeg = new Leg(6,isAlive);
        this.tail = new Tail(20,isAlive);
        this.whiskers = new Whiskers(3, isAlive);
        this.heart = new Heart("red",isAlive);
        this.nose = new Nose(!isAlive,2);
    }
    public Cat(String name,int age)
    {
        this.name = name;
        this.age = age;
        this.brain = new Brain(25, true);
        this.leftEar = new Ear("3 inches", true);
        this.rightEar = new Ear("3 inches", true);
        this.leftEye = new Eye("green", true);
        this.rightEye = new Eye("blue", true);
        this.mouth = new Mouth(1,true);
        this.rightBackLeg = new Leg(6,true);
        this.leftBackLeg = new Leg(6, true);
        this.rightFrontLeg = new Leg(6, true);
        this.leftFrontLeg = new Leg(6, true);
        this.tail = new Tail(20, true);
        this.whiskers = new Whiskers(3, true);
        this.heart = new Heart("red",true);
        this.nose = new Nose(false,2);
    }
    public String pounce()
    {
        String action = heart.beat() + "\n" + brain.sendSignals() + "\n" + rightBackLeg.kick() + "\n" + leftBackLeg.kick() + "\n" + rightFrontLeg.kick()+ "\n" + leftFrontLeg.kick();;
        if(!heart.getIsWorking() || !brain.getIsWorking())
        {
            return name + " is dead";
        }
        else if(!rightBackLeg.getIsUsable()||!rightFrontLeg.getIsUsable()||!leftBackLeg.getIsUsable()||!leftFrontLeg.getIsUsable())
        {
            return "The leg is injured";
        }
        else
        {
            return action;
        }
    }
    
    public String sniff()
    {
        String action = heart.beat() + "\n" + brain.sendSignals() + "\n" + nose.breath();;
        if(!heart.getIsWorking() || !brain.getIsWorking())
        {
            return name + " is dead";
        }
        else if(nose.getIsStuffed())
        {
            return "The nose is stuffed";
        }
        else
        {
            return action;
        }
    }
    
    public String eat()
    {
        String action = heart.beat() + "\n" + brain.sendSignals() + "\n" + mouth.eat();
        if(!heart.getIsWorking() || !brain.getIsWorking())
        {
            return name + " is dead";
        }
        else if(!mouth.getIsUsable())
        {
            return "The mouth is injured";
        }
        else
        {
            return action;
        }
    }
    
    public String visitVet()
    {
        brain.heal();
        leftEar.heal();
        rightEar.heal();
        leftEye.heal();
        rightEye.heal();
        mouth.heal();
        rightBackLeg.heal();
        leftBackLeg.heal();
        rightFrontLeg.heal();
        leftFrontLeg.heal();
        tail.heal();
        whiskers.heal();
        heart.heal();
        nose.clear();
        return name + " was healed.";
    }
}
