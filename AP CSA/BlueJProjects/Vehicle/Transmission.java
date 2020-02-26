public class Transmission extends CarComponent{
    // instance variables
    private int numberOfPlanetGear;
    private int numberOfRingGear;
    private int numberOfSunGear;
    private int numberOfPlanetaryGearSet;
    private double gearRatio;
    private double amountOfTransmissionFluidInQuarts;
    private boolean valveBodyIsWorking;
    private boolean sensorIsWorking;
    private boolean clutchesAndBandsIsWorking;
    private boolean torqueConverterIsWorking;
    private boolean planetaryGearSetIsWorking;
    private boolean sunGearIsWorking;
    private boolean planetGearIsWorking;
    private boolean ringGearIsWorking;
    private boolean pumpIsWorking;
    
    //damage and fix are the heal and injure
    
    //constructors
    public Transmission(int numberOfPlanetGear, int numberOfRingGear, int numberOfSunGear, int numberOfPlanetaryGearSet, double gearRatio, 
    double amountOfTransmissionFluidInQuarts, boolean valveBodyIsWorking, boolean sensorIsWorking, boolean clutchesAndBandsIsWorking, 
    boolean torqueConverterIsWorking, boolean planetaryGearSetIsWorking, boolean sunGearIsWorking,
    boolean planetGearIsWorking, boolean ringGearIsWorking, boolean pumpIsWorking, boolean isWorking){
        super("transmission", isWorking);
        this.numberOfPlanetGear = numberOfPlanetGear;
        this.numberOfRingGear = numberOfRingGear;
        this.numberOfSunGear= numberOfSunGear;
        this.numberOfPlanetaryGearSet = numberOfPlanetaryGearSet;
        this.gearRatio = gearRatio;
        this.amountOfTransmissionFluidInQuarts = amountOfTransmissionFluidInQuarts;
        this.valveBodyIsWorking = valveBodyIsWorking;
        this.sensorIsWorking = sensorIsWorking;
        this.clutchesAndBandsIsWorking = clutchesAndBandsIsWorking;
        this.torqueConverterIsWorking = torqueConverterIsWorking;
        this.planetaryGearSetIsWorking = planetaryGearSetIsWorking;
        this.sunGearIsWorking = sunGearIsWorking;
        this.planetGearIsWorking = planetGearIsWorking;
        this.ringGearIsWorking = ringGearIsWorking;
        this.pumpIsWorking = pumpIsWorking;
    }
    
    public Transmission(int numberOfPlanetGear, int numberOfRingGear, int numberOfSunGear, int numberOfPlanetaryGearSet, double gearRatio, 
    double amountOfTransmissionFluidInQuarts, boolean isWorking){
        super("transmission", isWorking);
        this.numberOfPlanetGear = numberOfPlanetGear;
        this.numberOfRingGear = numberOfRingGear;
        this.numberOfSunGear= numberOfSunGear;
        this.numberOfPlanetaryGearSet = numberOfPlanetaryGearSet;
        this.gearRatio = gearRatio;
        this.amountOfTransmissionFluidInQuarts = amountOfTransmissionFluidInQuarts;
        if(isWorking){
            this.valveBodyIsWorking = true;
            this.sensorIsWorking = true;
            this.clutchesAndBandsIsWorking = true;
            this.torqueConverterIsWorking = true;
            this.planetaryGearSetIsWorking = true;
            this.sunGearIsWorking = true;
            this.planetGearIsWorking = true;
            this.ringGearIsWorking = true;
        }
        else{
            this.valveBodyIsWorking = false;
            this.sensorIsWorking = false;
            this.clutchesAndBandsIsWorking = false;
            this.torqueConverterIsWorking = false;
            this.planetaryGearSetIsWorking = false;
            this.sunGearIsWorking = false;
            this.planetGearIsWorking = false;
            this.ringGearIsWorking = false;
        }
    }
    
    public Transmission(int numberOfPlanetaryGearSet, boolean isWorking){
        super("transmission", isWorking);
        this.numberOfPlanetGear = 2 * numberOfPlanetaryGearSet;
        this.numberOfRingGear = 1 * numberOfPlanetaryGearSet;
        this.numberOfSunGear = 1 * numberOfPlanetaryGearSet;
        this.numberOfPlanetaryGearSet = numberOfPlanetaryGearSet;
        this.gearRatio = 1.2;
        this.amountOfTransmissionFluidInQuarts = 14;
        if(isWorking){
            this.valveBodyIsWorking = true;
            this.sensorIsWorking = true;
            this.clutchesAndBandsIsWorking = true;
            this.torqueConverterIsWorking = true;
            this.planetaryGearSetIsWorking = true;
            this.sunGearIsWorking = true;
            this.planetGearIsWorking = true;
            this.ringGearIsWorking = true;
        }
        else{
            this.valveBodyIsWorking = false;
            this.sensorIsWorking = false;
            this.clutchesAndBandsIsWorking = false;
            this.torqueConverterIsWorking = false;
            this.planetaryGearSetIsWorking = false;
            this.sunGearIsWorking = false;
            this.planetGearIsWorking = false;
            this.ringGearIsWorking = false;
        }
    }
    
    
    
    //methods
    public void updateIsWorking(){
        if(getIsWorking()){
            this.valveBodyIsWorking = true;
            this.sensorIsWorking = true;
            this.clutchesAndBandsIsWorking = true;
            this.torqueConverterIsWorking = true;
            this.planetaryGearSetIsWorking = true;
            this.sunGearIsWorking = true;
            this.planetGearIsWorking = true;
            this.ringGearIsWorking = true;
        }
        else{
            this.valveBodyIsWorking = false;
            this.sensorIsWorking = false;
            this.clutchesAndBandsIsWorking = false;
            this.torqueConverterIsWorking = false;
            this.planetaryGearSetIsWorking = false;
            this.sunGearIsWorking = false;
            this.planetGearIsWorking = false;
            this.ringGearIsWorking = false;
        }
    }

    public void updateTransmissionComponents(){
        if(sunGearIsWorking && planetGearIsWorking && ringGearIsWorking){
            this.planetaryGearSetIsWorking = true;
        }
        else{
            this.planetaryGearSetIsWorking = false;
        }
        
        if(valveBodyIsWorking && sensorIsWorking && clutchesAndBandsIsWorking && torqueConverterIsWorking && planetaryGearSetIsWorking){
            setIsWorking(true);
        }
        else{
            setIsWorking(false);
        }
    }
    
    @Override
    public String damage(){
        setIsWorking(false);
        updateIsWorking();
        return "The transmission is not working.";
    }
    
    @Override
    public String fix(){
        setIsWorking(true);
        updateIsWorking();
        return "The transmission is working.";
    }
    
    
    @Override
    public String action1(){
        return runTransmission();
    }
    
    @Override
    public String action2(){
        return rotateGears();
    }
    
    
    public String runTransmission(){
        updateTransmissionComponents();
        updateIsWorking();
        if((amountOfTransmissionFluidInQuarts > 10) && valveBodyIsWorking && clutchesAndBandsIsWorking && torqueConverterIsWorking && planetaryGearSetIsWorking && pumpIsWorking && getIsWorking()){
            if(!super.conditionalCheck()){
                // chance of transmission breaking down despite everything working
                return "The transmission failed to run.\n";
            }
            else{
                // transmission working fine
                return "The transmission ran.\n";
            }
        }
        else{
            // transmission not running at all
            return "The transmission cannot function.\n";
        }
    }
    
    public String rotateGears(){
        updateTransmissionComponents();
        updateIsWorking();
        if((amountOfTransmissionFluidInQuarts > 10) && planetaryGearSetIsWorking){
            if(!super.conditionalCheck()){
                // chance of gears breaking down
                return "The transmission failed to rotate its gears.\n";
            }
            else{
                // gears working fine
                return "The transmission rotated its gears.\n";
            }
        }
        else{
            return "The transmission cannot rotate its gears.\n";
        }
    }
    
    @Override
    public String toString(){
        String message = "";
        if(getIsWorking()){
            message += "The transmission is working.\n";
        }
        else{
            message += "The transmission is not working.\n";
        }
        if(numberOfPlanetGear == 1){
            message += "   The transmission has one planet gear.\n";
        }
        else{
            message += "   The transmission has " + numberOfPlanetGear + " planet gears.\n";
        }
        if(numberOfRingGear == 1){
            message += "   The transmission has one ring gear.\n";
        }
        else{
            message += "   The transmission has " + numberOfRingGear + " ring gears.\n";
        }
        if(numberOfSunGear == 1){
            message += "   The transmission has one sun gear.\n";
        }
        else{
            message += "   The transmission has " + numberOfSunGear + " sun gears.\n";
        }
        if(numberOfPlanetaryGearSet == 1){
            message += "   The transmission has one planatary gear set.\n";
        }
        else{
            message += "   The transmission has " + numberOfPlanetaryGearSet + " planetary gear sets.\n";
        }
        message += "   The transmission gear ratio is " + gearRatio + ".\n";
        if(amountOfTransmissionFluidInQuarts == 1){
            message += "   The transmission has one quart of transmission fluid.\n";
        }
        else{
            message += "   The transmission has " + amountOfTransmissionFluidInQuarts + " quarts of transmission fluid.\n";
        }
        if(valveBodyIsWorking){
            message += "   The valve body is working.\n"; 
        }
        else{
            message += "   The valve body is not working.\n";
        }
        if(sensorIsWorking){
            message += "   The sensor is working.\n"; 
        }
        else{
            message += "   The sensor is not working.\n";
        }
        if(clutchesAndBandsIsWorking){
            message += "   The clutches and bands are working.\n"; 
        }
        else{
            message += "   The clutches and bands are not working.\n";
        }
        if(torqueConverterIsWorking){
            message += "   The torque converter is working.\n"; 
        }
        else{
            message += "   The torque converter is not working.\n";
        }
        if(planetaryGearSetIsWorking){
            message += "   The planetary gear set is working.\n"; 
        }
        else{
            message += "   The planetary gear set is not working.\n";
        }
        if(sunGearIsWorking){
            message += "   The sun gear is working.\n"; 
        }
        else{
            message += "   The sun gear is not working.\n";
        }
        if(planetGearIsWorking){
            message += "   The planet gear is working.\n"; 
        }
        else{
            message += "   The planet gear is not working.\n";
        }
        if(ringGearIsWorking){
            message += "   The ring gear is working.\n"; 
        }
        else{
            message += "   The ring gear is not working.\n";
        }
        if(pumpIsWorking){
            message += "   The pump is working.\n"; 
        }
        else{
            message += "   The pump is not working.\n";
        }
        
        return message;
    }
    public void setNumberOfPlanetGear(int number){
        this.numberOfPlanetGear = number;
    }
    public int getNumberOfPlanetGear(){
        return this.numberOfPlanetGear;
    }
    
    public void setNumberOfRingGear(int number){
        this.numberOfRingGear = number;
    }
    public int getNumberOfRingGear(){
        return this.numberOfRingGear;
    }
    
    public void setNumberOfSunGear(int number){
        this.numberOfSunGear = number;
    }
    public int getNumberOfSunGear(){
        return this.numberOfSunGear;
    }
    
    public void setNumberOfPlanetaryGearSet(int number){
        this.numberOfPlanetaryGearSet = number;
    }
    public int getNumberOfPlanetaryGearSet(){
        return this.numberOfPlanetaryGearSet;
    }
    
    public void getGearRatio(double ratio){
        this.gearRatio = ratio;
    }
    public double getGearRatio(){
        return this.gearRatio;
    }
    
    public void getAmountOfTransmissionFluidInQuarts(double amount){
        this.amountOfTransmissionFluidInQuarts = amount;
    }
    public double getAmountOfTransmissionFluidInQuarts(){
        return this.amountOfTransmissionFluidInQuarts;
    }
    
    public void setValveBodyIsWorking(boolean working){
        this.valveBodyIsWorking = working;
    }
    public boolean getValveBodyIsWorking(){
        return this.valveBodyIsWorking;
    }
    
    public void setSensorIsWorking(boolean working){
        this.sensorIsWorking = working;
    }
    public boolean getSensorIsWorking(){
        return this.sensorIsWorking;
    }
    
    public void setClutchesAndBandsIsWorking(boolean working){
        this.clutchesAndBandsIsWorking = working;
    }
    public boolean getClutchesAndBandsIsWorking(){
        return this.clutchesAndBandsIsWorking;
    }
    
    public void setTorqueConverterIsWorking(boolean working){
        this.torqueConverterIsWorking = working;
    }
    public boolean getTorqueConverterIsWorking(){
        return this.torqueConverterIsWorking;
    }
    
    public void setPlanetaryGearSetIsWorking(boolean working){
        this.planetaryGearSetIsWorking = working;
    }
    public boolean getPlanetaryGearSetIsWorking(){
        return this.planetaryGearSetIsWorking;
    }
    
    public void setSunGearIsWorking(boolean working){
        this.sunGearIsWorking = working;
    }
    public boolean getSunGearIsWorking(){
        return this.sunGearIsWorking;
    }
    
    public void setPlanetGearIsWorking(boolean working){
        this.planetGearIsWorking = working;
    }
    public boolean getPlanetGearIsWorking(){
        return this.planetGearIsWorking;
    }
    
    public void setRingGearIsWorking(boolean working){
        this.ringGearIsWorking = working;
    }
    public boolean getRingGearIsWorking(){
        return this.ringGearIsWorking;
    }
    
}

