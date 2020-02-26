class Brain {
  public static void main(String[] args) {
    Brain brain1 = new Brain(50.0);
    System.out.println(brain1.sendSignals());
    System.out.println(brain1.sendSignals());
  }

  //instance variables
  private double weight;
  private boolean isWorking;

  //2 constructors (overloaded)
  public Brain(double weight, boolean isWorking) {
    this.weight = weight;
    this.isWorking = isWorking;
  }

  public Brain(double weight) {
    this.weight = weight;
    isWorking = true;
  }

  //methods
  public String sendSignals() {
    if(isWorking)
        {
            if(((int) (Math.random()*100)+1)>90)
            {
                return injure() + " The brain cannot send signals at this time.";
                
            }
            return "The brain has sent signals.";
        }
        else
        {
            return "The brain does not send signals.";
        }
  }

  public String injure() {
    this.isWorking = false;
    return "The brain is injured.";
  }

  public String heal() {
    if(isWorking) {
      return "The brain was already working fine.";
    }
    else {
      this.isWorking = true;
      return "The brain has been healed and is now working.";
    } 
  }
}
