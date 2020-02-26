public class Octopus extends Mollusca
{
    private Gill gill; 
    private Tentacle tentacle1;
    private Tentacle tentacle2;
    private Tentacle tentacle3;
    private Tentacle tentacle4;
    private Tentacle tentacle5;
    private Tentacle tentacle6;
    private Tentacle tentacle7;
    private Tentacle tentacle8;

    public Octopus(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String leftEyeName, String leftEyeColor, boolean leftEyeIsWorking,
    String rightEyeName, String rightEyeColor, boolean rightEyeIsWorking, String heartColor, boolean heartIsWorking,String mouthName, double mouthSizeInInches, 
    boolean mouthIsWorking, String gillName, int gillLengthInCm, boolean gillIsWorking, 
    String tentacle1Color, String tentacle1Name, boolean tentacle1IsWorking,
    String tentacle2Color, String tentacle2Name, boolean tentacle2IsWorking,
    String tentacle3Color, String tentacle3Name, boolean tentacle3IsWorking,
    String tentacle4Color, String tentacle4Name, boolean tentacle4IsWorking,
    String tentacle5Color, String tentacle5Name, boolean tentacle5IsWorking,
    String tentacle6Color, String tentacle6Name, boolean tentacle6IsWorking,
    String tentacle7Color, String tentacle7Name, boolean tentacle7IsWorking,
    String tentacle8Color, String tentacle8Name, boolean tentacle8IsWorking){
        super(name, currentAgeInYears, isAlive, weightOfBrain, leftEyeName, leftEyeColor, leftEyeIsWorking, rightEyeName, rightEyeColor, rightEyeIsWorking,
            heartColor, heartIsWorking, mouthName, mouthSizeInInches, mouthIsWorking);

        gill = new Gill(gillName, gillLengthInCm, gillIsWorking);

        tentacle1 = new Tentacle(tentacle1Color, tentacle1Name, tentacle1IsWorking); 
        tentacle2 = new Tentacle(tentacle2Color, tentacle2Name, tentacle2IsWorking); 
        tentacle3 = new Tentacle(tentacle3Color, tentacle3Name, tentacle3IsWorking); 
        tentacle4 = new Tentacle(tentacle4Color, tentacle4Name, tentacle4IsWorking); 
        tentacle5 = new Tentacle(tentacle5Color, tentacle5Name, tentacle5IsWorking); 
        tentacle6 = new Tentacle(tentacle6Color, tentacle6Name, tentacle6IsWorking); 
        tentacle7 = new Tentacle(tentacle7Color, tentacle7Name, tentacle7IsWorking); 
        tentacle8 = new Tentacle(tentacle8Color, tentacle8Name, tentacle8IsWorking); 
    }

    public Octopus(String name, double currentAgeInYears, double weightOfBrain, String leftEyeName, String leftEyeColor, 
    String rightEyeName, String rightEyeColor, String heartColor, String mouthName, double mouthSizeInInches, 
    String gillName, int gillLengthInCm,  String tentacle1Color, String tentacle1Name,
    String tentacle2Color, String tentacle2Name, 
    String tentacle3Color, String tentacle3Name, 
    String tentacle4Color, String tentacle4Name, 
    String tentacle5Color, String tentacle5Name, 
    String tentacle6Color, String tentacle6Name, 
    String tentacle7Color, String tentacle7Name, 
    String tentacle8Color, String tentacle8Name){
        super(name, currentAgeInYears, true, weightOfBrain, leftEyeName, leftEyeColor, true, rightEyeName, rightEyeColor, true,
            heartColor, true, mouthName, mouthSizeInInches, true);

        gill = new Gill(gillName, gillLengthInCm, true);

        tentacle1 = new Tentacle(tentacle1Color, tentacle1Name, true); 
        tentacle2 = new Tentacle(tentacle2Color, tentacle2Name, true); 
        tentacle3 = new Tentacle(tentacle3Color, tentacle3Name, true); 
        tentacle4 = new Tentacle(tentacle4Color, tentacle4Name, true); 
        tentacle5 = new Tentacle(tentacle5Color, tentacle5Name, true); 
        tentacle6 = new Tentacle(tentacle6Color, tentacle6Name, true); 
        tentacle7 = new Tentacle(tentacle7Color, tentacle7Name, true); 
        tentacle8 = new Tentacle(tentacle8Color, tentacle8Name, true); 
    }

    @Override
    public String weakAction(){
        return swim();
    }

    @Override
    public String normalAction(){
        return eat();
    }

    @Override
    public String strongAction(){ 
        return attack();
    }

    public String heal(){
        return getLeftEye().heal() + "\n"+ getRightEye().heal() +"\n"+ getHeart().heal() +"\n"+ getBrain().heal() +"\n"
        +"\n" + gill.heal() +"\n"+ tentacle1.heal()+"\n" + tentacle2.heal() +"\n"+ tentacle3.heal() 
        +"\n"+ tentacle4.heal() +"\n"+ tentacle5.heal()+"\n" + tentacle6.heal()+"\n"+ tentacle7.heal() +"\n"
        + tentacle8.heal()  +"\n" + getMouth().heal(); 

    }
    
    

    @Override
    public String toString(){
        String message = "";
        // if(getIsAlive())
            // message += "alive";
        // else
            // message += "dead";
        // message += ".\n   Brain: weighs "+getBrain().getWeightInPounds()+" lbs and is ";

        // if(getBrain().getIsWorking())
            // message += "working.";
        // else
            // message += "not working.";
        // message += ".\n   The" + getLeftEye().getNameOfPart() + "is "+ getLeftEye().getColor() +" and is ";

        // if(getLeftEye().getIsWorking())
            // message += "working.";
        // else
            // message += "not working.";
        // message += ".\n   The" + getRightEye().getNameOfPart() + "is "+ getRightEye().getColor() +" and is ";

        // if(getRightEye().getIsWorking())
            // message += "working.";
        // else
            // message += "not working.";   
        // message += ".\n   The" + getHeart().getNameOfPart() + "is "+ getHeart().getColor() +" and is ";

        // if(getHeart().getIsWorking())
            // message += "working.";
        // else
            // message += "not working.";
            
            message+= super.toString();
        message += ".\n   The" + tentacle1.getNameOfPart() + "is "+ tentacle1.getColor() +" and is ";
        if(tentacle1.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle2.getNameOfPart() + "is "+ tentacle2.getColor() +" and is ";
        if(tentacle2.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle3.getNameOfPart() + "is "+ tentacle3.getColor() +" and is ";
        if(tentacle3.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle4.getNameOfPart() + "is "+ tentacle4.getColor() +" and is ";
        if(tentacle4.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle5.getNameOfPart() + "is "+ tentacle5.getColor() +" and is ";
        if(tentacle5.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle6.getNameOfPart() + "is "+ tentacle6.getColor() +" and is ";
        if(tentacle6.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle7.getNameOfPart() + "is "+ tentacle7.getColor() +" and is ";
        if(tentacle7.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + tentacle8.getNameOfPart() + "is "+ tentacle8.getColor() +" and is ";
        if(tentacle8.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + gill.getNameOfPart() + "is "+ gill.getLengthInCm() +" and is ";
        if(gill.getIsWorking())
            message += "working.";
        else
            message += "not working.";

            
        return message;
    }

    @Override
    public String revive()
    {
        setIsAlive(true);
        return  heal() + "octopus A L I V E" ;
    }
    
    public String swim(){
        if (!this.getHeart().getIsWorking())
        {
            return "The Heart stopped working";
        }

        return getBrain().action1() + "\n" + gill.action1() 
        + "\n"+ tentacle1.action1()+ "\n" + tentacle2.action1()
        + "\n" + tentacle3.action1()+ "\n" + tentacle4.action1()+ "\n" + tentacle5.action1()
        + "\n" + tentacle6.action1()+ "\n" + tentacle7.action1()+ "\n" + tentacle8.action1()+ "\n"+ getHeart().action1() + "\n" ; 
    }

    public String eat(){
        if (!getHeart().getIsWorking())
        {
            return "The Heart stopped working";
        }

        return getBrain().action1() + "\n" + tentacle1.action1()+ "\n" + tentacle2.action1()
        + "\n" + tentacle3.action1()+ "\n" + tentacle4.action1() + "\n"
        + getLeftEye().action1() + "\n" + getRightEye().action1()+ "\n" + getMouth().action1()+ "\n" + getHeart().action1() + "\n" ; 
    } 

    public String attack(){
        if (!this.getHeart().getIsWorking())
        {
            return "The Heart stopped working, :^(";
        }

        return getBrain().action1() + "\n" + tentacle1.action1()+ "\n" + tentacle2.action1()
        + "\n" + tentacle3.action1()+ "\n" + tentacle4.action1()+ "\n" + tentacle5.action1()
        + "\n" + tentacle6.action1()+ "\n" + tentacle7.action1()+ "\n" + tentacle8.action1()+ "\n"
        + getLeftEye().action1() + "\n" + getRightEye().action1()+ "\n" + getHeart().action1()+ "\n";
    }

    public Gill getGill(){
        return gill;
    }

    public Tentacle getTentacle1(){
        return tentacle1;   
    }

    public Tentacle getTentacle2(){
        return tentacle2;   
    }

    public Tentacle getTentacle3(){
        return tentacle3;   
    }

    public Tentacle getTentacle4(){
        return tentacle4;   
    }

    public Tentacle getTentacle5(){
        return tentacle5;   
    }

    public Tentacle getTentacle6(){
        return tentacle6;   
    }

    public Tentacle getTentacle7(){
        return tentacle7;   
    }

    public Tentacle getTentacle8(){
        return tentacle8;   
    }



}
