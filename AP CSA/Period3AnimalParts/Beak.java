
/**
 * Write a description of class Beak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beak
{
    //instance variables
    private double length;
    private boolean ifWorks;
    //constructors
    public Beak(double length, boolean ifWorks){
        this.length = length;
        this.ifWorks = ifWorks;
    }

    public Beak(double length){
        this.length = length;
        this.ifWorks = true;
    }
    //methods, accessors, mutators
     public String peck()
    {
        if (ifWorks){
            if((int)(Math.random() * 100) + 1 > 70){
                return injure() + "The beak cannot peck";
            }
            return "The beak pecks";   
        }
        else{
            return "The beak does not peck";   
        }
    }

    public String injure()
    {
        this.ifWorks = false;
        return "The beak is injured";
    }

    public String heal()
    {
        if (ifWorks){
            this.ifWorks = true;   
            return "The beak was already fine";
        }
        else{
            return "The beak is now working";
        }
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;   
    }
    
    public void setIfWorks(boolean ifWorks){
        this.ifWorks = ifWorks;
    }
    public boolean getIfWorks(){
        return this.ifWorks;   
    }
}
