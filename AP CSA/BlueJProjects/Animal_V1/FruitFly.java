public class FruitFly{
    private String name;
    private int ageInMonths;
    private int crimesCommitted;
    private boolean isAlive;
    private Brain brain;
    private Antenna leftAntenna;
    private Antenna rightAntenna;
    private Mouth proboscis;
    private Heart flyHeart;
    private Eye rightCompoundEye;
    private Eye leftCompoundEye;
    private Leg rightForeLeg;
    private Leg leftForeLeg;
    private Leg rightMidLeg;
    private Leg leftMidLeg;
    private Leg rightHindLeg;
    private Leg leftHindLeg;
    private Wing rightWing;
    private Wing leftWing;
    public FruitFly(String name, int ageInMonths, int crimesCommitted, boolean isAlive){
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.crimesCommitted = crimesCommitted;
        this.isAlive = isAlive;
        Brain brain = new Brain (6.0, isAlive);
        Antenna leftAntenna = new Antenna ("Curved", isAlive);
        Antenna rightAntenna = new Antenna ("Curved", isAlive);
        Mouth proboscis = new Mouth (1.0, isAlive);
        Heart flyHeart = new Heart ("Yellow", isAlive);
        Eye rightCompoundEye = new Eye("Red", isAlive);
        Eye leftCompoundEye = new Eye("Red", isAlive);
        Leg rightForeLeg = new Leg(1, isAlive);
        Leg leftForeLeg = new Leg(1, isAlive);
        Leg rightMidLeg = new Leg(1, isAlive);
        Leg leftMidLeg = new Leg(1, isAlive);
        Leg rightHindLeg = new Leg(1, isAlive);
        Leg leftHindLeg = new Leg(1, isAlive);
        Wing rightWing = new Wing("white", isAlive);
        Wing leftWing = new Wing("white", isAlive);
    }
    public String healSelf(){
        isAlive = true;
        this.brain.heal();
        this.leftAntenna.retrieve();
        this.rightAntenna.retrieve();
        this.proboscis.heal();
        this.flyHeart.heal();
        this.rightCompoundEye.heal();
        this.leftCompoundEye.heal();
        this.rightForeLeg.heal();
        this.leftForeLeg.heal();
        this.rightMidLeg.heal();
        this.leftMidLeg.heal();
        this.rightHindLeg.heal();
        this.leftHindLeg.heal();
        this.rightWing.heal();
        this.leftWing.heal();
        return "The fruit fly has healed itself. May God save us all.";
    }
    public String checkSurroundings(){
        if ((!this.flyHeart.getIsWorking()) || (!this.brain.getIsWorking())){
            return "Cannot check surroundings because the fruit fly has been slain!";
        }
        return this.flyHeart.beat() + this.brain.sendSignals() + this.rightAntenna.sense() + this.leftAntenna.sense() + this.rightCompoundEye.blink() + this.leftCompoundEye.blink();
    }
    public String searchForFood(){
        if((!this.flyHeart.getIsWorking()) || (!this.brain.getIsWorking())){
            return "Cannot search for food because the fruit fly has been slain!";
        }
        this.flyHeart.beat();
        this.brain.sendSignals();
        this.rightWing.flap();
        this.leftWing.flap();
        this.rightForeLeg.kick();
        this.leftForeLeg.kick();
        this.rightMidLeg.kick();
        this.leftMidLeg.kick();
        this.rightHindLeg.kick();
        this.leftHindLeg.kick();
        return "Hopefully the fruit fly died.";
    }
    // Note that this violates the Geneva Convention
    public String liquidateAndConsumeAVictim(){
        if ((!this.flyHeart.getIsWorking()) || (!this.brain.getIsWorking())){
            return "Stay dead.";
        }
        return this.flyHeart.beat() + this.brain.sendSignals() + this.proboscis.eat();
    }
}
