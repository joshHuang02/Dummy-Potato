
public class GasPedal extends CarComponent
{
    private double surfaceAreaInInchesSquared;
    public GasPedal(String nameOfComponent, boolean isWorking, double surfaceAreaInInchesSquared, double chanceOfFailure)
    {
        super(nameOfComponent, isWorking, chanceOfFailure);
        this.surfaceAreaInInchesSquared = surfaceAreaInInchesSquared;
    }
    public GasPedal(String nameOfComponent, boolean isWorking, double surfaceAreaInInchesSquared)
    {
        super(nameOfComponent, isWorking);
        this.surfaceAreaInInchesSquared = surfaceAreaInInchesSquared;
    }
    @Override
	public String toString() {
	String message = getNameOfComponent() + "is ";
	if(getIsWorking()) 
	{
	    message += "workng";
	}
	else 
	{
	    message+= "not working"; 
	}
	message += "\n    " + "The surface area of " + getNameOfComponent() + " is " + getSurfaceAreaInInchesSquared() + " inches squared";
	return message;
    }
    public String accelerate()
    {
        if(getIsWorking()){
            if(!super.conditionalCheck())
            {
                setIsWorking(false);
                return getNameOfComponent() + " does not accelerate.";
            }
            else
            {
                return getNameOfComponent() + " accelerates.";
            }
        }
        return getNameOfComponent() + " does not accelerate.";
    }
    public String decelerate()
    {
        if(getIsWorking()){
            if(!super.conditionalCheck())
            {
                setIsWorking(false);
                return getNameOfComponent() + " does not decelerate.";
            }
            else
            {
                return getNameOfComponent() + " decelerates.";
            }
        }
        return getNameOfComponent() + " does not decelerate.";
    }
    @Override
    public String action1()
    {
        return accelerate();
    }
    @Override
    public String action2()
    {
        return decelerate();
    }
    @Override
    public String fix()
    {
        String message = "";
        setIsWorking(true);
        if(!getIsWorking())
        {
            message+=getNameOfComponent() + " has been fixed";
        }
        return message;
    }
    @Override
    public String damage()
    {
        setIsWorking(false);
        return getNameOfComponent() + " has ben damaged and does not work";
    }
    public void setSurfaceAreaInInchesSquared(double surfaceAreaInInchesSquared)
    {
        this.surfaceAreaInInchesSquared = surfaceAreaInInchesSquared;
    }
    public double getSurfaceAreaInInchesSquared()
    {
        return surfaceAreaInInchesSquared;
    }
}
