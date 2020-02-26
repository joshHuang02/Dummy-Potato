
/**
 * Write a description of class Elephant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elephant
{
    private Nose nose;
    private Tail tail;
    private Leg leg1;
    private Leg leg2;
    private Leg leg3;
    private Leg leg4;
    private Ear ear1;
    private Ear ear2;
    private Eye eye1;
    private Eye eye2;
    private Mouth mouth;
    private Trunk trunk;
    private Heart heart;
    private Brain brain;
    
    
    
    public Elephant(){
        nose = new Nose(false,4);
        tail = new Tail(100,true);
        leg1 = new Leg(100, true);
        leg2 = new Leg(100, true);
        leg3 = new Leg(100, true);
        leg4 = new Leg(100, true);
        ear1 = new Ear("Large", true);
        ear2 = new Ear("Large", true);
        eye1 = new Eye("brown",true);
        eye2 = new Eye("brown",true);
        mouth = new Mouth(36,true);
        trunk = new Trunk("grey", true);
        heart = new Heart("red", true);
        brain = new Brain(20, true);
    }
    
    public String attack(){
        return "The elephant attacked" + "\n" + leg1.kick() + "\n"
        + trunk.swing() + "\n" + leg2.kick() + "\n" + leg3.kick() 
        + "\n" + leg4.kick() + "\n" + heart.beat() + "\n" 
        + brain.sendSignals();
    }
    
    public String guard(){
        if(((int)(Math.random()*100) +1)>80){
            return brain.injure() + "\n" 
            + " The elephant could not guard itself";
        }
        
        return "The elephant became alert of its surroundings" + "\n" + eye1.blink()
        + "\n" + eye2.blink() + "\n" + ear1.listenToMusic() + "\n" + ear2.listenToMusic() 
        + "\n" + tail.wag();
    }
    
    public String eat(){
        /*if(((int)(Math.random()*100) +1)>80){
            return heart.heartAttack() + "\n" 
            + " The elephant collapsed";
        }*/
        
        if (!this.heart.getIsWorking()){
            return "the heart stopped working";
        }
        
        if(((int)(Math.random()*100) +1)>80){
            return nose.clear() + "\n" + tail.heal() + "\n" + leg1.heal()
            + "\n" + leg2.heal() + "\n" + leg3.heal() + "\n" + leg4.heal()
            + "\n" + eye1.heal() + "\n" + eye2.heal() + "\n" + ear1.heal()
            + "\n" + ear2.heal() + "\n" + mouth.heal() + "\n" + trunk.heal()
            + "\n" + heart.heal() + "\n" + brain.heal()
            + " The elephant was healed";
        }
        
        return "The elephant started to eat" + "\n" + trunk.swing() + "\n" 
        + mouth.eat() + "\n" + nose.breath();
    }


    
}