// Issue with constructor calling super

//Kenzo Khowdee
public class Annelids extends Animal
{
    //variables
    private Heart heart;
    private Mouth mouth;
    private Tail tail;

    //constructors
    public Annelids(String name, int currentAgeInYears, double ageInyears,  boolean isAlive, double weightOfBrain, String colorOfHeart, double mouthSizeInInches, 
    int sizeOfTailInCM){
        super(name, currentAgeInYears, isAlive,weightOfBrain);

        this.mouth = new Mouth(name, mouthSizeInInches, isAlive );
        this.heart = new Heart(colorOfHeart, isAlive);
        this.tail = new Tail(sizeOfTailInCM, isAlive, name);
    }

    public Annelids(String name, int currentAgeInYears, double ageInyears, double weightOfBrain, String colorOfHeart, double mouthSizeInInches, 
    int sizeOfTailInCM){
        super(name, currentAgeInYears, true,weightOfBrain);

        this.mouth = new Mouth(name, mouthSizeInInches, true );
        this.heart = new Heart(colorOfHeart,true);
        this.tail = new Tail(sizeOfTailInCM, true, name);
    }

    public Annelids(String name, int currentAgeInYears, boolean isAlive, double weightOfBrain, String colorOfHeart){
        super(name, currentAgeInYears, isAlive,weightOfBrain);
        this.mouth = new Mouth(isAlive);
        this.heart = new Heart(colorOfHeart);
        this.tail = new Tail(10, true, "tail");
    }
    //methods
    @Override
    public String toString(){
        String message = "This Annelid is currently ";
        if(this.heart.getIsWorking())
            message += "alive.";
        else
            message += "dead.";

        message+= "/n" + "The heart is";
        if(this.mouth.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message+= "/n" + "The tail is";
        if(this.tail.getIsWorking())
            message += "working.";
        else
            message += "not working.";

        message+= "/n" + "The heart is";
        if(this.heart.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        return message;
    }

    public Mouth getMouth(){
        return this.mouth;
    }

    public Heart getHeart(){
        return this.heart;
    }

    public Tail getTail(){
        return this.tail;
    }

    
    
    
    
    
    
}
