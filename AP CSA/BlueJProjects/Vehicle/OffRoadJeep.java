/**
 * Write a description of class OffRoadJeep here.
 *
 * @author Ivy Zhao
 * @version 02/06/2020
 */
public class OffRoadJeep extends Vehicle
{
    private Wheel wheel1, wheel2, wheel3, wheel4, spareWheel;
    private Door door1, door2, door3, door4;
    private Axle axle;
    private Seat seat1, seat2, seat3, seat4, seat5;
    private Headlight rightHeadlight;
    private Headlight leftHeadlight;
    private Trunk trunk;
    private CarComponent[] arr = new CarComponent[18];

    public OffRoadJeep (String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
                        double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
                        double crashPotentialPercentage, String nameOfEngine, int numberOfEngineCylinders,
                        int engineTemperatureInFahrenheit, boolean engineIsWorking, double engineChanceOfFailure,
                        String nameOfSteeringWheel, boolean steeringWheelIsWorking, double steeringWheelChanceOfFailure,
                        String steeringWheelType, double steeringWheelDiameterInInches, String nameOfBattery, String batteryColor,
                        int batteryCapacityInYears, double batteryVoltageInVolts, boolean batteryIsWorking, String nameOfFuelTank,
                        boolean fuelTankIsWorking, int fuelTankOilInGallons, double fuelTankCapacity, String nameOfBrake,
                        int brakeDiscSizeInInches, double brakePadThicknessInInches, boolean brakeIsWorking,
                        double brakeChanceOfFailure, int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear,
                        int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet, double transmissionGearRatio,
                        double transmissionAmountOfTransmissionFluidInQuarts, boolean transmissionValveBodyIsWorking,
                        boolean transmissionSensorIsWorking, boolean transmissionClutchesAndBandsIsWorking,
                        boolean transmissionTorqueConverterIsWorking, boolean transmissionPlanetaryGearSetIsWorking,
                        boolean transmissionSunGearIsWorking, boolean transmissionPlanetGearIsWorking,
                        boolean transmissionRingGearIsWorking, boolean transmissionPumpIsWorking, boolean transmissionIsWorking,
                        String nameOfGasPedal, boolean gasPedalIsWorking, double gasPedalSurfaceAreaInInches, String nameOfRadiator,
                        double radiatorTemperatureOfRadiatorFahrenheit, boolean radiatorIsWorking,
                        double radiatorWaterLevelInInches,

                        int tirePressureInPSI, int rimDiameterInInches, boolean isOpen, int tintPercentage, boolean isLocked, double thicknessInInches,
                        double lengthInInches, int seatBeltLengthInInches, int reclineBackwardsInInches,  String bulbType, double bulbLengthInInches, double windowLengthInInches,
                        int diameterInFeet, boolean isWorking, boolean windowOpen, int chanceOfFailure)
    {
        super(color, nameOfCar, typeOfCar, fuelType, weightInPounds,  lengthInFeet, maxSpeedMph, costOfCarInDollars,  carIsWorking, crashPotentialPercentage,
                 nameOfEngine,  numberOfEngineCylinders,  engineTemperatureInFahrenheit,  engineIsWorking, engineChanceOfFailure, nameOfSteeringWheel, steeringWheelIsWorking,
                steeringWheelChanceOfFailure, steeringWheelType, steeringWheelDiameterInInches, nameOfBattery,  batteryColor,  batteryCapacityInYears, batteryVoltageInVolts, batteryIsWorking,
                nameOfFuelTank,fuelTankIsWorking, fuelTankOilInGallons, fuelTankCapacity, nameOfBrake,brakeDiscSizeInInches, brakePadThicknessInInches,
                brakeIsWorking, brakeChanceOfFailure, transmissionNumberOfPlanetGear, transmissionNumberOfRingGear, transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts, transmissionValveBodyIsWorking, transmissionSensorIsWorking,
                transmissionClutchesAndBandsIsWorking, transmissionTorqueConverterIsWorking, transmissionPlanetaryGearSetIsWorking, transmissionSunGearIsWorking,
                transmissionPlanetGearIsWorking, transmissionRingGearIsWorking, transmissionPumpIsWorking, transmissionIsWorking, nameOfGasPedal, gasPedalIsWorking,
                gasPedalSurfaceAreaInInches, nameOfRadiator, radiatorTemperatureOfRadiatorFahrenheit, radiatorIsWorking, radiatorWaterLevelInInches);
        wheel1 = new Wheel("wheel1", tirePressureInPSI, rimDiameterInInches, isWorking);
        wheel2 = new Wheel("wheel2", tirePressureInPSI, rimDiameterInInches, isWorking);
        wheel3 = new Wheel("wheel3", tirePressureInPSI, rimDiameterInInches, isWorking);
        wheel4 = new Wheel("wheel4", tirePressureInPSI, rimDiameterInInches, isWorking);
        spareWheel = new Wheel("spare wheel", tirePressureInPSI, rimDiameterInInches, isWorking);
        door1 = new Door(isOpen, tintPercentage, isLocked, isWorking, windowOpen, "door1");
        door2 = new Door(isOpen, tintPercentage, isLocked, isWorking, windowOpen, "door2");
        door3 = new Door(isOpen, tintPercentage, isLocked, isWorking, windowOpen, "door3");
        door4 = new Door(isOpen, tintPercentage, isLocked, isWorking, windowOpen, "door4");
        axle = new Axle("axle", isWorking, thicknessInInches, lengthInInches);
        seat1 = new Seat("seat1", isWorking, seatBeltLengthInInches,reclineBackwardsInInches, chanceOfFailure);
        seat2 = new Seat("seat2", isWorking, seatBeltLengthInInches,reclineBackwardsInInches, chanceOfFailure);
        seat3 = new Seat("seat3", isWorking, seatBeltLengthInInches,reclineBackwardsInInches, chanceOfFailure);
        seat4 = new Seat("seat4", isWorking, seatBeltLengthInInches,reclineBackwardsInInches, chanceOfFailure);
        seat5 = new Seat("seat5", isWorking, seatBeltLengthInInches,reclineBackwardsInInches, chanceOfFailure);
        rightHeadlight = new Headlight("right headlight", isWorking,chanceOfFailure, bulbType, color, bulbLengthInInches, windowLengthInInches);
        leftHeadlight = new Headlight("left headlight", isWorking,chanceOfFailure, bulbType, color, bulbLengthInInches, windowLengthInInches);
        trunk = new Trunk("trunk", diameterInFeet, isWorking,chanceOfFailure);
        arr[0] = wheel1;
        arr[1] = wheel2;
        arr[2] = wheel3;
        arr[3] = wheel4;
        arr[4] = spareWheel;
        arr[5] = door1;
        arr[6] = door2;
        arr[7] = door3;
        arr[8] = door4;
        arr[9] = axle;
        arr[10] =seat1;
        arr[11] =seat2;
        arr[12] =seat3;
        arr[13] =seat4;
        arr[14] =seat5;
        arr[15] =rightHeadlight;
        arr[16] =leftHeadlight;
        arr[17] =trunk;
    }

