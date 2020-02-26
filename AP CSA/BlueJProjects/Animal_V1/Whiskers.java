
/**
 * Write a description of class Whiskers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Whiskers
{
    private int length;
    private boolean isUsable;
    
    public Whiskers(int length, boolean isUsable){
        this.length = length;
        this.isUsable = isUsable;
    }
    
    public String pull(){
        if(isUsable)
        {    
            return "The whisker gets pulled but not plucked out";
        }
         else
            return "The whisker gets plucked out";      
    }
    
    public String injure(){
        isUsable = false;
        return "The whisker is out";
    }
    
    public String heal(){
        if(isUsable)
            return "The whisker is already fine";
        else{
            isUsable = true;
            return "The whisker can be pulled now";
        }
    }
}
