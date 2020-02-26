/**
 * Write a description of class Manatee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manatee
{
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Brain brain;
    private Heart heart;
    private Mouth mouth;
    private Nose nose;
    private Whiskers whiskers;
    private Tail tail; 

    public Manatee(String name){
        leftEye = new Eye("Left Eye", "Red", true);
        rightEye = new Eye("Right Eye", "Red", true);
        brain = new Brain(40.0, true);
        heart = new Heart("Red", true);
        mouth = new Mouth(12, true);
        nose = new Nose(true, 2);
        whiskers = new Whiskers(6, true);
        tail = new Tail(38, true);   
    }

    public String swim(){
        if(this.heart.getIsWorking() || this.brain.getIsWorking())
        {
            return "The animal is dead.";

        }
        return this.leftEye.blink() + " " + this.rightEye.blink()+ " " + 
        this.heart.beat() + " " + this.brain.sendSignals()+ this.tail.wag();
    }

    public String goHospital(){
        if(this.heart.getIsWorking())
        {
            return "The animal is dead.";

        }
        return this.leftEye.heal()+
        this.rightEye.heal()+
        this.brain.heal()+
        this.heart.heal()+
        this.mouth.heal()+
        this.nose.clear()+
        this.whiskers.heal()+
        this.tail.heal();
    }
    
    public String eat(){
        if(this.heart.getIsWorking() || this.brain.getIsWorking())
        {
            return "The animal is dead.";

        }
        return this.leftEye.blink() + " " + this.rightEye.blink()+ " " + 
        this.heart.beat() + " " + this.brain.sendSignals()+ " " +this.tail.wag()+ " " 
         + " " + this.mouth.eat() + " " +this.nose.breath()+ " " +this.whiskers.pull();
    }
}




