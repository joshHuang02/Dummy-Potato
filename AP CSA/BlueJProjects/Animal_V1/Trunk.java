public class Trunk
{
    //instance variables
    private String color;
    private boolean isUsable;
    
    //constructors
    public Trunk(String color, boolean isUsable){
        this.color = color;
        this.isUsable = isUsable;
    }
    
    public Trunk(String color){
        this.color = color;
        this.isUsable = true;
    }
    
    //methods, accessors, mutators
    public String swing(){
        if(isUsable){
            if(((int)(Math.random()*100) +1)>80){
                return injure() + "The trunk could not be lifted.";
            }
            return "The trunk was swung.";
        }
        else{
               if(((int)(Math.random()*100) +1)>80){
                return heal() + "The trunk was swung.";
            }
            return "The trunk could not swing because it was injured.";
        }
        
    }
    
    public String injure(){
        this.isUsable = false;
        return "The trunk was injured.";
    }
    
    public String heal(){
        if(isUsable){
            return "The trunk is still healthy.";
        }
        else{
            this.isUsable = true;
            return "The trunk was healed.";
        }
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String setIsAttatched(boolean isUsable){
     this.isUsable = isUsable;
     if(isUsable){
          return "The trunk is still healthy";
        }
     else{
          return "The trunk is injured.";
        }
    }
    
    public boolean getIsUsable(){
        return this.isUsable;
    }
}
