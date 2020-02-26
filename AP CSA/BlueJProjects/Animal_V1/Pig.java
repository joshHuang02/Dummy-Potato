
/**
 * Write a description of class Pig here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pig
{
    //instance variables
    private String name;
    private int age;
    private Mouth mouth;
    private Leg rightFrontLeg;
    private Leg rightBackLeg;
    private Leg leftFrontLeg;
    private Leg leftBackLeg;
    private Ear leftEar;
    private Ear rightEar;
    private Nose nose;
    private Brain brain;
    private Heart heart;
    private Eye leftEye;
    private Eye rightEye;
    private Tail tail;
    private boolean isAlive;

    //constructors
    public Pig(int age, String name){
        this.name = name;
        this.age = age;
        isAlive = true;
        tail = new Tail(2, isAlive);
        mouth = new Mouth(3, isAlive);
        rightEar = new Ear("huge", isAlive);
        leftEar = new Ear("huge", isAlive);
        brain = new Brain(10, isAlive);
        heart = new Heart("red", isAlive);
        rightEye = new Eye("black", isAlive);
        leftEye = new Eye("black", isAlive);
        leftFrontLeg = new Leg(5, isAlive);
        leftBackLeg = new Leg(5, isAlive);
        rightFrontLeg = new Leg(5, isAlive);
        rightBackLeg = new Leg(5, isAlive); 
        nose = new Nose(!isAlive, 2);
    }

    public Pig(int age, String name, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        if (age > 100){
            this.isAlive = false;
        }
        tail = new Tail(2, this.isAlive);
        mouth = new Mouth(3, this.isAlive);
        rightEar = new Ear("huge", this.isAlive);
        leftEar = new Ear("huge", this.isAlive);
        brain = new Brain(10, this.isAlive);
        heart = new Heart("red", this.isAlive);
        rightEye = new Eye("black", this.isAlive);
        leftEye = new Eye("black", this.isAlive);
        leftFrontLeg = new Leg(5, this.isAlive);
        leftBackLeg = new Leg(5, this.isAlive);
        rightFrontLeg = new Leg(5, this.isAlive);
        rightBackLeg = new Leg(5, this.isAlive); 
        nose = new Nose(!this.isAlive, 2);
    }

    //methods and accecors
    public String blink(){
        if(heart.getIsWorking()){
            return rightEye.blink() + " " + leftEye.blink();}
        else{
            return name + " is dead.";}
    }

    public void toTheHospital(){
        heart.heal();
        tail.heal();
        mouth.heal();
        rightEar.heal();
        leftEar.heal();
        brain.heal();
        heart.heal();
        rightEye.heal();
        leftEye.heal();
        leftFrontLeg.heal();
        leftBackLeg.heal();
        rightFrontLeg.heal();
        rightBackLeg.heal();
        nose.clear();
    }

    public String run(){
        String back = "";
        back += heart.beat() + "\n";
        if(heart.getIsWorking()){
            back += leftFrontLeg.kick() + "\n" + leftBackLeg.kick() + "\n" + rightFrontLeg.kick() + "\n" + rightBackLeg.kick();
        }
        else{
            back += name + " is dead.";
        }
        return back;
    }
}