    public OffRoadJeep (String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
                        double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
                        double crashPotentialPercentage, int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
                        String steeringWheelType, double steeringWheelDiameterInInches, String batteryColor,
                        int batteryCapacityInYears, double batteryVoltageInVolts, int fuelTankOilInGallons, int fuelTankCapacity,
                        int brakeDiscSizeInInches, double brakePadThicknessInInches, int transmissionNumberOfPlanetGear,
                        int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                        double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
                        double gasPedalSurfaceAreaInInches, double radiatorTemperatureOfRadiatorFahrenheit,
                        double radiatorWaterLevelInches, int reclineBackwardsInInches, int chanceOfFailure,

                        int tirePressureInPSI, int rimDiameterInInches, int tintPercentage, boolean isLocked, double thicknessInInches,
                        double lengthInInches, int seatBeltLengthInInches, String bulbType, double bulbLengthInInches, double windowLengthInInches,
                        int diameterInFeet)
    {
            super(color, nameOfCar, typeOfCar, fuelType,
                     weightInPounds,  lengthInFeet, maxSpeedMph,
                     costOfCarInDollars,  carIsWorking,
                     crashPotentialPercentage,
                     numberOfEngineCylinders,  engineTemperatureInFahrenheit,
                     steeringWheelType, steeringWheelDiameterInInches,
                     batteryColor,batteryCapacityInYears,batteryVoltageInVolts,
                     fuelTankOilInGallons,  fuelTankCapacity,
                     brakeDiscSizeInInches,  brakePadThicknessInInches,
                     transmissionNumberOfPlanetGear,  transmissionNumberOfRingGear,  transmissionNumberOfSunGear,  transmissionNumberOfPlanetaryGearSet,
                     transmissionGearRatio,  transmissionAmountOfTransmissionFluidInQuarts,
                     gasPedalSurfaceAreaInInches,
                     radiatorTemperatureOfRadiatorFahrenheit,  radiatorWaterLevelInches);
        wheel1 = new Wheel("wheel1", tirePressureInPSI, rimDiameterInInches, true);
        wheel2 = new Wheel("wheel2", tirePressureInPSI, rimDiameterInInches, true);
        wheel3 = new Wheel("wheel3", tirePressureInPSI, rimDiameterInInches, true);
        wheel4 = new Wheel("wheel4", tirePressureInPSI, rimDiameterInInches, true);
        spareWheel = new Wheel("spare wheel", tirePressureInPSI, rimDiameterInInches, true);
        door1 = new Door(true, tintPercentage, isLocked, true, true,"door1");
        door2 = new Door(true, tintPercentage, isLocked, true, true,"door2");
        door3 = new Door(true, tintPercentage, isLocked, true, true,"door3");
        door4 = new Door(true, tintPercentage, isLocked, true, true, "door4");
        axle = new Axle("axle", true, thicknessInInches, lengthInInches);
        seat1 = new Seat("seat1", true, seatBeltLengthInInches,reclineBackwardsInInches,chanceOfFailure);
        seat2 = new Seat("seat2",  true, seatBeltLengthInInches,reclineBackwardsInInches, chanceOfFailure);
        seat3 = new Seat("seat3",  true,seatBeltLengthInInches,reclineBackwardsInInches,chanceOfFailure);
        seat4 = new Seat("seat4", true, seatBeltLengthInInches,reclineBackwardsInInches,chanceOfFailure);
        seat5 = new Seat("seat5", true, seatBeltLengthInInches,reclineBackwardsInInches,chanceOfFailure);
        rightHeadlight = new Headlight("right headlight", true,chanceOfFailure, bulbType, color, bulbLengthInInches, windowLengthInInches);
        leftHeadlight = new Headlight("left headlight", true,chanceOfFailure, bulbType, color, bulbLengthInInches, windowLengthInInches);
        trunk = new Trunk("trunk", diameterInFeet, true,chanceOfFailure);
        arr[0] = wheel1;
        arr[1] = wheel2;
        arr[2] = wheel3;
        arr[3] = wheel4;
        arr[4] = spareWheel;
        arr[5] = door1;
        arr[6] = door2;
        arr[7] = door3;
        arr[8] = door4;
        arr[9] = axle;
        arr[10] =seat1;
        arr[11] =seat2;
        arr[12] =seat3;
        arr[13] =seat4;
        arr[14] =seat5;
        arr[15] =rightHeadlight;
        arr[16] =leftHeadlight;
        arr[17] =trunk;
    }

