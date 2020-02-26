public class Deer
{
    private Heart heart;
    private Brain brain;
    private Mouth mouth;
    private Tail tail;
    private Nose nose;
    private Eye leftEye;
    private Eye rightEye;
    private Ear leftEar;
    private Ear rightEar;
    private Leg leftForeLeg;
    private Leg rightForeLeg;
    private Leg leftHindLeg;
    private Leg rightindLeg;
    
    public Deer()
    {
        heart=new Heart("red",true);
        brain=new Brain(7.99,true);
        mouth=new Mouth(4.8,true);
        tail=new Tail(5,true);
        nose=new Nose(true,4);
        leftEye=new Eye("blue",true);
        rightEye=new Eye("blue",true);
        leftEar=new Ear("medium",true);
        rightEar=new Ear("medium",true);
        leftForeLeg=new Leg(9,true);
        rightForeLeg=new Leg(9,true);
        leftHindLeg=new Leg(9,true);
        rightindLeg=new Leg(9,true);
    }
    
    public String run()
    {
        if(!this.heart.getIsWorking()){
            return "The heart stopped working";
        }
        return heart.beat() + "\n" + brain.sendSignals() + "\n" + leftEye.blink()
        + "\n"+ rightEye.blink()+ "\n" + leftForeLeg.kick()
        + "\n" + rightForeLeg.kick()+ "\n" + leftHindLeg.kick()
        + "\n" + rightindLeg.kick()+ "\n";
    }
    
    public String eat()
    {
        if(!this.heart.getIsWorking()){
            return "The heart stopped working";
        }
        return heart.beat() + "\n" + brain.sendSignals() + "\n" + leftEye.blink()
        + "\n"+ rightEye.blink()+ "\n" + mouth.eat()
        + "\n" + nose.breath()+ "\n";
    }
    
    public String attack()
    {
        if(!this.heart.getIsWorking()){
            return "The heart stopped working";
        }
        return heart.beat() + "\n" + brain.sendSignals() + "\n" + leftEye.blink()
        + "\n"+ rightEye.blink()+ "\n" + leftForeLeg.kick()
        + "\n" + rightForeLeg.kick()+ "\n" + leftHindLeg.kick()
        + "\n" + rightindLeg.kick()+ "\n" + leftEar.listenToMusic() 
        + "\n" + rightEar.listenToMusic()+ "\n";
    }
    
    public String heal()
    {
        return heart.heal() + "\n" + brain.heal() +"\n" + mouth.heal() 
        + "\n" + leftEye.heal() + "\n" + rightEye.heal()
        +"\n" + tail.heal() + "\n" +  nose.clear()+"\n" + leftEar.heal() 
        +"\n"+ rightEar.heal() +"\n"+ leftForeLeg.heal() +"\n"+ rightForeLeg.heal()
        +"\n" + leftHindLeg.heal()+"\n"+ rightindLeg.heal() + "\n" ;
    }
}
