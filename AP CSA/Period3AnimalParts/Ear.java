
/**
 * This animal has-a ear.
 *
 * @Cecilia Li
 * @1/6/2020
 */
public class Ear
{
    //instance variable
    private String size;
    private boolean isUsable;
    
    //constructor(s)
    public Ear(String size, boolean isUsable){
        this.size = size;
        this.isUsable = isUsable;
    }
    
    public Ear(String size){
        this.size = size;
        this.isUsable = true;
    }
    
    //method, accecors, and mutators
    
    public String listenToMusic(){
        if(isUsable){
            if(Math.random()*100 + 1 < 50)
                return injure() + " You cannot listen to music.";
            else
                return "You are listening to music.";
        }
        else
            return "You cannot listen to music.";
    }
    
    public String injure(){
        if (isUsable){
            this.isUsable = false;
            return "Your hearing is lost.";}
        else
            return "Your hearing was already lost.";
    }
    
    public String heal(){
        if(isUsable)
            return"This ear was already fine.";
        else{
            this.isUsable = true;
            return "This ear is now working";
        }
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public String getSize(){
        return this.size;
    }
    
    public void setIsUsable(boolean isUsable){
        this.isUsable = isUsable;
    }
    
    public boolean getIsUsable(){
        return this.isUsable;
    }
}
