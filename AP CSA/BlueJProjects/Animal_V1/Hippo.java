
public class Hippo
{
     private Eye rightEye;
     private Eye leftEye;
     private Leg leg1;
     private Leg leg2;
     private Leg leg3;
     private Leg leg4;
     private Mouth mouth;
     private Tail tail;
     private Nose nose; 
     private Heart heart; 
   /**
    * Hippo constructor takes the boolean data type isAlive as a parameter
    */
   public void Hippo(boolean isAlive){
      this.rightEye = new Eye("black", isAlive);
      this.leftEye = new Eye("black", isAlive);
      this.leg1 = new Leg(2,isAlive);
      this.leg2 = new Leg(2,isAlive);
      this.leg3 = new Leg(2,isAlive);
      this.leg4 = new Leg(2,isAlive);
      this.mouth = new Mouth(24,isAlive);
      this.tail = new Tail(55,isAlive);
      this.nose = new Nose(!(isAlive), 3);
      this.heart = new Heart("red", isAlive);
    }
   public String chomp(){
       if(this.heart.getIsWorking() && this.mouth.getIsUsable()){
           return this.mouth.eat()+ this.heart.beat() +" The mouth chomps down.";
        }
       else{
           return "Hippo is too injured to chomp.";
        } 
    }
   public String swim(){
       if(this.leg1.getIsUsable() && this.leg2.getIsUsable() && this.leg3.getIsUsable() && this.leg4.getIsUsable()){
           if(this.heart.getIsWorking()){
              return this.leg1.kick()+"\n"+this.leg2.kick()+"\n"+this.leg3.kick()+
              "\n"+this.leg4.kick()+"\n"+this.tail.wag()+"\n"+this.heart.beat()+"\n"+"The hippo swims";
            }
           else{
               return "The hippo's heart is not working";
            }
        }
       else{
           return "The hippo is too injured to swim";
        }
    }
   public String sneeze(){
     if(this.rightEye.getIsUsable() && this.leftEye.getIsUsable()){
         if(this.heart.getIsWorking()){
              return this.rightEye.blink()+"\n"+this.leftEye.blink()+"\n"+this.nose.breath()+"\n"+"The hippo sneezed.";
            }
           else{
               return "The hippo's heart is not working";
            }
        }
     else{
         return "The hippo is too injured to sneeze";
        }
    }
   public String visitDoc(){
       this.rightEye.heal();
       this.leftEye.heal();
       this.leg1.heal();
       this.leg2.heal();
       this.leg3.heal();
       this.leg4.heal();
       this.mouth.heal();
       this.tail.heal();
       this.nose.clear();
       this.heart.heal();
       return "All of the hippo's parts were healed";
    }
}
