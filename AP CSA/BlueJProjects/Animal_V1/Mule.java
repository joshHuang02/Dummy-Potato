
/**
 The class creates a mule animal with four actions.
 *
 * @author (Mingyu Liu)
 * @version 1.9.5
 */
public class Mule
{
    private String name;
    private int age;
    private Ear leftEar;
    private Ear rightEar;
    private Eye leftEye;
    private Eye rightEye;
    private Tail tail;
    private Brain brain;
    private Butt butt;
    private Leg frontLeftLeg;
    private Leg frontRightLeg;
    private Leg backLeftLeg;
    private Leg backRightLeg;
    private Mouth mouth;
    private Nose nose;
    private Heart heart;
    
    public Mule(int age,String name,boolean isAlive){
        this.age=age;
        this.name=name;
        this.leftEar= new Ear("Big",isAlive);
        this.rightEar= new Ear("Big",isAlive);
        this.leftEye= new Eye("black",isAlive);
        this.rightEye= new Eye("black",isAlive);
        this.tail=new Tail(10,isAlive);
        this.brain = new Brain(3.0,isAlive);
        this.butt= new Butt(10,2,1,"smooth",true,isAlive);
        this.frontLeftLeg = new Leg (12,isAlive);
          this.backLeftLeg = new Leg(12,isAlive);
           this.frontRightLeg = new Leg(12,isAlive);
            this.backRightLeg = new Leg(12,isAlive);
          this.mouth= new Mouth(3.5,isAlive);
          this.nose = new Nose(!isAlive,1);
            this.heart = new Heart("red",isAlive);
            
    }
    public String attack(){
        
        if((this.brain.getIsWorking()&&this.heart.getIsWorking())){
           
            return this.brain.sendSignals()+" "+this.heart.beat()+" "+ this.frontLeftLeg.kick()+" " +this.backLeftLeg.kick()+" " 
            +this.backRightLeg.kick()+" " +this.frontRightLeg.kick();
        }
        else{
            return "Your Mule is dead.";
            
        } 
    }
    public String experienceSignificantEmotionalEvent(){
        if((this.brain.getIsWorking()&&this.heart.getIsWorking())){
           return this.butt.fart()+ " "+this.heart.heartAttack()+" "+this.brain.injure()+" " + this.nose.alergic();    
        }
        else{
         return " The Mule is already dead.";
         
        }
    }
    public String relax(){
        if((this.brain.getIsWorking()&&this.heart.getIsWorking())){
           return this.mouth.eat()+" "+this.tail.wag()+" " + this.butt.excrete()+this.butt.fart();    
        }
        else{
         return " The Mule has been dead.";
         
        }
    }
    public void visitHospital(){
        this.leftEar.heal();
        this.rightEar.heal();
        this.leftEye.heal();
        this.rightEye.heal();
        this.tail.heal();
        this.brain.heal();
        this.butt.heal();
        this.frontLeftLeg.heal();
          this.backLeftLeg.heal();
           this.frontRightLeg.heal();
            this.backRightLeg.heal();
          this.mouth.heal();
          this.nose.clear();
            this.heart.heal();
 
        System.out.println("The Mule has been resuscitated.");
    }
}
