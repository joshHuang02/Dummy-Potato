/**
 * Write a description of class Engine here.
 *
 * @author (Phillip Zhou)
 * @version (2/4/20)
 */
public class Engine extends CarComponent

{
    //instance variables
    //private String nameOfComponent;
    private int numberOfCylinders;
    private int engineTemperatureInFahrenheit;
    //private boolean engineIsWorking;
    

    //constructors
    public Engine(String nameOfComponent, int numberOfCylinders, 
    int engineTemperatureInFahrenheit, boolean engineIsWorking, double chanceOfFailure  )
    {
        super(nameOfComponent, engineIsWorking, chanceOfFailure);
        //this.nameOfComponent = nameOfComponent;
        this.numberOfCylinders = numberOfCylinders;
        this.engineTemperatureInFahrenheit = engineTemperatureInFahrenheit;
        //this.engineIsWorking = engineIsWorking;

    }

    public Engine(String nameOfComponent, int numberOfCylinders, 
    int engineTemperatureInFahrenheit )
    {
        super(nameOfComponent, true,10);
        
        this.numberOfCylinders = numberOfCylinders;
        this.engineTemperatureInFahrenheit = engineTemperatureInFahrenheit;
        

    }





    //override actions
    public String action1(){
        return ignition();  
    }

    public String action2(){
        return useFuel();  
    }

    //methods
    public String ignition()
    {

        if (getIsWorking())
        {   if(!super.conditionalCheck() )
            { 
                setIsWorking(false);
                return getNameOfComponent() + " broke.";

            }
            else{
             return getNameOfComponent()+ " ignites." ; 
            }
        }
        else{
            return getNameOfComponent() + " cannot ignite.";
        }
        
    }
    public String useFuel() 
    {
        if (getIsWorking()){
            if( !super.conditionalCheck() )
            { 
                setIsWorking(false);
                return getNameOfComponent() + " broke.";

            }
            else{
             return getNameOfComponent() + " uses fuel."; 
            }
        }
        else{
            return getNameOfComponent() + " cannot use fuel.";
        }   
    }

    public String toString()
    {
        String message = "The " + getNameOfComponent() + " is "; 
        if(getIsWorking()){
            message+= "working. \n"; 
        }else{
            message+= "not working. \n"; 
        }
        return message;
    }

    public String damage(){
        setIsWorking(false); 
        return "You broke the" + getNameOfComponent() + ".";
    }

    public String fix(){
        setIsWorking(true); 
        return "The" + getNameOfComponent() + "received repairs and is now fixed.";
    }

    //getters and setters
    
    
    // public String getNameOfComponent(){
        // return nameOfComponent; 
    // }

    // public void setNameOfComponent(String nameOfComponent){
        // this.nameOfComponent = nameOfComponent;
    // }

    public int getNumberOfCylinders(){
        return numberOfCylinders; 
    }

    public void setNumberOfCylinders(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getEngineTemperatureInFahrenheit(){
        return engineTemperatureInFahrenheit; 
    }

    public void setEngineTemperatureInFahrenheit(int engineTemperatureInFahrenheit){
        this.engineTemperatureInFahrenheit = engineTemperatureInFahrenheit;
    }
}