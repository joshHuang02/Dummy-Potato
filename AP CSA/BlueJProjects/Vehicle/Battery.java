/**
 * Battery component
 *
 * @author Andrew Tarng
 * @version 2/3/2020
 */
public class Battery extends CarComponent
{
    //instance variables
    private String color;
    private int batteryCapacityInYears;
    private double voltageInVolts;

    //constructor(s)
    public Battery(String name, String color, int batteryCapacityInYears, double voltageInVolts, boolean isWorking)
    {
        super(name, isWorking);
        this.color = color;
        this.batteryCapacityInYears = batteryCapacityInYears;
        this.voltageInVolts = voltageInVolts;
    }
    
    public Battery(String color, int batteryCapacityInYears, double voltageInVolts)
    {
        super("battery", true);
        this.color = color;
        this.batteryCapacityInYears = batteryCapacityInYears;
        this.voltageInVolts = voltageInVolts;
    }
    
    //methods, accessors, mutators
    @Override
    public String action1()
    {
        return generateElectricityInVolts();
    }
    
    @Override
    public String action2()
    {
        return poweredOn();
    }
    
    @Override
    public String toString()
    {
        String message = "";
        
        message += "The " + getNameOfComponent() + " is";
        if(getIsWorking())
            message += " working";
        else
            message += " not working";
        return message;
    }
    
    public String generateElectricityInVolts()
    {
        if(getIsWorking())
        {
            if(!super.conditionalCheck())
            {
                return "The " + getNameOfComponent() + " can't generate electricity";
            }
            return "The " + getNameOfComponent() + " generates electricity";
        }
        else
            {
                return "The " + getNameOfComponent() + " can't generate electricity";
            }
    }
    
    public String poweredOn()
    {
        if(getIsWorking())
        {
            if(!super.conditionalCheck())
            {
                return "The " + getNameOfComponent() + " can't power on";
            }
            return "The " + getNameOfComponent() + " powers on";
        }
        else
            {
                return "The " + getNameOfComponent() + " can't power on";
            }
    }
    
    @Override
    public String damage()
    {
        setIsWorking(false);
        return "The " + getNameOfComponent() + " is overheated and cannot run";
    }
    
    @Override
    public String fix()
    {
        if(getIsWorking())
        return "The " + getNameOfComponent() + " was already fine.";
        else{
            setIsWorking(true);
            return "The " + getNameOfComponent() + " is now working";
        }
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setBatteryCapacityInYears(int batteryCapacityInYears)
    {
        this.batteryCapacityInYears = batteryCapacityInYears;
    }
    
    public int getBatteryCapacityInYears()
    {
        return this.batteryCapacityInYears;
    }
    
    public void setVoltageInVolts(double voltageInVolts)
    {
        this.voltageInVolts = voltageInVolts;
    }
    
    public double getVoltageInVolts()
    {
        return this.voltageInVolts;
    }
}