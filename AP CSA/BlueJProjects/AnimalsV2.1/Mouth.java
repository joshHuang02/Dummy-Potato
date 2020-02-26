// Mingyu Liu and Casey Hong
// Removed 2 constructors
// FIXED: Issue with action1 not using eat()

public class Mouth extends AnimalPart{
    private double mouthSizeInInches;

    public Mouth(String nameOfPart, double mouthSizeInInches,boolean isWorking){
        super(nameOfPart, isWorking);
        this.mouthSizeInInches = mouthSizeInInches;
    }

    public Mouth(boolean isWorking){  
        super("Mouth", isWorking);
        this.mouthSizeInInches = 0;
    }

    public String eat()
    {
        if(getIsWorking()){
            if(((int)(Math.random()*100))+1>70)
            {
                return injure() + getNameOfPart() +" can not eat.";
            }
            return getNameOfPart() +" eats.";
        }
        else
        {
            return getNameOfPart() + " does not eat.";
        }
    }

    @Override
    public String action1()
    {
        return eat();
    }

    @Override
    public String injure()
    {
        setIsWorking(false);
        return getNameOfPart() +" is injured.";
    }

    @Override
    public String heal()
    {
        if(getIsWorking())
        {
            return getNameOfPart() +" was already fine and does not need healing.";
        }
        else
        {
            setIsWorking(true);
            return getNameOfPart() +" was healed and is now working.";
        }
    }

    @Override
    public String toString()
    {
        String message = "";
        if(getIsWorking())
        {
            return getNameOfPart() +" is working";
        }
        else
            return getNameOfPart() +" is not working";
    }

    public double getMouthSizeInInches(){
        return this.mouthSizeInInches;
    }

    public void setMouthSizeInInches(double mouthSizeInInches){
        this.mouthSizeInInches=mouthSizeInInches;
    }
}