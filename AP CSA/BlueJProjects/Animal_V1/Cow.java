
/**
 * Write a description of class Cow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cow
{
    private int age;
    private Boolean isAlive;
    
    private Eye leftEye;
    private Eye rightEye;
    private Leg rightForeleg;
    private Leg leftForeleg;
    private Leg rightHindleg;
    private Leg leftHindleg;
    private Ear leftEar;
    private Ear rightEar;
    private Heart heart;
    private Nose nose;
    private Mouth mouth;
    private Brain brain;
    private Tail tail;
    
    public Cow(int age, Boolean isAlive){
        this.age = age;
        this.isAlive = isAlive;
        
        leftEye = new Eye("blue", isAlive);
        rightEye = new Eye("blue", isAlive);
        rightForeleg = new Leg(50, isAlive);
        leftForeleg = new Leg(50, isAlive);
        rightHindleg = new Leg(50, isAlive);
        leftHindleg = new Leg(50, isAlive);
        leftEar = new Ear("big", isAlive);
        rightEar = new Ear("big", isAlive);
        heart = new Heart("red", isAlive);
        nose = new Nose(!isAlive, 1);
        mouth = new Mouth(4, isAlive);
        brain = new Brain(20, isAlive);
        tail = new Tail(30, isAlive);
        
    }
    
    public String kick(){
        if(heart.getIsWorking()){
            
            return rightForeleg.kick();
        }else{
            return "The cannot jump since it is dead";
        }
    }
    
    public String eat(){
        if(heart.getIsWorking()){
            brain.sendSignals();                                                
            return mouth.eat();
        }else{
            isAlive = false;
            return "The cow does not eat because it is dead";
        }
    }
    
    public String wagTail(){
        if(heart.getIsWorking()){
            brain.sendSignals();
            return tail.wag();
        }else{
            isAlive = false;
            return "The cow's heart stopped working";
        }
    }
    
    public String panic(){
        if(heart.getIsWorking()){
            leftEye.blink();
            rightEye.blink();
            brain.sendSignals();
            leftEar.injure();
            return rightEar.injure() + tail.wag() + nose.alergic() + mouth.eat() + heart.heartAttack();
        }else{
            isAlive = false;
            return "The cow died before it can panic";
        }
    }
    
     public String sleep(){
            return "The cow sleeps well and regenerates "
            + leftEye.heal() + rightEye.heal() 
            + rightForeleg.heal() + leftForeleg.heal() 
            + rightHindleg.heal() + leftHindleg.heal() + tail.heal()
            + nose.clear() + heart.heal() + mouth.heal() + brain.heal()
            +leftEar.heal() + rightEar.heal();
    }
}
