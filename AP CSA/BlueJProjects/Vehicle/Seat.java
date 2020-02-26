
/**
 * Write a description of class Seat here.
 *
 * @author (Timothy)
 * @version (2/6)
 */
public class Seat extends CarComponent
{
    //instance variables
    private int seatBeltLengthInInches;//legally have to be 60 - 90 in long
    private int reclineBackwardsInInches;
    //private int intensityOfPersonInLbs; //how much force is being put onto the seat
    //private boolean isWorking;
    //private String nameOfComponent; 
    //constructors 
    public Seat(String nameOfComponent, boolean isWorking, int seatBeltLengthInInches, int reclineBackwardsInInches, double chanceOfFailure){
        super(nameOfComponent, isWorking, chanceOfFailure);
        //this.isWorking = true;
        this.seatBeltLengthInInches = 60;
        this.reclineBackwardsInInches = 12;
        //this.intensityOfPersonInLbs = 150;//avg human male lbs
        // this.nameOfComponent = nameOfComponent;
    }

    public Seat(boolean isWorking, int seatBeltLengthInInches, int reclineBackwardsInInches ){
        super("SeatName",isWorking);
        this.seatBeltLengthInInches = 60;
        this.reclineBackwardsInInches = 12;
        //this.intensityOfPersonInLbs = 150;
        //this.isWorking = isWorking;
        //this.seatBeltLengthInInches = seatBeltLengthInInches;

    }

    //methods, accessors, mutator

    @Override 
    public String toString(){
        String message ="";

        if(getIsWorking()) {

            message+= "The " + getNameOfComponent() + " is working. The seatbelt is "+ getSeatBeltLengthInInches() + " inches and you have reclined " + getReclineBackwardsInInches() + "inches";
        }else {
            message+= "The " + getNameOfComponent() + " is not working"; 
        }
        return message;
    }

    @Override
    public String action1(){
        return useSeatBelt();   
        //return getIsWorking();
    }

    @Override
    public String action2(){
        return reclineBackwardsInInches();
        //return getIsWorking();
    }

    public String useSeatBelt(){
        if (getIsWorking()  /*|| intensityOfPersonInLbs > 6000*/ ){
            if(!super.conditionalCheck())
                return damage() + "The "+getNameOfComponent()+ " is broken and you can not get into the car.";
            else
                return "The "+getNameOfComponent()+ " works and you are safe.";
        }
        else
            return "The " +getNameOfComponent()+ " is broken and you can not get into the car.";
    }

    public String reclineBackwardsInInches(){
        if (getIsWorking()  /*||intensityOfPersonInLbs > 6000*/ ){
            if(!super.conditionalCheck())
                return damage() + "The " +getNameOfComponent()+ " can not recline.";
            else
                return "The " +getNameOfComponent()+ " reclined backwards.";

        }
        else 
            return " The " +getNameOfComponent() + " can not recline.";
    }

    @Override
    public String damage(){
        setIsWorking(false);
        return "";
    }

    @Override
    public String fix(){
        setIsWorking(true);
        return "The" + getNameOfComponent() + "is now in working condition";
    }

    public int getSeatBeltLengthInInches (){
        return this.seatBeltLengthInInches ;
    }

    public void setSeatBeltLengthInInches (int seatBeltLengthInInches ){
        this.seatBeltLengthInInches  = seatBeltLengthInInches ; 
    }

    public int getReclineBackwardsInInches() {
        return this.reclineBackwardsInInches;   
    }

    public void setReclineBackwardsInInches(int reclineBackwardsInInches){
        this.reclineBackwardsInInches = reclineBackwardsInInches;

    }

    /*public int getIntensityOfPersonInLbs(){
    return this.intensityOfPersonInLbs;
    }

    public void setIntensityOfPersonInLbs(int intensityOfPersonInLbs){
    this.intensityOfPersonInLbs = intensityOfPersonInLbs;   
    }*/
}