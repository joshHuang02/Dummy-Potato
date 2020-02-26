
/**
 * Write a description of class Wolf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wolf
{
   //instances
   private Brain brain;
   private Leg leg1;
   private Leg leg2;
   private Leg leg3;
   private Leg leg4;
   private Eye rightEye;
   private Eye leftEye;
   private Ear leftEar;
   private Ear rightEar;
   private Heart heart;
   private Nose nose;
   private Mouth mouth;
   private Tail tail;
   public static void main(){
    
    }
   //constructors
   public Wolf(boolean functioning){
   Brain brain = new Brain(3.0,functioning);
   Leg leg1 = new Leg(11,functioning);
   Leg leg2 = new Leg(12,functioning);
   Leg leg3 = new Leg(13,functioning);
   Leg leg4 = new Leg(14,functioning);
   Eye rightEye = new Eye("green", functioning);
   Eye leftEye = new Eye("blue", functioning);
   Ear leftEar = new Ear("big",functioning);
   Ear rightEar = new Ear("average but totally not small", functioning);
   Heart heart = new Heart("red", functioning);
   Nose nose = new Nose(!functioning, 3);
   Mouth mouth = new Mouth(5, functioning);
   Tail tail = new Tail(6, functioning);
    }
   //methods
   public String heal(){
   brain.setIsWorking(true);
   leg1.setIsUsable(true);
  leg2.setIsUsable(true);
  leg3.setIsUsable(true);
  leg4.setIsUsable(true);
  rightEye.setIsUsable(true);
  leftEye.setIsUsable(true);
  leftEar.setIsUsable(true);
  rightEar.setIsUsable(true);
  heart.setIsWorking(true);
  nose.clear();
  mouth.setIsUsable(true);
  tail.setIsWorking(true);
  return "The body has been healed";
    }
    public String run(){
        if(heart.getIsWorking() && brain.getIsWorking()){
    
    return brain.sendSignals() +leg1.kick()
    +leg2.kick()
    +leg3.kick()
    +leg4.kick()
    +heart.beat()
    +nose.breath()
    +"The wolf is running";
}else {
    return "Ooopsies! The wolf is dead.";
}
}
public String sense(){
        if(heart.getIsWorking() && brain.getIsWorking()){
    
    return brain.sendSignals() 
    +heart.beat()
    +nose.breath()
    +rightEye.blink()
    +leftEye.blink()
    +leftEar.listenToMusic()
    +rightEar.listenToMusic()
    +tail.wag()
    +"The wolf is sensing something";
}else {
    return "Ooopsies! The wolf is dead.";
}
}
public String haveDinner(){
        if(heart.getIsWorking() && brain.getIsWorking()){
    
    return brain.sendSignals() 
    +heart.beat()
    +nose.breath()
    +mouth.eat()
    +rightEye.blink()
    +leftEye.blink()
    +"The wolf is eating good";
}else {
    return "Ooopsies! The wolf is dead.";
}
}
}
