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
        private CarComponent nonWheelComponenets[] = new CarComponent[18];
        // private CarComponent nonWheelComponents[] = { super.getEngine(),
        // super.getSteeringWheel(), super.getBattery(),
        // super.getFuelTank(), super.getBrake(), super.getTransmission(),
        // super.getGasPedal(), super.getRadiator(),
        // leftDoor, rightDoor, frontAxle, midAxle, rearAxle, driverSeat, passengerSeat,
        // leftLight, rightLight,
        // radio };

        public SemiTruck(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
                        double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
                        double crashPotentialPercentage, String nameOfEngine, int numberOfEngineCylinders,
                        int engineTemperatureInFahrenheit, boolean engineIsWorking, String nameOfSteeringWheel,
                        boolean steeringWheelIsWorking, String steeringWheelType, double steeringWheelDiameterInInches,
                        String nameOfBattery, String batteryColor, int batteryCapacityInYears,
                        double batteryVoltageInVolts, boolean batteryIsWorking, String nameOfFuelTank,
                        boolean fuelTankIsWorking, int fuelTankOilInGallons, double fuelTankCapacityInGallons,
                        String nameOfBrake, int brakeDiscSizeInInches, double brakePadThicknessInInches,
                        boolean brakeIsWorking, int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear,
                        int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                        double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
                        boolean transmissionValveBodyIsWorking, boolean transmissionSensorIsWorking,
                        boolean transmissionClutchesAndBandsIsWorking, boolean transmissionTorqueConverterIsWorking,
                        boolean transmissionPlanetaryGearSetIsWorking, boolean transmissionSunGearIsWorking,
                        boolean transmissionPlanetGearIsWorking, boolean transmissionRingGearIsWorking,
                        boolean transmissionPumpIsWorking, boolean transmissionIsWorking, String nameOfGasPedal,
                        boolean gasPedalIsWorking, double gasPedalSurfaceAreaInInches, String nameOfRadiator,
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
                        boolean leftDoorIsWorking, String leftDoorNameOfComponent, boolean rightDoorIsOpen,
                        int rightDoorTintPercentage, boolean rightDoorIsLocked, boolean rightDoorIsWorking,
                        String rightDoorNameOfComponent, boolean frontAxleIsWorking, double frontAxleThicknessInInches,
                        double frontAxleLengthInInches, boolean midAxleIsWorking, double midAxleThicknessInInches,
                        double midAxleLengthInInches, boolean rearAxleIsWorking, double rearAxleThicknessInInches,
                        double rearAxleLengthInInches, boolean driverSeatIsWorking,
                        int driverSeatSeatBeltLengthInInches, boolean passengerSeatIsWorking,
                        int passengerSeatSeatBeltLengthInInches, boolean leftLightIsWorking, String leftLightBulbType,
                        String leftLightColor, double leftLightBulbLengthInInches, double leftLightWindowLengthInInches,
                        boolean rightLightIsWorking, String rightLightBulbType, String rightLightColor,
                        double rightLightBulbLengthInInches, double rightLightWindowLengthInInches,
                        int radioNumberOfSpeaker, boolean radioCircuitBoardIsWorking, boolean radioResistorsIsWorking,
                        boolean radioCapacitorsIsWorking, boolean radioTransformersIsWorking,
                        boolean radioTransitorsIsWorking, boolean radioIntegratedCircuitsIsWorking,
                        boolean radioSpeakerIsWorking, boolean radioIsWorking) {
                super(color, nameOfCar, typeOfCar, fuelType, weightInPounds, lengthInFeet, maxSpeedMph,
                                costOfCarInDollars, carIsWorking, crashPotentialPercentage, nameOfEngine,
                                numberOfEngineCylinders, engineTemperatureInFahrenheit, engineIsWorking,
                                nameOfSteeringWheel, steeringWheelIsWorking, steeringWheelType,
                                steeringWheelDiameterInInches, nameOfBattery, batteryColor, batteryCapacityInYears,
                                batteryVoltageInVolts, batteryIsWorking, nameOfFuelTank, fuelTankIsWorking,
                                fuelTankOilInGallons, fuelTankCapacityInGallons, nameOfBrake, brakeDiscSizeInInches,
                                brakePadThicknessInInches, brakeIsWorking, transmissionNumberOfPlanetGear,
                                transmissionNumberOfRingGear, transmissionNumberOfSunGear,
                                transmissionNumberOfPlanetaryGearSet, transmissionGearRatio,
                                transmissionAmountOfTransmissionFluidInQuarts, transmissionValveBodyIsWorking,
                                transmissionSensorIsWorking, transmissionClutchesAndBandsIsWorking,
                                transmissionTorqueConverterIsWorking, transmissionPlanetaryGearSetIsWorking,
                                transmissionSunGearIsWorking, transmissionPlanetGearIsWorking,
                                transmissionRingGearIsWorking, transmissionPumpIsWorking, transmissionIsWorking,
                                nameOfGasPedal, gasPedalIsWorking, gasPedalSurfaceAreaInInches, nameOfRadiator,
                                radiatorTemperatureOfRadiatorFahrenheit, radiatorIsWorking, radiatorWaterLevelInches);
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
                                leftDoorNameOfComponent);
                rightDoor = new Door(rightDoorIsOpen, rightDoorTintPercentage, rightDoorIsLocked, rightDoorIsWorking,
                                rightDoorNameOfComponent);
                frontAxle = new Axle("Front axel", frontAxleIsWorking, frontAxleThicknessInInches,
                                frontAxleLengthInInches);
                midAxle = new Axle("Mid axle", midAxleIsWorking, midAxleThicknessInInches, midAxleLengthInInches);
                rearAxle = new Axle("Rear axle", rearAxleIsWorking, rearAxleThicknessInInches, rearAxleLengthInInches);
                driverSeat = new Seat("Driver seat", driverSeatIsWorking, driverSeatSeatBeltLengthInInches);
                passengerSeat = new Seat("Passenger seat", passengerSeatIsWorking, passengerSeatSeatBeltLengthInInches);
                leftLight = new Headlight("Left light", leftLightIsWorking, leftLightBulbType, leftLightColor,
                                leftLightBulbLengthInInches, leftLightWindowLengthInInches);
                rightLight = new Headlight("Right light", rightLightIsWorking, rightLightBulbType, rightLightColor,
                                rightLightBulbLengthInInches, rightLightWindowLengthInInches);
                radio = new Radio(radioNumberOfSpeaker, radioCircuitBoardIsWorking, radioResistorsIsWorking,
                                radioCapacitorsIsWorking, radioTransformersIsWorking, radioTransitorsIsWorking,
                                radioIntegratedCircuitsIsWorking, radioSpeakerIsWorking, radioIsWorking);
                // super.getEngine(), super.getSteeringWheel(), super.getBattery(),
                // super.getFuelTank(), super.getBrake(), super.getTransmission(),
                // super.getGasPedal(), super.getRadiator(),
                // leftDoor, rightDoor, frontAxle, midAxle, rearAxle, driverSeat, passengerSeat,
                // leftLight, rightLight,
                // radio
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
        }

        public SemiTruck(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
                        double lengthInFeet, double maxSpeedMph, double costOfCarInDollars,
                        double crashPotentialPercentage, String nameOfEngine, int numberOfEngineCylinders,
                        int engineTemperatureInFahrenheit, String nameOfSteeringWheel, String steeringWheelType,
                        double steeringWheelDiameterInInches, String nameOfBattery, String batteryColor,
                        int batteryCapacityInYears, double batteryVoltageInVolts, String nameOfFuelTank,
                        int fuelTankOilInGallons, double fuelTankCapacityInGallons, String nameOfBrake,
                        int brakeDiscSizeInInches, double brakePadThicknessInInches, int transmissionNumberOfPlanetGear,
                        int transmissionNumberOfRingGear, int transmissionNumberOfSunGear,
                        int transmissionNumberOfPlanetaryGearSet, double transmissionGearRatio,
                        double transmissionAmountOfTransmissionFluidInQuarts,

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
                        String leftDoorNameOfComponent, boolean rightDoorIsOpen, int rightDoorTintPercentage,
                        boolean rightDoorIsLocked, String rightDoorNameOfComponent, double frontAxleThicknessInInches,
                        double frontAxleLengthInInches, double midAxleThicknessInInches, double midAxleLengthInInches,
                        double rearAxleThicknessInInches, double rearAxleLengthInInches,
                        int driverSeatSeatBeltLengthInInches, int passengerSeatSeatBeltLengthInInches,
                        String leftLightBulbType, String leftLightColor, double leftLightBulbLengthInInches,
                        double leftLightWindowLengthInInches, String rightLightBulbType, String rightLightColor,
                        double rightLightBulbLengthInInches, double rightLightWindowLengthInInches,
                        int radioNumberOfSpeaker) {
                super(color, nameOfCar, typeOfCar, fuelType, weightInPounds, lengthInFeet, maxSpeedMph,
                                costOfCarInDollars, true, crashPotentialPercentage, nameOfEngine,
                                numberOfEngineCylinders, engineTemperatureInFahrenheit, true, nameOfSteeringWheel, true,
                                steeringWheelType, steeringWheelDiameterInInches, nameOfBattery, batteryColor,
                                batteryCapacityInYears, batteryVoltageInVolts, true, nameOfFuelTank, true,
                                fuelTankOilInGallons, fuelTankCapacityInGallons, nameOfBrake, brakeDiscSizeInInches,
                                brakePadThicknessInInches, true, transmissionNumberOfPlanetGear,
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
                                leftDoorNameOfComponent);
                rightDoor = new Door(rightDoorIsOpen, rightDoorTintPercentage, rightDoorIsLocked, true,
                                rightDoorNameOfComponent);
                frontAxle = new Axle("Front axel", true, frontAxleThicknessInInches, frontAxleLengthInInches);
                midAxle = new Axle("Mid axle", true, midAxleThicknessInInches, midAxleLengthInInches);
                rearAxle = new Axle("Rear axle", true, rearAxleThicknessInInches, rearAxleLengthInInches);
                driverSeat = new Seat("Driver seat", true, driverSeatSeatBeltLengthInInches);
                passengerSeat = new Seat("Passenger seat", true, passengerSeatSeatBeltLengthInInches);
                leftLight = new Headlight("Left light", true, leftLightBulbType, leftLightColor,
                                leftLightBulbLengthInInches, leftLightWindowLengthInInches);
                rightLight = new Headlight("Right light", true, rightLightBulbType, rightLightColor,
                                rightLightBulbLengthInInches, rightLightWindowLengthInInches);
                radio = new Radio(radioNumberOfSpeaker, true, true, true, true, true, true, true, true);
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

        public String fix() {
                for (Wheel wheel : wheels) {
                        System.out.println(wheel.fix());
                }
                for (CarComponent component : nonWheelComponenets) {
                        System.out.println(component.fix());
                }
                return "The semi truck has been fixed";
        }

}
