public class Headlight extends CarComponent{
  private String bulbType;
  private String color;
  private double bulbLengthInInches;
  private double windowLengthInInches;
  
  public Headlight(String nameOfComponent, boolean isWorking, double chanceOfFailure, String bulbType, String color, double bulbLengthInInches, double windowLengthInInches){
    super(nameOfComponent,isWorking);
    this.bulbType = bulbType;
    this.color = color;
    this.bulbLengthInInches = bulbLengthInInches;
    this.windowLengthInInches = windowLengthInInches;
  }
  public Headlight(String bulbType, String color, double bulbLengthInInches, double windowLengthInInches){
    super("Headlight", true);
    this.bulbType = bulbType;
    this.color = color;
    this.bulbLengthInInches = bulbLengthInInches;
    this.windowLengthInInches = windowLengthInInches;
  }
  public String flashLight(){
    if(getIsWorking()){
      if (!super.conditionalCheck()){
      damage();
      return "The headlight no longer lights.";
    }
    else {
      return "The headlight lights up.";
    }
    }
    else{
      return "The headlight doesn't light up.";
    }
  }
  public String glareLight(){
    if(getIsWorking()){
      if (!super.conditionalCheck()){
      damage();
      return "The headlight no longer lights.";
    }
    else {
      return "The headlight lights up.";
    }
    }
    else{
      return "The headlight doesn't light up.";
    }
  }

  public String toString(){
    String m = "";
    m += "This is the " + getNameOfComponent() + " and it is ";
    if (getIsWorking()){
      m += "working ";
    }
    else{
      m+= "not working. ";
    }
    m += "The bulb type is " + getBulbType() + ",the color of the bulb is " + getColor() + ",the bulb length in centimeters is " + getBulbLengthInInches() + ",and the window length in centimeters is " + getWindowLengthInInches() + ".";
    return m;
  }
  public String action1(){
    return flashLight();
  }
  public String action2(){
    return glareLight();
  }
  public String damage(){
    setIsWorking(false);
    return "The headlight is damaged.";
  }
  public String fix(){
    setIsWorking(true);
    return "The headlight is fixed.";
  }
  public void setBulbType(String type){
    this.bulbType = type;
  }
  public String getBulbType(){
    return this.bulbType;
  }
  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return this.color;
  }
  public void setBulbLengthInInches(double bulbLengthInInches){
    this.bulbLengthInInches = bulbLengthInInches;
  }
  public double getBulbLengthInInches(){
    return this.bulbLengthInInches;
  }
  public void setWindowLengthInInches(double windowLengthInInches){
    this.windowLengthInInches = windowLengthInInches;
  }
  public double getWindowLengthInInches(){
    return this.windowLengthInInches;
  }

}

/*public class Headlight extends CarComponent{
  private String bulbType;
  private String color;
  private double bulbLengthInInches;
  private double windowLengthInInches;
  private int blinkCounter;
  
  public Headlight(String nameOfComponent, boolean isWorking, String bulbType, String color, double bulbLengthInInches, double windowLengthInInches, int blinkCounter){
    super(nameOfComponent,isWorking);
    this.bulbType = bulbType;
    this.color = color;
    this.bulbLengthInInches = bulbLengthInInches;
    this.windowLengthInInches = windowLengthInInches;
    this.blinkCounter = blinkCounter;
  }
  public Headlight(String bulbType, String color, double bulbLengthInInches, double windowLengthInInches, int blinkCounter){
    super("Headlight", true);
    this.bulbType = bulbType;
    this.color = color;
    this.bulbLengthInInches = bulbLengthInInches;
    this.windowLengthInInches = windowLengthInInches;
    this.blinkCounter = blinkCounter;
  }

  public boolean flashLight(){
    if(getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < ((bulbLengthInInches * 5.0) + (windowLengthInInches * 0.05) + (getBlinkCounter()/getBlinkCounter() + 10)))){
      damage();
      return getIsWorking();
    }
    else {
      return getIsWorking();
    }
    }
    else{
      return getIsWorking();
    }
  }
  public boolean glareLight(){

    if(getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < ((bulbLengthInInches * 5.5) +(getBlinkCounter()/getBlinkCounter() + 10)+(windowLengthInInches * 0.10)))){
      damage();
      return getIsWorking();
    }
    else {
      return getIsWorking();
    }
    }
    else{
      return getIsWorking();
    }
  }

  public String toString(){
    String m = "";
    m += "This is the " + getNameOfComponent() + " and it is ";
    if (getIsWorking()){
      m += "working ";
    }
    else{
      m+= "not working. ";
    }
    m += "The bulb type is " + getBulbType() + ",the color of the bulb is " + getColor() + ",the bulb length in centimeters is " + getBulbLengthInInches() + ",and the window length in centimeters is " + getWindowLengthInInches() + ".";
    return m;
  }
  public String action1(){
    return flashLight();
  }
  public String action2(){
    return glareLight();
  }
  public String damage(){
    setIsWorking(false);
    return "The headlight is damaged.";
  }
  public String fix(){
    setIsWorking(true);
    return "The headlight is fixed.";
  }
  public void setBulbType(String type){
    this.bulbType = type;
  }
  public String getBulbType(){
    return this.bulbType;
  }
  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return this.color;
  }
  public void setBulbLengthInInches(double bulbLengthInInches){
    this.bulbLengthInInches = bulbLengthInInches;
  }
  public double getBulbLengthInInches(){
    return this.bulbLengthInInches;
  }
  public void setWindowLengthInInches(double windowLengthInInches){
    this.windowLengthInInches = windowLengthInInches;
  }
  public double getWindowLengthInInches(){
    return this.windowLengthInInches;
  }
  public void setBlinkCounter(int blinkCounter){
    this.blinkCounter = blinkCounter;
  }
  public int getBlinkCounter(){
    return this.blinkCounter;
  }

}
*/