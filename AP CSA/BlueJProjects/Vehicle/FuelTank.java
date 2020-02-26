
/**
 * Write a description of class GasTank here.
 *
 * @author Cecilia Li
 * @version v1
 */
public class FuelTank extends CarComponent {
  // instance variable
  double oilInGallons;
  double fuelTankCapacity;

  // constructor
  public FuelTank(String nameOfComponent, boolean isWorking, double oilInGallons, double fuelTankCapacity) {
    super(nameOfComponent, isWorking);
    this.fuelTankCapacity = fuelTankCapacity;
    if (oilInGallons < 0)
      this.oilInGallons = 0;
    else if (oilInGallons > fuelTankCapacity)
      this.oilInGallons = fuelTankCapacity;
    else
      this.oilInGallons = oilInGallons;
  }

  public FuelTank(double oilInGallons, double fuelTankCapacity) {
    super("Fuel Tank", true);
    this.oilInGallons = oilInGallons;
    this.fuelTankCapacity = fuelTankCapacity;
  }

  // methods
  @Override
  public String toString() {
    String back = "";
    if (getIsWorking())
      back += "The fuel tank is working.\n";
    else
      back += "The fuel tank is not working.\n";

    back += "The maximun number of oil in this fuel tank is " + fuelTankCapacity + ".\n";

    back += "Currently there are " + oilInGallons + "gallons of oil in this fuel tank";

    return back;
  }

  @Override
  public String action1() {
    String back = "";
    oilInGallons += 5;
    if (oilInGallons < 0) {
      this.oilInGallons = 0;
    } else if (oilInGallons > fuelTankCapacity) {
      this.oilInGallons = fuelTankCapacity;
    }
    back += "The car has " + oilInGallons + " gallons of oil.\n";
    return back;
  }

  @Override
  public String action2() {
    String back = "";
    if (getIsWorking()) {
      if (oilInGallons > (2 / 3 * fuelTankCapacity)) {
        if (!super.conditionalCheck()) {
          setIsWorking(false);
          back += "The fuel tank has exploded.\n";
        } else {
          back += "The fuel tank is still working.\n";
        }
      } else {
        if (!super.conditionalCheck()) {
          setIsWorking(false);
          back += "The fuel tank has exploded.\n";
        } else {
          back += "The fuel tank is still working.\n";
        }
      }
    } else {
      back += "The fuel tank was already damaged.\n";
    }

    return back;
  }

  @Override
  public String damage() {
    setIsWorking(false);
    return "The Fuel Tank has failed.\n";
  }

  @Override
  public String fix() {
    setIsWorking(true);
    return "The Fuel Tank is now fixed.\n";
  }

  public double getOilInGallons() {
    return oilInGallons;
  }

  public void setOilInGallons(double oilInGallons) {
    this.oilInGallons = oilInGallons;
  }

  public double getFuelTankCapacity() {
    return fuelTankCapacity;
  }

  public void setFuelTankCapacity(double fuelTankCapacity) {
    this.fuelTankCapacity = fuelTankCapacity;
  }
}
