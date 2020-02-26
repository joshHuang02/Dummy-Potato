public class Tail{
  private int lengthInCm; 
  private boolean isWorking; 

  public Tail(int l, boolean w){
    lengthInCm = l; 
    isWorking = w; 
  }

  public String wag(){
    if (isWorking){
      return "tail wags"; 
    }
    else{
      return "tail cannot wag";
    }

  }
  public String injure(){
    isWorking = false; 
    return "you broke its tail..";
  }
  public String heal(){
    isWorking = true; 
    return "you gave it a healing potion. its tail is working now!";
  }

  public int getLength(){
    return lengthInCm; 
  }
  public void setLength(int l){
    lengthInCm = l;
  }

  public boolean getIsWorking(){
    return isWorking; 
  }
  public void setIsWorking(boolean w){
    isWorking = w;
  }

}