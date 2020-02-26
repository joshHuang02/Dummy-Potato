
/**
 * The Lion class specifies lion parts and certain actions performed by the lion.
 *
 * Anoushka Bhat 
 * 01/08/2020
 */
public class Lion
{
    //instance variables
    private Leg leftFrontLeg;
    private Leg leftBackLeg;
    private Leg rightBackLeg;
    private Leg rightFrontLeg;
    private Tail tail;
    private Mouth mouth;
    private Eye rightEye;
    private Eye leftEye;
    private Heart heart;
    private Whiskers firstRightWhisker;
    private Whiskers firstLeftWhisker;
    private Whiskers secondRightWhisker;
    private Whiskers secondLeftWhisker;
    private Brain brain;
    private Ear rightEar;
    private Ear leftEar;
    private Nose nose;
    private String name;
    private int age;

    //constructors
    public Lion(String name, int age, boolean isAlive){
        this.name = name;
        this.age = age;
        firstRightWhisker = new Whiskers(3,isAlive);
        firstLeftWhisker = new Whiskers(3, isAlive);
        secondRightWhisker = new Whiskers(4, isAlive);
        secondLeftWhisker = new Whiskers(4, isAlive);
        brain = new Brain(8,isAlive);
        heart = new Heart("red", isAlive);
        mouth = new Mouth(5,isAlive);
        rightEye = new Eye("hazel", isAlive);
        leftEye = new Eye("hazel", isAlive);
        tail = new Tail(90, isAlive);
        rightFrontLeg = new Leg(24, isAlive);
        leftFrontLeg = new Leg(24, isAlive);
        rightBackLeg = new Leg(20, isAlive);
        leftBackLeg = new Leg(20, isAlive);
        leftEar = new Ear("medium", isAlive);
        rightEar = new Ear("medium", isAlive);
        nose = new Nose(!isAlive, 2);
    }

    public String pounce(){
       rightFrontLeg.kick();   
       leftFrontLeg.kick();
       rightBackLeg.kick();
       leftBackLeg.kick();
       heart.beat();
       tail.wag();
       brain.sendSignals();
        //kicks legs, uses heart, wags tail, eyes, brain, ears
        if(!heart.getIsWorking ()|| !brain.getIsWorking()){
            return name + " is dead." +"\n";
        }
        if(!rightFrontLeg.getIsUsable() || !rightBackLeg.getIsUsable() || !leftFrontLeg.getIsUsable() ||!leftBackLeg.getIsUsable()){
            return name + " cannot pounce (the legs don't work)."+"\n";
        }
        if(!rightEar.getIsUsable()){
            return name + " cannot pounce (cannot hear prey move)."+"\n";
        }
        return name + " can pounce" + "\n";
        
    }


    public String sniff(){

        //mouth,nose,brain, heart
        //mouths helps lions smell food as well
        mouth.eat();
        heart.beat();
        brain.sendSignals();
        nose.breath();

    if(!this.heart.getIsWorking() || !this.brain.getIsWorking())
            return name + " is dead."+"\n";
    if(nose.getIsStuffed()){   
        return name + " cannot sniff out prey."+"\n";
    }
    return name + " can sniff"+"\n";
}

    public String lookForPrey(){
        brain.sendSignals();
        heart.beat();
        rightEar.listenToMusic(); //lion needs to listen for movement of prey
        leftEar.listenToMusic();
        firstRightWhisker.pull();
        secondRightWhisker.pull();
        firstLeftWhisker.pull();
        secondLeftWhisker.pull();//whiskers allow lions to see in the dark, so that it can see the prey it sniffs
        rightEye.blink();
        leftEye.blink();

        if(!this.rightEye.getIsUsable() || !this.leftEye.getIsUsable()){

            return "The animal cannot look for prey because one or both of it's eyes don't work."+"\n";

        }
        if(!this.heart.getIsWorking() || !this.brain.getIsWorking()){
            return "The animal is dead."+"\n";
        }     
        return name + " can look for prey."+"\n";
    }

    public String goToVet(){
        leftFrontLeg.heal();
        leftBackLeg.heal();
        rightBackLeg.heal();
        rightFrontLeg.heal();
        tail.heal(); 
        mouth.heal();
        rightEye.heal();
        leftEye.heal();
        heart.heal();
        firstRightWhisker.heal();
        firstLeftWhisker.heal();
        secondRightWhisker.heal();
        secondLeftWhisker.heal();
        brain.heal();
        rightEar.heal();
        leftEar.heal();
        nose.clear();
        return name + " is healed" +"\n";
    }
}