    @Override
    public String toString(){
        String message = super.toString();
        for(CarComponent i : arr){
            if(!i.getIsWorking()){
                message += "The " + i.getNameOfComponent() + " is not working. \n";
            }
        }
        return message;
    }

    @Override
    public String description(){
        String message= "This car" + getNameOfCar();
        message += super.description();
        message += "This car's headlights are " + rightHeadlight.getColor()+ " and " + leftHeadlight.getColor() + ". ";
        return message;
    }

    @Override
    public boolean action1(){
        hillClimb();
        String msg = "";
        if(getCarIsWorking() && getEngine().getIsWorking()){
            if(!(getBrake().getIsWorking())){
                msg += "\n The brake is not working. ";
            }
            if(!(getFuelTank().getIsWorking())){
                msg += "\n The fuel tank is not working. ";
            }
            if(!(getGasPedal().getIsWorking())){
                msg += "\n The gas pedal is not working. ";
            }
            if(!(rightHeadlight.getIsWorking())){
                msg += "\n The right head light is not working. ";
            }
            if(!(leftHeadlight.getIsWorking())){
                msg += "\n The left head light is not working. ";
            }
            if(!(wheel1.getIsWorking())){
                msg += "\n The wheel #1 is not working. ";
            }
            if(!(wheel2.getIsWorking())){
                msg += "\n The wheel #2 is not working. ";
            }
            if(!(wheel3.getIsWorking())) {
                msg += "\n The wheel #3 is not working. ";
            }
            if(!(wheel4.getIsWorking())){
                msg += "\n The wheel #4 is not working. ";
            }
            if(!(trunk.getIsWorking())){
                msg += "\n The trunk is not working. ";
            }
            if(!(getEngine().getIsWorking())){
                msg += "\n The engine is not working. ";
            }
            System.out.println("\nThe car " + getNameOfCar() + " climbs hill. " + msg);
            return true;
        }else{
            System.out.println("The car does not climb the hill. \n");
            return false;
        }
    }

