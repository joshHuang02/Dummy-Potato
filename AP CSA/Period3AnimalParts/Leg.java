public class Leg {
  //instance(s)
  private int length;
  private boolean isUsable;
  //constructor(s)
  public Leg(int length)
  {
    this.length = length;
	this.isUsable=true;
  }
  public Leg(int length, boolean isUsable)
  {
    this.length = length;
    this.isUsable = isUsable;
  }
  //method(s)
  public void setLength(int length)
  {
    this.length = length;
  }
  public int getLength()
  {
    return length;
  }
  public void setIsUsable(boolean isUsable)
  {
    this.isUsable = isUsable;
  }
  public boolean getIsUsable()
  {
    return this.isUsable;
  }
  public String injure()
  {
    this.isUsable = false;
    return "The leg is broken.";
  }
    
  public String heal()
  {
    if(isUsable) {
      return "The leg was already working.";
    }
    else {
      this.isUsable = true;
      return "The leg is no longer broken.";
    }
  }
  public String kick() 
  {
    if(isUsable){
      if(((int)(Math.random()*100)+1)>80){
        this.isUsable = false;
        return injure()+" The leg can no longer kick.";
      }
      else {
        return "The leg kicked.";
      }
    }
    else {
      return "The leg can not kick.";
    }
  }
}