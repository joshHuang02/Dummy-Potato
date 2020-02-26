public class Vehicle {
	// Instances
	private String color;
	private String nameOfCar;
	private String typeOfCar;
	private String fuelType;
	private double weightInPounds;
	private double lengthInFeet;
	private double maxSpeedMph;
	private double costOfCarInDollars;
	private boolean carIsOn = false;
	private boolean carIsWorking;
	private double crashPotentialPercentage;
	private double speedOfCarMph;

	private Engine engine;
	private SteeringWheel steeringWheel;
	private Battery battery;
	private FuelTank fuelTank;
	private Brake brake;
	private Transmission transmission;
	private GasPedal gasPedal;
	private Radiator radiator;
	CarComponent[] arr = new CarComponent[8];

  
	// Constructor
	// removed the speedinMph from constructor
	public Vehicle(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
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
			double radiatorWaterLevelInInches) {
		this.color = color;
		this.nameOfCar = nameOfCar;
		this.typeOfCar = typeOfCar;
		this.fuelType = fuelType;
		this.weightInPounds = weightInPounds;
		this.lengthInFeet = lengthInFeet;
		this.maxSpeedMph = maxSpeedMph;
		this.costOfCarInDollars = costOfCarInDollars;
		this.carIsWorking = carIsWorking;
		if (crashPotentialPercentage > 100) {
			this.crashPotentialPercentage = 100.0;
		} else if (crashPotentialPercentage < 0) {
			this.crashPotentialPercentage = 0.0;
		}
		this.crashPotentialPercentage = crashPotentialPercentage;

		engine = new Engine(nameOfEngine, numberOfEngineCylinders, engineTemperatureInFahrenheit, engineIsWorking,
				engineChanceOfFailure);
		steeringWheel = new SteeringWheel(nameOfSteeringWheel, steeringWheelIsWorking, steeringWheelChanceOfFailure,
				steeringWheelType, steeringWheelDiameterInInches);
		battery = new Battery(nameOfBattery, batteryColor, batteryCapacityInYears, batteryVoltageInVolts,
				batteryIsWorking);
		fuelTank = new FuelTank(nameOfFuelTank, fuelTankIsWorking, fuelTankOilInGallons, fuelTankCapacity);
		brake = new Brake(nameOfBrake, brakeDiscSizeInInches, brakePadThicknessInInches, brakeIsWorking,
				brakeChanceOfFailure);
		transmission = new Transmission(transmissionNumberOfPlanetGear, transmissionNumberOfRingGear,
				transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet, transmissionGearRatio,
				transmissionAmountOfTransmissionFluidInQuarts, transmissionValveBodyIsWorking,
				transmissionSensorIsWorking, transmissionClutchesAndBandsIsWorking,
				transmissionTorqueConverterIsWorking, transmissionPlanetaryGearSetIsWorking,
				transmissionSunGearIsWorking, transmissionPlanetGearIsWorking, transmissionRingGearIsWorking,
				transmissionPumpIsWorking, transmissionIsWorking);
		gasPedal = new GasPedal(nameOfGasPedal, gasPedalIsWorking, gasPedalSurfaceAreaInInches);
		radiator = new Radiator(radiatorTemperatureOfRadiatorFahrenheit, radiatorIsWorking, radiatorWaterLevelInInches,
				nameOfRadiator);
		arr[0] = engine;
		arr[1] = steeringWheel;
		arr[2] = battery;
		arr[3] = fuelTank;
		arr[4] = brake;
		arr[5] = transmission;
		arr[6] = gasPedal;
		arr[7] = radiator;
	}

	public Vehicle(String color, String nameOfCar, String typeOfCar, String fuelType, double weightInPounds,
			double lengthInFeet, double maxSpeedMph, double costOfCarInDollars, boolean carIsWorking,
			double crashPotentialPercentage, int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
			String steeringWheelType, double steeringWheelDiameterInInches, String batteryColor,
			int batteryCapacityInYears, double batteryVoltageInVolts, int fuelTankOilInGallons, int fuelTankCapacity,
			int brakeDiscSizeInInches, double brakePadThicknessInInches, int transmissionNumberOfPlanetGear,
			int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
			double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
			double gasPedalSurfaceAreaInInches, double radiatorTemperatureOfRadiatorFahrenheit,
			double radiatorWaterLevelInches) {
		this.color = color;
		this.nameOfCar = nameOfCar;
		this.typeOfCar = typeOfCar;
		this.fuelType = fuelType;
		this.weightInPounds = weightInPounds;
		this.lengthInFeet = lengthInFeet;
		this.maxSpeedMph = maxSpeedMph;
		this.costOfCarInDollars = costOfCarInDollars;
		this.carIsWorking = carIsWorking;
		if (crashPotentialPercentage > 100) {
			this.crashPotentialPercentage = 100.0;
		} else if (crashPotentialPercentage < 0) {
			this.crashPotentialPercentage = 0.0;
		}
		this.crashPotentialPercentage = crashPotentialPercentage;

		engine = new Engine("engine", numberOfEngineCylinders, engineTemperatureInFahrenheit, true, 5);
		steeringWheel = new SteeringWheel("steering wheel", true, 4, steeringWheelType, steeringWheelDiameterInInches);
		battery = new Battery("battery", batteryColor, batteryCapacityInYears, batteryVoltageInVolts, true);
		fuelTank = new FuelTank("fuel tank", true, fuelTankOilInGallons, fuelTankCapacity);
		brake = new Brake("brake", brakeDiscSizeInInches, brakePadThicknessInInches, true, 6);
		transmission = new Transmission(transmissionNumberOfPlanetGear, transmissionNumberOfRingGear,
				transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet, transmissionGearRatio,
				transmissionAmountOfTransmissionFluidInQuarts, true, true, true, true, true, true, true, true, true,
				true);
		gasPedal = new GasPedal("gas pedal", true, gasPedalSurfaceAreaInInches);
		radiator = new Radiator(radiatorTemperatureOfRadiatorFahrenheit, true, radiatorWaterLevelInches, "radiator");
		arr[0] = engine;
		arr[1] = steeringWheel;
		arr[2] = battery;
		arr[3] = fuelTank;
		arr[4] = brake;
		arr[5] = transmission;
		arr[6] = gasPedal;
		arr[7] = radiator;
	}

	// Methods

	public String start() {
		if (carIsWorking && getEngine().getIsWorking() && getBattery().getIsWorking()
				&& getFuelTank().getFuelTankCapacity() > 0
				&& getTransmission().getAmountOfTransmissionFluidInQuarts() > 0 && getRadiator().getIsWorking()) {
			carIsOn = true;
			return "car is on!";
		} else {
			carIsOn = false;
			return "The car is not working.";
		}

	}

	@Override
	public String toString() {
		String message = description();
		if (!carIsWorking) {
			message += "The car is not working.\n";
		}
		if (!carIsOn) {
			message += "The car is not on.\n";
		}
		for (CarComponent i : arr) {
			if (!(i.getIsWorking())) {
				message += "The " + i.getNameOfComponent() + " is not working. \n";
			}
		}
		return message;
	}

	public String description() {
		String message = "The " + getNameOfCar() + " is " + typeOfCar + ".\n";
		message += "The color of the car is " + color + ".\n";
		message += "The fuel type of the car is " + fuelType + ".\n";
		message += "The length of the car is " + lengthInFeet + " feet.\n";
		message += "The max speed of the car is " + maxSpeedMph + " in mph.\n";
		message += "The cost of the car is " + costOfCarInDollars + " in dollars.\n";
		message += "The weight of the car is " + weightInPounds + " in pounds.\n";
		message += "The crash potential percentage of the car is " + crashPotentialPercentage + ".\n";
		message += "The speed of the car is " + speedOfCarMph + ".\n";
		return message;
	}

	public double fix() {
		double cost = 0;
		for (CarComponent i : arr) {
			if (!(i.getIsWorking())) {
				if (i.getNameOfComponent().equals(engine.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 1000;
				}
				if (i.getNameOfComponent().equals(steeringWheel.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 29.99;
				}
				if (i.getNameOfComponent().equals(battery.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 120;
				}
				if (i.getNameOfComponent().equals(fuelTank.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 1381;
				}
				if (i.getNameOfComponent().equals(brake.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 600;
				}
				if (i.getNameOfComponent().equals(transmission.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 2800;
				}
				if (i.getNameOfComponent().equals(gasPedal.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 85;
				}
				if (i.getNameOfComponent().equals(radiator.getNameOfComponent())) {
					System.out.println(i.fix());
					cost += 750;
				}
			}
		}
		carIsWorking = true;
		return cost;
	}

	public boolean drive() {
		return drive(60);
	}

	public boolean drive(double mph) {
    calculateFailRateOfParts(mph);
		speedOfCarMph = mph;
		if (!carIsWorking) {
			System.out.println("This " + nameOfCar + " is not working and you cannot drive it.");
			return false;
		}
		if (!carIsOn || !(getSteeringWheel().getIsWorking())) {
			System.out
					.println("This " + nameOfCar + " cannot drive because of certain part failures or it didn't start");
			return false;
		} else if (mph > maxSpeedMph) {
			System.out.println("You attempt to drive the car at a high speed. Crash potential increased. ");
		}
		if ((Math.random() * 100) + 1 <= calculateCrashRate(mph)) {
			System.out.println("You attempt to drive the car at a high speed. Your " + nameOfCar + " is now damaged");
			for (CarComponent i : arr) {
				i.damage();
			}
			carIsWorking = false;
			carIsOn = false;
			return false;
		}

		return true;
	}

	public double calculateCrashRate(double speedInMph) {
		double slope = (100 - crashPotentialPercentage) / (Math.pow(1.013, maxSpeedMph));
		double yint = crashPotentialPercentage - slope - 20;
		double crashRate = (slope * Math.pow(1.013, speedInMph) + yint);
		if (speedInMph < maxSpeedMph) {
			crashRate -= 20;
		}
		return crashRate;
	}

  public void calculateFailRateOfParts(double speedInMph){
   engine.calculateChanceOfFailure(speedInMph);
    steeringWheel.calculateChanceOfFailure(speedInMph);
    battery.calculateChanceOfFailure(speedInMph);
    fuelTank.calculateChanceOfFailure(speedInMph);
    brake.calculateChanceOfFailure(speedInMph);
    transmission.calculateChanceOfFailure(speedInMph);
    gasPedal.calculateChanceOfFailure(speedInMph);
    radiator.calculateChanceOfFailure(speedInMph);
    }

	public boolean action1() {
		return true;
	}

	public boolean action2() {
		return true;
	}

	public String damage() {
		for (CarComponent i : arr) {
			i.damage();
		}
		return "code incomplete";
	}

	// getter and setter
	// --------------------setters-----------------
	public void setColor(String color) {
		this.color = color;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setWeightInPounds(double weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	public void setLengthInFeet(double lengthInFeet) {
		this.lengthInFeet = lengthInFeet;
	}

	public void setMaxSpeedMph(double maxSpeedMph) {
		this.maxSpeedMph = maxSpeedMph;
	}

	public void setCostOfCarInDollars(double costOfCarInDollars) {
		this.costOfCarInDollars = costOfCarInDollars;
	}

	public void setCarIsOn(boolean carIsOn) {
		this.carIsOn = carIsOn;
	}

	public void setCarIsWorking(boolean carIsWorking) {
		this.carIsWorking = carIsWorking;
	}

	public void setCrashPotentialPercentage(double crashPotentialPercentage) {
		this.crashPotentialPercentage = crashPotentialPercentage;
	}

	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}

	public void setSpeedOfCarMph(double speedOfCarMph) {
		this.speedOfCarMph = speedOfCarMph;
	}

//--------------------getters---------------------

	public String getColor() {
		return color;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getWeightInPounds() {
		return weightInPounds;
	}

	public double getLengthInFeet() {
		return lengthInFeet;
	}

	public double getMaxSpeedMph() {
		return maxSpeedMph;
	}

	public double getCostOfCarInDollars() {
		return costOfCarInDollars;
	}

	public boolean getCarIsOn() {
		return carIsOn;
	}

	public boolean getCarIsWorking() {
		return carIsWorking;
	}

	public double getCrashPotentialPercentage() {
		return crashPotentialPercentage;
	}

	public String getTypeOfCar() {
		return typeOfCar;
	}

	public double getSpeedOfCarMph() {
		return speedOfCarMph;
	}

	// getters (parts)

	public Engine getEngine() {
		return this.engine;
	}

	public SteeringWheel getSteeringWheel() {
		return this.steeringWheel;
	}

	public Battery getBattery() {
		return this.battery;
	}

	public FuelTank getFuelTank() {
		return this.fuelTank;
	}

	public Brake getBrake() {
		return this.brake;
	}

	public Transmission getTransmission() {
		return this.transmission;
	}

	public Radiator getRadiator() {
		return this.radiator;
	}

	public GasPedal getGasPedal() {
		return this.gasPedal;
	}

}
