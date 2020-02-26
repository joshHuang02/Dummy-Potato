
public class Axle extends CarComponent
{
   // instance variables
   private double thicknessInInches;
   private double lengthInInches; 
   private boolean isWorking;
   // constructors
   
   public Axle(String nameOfComponent, boolean isWorking, double thicknessInInches, double lengthInInches)
   {
     super(nameOfComponent, isWorking);
     this.thicknessInInches = thicknessInInches;
     this.lengthInInches = lengthInInches;
     //this.isWorking = isWorking;  
   }
    
   // methods
   public String spin()
   {
       if (getIsWorking())
       {
           if (!super.conditionalCheck())
           {
               damage();
               return "The axle cannot spin."; 
           }
           return "The axle spins.";
       }
       else
       {
           return "The axle cannot spin."; 
       }
   }
   
   public String transferPower()
   {
       if (getIsWorking())
       {
           if (!super.conditionalCheck())
           {
               damage();
               return "The axle cannot transfer power."; 
           }
           return "The axle transfers power.";
       }
       else
       {
           return "The axle cannot transfer power."; 
       }
   }
   
   @Override
   public String action1()
   {
      
       return  spin();
   }
   
   @Override
   public String action2()
   {
        
        return transferPower();
   }
   
   @Override
   public String damage()
   {
       setIsWorking(false);
       return "The axle is damaged.";
   }
   
   @Override
   public String fix()
   {
       if (getIsWorking())
           return "The axle is already working.";
       else
       {
           setIsWorking(true);
           return "The axle is fixed.";
       }
   }
   
   @Override
   public String toString()
   {
       String message = "";
       message += super.toString();
       message += "The thickness in cm is " + getThicknessInInches() + ". \n";
       message += "The length in cm is " + getLengthInInches() + ". \n"; 
       return message;
   } 
   
   // getters and setters
   public void setThicknessInInches(double thicknessInInches)
   {
       this.thicknessInInches = thicknessInInches;
   }
   
   public double getThicknessInInches()
   {
       return thicknessInInches; 
   }
   
   public void setLengthInInches(double lengthInInches)
   {
       this.lengthInInches = lengthInInches;
   }
   
   public double getLengthInInches()
   {
       return lengthInInches; 
   }
  
   public void setIsWorking(boolean isWorking)
   {
       this.isWorking = isWorking;
   }
   
   public boolean getIsWorking()
   {
       return isWorking; 
   }
   
}

//OLD CODE BELOW
/*
public class Axle extends CarComponent
{
   // instance variables
   private double thicknessInCm;
   private double lengthInCm; 
   private boolean isWorking;
   // constructors
   
   public Axle(String nameOfComponent, boolean isWorking, double thicknessInCm, double lengthInCm)
   {
     super(nameOfComponent, isWorking);
     this.thicknessInCm = thicknessInCm;
     this.lengthInCm = lengthInCm;
     //this.isWorking = isWorking;  
   }
    
   // methods
   public String spin()
   {
       if (getIsWorking())
       {
           if (((int)(Math.random() * 100) + 1) > 10)
           {
               damage();
               return "The axle cannot spin."; 
           }
           return "The axle spins.";
       }
       else
       {
           return "The axle cannot spin."; 
       }
   }
   
   public String transferPower()
   {
       if (getIsWorking())
       {
           if (((int)(Math.random() * 100) + 1) > 10)
           {
               damage();
               return "The axle cannot transfer power."; 
           }
           return "The axle transfers power.";
       }
       else
       {
           return "The axle cannot transfer power."; 
       }
   }
   
   @Override
   public String action1()
   {
       return spin();
   }
   
   @Override
   public String action2()
   {
       return transferPower();
   }
   
   @Override
   public String damage()
   {
       setIsWorking(false);
       return "The axle is damaged.";
   }
   
   @Override
   public String fix()
   {
       if (getIsWorking())
           return "The axle is already working.";
       else
       {
           setIsWorking(true);
           return "The axle is fixed.";
       }
   }
   
   @Override
   public String toString()
   {
       String message = "";
       message += super.toString();
       message += "The thickness in cm is " + getThicknessInCm() + ". \n";
       message += "The length in cm is " + getLengthInCm() + ". \n"; 
       return message;
   } 
   
   // getters and setters
   public void setThicknessInCm(double thicknessInCm)
   {
       this.thicknessInCm = thicknessInCm;
   }
   
   public double getThicknessInCm()
   {
       return thicknessInCm; 
   }
   
   public void setLengthInCm(double lengthInCm)
   {
       this.lengthInCm = lengthInCm;
   }
   
   public double getLengthInCm()
   {
       return lengthInCm; 
   }
  
   public void setIsWorking(boolean isWorking)
   {
       this.isWorking = isWorking;
   }
   
   public boolean getIsWorking()
   {
       return isWorking; 
   }
   
}
*/