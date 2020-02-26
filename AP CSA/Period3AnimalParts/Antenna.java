public class Antenna{
   // initialize
  private String antennaType;
  private boolean canSense;

  // construct
  public Antenna(String antennaType, boolean canSense){
  this.antennaType = antennaType;
  this.canSense = canSense;
  }

  public Antenna(String antennaType){
    this.antennaType = antennaType;
    canSense = true;
  }

  // methods and accessors
  public void setAntennaType(String antennaType) {
    this.antennaType = antennaType;
  }

  public String getAntennaType() {
    return antennaType;
  }

  public String setCanSense(boolean canSense) {
    this.canSense = canSense;
    if (canSense) {
      return "You can still use this antenna. Cherish it while it still remains with you.";
    } else {
      return "Your antenna has been stolen by the fruit flies. Retrieve it as soon as possible.";
    }
  }

  public boolean getCanSense() {
    return canSense;
  }

  // mutators
  public String sense() {
    if (canSense) {
      if (((int)(Math.random() * 100 + 1) > 50))
      {
        return stolen() + " You cannot sense.";
      }
      return "You sense.";
    }
    else
    {
      return "You do not sense.";
    }
  }

  public String stolen() {
    this.canSense = false;
    return "The fruit flies have stolen your antenna!";
  }

  public String retrieve() {
    if (canSense) {
      return "There is no need to retrieve. The fruit flies have spared your antenna ... for now.";
    } else {
      this.canSense = true;
      return "You have successfully retrieved your antenna from the fruit flies... for now.";
    }
  }
}


