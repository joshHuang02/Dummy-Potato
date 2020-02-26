public class Mouth{
    private double mouthSizeInInches;
    private boolean isUsable;
    public Mouth(double mouthSizeInInches,boolean isUsable){
      this.mouthSizeInInches = mouthSizeInInches;
      this.isUsable=isUsable;

    }
    public Mouth(boolean isUsable){  
      this.isUsable = isUsable;
      this.mouthSizeInInches = 0;
      }
    public String eat()
    {
      if(isUsable){
        if(((int)(Math.random()*100))+1>70)
        {
          return injure() + " The mouth can not eat.";
        }
        return "The mouth eats.";
      }
      else
      {
        return "The mouth does not eat.";
      }

    }
    public String injure()
    {
      this.isUsable = false;
      return "The mouth is injured.";
    }
    public String heal()
    {
      if(isUsable)
      {
        return "The mouth was already fine and does not need healing.";
      }
      else
      {
        this.isUsable = true;
          return "The mouth was healed and is now working.";
      }
    }
    public double getMouthSizeInInches(){
      return this.mouthSizeInInches;
    }
    public boolean getIsUsable(){
      return this.isUsable;
    }
    public void setMouthSizeInInches(double mouthSizeInInches){
      this.mouthSizeInInches=mouthSizeInInches;
    }
    public void setIsUsable(boolean isUsable){
      this.isUsable=isUsable;
    }
}