    @Override
    public boolean action2(){
        racing();
        String msg = "";
        if(getCarIsWorking() && getEngine().getIsWorking()){
            racing();
            if(!(door1.getIsWorking())){
                msg += "\n The door #1 is not working. ";
            }
            if(!(door2.getIsWorking())){
                msg += "\n The door #2 is not working. ";
            }
            if(!(door3.getIsWorking())){
                msg += "\n The door #3 is not working. ";
            }
            if(!(door4.getIsWorking())){
                msg += "\n The door #4 is not working. ";
            }
            if(!(getGasPedal().getIsWorking())){
                msg += "\n The gas pedal is not working. ";
            }
            if(!(rightHeadlight.getIsWorking())){
                msg += "\n The right headlight is not working. ";
            }
            if(!(leftHeadlight.getIsWorking())){
                msg += "\n The left headlight is not working. ";
            }
            if(!(getRadiator().getIsWorking())){
                msg += "\n The radiator is not working. ";
            }
            if(!(getSteeringWheel().getIsWorking())){
                msg += "\n The steer wheel is not working. ";
            }
            if(!(wheel1.getIsWorking())){
                msg += "\n The wheel #1 is not working. ";
            }
            if(!(wheel2.getIsWorking())){
                msg += "\n The wheel #2 is not working. ";
            }
            if(!(wheel3.getIsWorking())) {
                msg += "\n The wheel #3 is not working. ";
            }
            if(!(wheel4.getIsWorking())){
                msg += "\n The wheel #4 is not working. ";
            }
            if(!(getTransmission().getIsWorking())){
                msg += "\n The transmission is not working. ";
            }
            if(!(getEngine().getIsWorking())){
                msg += "\n The engine is not working. ";
            }
            System.out.println("\nThe car " + getNameOfCar() + " races. " + msg);
            return true;
        }else{
            System.out.println("The car does not race. ");
            return false;
        }
    }


    @Override
    public boolean drive(double mph){
        setSpeedOfCarMph(mph);
        calculateFailRateOfParts(mph);
        if (!getCarIsWorking()) {
            System.out.println("This " + getNameOfCar() + " is not working and you cannot drive it.");
            return false;
        }
        if (!getCarIsOn() || !(getSteeringWheel().getIsWorking())) {
            System.out.println("This " + getNameOfCar() + " cannot drive because of certain part failures or it didn't start");
            return false;
        } else if (mph > getMaxSpeedMph()) {
            System.out.println("You attempt to drive the car at a high speed. Crash potential increased. ");
        }
        if ((Math.random() * 100) + 1 <= calculateCrashRate(mph)) {
            System.out.println("You attempt to drive the car at a high speed. Your " + getNameOfCar() + " is now damaged");
            damage();
            setCarIsWorking(false);
            setCarIsOn(false);
            return false;
        }
        return true;
    }

