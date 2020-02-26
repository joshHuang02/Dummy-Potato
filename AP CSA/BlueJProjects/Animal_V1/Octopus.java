public class Octopus
{
    private Heart heart;
    private Brain brain; 
    private Mouth mouth; 
    private Gills gills; 
    private Eye leftEye;
    private Eye rightEye;
    private Tentacle tentacle1;
    private Tentacle tentacle2;
    private Tentacle tentacle3;
    private Tentacle tentacle4;
    private Tentacle tentacle5;
    private Tentacle tentacle6;
    private Tentacle tentacle7;
    private Tentacle tentacle8;

    public Octopus(){
        heart = new Heart("blue",true);
        brain = new Brain(5.55, true);
        mouth = new Mouth(4, true);
        gills = new Gills(2, true);
        leftEye = new Eye("black", true);
        rightEye = new Eye("black", true); 
        tentacle1 = new Tentacle("red",true); 
        tentacle2 = new Tentacle("blue",true); 
        tentacle3 = new  Tentacle("green", true); 
        tentacle4 = new Tentacle("yellow", true); 
        tentacle5 = new Tentacle("purple", true); 
        tentacle6 = new Tentacle("orange", true); 
        tentacle7 = new Tentacle("pink", true); 
        tentacle8 = new Tentacle("white", true); 
    }

    public String swim(){
        if (!this.heart.getIsWorking())
        {
         return "The Heart stopped working";
        }
        
        
        return brain.sendSignals() + "\n" + gills.breathe() 
        + "\n"+ tentacle1.constrict()+ "\n" + tentacle2.constrict()
        + "\n" + tentacle3.constrict()+ "\n" + tentacle4.constrict()+ "\n" + tentacle5.constrict()
        + "\n" + tentacle6.constrict()+ "\n" + tentacle7.constrict()+ "\n" + tentacle8.constrict()+ "\n"+ heart.beat() + "\n" ; 
    }

    public String eat(){
        if (!this.heart.getIsWorking())
        {
         return "The Heart stopped working";
        }
        
        
        return brain.sendSignals() + "\n" + tentacle1.constrict()+ "\n" + tentacle2.constrict()
        + "\n" + tentacle3.constrict()+ "\n" + tentacle4.constrict() + "\n"
        + leftEye.blink() + "\n" + rightEye.blink()+ "\n" + mouth.eat()+ "\n" + heart.beat() + "\n" ; 
    } 

    public String attack(){
        if (!this.heart.getIsWorking())
        {
         return "The Heart stopped working, :^(";
        }
        
        
        return brain.sendSignals() + "\n" + tentacle1.constrict()+ "\n" + tentacle2.constrict()
        + "\n" + tentacle3.constrict()+ "\n" + tentacle4.constrict()+ "\n" + tentacle5.constrict()
        + "\n" + tentacle6.constrict()+ "\n" + tentacle7.constrict()+ "\n" + tentacle8.constrict()+ "\n"
        + leftEye.blink() + "\n" + rightEye.blink()+ "\n" + heart.beat()+ "\n";
    }

    public String heal(){
        return leftEye.heal() + "\n"+ rightEye.heal() +"\n"+ heart.heal() +"\n"+ brain.heal() +"\n"
        +"\n" + gills.heal() +"\n"+  tentacle1.heal()+"\n" + tentacle2.heal() +"\n"+ tentacle3.heal() 
        +"\n"+ tentacle4.heal() +"\n"+ tentacle5.heal()+"\n" + tentacle6.heal()+"\n"+ tentacle7.heal() +"\n"
        + tentacle8.heal()  +"\n" + mouth.heal(); 
    }
}
  

