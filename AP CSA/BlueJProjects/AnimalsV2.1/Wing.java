// Natalle S. and Tony Y.
// FIXED: Issue with super not being called in constructor
// FIXED: Issue with not giving option to name wing on construction
// Removed constructor

public class Wing extends AnimalPart
{
    //instance variables
    private String color;

    //constructors
    public Wing(String name, boolean isWorking, String color){
        super(name, isWorking);
        this.color = color;
    }

    //methods, accessors, mutators
    @Override
    public String action1(){
        return flap();
    }

    public String flap(){
        if(getIsWorking()){
            if(((int) (Math.random() * 100)+1) >50){
                return injure() + "The wing cannot flap.";
            }
            return "The wing flaps.";
        }
        else
        {
            return "The wing does not flap.";
        }
    }

    @Override
    public String injure(){
        setIsWorking(false);
        return "The wing is injured";
    }

    @Override
    public String heal(){
        if(getIsWorking()){
            return "The wing was already fine.";
        }
        else
        {
            setIsWorking(true);
            return "The wing is fine.";
        }
    }

    @Override
    public String toString(){
        return "This is the wing in child class";
    }
}
