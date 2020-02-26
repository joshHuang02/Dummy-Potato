
/**
 * Write a description of class Mollusca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mollusca extends Animal
{
    private Eye leftEye; 
    private Eye rightEye; 
    private Heart heart; 
    private Mouth mouth; 
    
    public Mollusca(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String leftEyeName, String leftEyeColor, boolean leftEyeIsWorking,
    String rightEyeName, String rightEyeColor, boolean rightEyeIsWorking, String heartColor, boolean heartIsWorking,String mouthName, double mouthSizeInInches, 
    boolean mouthIsWorking){
        super(name,currentAgeInYears,isAlive,weightOfBrain);
        
        leftEye = new Eye(leftEyeName, leftEyeColor, leftEyeIsWorking); 
        rightEye = new Eye(rightEyeName, rightEyeColor, rightEyeIsWorking);
        
        heart = new Heart(heartColor,heartIsWorking);
        
        mouth = new Mouth(mouthName, mouthSizeInInches, mouthIsWorking);
    }
    
    public Mollusca(String name, double currentAgeInYears, double weightOfBrain, String leftEyeName, String leftEyeColor,
    String rightEyeName, String rightEyeColor, String heartColor, String mouthName, double mouthSizeInInches){
        super(name,currentAgeInYears,true,weightOfBrain);
        
        leftEye = new Eye(leftEyeName, leftEyeColor, true); 
        rightEye = new Eye(rightEyeName, rightEyeColor, true);
        
        heart = new Heart(heartColor,true);
        
        mouth = new Mouth(mouthName, mouthSizeInInches, true);
    }
    
    @Override
    public String toString()
    {
        String message = "This "+ getName() +" is currently ";
        if(getIsAlive())
            message += "alive";
        else
            message += "dead";
        message += ".\n   Brain: weighs "+getBrain().getWeightInPounds()+" lbs and is ";
        
        if(getBrain().getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + leftEye.getNameOfPart() + "is "+ leftEye.getColor() +" and is ";
        
        if(leftEye.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message += ".\n   The" + rightEye.getNameOfPart() + "is "+ rightEye.getColor() +" and is ";
        
        if(rightEye.getIsWorking())
            message += "working.";
        else
            message += "not working.";   
        message += ".\n   The" + heart.getNameOfPart() + "is "+ heart.getColor() +" and is ";
        
        if(heart.getIsWorking())
            message += "working.";
        else
            message += "not working.";
           
        return message;
    }
    
    public Eye getLeftEye(){
        return leftEye;
    }
    public Eye getRightEye(){
        return rightEye;
    }
    public Mouth getMouth(){
        return mouth;
    }
    public Heart getHeart(){
        return heart;
    }
}
