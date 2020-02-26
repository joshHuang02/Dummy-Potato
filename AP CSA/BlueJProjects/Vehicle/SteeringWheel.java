public class SteeringWheel extends CarComponent{
  private String type;
  private double diameterInInches;
  public SteeringWheel(String nameOfComponent, boolean isWorking, double chanceOfFailure, String type, double diameterInInches){
    super(nameOfComponent, isWorking, chanceOfFailure);
    this.type = type;
    this.diameterInInches = diameterInInches;
  }
  public SteeringWheel(String type, double diameterInInches){
    super("Steering Wheel", true);
    this.type = type;
    this.diameterInInches = diameterInInches;
  }
  public String steer(){
    if (getIsWorking()){
      if (!super.conditionalCheck()){
      return damage() + "The steering wheel no longer steers.";
    }
      else {
      return "The steering wheel steers.";
    }
    }
    else {
      return "The steering wheel cannot steer because it has broken.";
    }
  }
  public String turn(){
    if (getIsWorking()){
      if (!super.conditionalCheck()){
      return damage() + "The steering wheel no longer steers.";
    }
    else {
      return "The steering wheel steers.";
    }
  }
    else {
      return "The steering wheel cannot steer because it is broken.";
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
    m += "The wheel type is " + getType() + " and the diameter of the wheel is " + getDiameterInInches() + ".";
    return m;
  }
  public String action1(){
    return steer();
  }
  public String action2(){
    return turn();
  }
  public String damage(){
    setIsWorking(false);
    return "The steering wheel has broken.";
  }
  public String fix(){
    setIsWorking(true);
    return "The steering wheel has been repaired.";
  }
  public void setType(String type){
    this.type = type;
  }
  public String getType(){
    return this.type;
  }
  public void setDiameterInInches(int diameterInInches){
    this.diameterInInches = diameterInInches;
  }
  public double getDiameterInInches(){
    return this.diameterInInches;
  }
}

/*public class SteeringWheel extends CarComponent{
  private String type;
  private double diameterInInches;
  private int amountOfSteers;
  
  public SteeringWheel(String nameOfComponent, boolean isWorking, double chanceOfFailure, String type, double diameterInInches){
    super(nameOfComponent, isWorking, chanceOfFailure);
    this.type = type;
    this.diameterInInches = diameterInInches;
  }
  public SteeringWheel(String type, double diameterInInches){
    super("Steering wheel", true);
    this.type = type;
    this.diameterInInches = diameterInInches;
  }
  public String steer(){
    amountOfSteers++;
    if (getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < ((diameterInInches * 0.25) + (getAmountOfSteers()/(getAmountOfSteers()+10)) ))){
      return damage() + "The steering wheel no longer steers.";
    }
      else {
      return "The steering wheel steers.";
    }
    }
    else {
      return "The steering wheel cannot steer because it has broken.";
    }
  }
  public String turn(){
    amountOfSteers++;
    if (getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < ((diameterInInches * 0.5) + (getAmountOfSteers()/getAmountOfSteers() + 10)))){
      return damage() + "The steering wheel no longer steers.";
    }
    else {
      return "The steering wheel steers.";
    }
  }
    else {
      return "The steering hweel cannot steer because it is broken.";
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
    m += "The wheel type is " + getType() + " and the diameter of the wheel is " + getDiameterInInches() + ".";
    return m;
  }
  public String action1(){
    return steer();
  }
  public String action2(){
    return turn();
  }
  public String damage(){
    setIsWorking(false);
    return "The steering wheel has broken.";
  }
  public String fix(){
    setIsWorking(true);
    return "The steering wheel has been repaired.";
  }
  public void setType(String type){
    this.type = type;
  }
  public String getType(){
    return this.type;
  }
  public void setDiameterInInches(double diameterInInches){
    this.diameterInInches = diameterInInches;
  }
  public double getDiameterInInches(){
    return this.diameterInInches;
  }
  public void setAmountOfSteers(int amountOfSteers){
    this.amountOfSteers = amountOfSteers;
  }
  public int getAmountOfSteers(){
    return this.amountOfSteers;
  }
}
*/