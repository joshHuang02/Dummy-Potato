public class Wing{

  // instance variables

  private String color;
  private boolean ableToFly;
  private boolean canKarateChop;
  

  //constructors

  public Wing(String color, boolean ableToFly, boolean canKarateChop)
  {
    this.color = color;
    this.ableToFly = ableToFly;
    this.canKarateChop = canKarateChop;
  }
  
  public Wing(String color, boolean ableToFly)
  { 
    this.color = color;
    this.ableToFly = ableToFly;
    this.canKarateChop = true;
  }

  public Wing(String color)
  { 
    this.color = color;
    this.ableToFly = true;
    this.canKarateChop = true;
  }

  //methods, accessors, mutators

  public String flap()
  {
    if(ableToFly)
    {
      if(((int) (Math.random() * 100)+1) >50)
      {
        return injure() + "The wing cannot flap.";
      }
       return "The wing flaps.";
     }
    else
    {
       return "The wing does not flap.";
    }
  }

  public String injure()
  {
    this.ableToFly = false;
    return "The wing is injured.";
  }

  public String heal()
  {
    if(ableToFly)
    {
      return "The wing was already fine.";
    }
    else
    {
      this.ableToFly = true;
      return "The wing is fine.";
    }
  }

  public String attemptKarateChop(){
    if (canKarateChop){
      if (((int) (Math.random() * 100) + 1) > 20){
        return "Karate chop is successful.";
      } 
      else{
        this.canKarateChop = false;
        return "You lost the ability to karate chop.";
      }
    }
    else{
      return "You cannot karate chop.";
    }
  }

  public String learnToKarateChop(){
    if(canKarateChop){
      return "You already know the ways of the karate chop.";
    }
    else{
      this.canKarateChop = true;
      return "You gained the ability to karate chop.";
    }
  }


  public void setColor(String color)
  {
    this.color = color;
  }  
  public String getColor()
  {
    return color;
  }

  public void setAbleToFly(boolean ableToFly)
  {
    this.ableToFly = ableToFly;
  }
  public boolean getAbleToFly()
  {
    return ableToFly;
  }

  public void setCanKarateChop(boolean canKarateChop){
    this.canKarateChop =  canKarateChop;
  }
  public boolean getCanKarateChop(){
    return this.canKarateChop;
  }
}