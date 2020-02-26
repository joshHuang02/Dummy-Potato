public class Animal
{
    // instance variables
    private String name;
    private double currentAgeInYears;
    private boolean isAlive;
    private Brain brain;

    // constructors
    public Animal(String name, double currentAgeInYears, boolean isAlive, double weightOfBrain)
    {
        this.name = name;
        if(currentAgeInYears<=0) 
        {
            currentAgeInYears = 0;
            isAlive = false;
        }
        if(weightOfBrain<=0) 
        {
            weightOfBrain = 0;
            isAlive = false;
        }
        this.currentAgeInYears = currentAgeInYears;
        this.isAlive = isAlive;
        this.brain = new Brain(weightOfBrain, isAlive);
    }
    public Animal(String name, double currentAgeInYears, double weightOfBrain)
    {
        this.name = name;
        if(currentAgeInYears<=0) 
        {
            currentAgeInYears = 0;
            isAlive = false;
        }
        if(weightOfBrain<=0) 
        {
            weightOfBrain = 0;
            isAlive = false;
        }
        this.currentAgeInYears = currentAgeInYears;
        this.isAlive = true;
        this.brain = new Brain(weightOfBrain, true);
    }

    // methods
    public String weakAction()
    {
        return "";
    }
    public String normalAction()
    {
        return "";
    }
    public String strongAction()
    {
        return "";
    }
    public String revive()
    {
        setIsAlive(true);
        return "";
    }
    @Override
    public String toString()
    {
        String message = "This "+this.name+" is currently ";
        if(isAlive)
            message += "alive";
        else
            message += "dead";
        message += ".\n   Brain: weighs "+this.brain.getWeightInPounds()+" lbs and is ";
        
        if(this.brain.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        
        return message;
    }
    // Methods: Getters and Setters
    public String getName()
    {
        return this.name;
    }

    public double getCurrentAgeInYears()
    {
        return this.currentAgeInYears;
    }

    public boolean getIsAlive()
    {
        return this.isAlive;
    }

    public Brain getBrain()
    {
        return this.brain;
    }
    
    public String setName(String name)
    {
        if (this.name.equals(name))
            return "The name was not updated since it was the same.";

        this.name = name;
        return "The name has been updated to " + name + ".";
    }

    public String setCurrentAgeInYears(double currentAgeInYears)
    {
        if (this.currentAgeInYears == currentAgeInYears)
            return "The current age was not updated since it was the same.";

        if (currentAgeInYears<=0)
            return "Current age can not be set because given value was negative.";

        this.currentAgeInYears = currentAgeInYears;
        return "The current age has been updated to " + currentAgeInYears + ".";
    }

    public String setIsAlive(boolean isAlive)
    {
        if (this.isAlive == isAlive)
            return "isAlive was not updated since it was the same.";

        this.isAlive = isAlive;
        this.brain.setIsWorking(isAlive);

        if (isAlive)
            return "The status of the animal's well being has been updated to alive";
        else
            return "The status of the animal's well being has been updated to dead.";
    }

}