    @Override
    public String damage(){
        super.damage();
        for(CarComponent i : arr){
            i.damage();
        }
        return "All parts are damaged";
    }

    @Override
    public void calculateFailRateOfParts(double speedInMph){
        super.calculateFailRateOfParts(speedInMph);
        for(CarComponent i : arr){
            i.calculateChanceOfFailure(speedInMph);
        }
    }

    public double fix()
    {
        double cost = super.fix();
        for(CarComponent i : arr){
            if(!i.getIsWorking()){
                i.fix();
                System.out.println("The " + i.getNameOfComponent() + " is now fixed.");
                cost += 100;
            }
        }
        setCarIsWorking(true);
        return cost;
    }

    /*
    public String hillClimb()
    {
    if(carIsworking){
    return getBrake().startBraking() + " " + getFuelTank().action1() + " " + getGasPedal().decelerate() + " " + getHeadlight().glareLight() + " " + getWheel().action1() + " " + getTrunk().action1() + " " + getEngine().ignition();
    }else{
    return "The car " + getNameOfCar() + " is not working. ";
    }

    }

    public String racing()
    {
    if(carIsWorking)
    return getDoor().openUp() + " " + getGasPedal().accelerate() + " " + getHeadlight().flashLight() + " " + getRadiator().coolEngine() + " " + getRadio().playMusic() + " " + getSteeringWheel().turn() + " " + getTransmission().updateIsWorking() + " " + getEngine().ignition();
    }else{
    return "The car " + getNameOfCar() + " is not working. ";
    }
     */

    public Door getDoor1(){
        return door1;
    }
    public Door getDoor2(){
        return door2;
    }
    public Door getDoor3(){
        return door3;
    }
    public Door getDoor4(){
        return door4;
    }
    public Wheel getWheel1(){
        return wheel1;
    }
    public Wheel getWheel2(){
        return wheel2;
    }
    public Wheel getWheel3(){
        return wheel3;
    }
    public Wheel getWheel4(){
        return wheel4;
    }
    public Wheel getSpareWheel(){
        return spareWheel;
    }
    public Seat getSeat1(){
        return seat1;
    }
    public Seat getSeat2(){
        return seat2;
    }
    public Seat getSeat3(){
        return seat3;
    }
    public Seat getSeat4(){
        return seat4;
    }
    public Seat getSeat5(){
        return seat5;
    }
    public Axle getAxle(){
        return axle;
    }
    public Trunk getTrunk(){
        return trunk;
    }
    public Headlight getRightHeadlight(){
        return rightHeadlight;
    }
    public Headlight getLeftHeadlight(){
        return leftHeadlight;
    }

    public String hillClimb()
    {
        getBrake().startBraking();
        getFuelTank().action1();
        getGasPedal().decelerate();
        rightHeadlight.flashLight();
        leftHeadlight.flashLight();
        wheel1.action1();
        wheel2.action1();
        wheel3.action1();
        wheel4.action1();
        spareWheel.action1();
        trunk.action1();
        getEngine().ignition();
        if(getCarIsWorking() && getEngine().getIsWorking()){
            return getEngine().ignition() + " So the car " + getNameOfCar() + " is climbing hill. ";
        }else{
            return "The car " + getNameOfCar() + " is not working. ";
        }
    }

    public String racing()
    {
        door1.openUp();
        door2.openUp();
        door3.openUp();
        door4.openUp();
        getGasPedal().accelerate();
        rightHeadlight.flashLight();
        leftHeadlight.flashLight();
        getRadiator().coolEngine();
        getSteeringWheel().turn();
        wheel1.action1();
        wheel2.action1();
        wheel3.action1();
        wheel4.action1();
        getTransmission().updateIsWorking();
        getEngine().ignition();
        if(getCarIsWorking() && getEngine().getIsWorking()){
            return getEngine().ignition() + " So the car " + getNameOfCar() + " is racing. ";
        }else{
            return "The car " + getNameOfCar() + " is not working. ";
        }
    }
}
