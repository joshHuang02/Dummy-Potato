public class Arm {
  //instance variables
  private double armLength;
  private boolean isWaveable;

  //constructors
  public Arm(double armLength, boolean isWaveable)
  {
    this.armLength = armLength;
    this.isWaveable = isWaveable;
  }
  public Arm(double armLength)
  {
    this.armLength = armLength;
    this.isWaveable = true;
  }

  //methods, accessors, mutators
  public String wave()
  {
    if (isWaveable)
    {
      if (((int) (Math.random() * 100) + 1) > 60)
      {
        return injure() + "The arm cannot wave.";
      }
      return "The arm waves.";
    }
    else
    {
      return "The arm is not waving.";
    }
  }
  public String injure()
  {
    this.isWaveable = false;
    return "The arm is broken.";
  }
  public String heal()
  {
    if (isWaveable)
    {
      return "The arm was already able to wave.";
    }
    else 
    {
      isWaveable = true;
      return "The arm is now able to wave.";
    }
  }
  public void setArmLength(double length)
  {
    armLength = length;
  }
  public double getArmLength()
  {
    return armLength; 
  }
  public void setIsWaveable(boolean isWaveable)
  {
    this.isWaveable = isWaveable;
  }
  public boolean getIsWaveable()
  {
    return this.isWaveable;
  }
}