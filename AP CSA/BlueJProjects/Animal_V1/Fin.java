class Fin
{
  //instance variables
  private String finType;
  private boolean isWorking;
  //constructors
  public Fin(String finType, boolean isWorking)
  {
    this.finType = finType;
    this.isWorking = isWorking;
  }
  public Fin(String finType)
  {
    this.finType = finType;
    isWorking = true;
  }
  // method(s), accessor(s), mutator(s)
  public void setFinType(String finType)
  {
    this.finType = finType;
  }

  public String getFinType()
  {
    return finType;
  }

  public String swim()
  {
    if(isWorking)
    {
    if(((int)(Math.random()*100+1)<=45))
  {
    return injure() + "So you can not swim";
  }
  return "The fish swam";
  }
  else
  {
    return "The fish can not swim";
  }
  }

public String injure()
    {
        this.isWorking = false;
        return "The fin is damaged.";
    }

    public String heal()
    {
        if(isWorking)
        {
            return "The fin was already good.";
        }
        else
        {
            this.isWorking = true;
            return "The fin is now working.";
        }
        
    }

    public String setIsWorking(boolean isWorking)
    {
        this.isWorking = isWorking;
        if(isWorking)
            return "The fin is working.";
        else
            return "The fin is damaged.";
    }

    public boolean getIsWorking()
    {
        return this.isWorking;
    }
}
