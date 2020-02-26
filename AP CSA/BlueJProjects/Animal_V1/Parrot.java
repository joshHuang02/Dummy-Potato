
public class Parrot
{
    private String name; 
    private Brain brain; 
    private Beak beak; 
    private Heart heart; 
    private Leg leftLeg; 
    private Leg rightLeg; 
    private Wing leftWing; 
    private Wing rightWing; 
    private Eye leftEye; 
    private Eye rightEye; 

    public Parrot(String name){
        this.name = name; 
        brain = new Brain(6.00, true);
        beak = new Beak(5.00, true); 
        heart = new Heart("pink", true);
        leftLeg = new Leg(2); 
        rightLeg = new Leg(2); 
        leftWing = new Wing("orange");
        rightWing = new Wing("yellow"); 
        leftEye = new Eye("blue"); 
        rightEye = new Eye("green"); 
    }

    public Parrot(String name, boolean isAlive){
        this.name = name; 
        brain = new Brain(6.00, isAlive);
        beak = new Beak(5.00, isAlive); 
        heart = new Heart("pink", isAlive);
        leftLeg = new Leg(2,isAlive); 
        rightLeg = new Leg(2,isAlive); 
        leftWing = new Wing("orange",isAlive,isAlive);
        rightWing = new Wing("yellow",isAlive,isAlive); 
        leftEye = new Eye("blue",isAlive); 
        rightEye = new Eye("green",isAlive); 
    }

    public String fly(){
        if(heart.getIsWorking()){
            return leftLeg.kick() + "\n" + rightLeg.kick() + "\n" + leftWing.flap() + "\n" + rightWing.flap() + "\n"
            + brain.sendSignals() + "\n" + heart.beat() + "\n"; 
        }else{
            return name + " the parrot is dead :^(";
        }

    }

    public String attack(){
        if(heart.getIsWorking()){
            return leftLeg.kick() + "\n" + rightLeg.kick() + "\n" + beak.peck()+ "\n" + leftEye.blink() + "\n" + rightEye.blink() + "\n"+ leftWing.attemptKarateChop() + "\n" + 
            rightWing.attemptKarateChop() + "\n"+ brain.sendSignals() + "\n" + heart.beat() + "\n"; 
        }else{
            return name + " the parrot is dead :^(";
        }
    }

    public String eat(){
        if(heart.getIsWorking()){
            return beak.peck() + "\n"+ brain.sendSignals() + "\n" + heart.beat() + "\n"; 
        }else{
            return name + " the parrot is dead :^(";
        }
    }

    public String heal(){
        return leftEye.heal() + "\n"+ rightEye.heal() +"\n"+ heart.heal() +"\n"+ brain.heal() +"\n"
        + beak.heal() +"\n"+  leftLeg.heal()+"\n" + rightLeg.heal() +"\n"+ leftWing.heal() 
        +"\n"+ rightWing.heal() +"\n"; 
    }
}
