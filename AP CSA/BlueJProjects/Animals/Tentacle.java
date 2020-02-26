public class Tentacle {
  // instance variables
  private String color;
  private boolean isAttatched;

  // constructors
  public Tentacle(String color, boolean isAttatched) {
    this.color = color;
    this.isAttatched = isAttatched;
  }

  public Tentacle(String color) {
    this.color = color;
    this.isAttatched = true;
  }

  // methods, accessors, mutators
  public String constrict() {
    if (isAttatched) {
      if (((int) (Math.random() * 100) + 1) > 70) {
        return injure() + "The tentacle could not constrict.";
      }
      return "The tentacle constricts.";
    } else {
      if (((int) (Math.random() * 100) + 1) > 70) {
        return heal() + "The tentacle constricts.";
      }
      return "The tentacle could not constrict since it is missing.";
    }

  }

  public String injure() {
    this.isAttatched = false;
    return "The tentacle was cut off.";
  }

  public String heal() {
    if (isAttatched) {
      return "The tentacle is still attatched.";
    } else {
      this.isAttatched = true;
      return "The tentacle grew back.";
    }
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public String setIsAttatched(boolean isAttatched) {
    this.isAttatched = isAttatched;
    if (isAttatched) {
      return "The tentacle is still attatched";
    } else {
      return "The tentacle is missing.";
    }
  }

  public boolean getIsAttatched() {
    return this.isAttatched;
  }
}
