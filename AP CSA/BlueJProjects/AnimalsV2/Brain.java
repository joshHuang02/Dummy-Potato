// Chelsea Wu and Zayn Saddique
// FIXED: Issue with no unit of measure in weight

public class Brain extends AnimalPart

{
    //instance variables
    private double weightInPounds;

    //2 constructors (overloaded)
    public Brain(double weightInPounds) {
        super("brain", true);
        this.weightInPounds = weightInPounds;
    }

    public Brain(double weightInPounds, boolean isWorking) {
        super("brain", isWorking);
        this.weightInPounds = weightInPounds;
    }

    //methods
    @Override
    public String action1()
    {
        return sendSignals();
    }

    public String sendSignals() {
        if(getIsWorking())
        {
            if(((int) (Math.random()*100)+1)>90)
            {
                return injure() + " The brain cannot send signals at this time.";

            }
            return "The brain has sent signals.";
        }
        else
        {
            return "The brain does not send signals.";
        }
    }

    @Override
    public String toString()
    {
        String message = "Hi! I'm the " + getNameOfPart() + "! I'm the child class.";
        if(getIsWorking()){
            message+= "The brain is currently working. ";
        }else{
            message+= "The brain isn't working. ";
        }
        message += "I weigh "+this.weightInPounds+" pounds.";
        return message;
    }

    public String injure() {
        setIsWorking(false);
        return "The brain is injured.";
    }

    public String heal() {
        if(getIsWorking()) {
            return "The brain was already working fine.";
        }
        else {
            setIsWorking(true);
            return "The brain has been healed and is now working.";
        } 
    }

    public double getWeightInPounds() {
        return this.weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
}
