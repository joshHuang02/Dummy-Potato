public class SemiTruck extends Vehicle {
    private Wheel wheels[] = new Wheel[10];
    private Door leftDoor;
    private Door rightDoor;
    private Axle frontAxle;
    private Axle midAxle;
    private Axle rearAxle;
    private Seat driverSeat;
    private Seat passengerSeat;
    private Headlight leftLight;
    private Headlight rightLight;
    private Radio radio;
    private TowHitch towHitch;
    private CarComponent nonWheelComponenets[] = new CarComponent[19];

    public SemiTruck(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
    double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
    double crashPotentialPercentage, String nameOfEngine, int numberOfEngineCylinders,
    int engineTemperatureInFahrenheit, boolean engineIsWorking, double engineChanceOfFailure,
    String nameOfSteeringWheel, boolean steeringWheelIsWorking, double steeringWheelChanceOfFailure,
    String steeringWheelType, double steeringWheelDiameterInInches, String nameOfBattery,
    String batteryColor, int batteryCapacityInYears, double batteryVoltageInVolts,
    boolean batteryIsWorking, String nameOfFuelTank, boolean fuelTankIsWorking,
    int fuelTankOilInGallons, double fuelTankCapacityInGallons, String nameOfBrake,
    int brakeDiscSizeInInches, double brakePadThicknessInInches, boolean brakeIsWorking,
    double brakeChanceOfFailure, int transmissionNumberOfPlanetGear,
    int transmissionNumberOfRingGear, int transmissionNumberOfSunGear,
    int transmissionNumberOfPlanetaryGearSet, double transmissionGearRatio,
    double transmissionAmountOfTransmissionFluidInQuarts, boolean transmissionValveBodyIsWorking,
    boolean transmissionSensorIsWorking, boolean transmissionClutchesAndBandsIsWorking,
    boolean transmissionTorqueConverterIsWorking, boolean transmissionPlanetaryGearSetIsWorking,
    boolean transmissionSunGearIsWorking, boolean transmissionPlanetGearIsWorking,
    boolean transmissionRingGearIsWorking, boolean transmissionPumpIsWorking,
    boolean transmissionIsWorking, String nameOfGasPedal, boolean gasPedalIsWorking,
    double gasPedalSurfaceAreaInInches, String nameOfRadiator,
    double radiatorTemperatureOfRadiatorFahrenheit, boolean radiatorIsWorking,
    double radiatorWaterLevelInches, String nameOfWheel1, String nameOfWheel2, String nameOfWheel3,
    String nameOfWheel4, String nameOfWheel5, String nameOfWheel6, String nameOfWheel7,
    String nameOfWheel8, String nameOfWheel9, String nameOfWheel10, int tirePressureInPSIofWheel1,
    int tirePressureInPSIofWheel2, int tirePressureInPSIofWheel3, int tirePressureInPSIofWheel4,
    int tirePressureInPSIofWheel5, int tirePressureInPSIofWheel6, int tirePressureInPSIofWheel7,
    int tirePressureInPSIofWheel8, int tirePressureInPSIofWheel9, int tirePressureInPSIofWheel10,
    int rimDiameterInInchesOfWheel1, int rimDiameterInInchesOfWheel2,
    int rimDiameterInInchesOfWheel3, int rimDiameterInInchesOfWheel4,
    int rimDiameterInInchesOfWheel5, int rimDiameterInInchesOfWheel6,
    int rimDiameterInInchesOfWheel7, int rimDiameterInInchesOfWheel8,
    int rimDiameterInInchesOfWheel9, int rimDiameterInInchesOfWheel10, boolean wheel1IsWorking,
    boolean wheel2IsWorking, boolean wheel3IsWorking, boolean wheel4IsWorking,
    boolean wheel5IsWorking, boolean wheel6IsWorking, boolean wheel7IsWorking,
    boolean wheel8IsWorking, boolean wheel9IsWorking, boolean wheel10IsWorking,
    boolean leftDoorIsOpen, int leftDoorTintPercentage, boolean leftDoorIsLocked,
    boolean leftDoorIsWorking, boolean leftDoorWindowIsOpen, String leftDoorNameOfComponent,
    boolean rightDoorIsOpen, int rightDoorTintPercentage, boolean rightDoorIsLocked,
    boolean rightDoorIsWorking, boolean rightDoorWindowIsOpen, String rightDoorNameOfComponent,
    boolean frontAxleIsWorking, double frontAxleThicknessInInches, double frontAxleLengthInInches,
    boolean midAxleIsWorking, double midAxleThicknessInInches, double midAxleLengthInInches,
    boolean rearAxleIsWorking, double rearAxleThicknessInInches, double rearAxleLengthInInches,
    boolean driverSeatIsWorking, int driverSeatSeatBeltLengthInInches,
    int driverSeatReclineBackwardsInInches, boolean passengerSeatIsWorking,
    int passengerSeatSeatBeltLengthInInches, int passengerSeatReclineBackwardsInInches,
    boolean leftLightIsWorking, String leftLightBulbType, String leftLightColor,
    double leftLightBulbLengthInInches, double leftLightWindowLengthInInches,
    boolean rightLightIsWorking, String rightLightBulbType, String rightLightColor,
    double rightLightBulbLengthInInches, double rightLightWindowLengthInInches,
    int radioNumberOfSpeaker, boolean radioSpeakerIsWorking, boolean radioCircuitBoardIsWorking,
    boolean radioIsWorking, String radioNameOfComponent, double RadioMinutesUsedWithoutRest,
    String hitchName, double hitchSizeInInzhes, boolean hitchIsAttached, boolean hitchIsWorking,
    double hitchChanceOfFailure) {
        super(color, nameOfCar, typeOfCar, fuelType, weightInPounds, lengthInFeet, maxSpeedMph,
            costOfCarInDollars, carIsWorking, crashPotentialPercentage, nameOfEngine,
            numberOfEngineCylinders, engineTemperatureInFahrenheit, engineIsWorking,
            engineChanceOfFailure, nameOfSteeringWheel, steeringWheelIsWorking,
            steeringWheelChanceOfFailure, steeringWheelType, steeringWheelDiameterInInches,
            nameOfBattery, batteryColor, batteryCapacityInYears, batteryVoltageInVolts,
            batteryIsWorking, nameOfFuelTank, fuelTankIsWorking, fuelTankOilInGallons,
            fuelTankCapacityInGallons, nameOfBrake, brakeDiscSizeInInches,
            brakePadThicknessInInches, brakeIsWorking, brakeChanceOfFailure,
            transmissionNumberOfPlanetGear, transmissionNumberOfRingGear,
            transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
            transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts,
            transmissionValveBodyIsWorking, transmissionSensorIsWorking,
            transmissionClutchesAndBandsIsWorking, transmissionTorqueConverterIsWorking,
            transmissionPlanetaryGearSetIsWorking, transmissionSunGearIsWorking,
            transmissionPlanetGearIsWorking, transmissionRingGearIsWorking,
            transmissionPumpIsWorking, transmissionIsWorking, nameOfGasPedal, gasPedalIsWorking,
            gasPedalSurfaceAreaInInches, nameOfRadiator, radiatorTemperatureOfRadiatorFahrenheit,
            radiatorIsWorking, radiatorWaterLevelInches);
        wheels[0] = new Wheel(nameOfWheel1, tirePressureInPSIofWheel1, rimDiameterInInchesOfWheel1,
            wheel1IsWorking);
        wheels[1] = new Wheel(nameOfWheel2, tirePressureInPSIofWheel2, rimDiameterInInchesOfWheel2,
            wheel2IsWorking);
        wheels[2] = new Wheel(nameOfWheel3, tirePressureInPSIofWheel3, rimDiameterInInchesOfWheel3,
            wheel3IsWorking);
        wheels[3] = new Wheel(nameOfWheel4, tirePressureInPSIofWheel4, rimDiameterInInchesOfWheel4,
            wheel4IsWorking);
        wheels[4] = new Wheel(nameOfWheel5, tirePressureInPSIofWheel5, rimDiameterInInchesOfWheel5,
            wheel5IsWorking);
        wheels[5] = new Wheel(nameOfWheel6, tirePressureInPSIofWheel6, rimDiameterInInchesOfWheel6,
            wheel6IsWorking);
        wheels[6] = new Wheel(nameOfWheel7, tirePressureInPSIofWheel7, rimDiameterInInchesOfWheel7,
            wheel7IsWorking);
        wheels[7] = new Wheel(nameOfWheel8, tirePressureInPSIofWheel8, rimDiameterInInchesOfWheel8,
            wheel8IsWorking);
        wheels[8] = new Wheel(nameOfWheel9, tirePressureInPSIofWheel9, rimDiameterInInchesOfWheel9,
            wheel9IsWorking);
        wheels[9] = new Wheel(nameOfWheel10, tirePressureInPSIofWheel10, rimDiameterInInchesOfWheel10,
            wheel10IsWorking);
        leftDoor = new Door(leftDoorIsOpen, leftDoorTintPercentage, leftDoorIsLocked, leftDoorIsWorking,
            leftDoorWindowIsOpen, leftDoorNameOfComponent);
        rightDoor = new Door(rightDoorIsOpen, rightDoorTintPercentage, rightDoorIsLocked, rightDoorIsWorking,
            rightDoorWindowIsOpen, rightDoorNameOfComponent);
        frontAxle = new Axle("Front axel", frontAxleIsWorking, frontAxleThicknessInInches,
            frontAxleLengthInInches);
        midAxle = new Axle("Mid axle", midAxleIsWorking, midAxleThicknessInInches, midAxleLengthInInches);
        rearAxle = new Axle("Rear axle", rearAxleIsWorking, rearAxleThicknessInInches, rearAxleLengthInInches);
        driverSeat = new Seat("Driver seat", driverSeatIsWorking, driverSeatSeatBeltLengthInInches,
            driverSeatReclineBackwardsInInches, 5);
        passengerSeat = new Seat("Passenger seat", passengerSeatIsWorking, passengerSeatSeatBeltLengthInInches,
            passengerSeatReclineBackwardsInInches, 5);
        leftLight = new Headlight("Left light", leftLightIsWorking, 5, leftLightBulbType, leftLightColor,
            leftLightBulbLengthInInches, leftLightWindowLengthInInches);
        rightLight = new Headlight("Right light", rightLightIsWorking, 5, rightLightBulbType, rightLightColor,
            rightLightBulbLengthInInches, rightLightWindowLengthInInches);
        radio = new Radio(radioNumberOfSpeaker, radioSpeakerIsWorking, radioCircuitBoardIsWorking,
            radioIsWorking, radioNameOfComponent, RadioMinutesUsedWithoutRest);
        towHitch = new TowHitch(hitchName, hitchSizeInInzhes, hitchIsAttached, hitchIsWorking,
            hitchChanceOfFailure);

        nonWheelComponenets[0] = super.getEngine();
        nonWheelComponenets[1] = super.getSteeringWheel();
        nonWheelComponenets[2] = super.getBattery();
        nonWheelComponenets[3] = super.getFuelTank();
        nonWheelComponenets[4] = super.getBrake();
        nonWheelComponenets[5] = super.getTransmission();
        nonWheelComponenets[6] = super.getGasPedal();
        nonWheelComponenets[7] = super.getRadiator();
        nonWheelComponenets[8] = leftDoor;
        nonWheelComponenets[9] = rightDoor;
        nonWheelComponenets[10] = frontAxle;
        nonWheelComponenets[11] = midAxle;
        nonWheelComponenets[12] = rearAxle;
        nonWheelComponenets[13] = driverSeat;
        nonWheelComponenets[14] = passengerSeat;
        nonWheelComponenets[15] = leftLight;
        nonWheelComponenets[16] = rightLight;
        nonWheelComponenets[17] = radio;
        nonWheelComponenets[18] = towHitch;
    }

    public SemiTruck(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
    double lengthInFeet, double maxSpeedMph, double costOfCarInDollars,
    double crashPotentialPercentage, String nameOfEngine, int numberOfEngineCylinders,
    int engineTemperatureInFahrenheit, double engineChanceOfFailure, String nameOfSteeringWheel,
    double steeringWheelChanceOfFailure, String steeringWheelType,
    double steeringWheelDiameterInInches, String nameOfBattery, String batteryColor,
    int batteryCapacityInYears, double batteryVoltageInVolts, String nameOfFuelTank,
    int fuelTankOilInGallons, double fuelTankCapacityInGallons, String nameOfBrake,
    int brakeDiscSizeInInches, double brakePadThicknessInInches, double brakeChanceOfFailure,
    int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear,
    int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
    double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,

    String nameOfGasPedal, double gasPedalSurfaceAreaInInches, String nameOfRadiator,
    double radiatorTemperatureOfRadiatorFahrenheit, double radiatorWaterLevelInches,
    String nameOfWheel1, String nameOfWheel2, String nameOfWheel3, String nameOfWheel4,
    String nameOfWheel5, String nameOfWheel6, String nameOfWheel7, String nameOfWheel8,
    String nameOfWheel9, String nameOfWheel10, int tirePressureInPSIofWheel1,
    int tirePressureInPSIofWheel2, int tirePressureInPSIofWheel3, int tirePressureInPSIofWheel4,
    int tirePressureInPSIofWheel5, int tirePressureInPSIofWheel6, int tirePressureInPSIofWheel7,
    int tirePressureInPSIofWheel8, int tirePressureInPSIofWheel9, int tirePressureInPSIofWheel10,
    int rimDiameterInInchesOfWheel1, int rimDiameterInInchesOfWheel2,
    int rimDiameterInInchesOfWheel3, int rimDiameterInInchesOfWheel4,
    int rimDiameterInInchesOfWheel5, int rimDiameterInInchesOfWheel6,
    int rimDiameterInInchesOfWheel7, int rimDiameterInInchesOfWheel8,
    int rimDiameterInInchesOfWheel9, int rimDiameterInInchesOfWheel10,

    boolean leftDoorIsOpen, int leftDoorTintPercentage, boolean leftDoorIsLocked,
    boolean leftDoorWindowIsOpen, String leftDoorNameOfComponent, boolean rightDoorIsOpen,
    int rightDoorTintPercentage, boolean rightDoorIsLocked, boolean rightDoorWindowIsOpen,
    String rightDoorNameOfComponent, double frontAxleThicknessInInches,
    double frontAxleLengthInInches, double midAxleThicknessInInches, double midAxleLengthInInches,
    double rearAxleThicknessInInches, double rearAxleLengthInInches,
    int driverSeatSeatBeltLengthInInches, int driverSeatReclineBackwardsInInches,
    int passengerSeatSeatBeltLengthInInches, int passengerSeatReclineBackwardsInInches,
    String leftLightBulbType, String leftLightColor, double leftLightBulbLengthInInches,
    double leftLightWindowLengthInInches, String rightLightBulbType, String rightLightColor,
    double rightLightBulbLengthInInches, double rightLightWindowLengthInInches,
    int radioNumberOfSpeaker, String radioNameOfComponent, double RadioMinutesUsedWithoutRest,
    String hitchName, double hitchSizeInInzhes, double hitchChanceOfFailure) {
        super(color, nameOfCar, typeOfCar, fuelType, weightInPounds, lengthInFeet, maxSpeedMph,
            costOfCarInDollars, true, crashPotentialPercentage, nameOfEngine,
            numberOfEngineCylinders, engineTemperatureInFahrenheit, true, engineChanceOfFailure,
            nameOfSteeringWheel, true, steeringWheelChanceOfFailure, steeringWheelType,
            steeringWheelDiameterInInches, nameOfBattery, batteryColor, batteryCapacityInYears,
            batteryVoltageInVolts, true, nameOfFuelTank, true, fuelTankOilInGallons,
            fuelTankCapacityInGallons, nameOfBrake, brakeDiscSizeInInches,
            brakePadThicknessInInches, true, brakeChanceOfFailure, transmissionNumberOfPlanetGear,
            transmissionNumberOfRingGear, transmissionNumberOfSunGear,
            transmissionNumberOfPlanetaryGearSet, transmissionGearRatio,
            transmissionAmountOfTransmissionFluidInQuarts, true, true, true, true, true, true, true,
            true, true, true, nameOfGasPedal, true, gasPedalSurfaceAreaInInches, nameOfRadiator,
            radiatorTemperatureOfRadiatorFahrenheit, true, radiatorWaterLevelInches);
        wheels[0] = new Wheel(nameOfWheel1, tirePressureInPSIofWheel1, rimDiameterInInchesOfWheel1, true);
        wheels[1] = new Wheel(nameOfWheel2, tirePressureInPSIofWheel2, rimDiameterInInchesOfWheel2, true);
        wheels[2] = new Wheel(nameOfWheel3, tirePressureInPSIofWheel3, rimDiameterInInchesOfWheel3, true);
        wheels[3] = new Wheel(nameOfWheel4, tirePressureInPSIofWheel4, rimDiameterInInchesOfWheel4, true);
        wheels[4] = new Wheel(nameOfWheel5, tirePressureInPSIofWheel5, rimDiameterInInchesOfWheel5, true);
        wheels[5] = new Wheel(nameOfWheel6, tirePressureInPSIofWheel6, rimDiameterInInchesOfWheel6, true);
        wheels[6] = new Wheel(nameOfWheel7, tirePressureInPSIofWheel7, rimDiameterInInchesOfWheel7, true);
        wheels[7] = new Wheel(nameOfWheel8, tirePressureInPSIofWheel8, rimDiameterInInchesOfWheel8, true);
        wheels[8] = new Wheel(nameOfWheel9, tirePressureInPSIofWheel9, rimDiameterInInchesOfWheel9, true);
        wheels[9] = new Wheel(nameOfWheel10, tirePressureInPSIofWheel10, rimDiameterInInchesOfWheel10, true);
        leftDoor = new Door(leftDoorIsOpen, leftDoorTintPercentage, leftDoorIsLocked, true,
            leftDoorWindowIsOpen, leftDoorNameOfComponent);
        rightDoor = new Door(rightDoorIsOpen, rightDoorTintPercentage, rightDoorIsLocked, true,
            rightDoorWindowIsOpen, rightDoorNameOfComponent);
        frontAxle = new Axle("Front axel", true, frontAxleThicknessInInches, frontAxleLengthInInches);
        midAxle = new Axle("Mid axle", true, midAxleThicknessInInches, midAxleLengthInInches);
        rearAxle = new Axle("Rear axle", true, rearAxleThicknessInInches, rearAxleLengthInInches);
        driverSeat = new Seat("Driver seat", true, driverSeatSeatBeltLengthInInches,
            driverSeatReclineBackwardsInInches, 5);
        passengerSeat = new Seat("Passenger seat", true, passengerSeatSeatBeltLengthInInches,
            passengerSeatReclineBackwardsInInches, 5);
        leftLight = new Headlight("Left light", true, 5, leftLightBulbType, leftLightColor,
            leftLightBulbLengthInInches, leftLightWindowLengthInInches);
        rightLight = new Headlight("Right light", true, 5, rightLightBulbType, rightLightColor,
            rightLightBulbLengthInInches, rightLightWindowLengthInInches);
        radio = new Radio(radioNumberOfSpeaker, true, true, true, radioNameOfComponent,
            RadioMinutesUsedWithoutRest);
        towHitch = new TowHitch(hitchName, hitchSizeInInzhes, true, true, hitchChanceOfFailure);
        nonWheelComponenets[0] = super.getEngine();
        nonWheelComponenets[1] = super.getSteeringWheel();
        nonWheelComponenets[2] = super.getBattery();
        nonWheelComponenets[3] = super.getFuelTank();
        nonWheelComponenets[4] = super.getBrake();
        nonWheelComponenets[5] = super.getTransmission();
        nonWheelComponenets[6] = super.getGasPedal();
        nonWheelComponenets[7] = super.getRadiator();
        nonWheelComponenets[8] = leftDoor;
        nonWheelComponenets[9] = rightDoor;
        nonWheelComponenets[10] = frontAxle;
        nonWheelComponenets[11] = midAxle;
        nonWheelComponenets[12] = rearAxle;
        nonWheelComponenets[13] = driverSeat;
        nonWheelComponenets[14] = passengerSeat;
        nonWheelComponenets[15] = leftLight;
        nonWheelComponenets[16] = rightLight;
        nonWheelComponenets[17] = radio;
        nonWheelComponenets[18] = towHitch;
    }

    @Override
    public boolean action1() {
        return towTrailer();
    }

    @Override
    public boolean action2() {
        return emergencyDropTrailer();
    }

    @Override
    public String toString() {
        String message = "";
        for (Wheel wheel : wheels) {
            message += wheel.toString() + "\n";
        }
        for (CarComponent component : nonWheelComponenets) {
            message += component.toString() + "\n";
        }
        return message;
    }

    @Override
    public String description() {
        int workingTires = 0;
        for (Wheel wheel : wheels) {
            if (wheel.getIsWorking())
                workingTires++;
        }
        return super.description()
        + "It has 2 doors, 2 headlights, 2 seats, 1 radio, 1 tow hitch, 3 axles, and 10 wheels, "
        + workingTires + " of which are working. ";
    }

    @Override
    public void calculateFailRateOfParts(double speedInMph) {
        super.calculateFailRateOfParts(speedInMph);
        for (Wheel wheel : wheels) {
            wheel.calculateChanceOfFailure(speedInMph);
        }
        for (CarComponent component : nonWheelComponenets) {
            component.calculateChanceOfFailure(speedInMph);
        }
    }

    @Override
    public boolean drive(double mph) {
        boolean superDrive = super.drive(mph);
        if (!superDrive)
            return false;
        if (!super.getEngine().getIsWorking()) {
            System.out.println("The " + super.getEngine().getNameOfComponent() + " is not working, so "
                + getNameOfCar() + " cannot drive. ");
            return false;
        }
        if (super.getFuelTank().getOilInGallons() <= 0) {
            System.out.println("The " + super.getFuelTank().getNameOfComponent() + " is out of fuel, so "
                + getNameOfCar() + " cannot drive. ");
            return false;
        }
        if (!super.getTransmission().getIsWorking()) {
            System.out.println("The " + super.getTransmission().getNameOfComponent()
                + " is not working, so " + getNameOfCar() + " cannot drive. ");
            return false;
        }
        if (!super.getRadiator().getIsWorking()) {
            System.out.println("The " + super.getRadiator().getNameOfComponent() + " is not working, so "
                + getNameOfCar() + " cannot drive. ");
            return false;
        }
        // System.out.println("The " + getNameOfCar() + " drives at " + mph + " miles
        // per hour. ");
        return true;
    }

    @Override
    public double fix() {
        double cost = 0;
        for (Wheel wheel : wheels) {
            if (!wheel.getIsWorking()) {
                System.out.println(wheel.fix());
                cost += 600;
            }

        }
        for (int i = 0; i < nonWheelComponenets.length; i++) {
            if (!nonWheelComponenets[i].getIsWorking()) {
                System.out.println(nonWheelComponenets[i].fix());
                switch (i) {
                    case 0:
                    cost += 10000;
                    break;
                    case 1:
                    cost += 80;
                    break;
                    case 2:
                    cost += 200;
                    break;
                    case 3:
                    cost += 300;
                    break;
                    case 4:
                    cost += 180;
                    break;
                    case 5:
                    cost += 4000;
                    break;
                    case 6:
                    cost += 30;
                    break;
                    case 7:
                    cost += 200;
                    break;
                    case 8:
                    cost += 120;
                    break;
                    case 9:
                    cost += 120;
                    break;
                    case 10:
                    cost += 400;
                    break;
                    case 11:
                    cost += 400;
                    break;
                    case 12:
                    cost += 400;
                    break;
                    case 13:
                    cost += 110;
                    break;
                    case 14:
                    cost += 110;
                    break;
                    case 15:
                    cost += 350;
                    break;
                    case 16:
                    cost += 350;
                    break;
                    case 17:
                    cost += 89;
                    break;
                    case 18:
                    cost += 200;
                    break;

                }
            }
        }
        return super.fix() + cost;
    }

    public boolean towTrailer() {

        // towHitch.action1();
        // getEngine().action2();
        // getSteeringWheel().action1();
        // getTransmission().action1();
        // getTransmission().action2();
        // frontAxle.action1();
        // midAxle.action1();
        // rearAxle.action1();
        // getBattery().action2();
        // getBattery().action1();
        // leftDoor.action1();
        // leftDoor.action2();
        // getGasPedal().action1();
        // leftLight.action1();
        // rightLight.action1();
        // getRadiator().action1();
        // radio.action1();
        // driverSeat.action1();
        // passengerSeat.action1();
        // getFuelTank().action1();
        // for (Wheel wheel : wheels) {
        // wheel.action1();
        // }

        System.out.println(towHitch.action1());
        System.out.println(getEngine().action2());
        System.out.println(getSteeringWheel().action1());
        System.out.println(getTransmission().action1());
        System.out.println(getTransmission().action2());
        System.out.println(frontAxle.action1());
        System.out.println(midAxle.action1());
        System.out.println(rearAxle.action1());
        System.out.println(getBattery().action2());
        System.out.println(getBattery().action1());
        System.out.println(leftDoor.action1());
        System.out.println(rightDoor.action1());
        System.out.println(getGasPedal().action1());
        System.out.println(leftLight.action1());
        System.out.println(rightLight.action1());
        System.out.println(getRadiator().action1());
        System.out.println(radio.action1());
        System.out.println(driverSeat.action1());
        System.out.println(passengerSeat.action1());
        System.out.println(getFuelTank().action1());
        for (Wheel wheel : wheels) {
            System.out.println(wheel.action1());
        }

        if (!towHitch.getIsWorking()) {
            System.out.println("The " + towHitch.getNameOfComponent() + " could not tow. ");
            return false;
        } else {
            boolean canDrive = drive(55);
            if (!getEngine().getIsWorking() || !getTransmission().getIsWorking()
            || !getGasPedal().getIsWorking() || !frontAxle.getIsWorking()
            || !midAxle.getIsWorking() || !rearAxle.getIsWorking())
                canDrive = false;
            if (canDrive)
                return true;
            return false;
        }
    }

    public boolean emergencyDropTrailer() {

        // getSteeringWheel().action1();
        // towHitch.action2();
        // getTransmission().action1();
        // getTransmission().action2();
        // frontAxle.action1();
        // midAxle.action1();
        // rearAxle.action1();
        // getBrake().action1();
        // driverSeat.action1();
        // passengerSeat.action1();
        // for (Wheel wheel : wheels) {
        // wheel.action1();
        // }

        System.out.println(getSteeringWheel().action1());
        System.out.println(towHitch.action2());
        System.out.println(getTransmission().action1());
        System.out.println(getTransmission().action2());
        System.out.println(frontAxle.action1());
        System.out.println(midAxle.action1());
        System.out.println(rearAxle.action1());
        System.out.println(getBrake().action1());
        System.out.println(driverSeat.action1());
        System.out.println(passengerSeat.action1());
        for (Wheel wheel : wheels) {
            System.out.println(wheel.action1());
        }

        System.out.print(towHitch.action2());
        if (!towHitch.getIsWorking()) {
            System.out.println("The " + towHitch.getNameOfComponent() + " is not working and could not detach. ");
            return false;
        } else {
            boolean canDrive = drive(55);
            if (canDrive) {
                System.out.println("The " + getNameOfCar()
                    + " was able to detach from its trailer in an emergency. ");
                return true;
            }
            System.out.println("The " + getNameOfCar()
                + " could not detach during emergency, the car cannot drive anymore. ");
            return false;
        }

        // private Wheel wheels[] = new Wheel[10];
        // private Door leftDoor;
        // private Door rightDoor;
        // private Axle frontAxle;
        // private Axle midAxle;
        // private Axle rearAxle;
        // private Seat driverSeat;
        // private Seat passengerSeat;
        // private Headlight leftLight;
        // private Headlight rightLight;
        // private Radio radio;
        // private TowHitch towHitch;

    }

    public Door getLeftDoor() {
        return this.leftDoor;
    }

    public Door getRightDoor() {
        return this.rightDoor;
    }

    public Axle getFrontAxle() {
        return this.frontAxle;
    }

    public Axle getMidAxle() {
        return this.midAxle;
    }

    public Axle getRearAxle() {
        return this.rearAxle;
    }

    public Seat getDriverSeat() {
        return this.driverSeat;
    }

    public Seat getPassengerSeat() {
        return this.passengerSeat;
    }

    public Headlight getLeftLight() {
        return this.leftLight;
    }

    public Headlight getRightLight() {
        return this.rightLight;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public TowHitch getTowHitch() {
        return this.towHitch;
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }
}
