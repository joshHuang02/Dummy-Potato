public class CarComponent{
	private String nameOfComponent;
	private boolean isWorking;
  private double chanceOfFailure;
	
	public CarComponent(String nameOfComponent, boolean isWorking,double chanceOfFailure) {
		this.nameOfComponent = nameOfComponent;
		this.isWorking = isWorking;
    this.chanceOfFailure=chanceOfFailure;
	}
  	public CarComponent(String nameOfComponent, boolean isWorking) {
		this.nameOfComponent = nameOfComponent;
		this.isWorking = isWorking;
    this.chanceOfFailure=5;
	}
  public void calculateChanceOfFailure(double speed,double constant){
   this.chanceOfFailure+=speed*constant;
  }
  public boolean conditionalCheck(){
     return (((int)((Math.random()*100))+1.0)>this.chanceOfFailure);
  }
  public void calculateChanceOfFailure(double speed){
   this.chanceOfFailure+=speed*0.3;

  }
  public double getChanceOfFailure(){
    return this.chanceOfFailure;

  }

	public String damage() {
		isWorking = false;
		return "";
	}
	public String fix() {
		isWorking = true;
		return "The " + nameOfComponent + " has been repaired and is now working";
	}
	
	public String action1() {
		return "";
	}
	
	public String action2() {
		return "";
	}
	@Override
	public String toString() {
		if(isWorking) {
			return "The " + nameOfComponent + " is working";
		}else {
			return "The " + nameOfComponent + " is not working"; 
		}
	}
		
	public String getNameOfComponent() {
		return nameOfComponent;
	}


	public void setNameOfComponent(String nameOfComponent) {
		this.nameOfComponent = nameOfComponent;
	}


	public boolean getIsWorking() {
		return isWorking;
	}


	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
}