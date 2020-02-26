/**
 * This class will define the dog's size, age, and number of legs
 * @author Josh Huang
 * @version 0.1.0 beta 
 */
public class Dog {
    // instance variables
    private double sizeInPounds;
    private int ageInYears;
    public final int numberOfLegs = 4;
    
    // constructors
    // default constructor below should have no parameters
    /**
     * This constructor defines the default value for size and age
     */
    public Dog () {
        sizeInPounds = 1000.0;
        ageInYears = 1;
    }
    
    /*
     * This constructor allow you to set up variables from what you pass in
     * @param ageInYears Accepts an int for age in years of the dog
     * @param currentSize Accepts a double to set sizeInPounds of dog
     */
    public Dog (int ageInYears, double currentSize) {
        this.ageInYears = ageInYears;
        this.sizeInPounds = currentSize;
    }
    
    /*
     * This constructor only sets the age and puts size as 0.1 default
     * @param ageInYears Accepts an int for age in years
     */
    public Dog (int ageInYears) {
        this.ageInYears = ageInYears;
        this.sizeInPounds = 0.1;
    }
    // methods
    // accessor, return type, method name, and inside parameter
    /**
    * This constructor defines the numbers for the variables
    * @param setAAccepts an int to replace age in years 
    */
    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public int getAgeInYear() {
        return ageInYears;
    }
    
    public void setSizeInPounds(double sizeInPounds){
        this.sizeInPounds = sizeInPounds;
    }
    
    public double getSizeInPounds(){
        return sizeInPounds;
    }
}   
