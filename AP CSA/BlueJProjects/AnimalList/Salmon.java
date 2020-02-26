//Justin Zhang
public class Salmon extends Fish
{
    public Salmon(String colorEye, int lengthGillInCm, int lengthMouthInInches, String colorHeart, int lengthTailInCm, 
    String name, double currentAgeInYears, double weightOfBrain, boolean isAlive, boolean isWorking)
    {
        super(colorEye, lengthGillInCm, lengthMouthInInches, colorHeart, lengthTailInCm, name, currentAgeInYears, weightOfBrain,
        isAlive, isWorking);
    }

    public Salmon(String colorEye, int lengthGillInCm, int lengthMouthInInches, String colorHeart, int lengthTailInCm, 
    String name, double currentAgeInYears, double weightOfBrain)
    {
        super(lengthGillInCm, lengthMouthInInches, lengthTailInCm, name, currentAgeInYears, weightOfBrain);
    }

    @Override
    public String toString()
    {
        String message = getName()+ " is ";
        if(getIsAlive())
            message += "alive";
        else
            message += "not alive";

        message += ".\n   The left gill is " + getLeftGill().getLengthInCm() +" centimeters long and is ";
        if(getLeftGill().getIsWorking())
            message += "breathing";
        else
            message += "not breathing";

        message += ".\n   The right gill is " + getRightGill().getLengthInCm() +" centimeters long and is ";
        if(getRightGill().getIsWorking())
            message += "breathing";
        else
            message += "not breathing";

        message += ".\n   The left eye is " + getLeftEye().getColor() +" and is ";
        if(getLeftEye().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The right eye is " + getRightEye().getColor() +" and is ";
        if(getRightEye().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The tail is "+getTail().getLengthInCm()+" centimeters long and is ";
        if(getTail().getIsWorking())
            message += "working";
        else
            message += "not working";

        message += ".\n   The heart is " + getHeart().getColor() +" and is ";
        if(getHeart().getIsWorking())
            message += "beating";
        else
            message += "not beating";

        message += ".\n   The mouth is "+getMouth().getMouthSizeInInches()+" inches long and is ";
        if(getMouth().getIsWorking())
            message += "functioning";
        else
            message += "not functioning";

        message += ".\n   The brain is "+getBrain().getWeightInPounds()+" pounds and is ";
        if(getMouth().getIsWorking())
            message += "sending signals";
        else
            message += "not sending signals";

        return message;
    }

    @Override
    public String weakAction()
    {
        return swim();
    }

    @Override
    public String normalAction()
    {
        return eat();
    }

    @Override
    public String strongAction()
    {
        return jump();
    }

    public String swim()
    {
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking() || !getLeftGill().getIsWorking() || !getRightGill().getIsWorking() 
        || !getTail().getIsWorking())
        {
            return getName()+ " is dead and cannot swim.";
        }
        return getName() + " swims. " + getHeart().beat() + " " + getBrain().sendSignals() + " " + getLeftGill().breathe() + " " 
        + getRightGill().breathe() +  " " + getTail().wag();
    }

    public String eat()
    {
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking() || !getLeftGill().getIsWorking() || !getRightGill().getIsWorking() 
        || !getMouth().getIsWorking())
        {
            return getName()+ " is dead and cannot eat.";
        }
        return getName() + " eats." + getHeart().beat() + " " + getBrain().sendSignals() + " " + getLeftGill().breathe() + " " 
        + getRightGill().breathe() + " " + getMouth().eat();
    }

    public String jump()
    {
        if(!getHeart().getIsWorking() || !getBrain().getIsWorking() || !getLeftGill().getIsWorking() || !getRightGill().getIsWorking() 
        || !getTail().getIsWorking() || !getLeftEye().getIsWorking() || !getRightEye().getIsWorking())
        {
            return getName()+ " is dead and cannot jump.";
        }
        return getName() + " jumps." + getHeart().beat() + " " + getBrain().sendSignals() + " " + getLeftGill().breathe() + " " + 
        getRightGill().breathe() + " " + getTail().wag() + " " + getLeftEye().blink() + " " + getRightEye().blink();
    }

    @Override
    public String revive()
    {
        setIsAlive(true);
        goToFishHospital();
        return getName() + " has been brought back to life.";
    }

    public String goToFishHospital()
    {
        return getLeftEye().heal() + " " + getRightEye().heal() + " " + getHeart().heal() + " " + getBrain().heal() + " " + 
        getLeftGill().heal() + " " + getRightGill().heal() + " " + getMouth().heal() + " " + getTail().heal();
    }
}
