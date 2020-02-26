// Issue with getBrainWeight does not exist
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
    boolean mouthIsWorking   ){
        super(name,currentAgeInYears,isAlive,weightOfBrain);
        
        leftEye = new Eye(leftEyeName, leftEyeColor, leftEyeIsWorking); 
        rightEye = new Eye(rightEyeName, rightEyeColor, rightEyeIsWorking);
        
        heart = new Heart(heartColor,heartIsWorking);
        
        mouth = new Mouth(mouthName, mouthSizeInInches, mouthIsWorking);//String nameOfPart, double mouthSizeInInches,boolean isWorking
    }
    
    public Mollusca(String name, boolean isAlive)
    {
         super(name, 1.0, isAlive, 1.0);
        leftEye = new Eye("left eye", "blue", isAlive); 
        rightEye = new Eye("right eye", "blue", isAlive);
        
        heart = new Heart("red",isAlive);
        
        mouth = new Mouth("mouth", 11.11, isAlive);
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
        
        
        if(heart.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        
        
            
        return message;
        
    }
    
    public String getLeftEyeName(){
     return leftEye.getNameOfPart();   
    }
    public void setLeftEyeName(String leftEyeName){
        
        leftEye.setNameOfPart(leftEyeName);
        
    }
    
    public String getLeftEyeColor(){
     return leftEye.getColor();   
    }
    public void setLeftEyeColor(String leftEyeColor){
        
        leftEye.setColor(leftEyeColor);
        
    }
    
    public boolean getLeftEyeIsWorking(){
     return leftEye.getIsWorking();   
    }
    public void setLeftEyeIsWorking(boolean leftEyeIsWorking){
        
        leftEye.setIsWorking(leftEyeIsWorking);
        
    }
    
    public String getRightEyeColor(){
     return rightEye.getColor();   
    }
    
    public void setRightEyeColor(String rightEyeColor){
        
        rightEye.setColor(rightEyeColor);
        
    }
    
    public String getRightEyeName(){
     return rightEye.getNameOfPart();   
    }
    
    public void setRightEyeName(String rightEyeName){
        
        rightEye.setNameOfPart(rightEyeName);
        
    }
    
    public boolean getRightEyeIsWorking(){
     return rightEye.getIsWorking();   
    }
    public void setRightEyeIsWorking(boolean rightEyeIsWorking){
        
        rightEye.setIsWorking(rightEyeIsWorking);
        
    }
    
    
    public String getHeartColor(){
     return heart.getColor();   
    }
    
    public void setHeartColor(String heartColor){
        
        heart.setColor(heartColor);
        
    }
    
    public boolean getHeartIsWorking()
    {
     return heart.getIsWorking();   
    }
    
    public void setHeartIsWorking (boolean heartIsWorking)
    {
     heart.setIsWorking(heartIsWorking);   
    }
    
    public String getMouthName()
    {
        return mouth.getNameOfPart();
    }
    
    public void setMouthName(String mouthName)
    {
        mouth.setNameOfPart(mouthName);
        
    }
    
    public double getMouthSizeInInches(){
     return mouth.getMouthSizeInInches();   
    }
    
    public void setMouthSizeInInches(double mouthSizeInInches){
        
        mouth.setMouthSizeInInches(mouthSizeInInches);
        
    }
    
    public boolean getMouthIsWorking()
    {
        return mouth.getIsWorking();
    }
    
    public void setMouthIsWorking(boolean mouthIsWorking)
    {
        mouth.setIsWorking(mouthIsWorking);
    }
}
