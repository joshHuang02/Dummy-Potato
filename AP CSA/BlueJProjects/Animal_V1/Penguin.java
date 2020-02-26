public class Penguin {
    //instance variables
    private String name;
    private int currentAge;
    private boolean isAlive;
    private Beak beak;
    private Brain brain;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Leg leftLeg;
    private Leg rightLeg;
    private Nose nose;
    private Tail tail;
    private Wing leftWing;
    private Wing rightWing;

    //constructor(s)
    public Penguin(String name, int currentAge, boolean isAlive)
    {
        this.name = name;
        this.currentAge = currentAge;
        beak = new Beak(3.0, isAlive);
        brain = new Brain(2.9, isAlive);
        leftEye = new Eye("black", isAlive);
        rightEye = new Eye("black", isAlive);
        heart = new Heart("red", isAlive);
        leftLeg = new Leg(8, isAlive);
        rightLeg = new Leg(8, isAlive);
        nose = new Nose(isAlive,4);
        tail = new Tail(8, isAlive);
        leftWing = new Wing("black",  isAlive);
        rightWing = new Wing("black", isAlive);
    }
    
    //methods, accessors, mutators
    public String swim()
    {
        brain.sendSignals();
        heart.beat();
        String message = "";
        if(!(brain.getIsWorking()) || !(heart.getIsWorking()))
        {
            return "Unfortunately, " + name + " is already dead.";
        }
        message = message + " \nLeft wing: " + leftWing.flap();
        message = message + " \nRight wing: " + rightWing.flap();
        message = message + " \n" + beak.peck();
        message = message + " \nLeft leg: " + leftLeg.kick();
        message = message + " \nRight leg: " + rightLeg.kick();
        message = message + " \n" + tail.wag();
        if(leftWing.getAbleToFly() && rightWing.getAbleToFly() && beak.getIfWorks() && leftLeg.getIsUsable() && rightLeg.getIsUsable())
        {
            return message + "\n" + name + " is now swimming.";
        }
        return message +"\n" + name + " cannot swim.";
    }

    public String eat()
    {
        brain.sendSignals();
        heart.beat();
        String message = "";
        if(!(brain.getIsWorking()) || !(heart.getIsWorking()))
        {
            return "Unfortunately, " + name + " is already dead.";
        }
        message = message + " \n" + beak.peck();
        message = message + " \nLeft eye: " + leftEye.blink();
        message = message + " \nRight eye: " + rightEye.blink();
        message = message + " \n" + nose.breath();
        if(beak.getIfWorks() && leftEye.getIsUsable() && rightEye.getIsUsable() && nose.breath().equals("Sensitivity Error"))
        {
            return message + "\n" + name + " is now eating.";
        }
        return message + "\n" + name + " cannot eat.";
    }
    
    public String waddle()
    {
        brain.sendSignals();
        heart.beat();
        String message = "";
        if(!(brain.getIsWorking()) || !(heart.getIsWorking()))
        {
            return "Unfortunately, " + name + " is already dead.";
        }
        message = message + " \nLeft leg: " + leftLeg.kick();
        message = message + " \nRight leg: " + rightLeg.kick();
        if(leftLeg.getIsUsable() && rightLeg.getIsUsable())
        {
            return message + "\n" + name + " is now waddling.";
        }
        return message + "\n" + name + " cannot waddle.";
    }
    
    public String jump()
    {
        brain.sendSignals();
        heart.beat();
        String message = "";
        if(!(brain.getIsWorking()) || !(heart.getIsWorking()))
        {
            return "Unfortunately, " + name + " is already dead.";
        }
        message = message + " \nLeft leg: " + leftLeg.kick();
        message = message + " \nRight leg: " + rightLeg.kick();
        message = message + " \nLeft wing: " + leftWing.flap();
        message = message + " \nRight wing: " + rightWing.flap();
        
        if(leftLeg.getIsUsable() && rightLeg.getIsUsable() && leftWing.getAbleToFly() && rightWing.getAbleToFly())
        {
            return message + "\n" + name + " is now jumping.";
        }
        return message + "\n" + name + " cannot jump.";
    }
    
    public String goToHospital()
    {
        String healed = "";
        healed = brain.heal() + "\n" + beak.heal() + "\nLeft eye: " + leftEye.heal() + "\nRight eye: " + 
        rightEye.heal() + "\n" + heart.heal() + "\nLeft leg: " + leftLeg.heal() + "\nRight leg: " + rightLeg.heal() + 
        "\n" + nose.clear() + "\n" + tail.heal() + "\nLeft wing: " + leftWing.heal() + "\nRight wing: " +
        rightWing.heal();
        return healed;
    }
    
}