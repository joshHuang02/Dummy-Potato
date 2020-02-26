
/**
 * Write a description of class Giraffe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Giraffe
{
    private Eye rightEye;
    private Eye leftEye;
    private Mouth mouth;
    private Nose nose;
    private Ear leftEar;
    private Ear rightEar;
    private Tail tail;
    private Leg frontLeftLeg;
    private Leg frontRightLeg;
    private Leg backLeftLeg;
    private Leg backRightLeg;
    private Heart heart;
    private Brain brain;
    private String name;
    private int timesRested=0;
    public Giraffe(String name){
        rightEye=new Eye("Right Eye","Green",true);
        leftEye=new Eye("Left Eye","Green",true);
        mouth=new Mouth(1,true);
        nose=new Nose(1);
        leftEar=new Ear("Small",true);
        rightEar=new Ear("Small",true);
        tail=new Tail(5,true);
        frontLeftLeg=new Leg(6);
        frontRightLeg=new Leg(6);
        backLeftLeg=new Leg(6);
        backRightLeg=new Leg(6);
        brain=new Brain(1);
        heart=new Heart("red",true);
        this.name=name;
    }
    public Giraffe(String name,boolean isAlive){
        rightEye=new Eye("Right Eye","Green",isAlive);
        leftEye=new Eye("Left Eye","Green",isAlive);
        mouth=new Mouth(1,isAlive);
        nose=new Nose(!isAlive,1);
        leftEar=new Ear("Small",isAlive);
        rightEar=new Ear("Small",isAlive);
        tail=new Tail(5,isAlive);
        frontLeftLeg=new Leg(6,isAlive);
        frontRightLeg=new Leg(6,isAlive);
        backLeftLeg=new Leg(6,isAlive);
        backRightLeg=new Leg(6,isAlive);
        brain=new Brain(1,isAlive);
        heart=new Heart("red",isAlive);
        this.name=name;
    }

    public String blink(){
        brain.sendSignals();
        heart.beat();
        if(isAlive()){
        rightEye.blink();
        leftEye.blink();
            if(rightEye.getIsUsable()&&leftEye.getIsUsable())
            return "You blinked";
            return "Your eyes were damaged when trying to blink";
    }
        return "You cannot blink, because your dead";
    }
    public boolean isAlive(){
        if(heart.getIsWorking()&&brain.getIsWorking())
        return true;
        return false;
    }
    public String walk(){
        brain.sendSignals();
        heart.beat();
        if(isAlive()){
        frontLeftLeg.kick();
        frontRightLeg.kick();
        backLeftLeg.kick();
        backRightLeg.kick();
        if(frontLeftLeg.getIsUsable()&&frontRightLeg.getIsUsable()&&backRightLeg.getIsUsable()&&backLeftLeg.getIsUsable()){
            return "You walked to your destination";
        } else{
            tail.setIsWorking(false);
            return "One of your legs is broken, so "+name+" trips and injures his tail";
        }
    }
    return "You cannot walk, because you are dead";
    }
    private String walks(){
        frontLeftLeg.kick();
        frontRightLeg.kick();
        backLeftLeg.kick();
        backRightLeg.kick();
        if(frontLeftLeg.getIsUsable()&&frontRightLeg.getIsUsable()&&backRightLeg.getIsUsable()&&backLeftLeg.getIsUsable()){
            return "You walked to your destination";
        } else{
            return "One of the legs is broken, so "+name+" trips";
        }
    }
    public String findFood(){
        brain.sendSignals();
        heart.beat();
        if(isAlive()){
        nose.breath();
        leftEar.listenToMusic();
        rightEar.listenToMusic();
        if(rightEar.getIsUsable()||leftEar.getIsUsable()||!nose.getIsStuffed()){
            walks();
            if(!(frontLeftLeg.getIsUsable()&&frontRightLeg.getIsUsable()&&backRightLeg.getIsUsable()&&backLeftLeg.getIsUsable()))
            return "You found food but could not walk to it";
            mouth.eat();
            if(mouth.getIsUsable()){
            return "You got to the food but could not eat it";
            } else{
                return "You were successfully able to obtain food";
            }
        } else{
            return "You could not find food";
        }
        }
        return "Your dead, you do not need food";
    }

    public String sleep(){
        timesRested++;
        if(timesRested>=3){
            rightEye.heal();
            leftEye.heal();
            mouth.heal();
            nose.clear();
            leftEar.heal();
            rightEar.heal();
            tail.heal();
            frontLeftLeg.heal();
            frontRightLeg.heal();
            backLeftLeg.heal();
            backRightLeg.heal();
            timesRested=0;
            heart.heal();
            brain.heal();
            return "Your sleep has completely healed you";
        } else{
            return "You had a good sleep but need to rest more to heal completely";
        }
    }
}
