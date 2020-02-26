public class Mule extends Mammal {
 private Leg frontLeftLeg;
 private Leg frontRightLeg;
 private Leg backLeftLeg;
 private Leg backRightLeg;
 private Tail tail;
 private Butt butt;
public Mule(String name,  int currentAge, boolean isAlive,
double weightOfBrain, String rightEyeColor, 
String  leftEyeColor,  int noseSensitivity,String leftEarSize
, String rightEarSize, double  mouthSizeInInches, 
String colorOfHeart,String nameOfNose, 
String  nameOfRightEye,String  nameOfLeftEye, 
String  nameOfLeftEar, String nameOfRightEar, 
int tailLengthInCm, String nameOfTail,
int lengthOfLegsInInches, 
String nameOfFrontLeftLeg,
String nameOfFrontRightLeg, 
String nameOfBackLeftLeg,
String  nameOfBackRightLeg, String nameOfButt,
int anusSizeInch, int  cheekSizeInch, 
int poopSizeInch, String texture, boolean isHairy){
super(name,currentAge, isAlive, weightOfBrain, 
     rightEyeColor,  leftEyeColor,  nameOfNose, isAlive,  noseSensitivity,leftEarSize, 
   rightEarSize,  mouthSizeInInches,  colorOfHeart, 
     nameOfRightEye,  nameOfLeftEye,nameOfLeftEar, nameOfRightEar,
     "mouth" ,  isAlive,isAlive,  isAlive, isAlive,  isAlive, isAlive);
     this.frontLeftLeg= new Leg (nameOfFrontLeftLeg,lengthOfLegsInInches,isAlive);
     this.frontRightLeg= new Leg (nameOfFrontRightLeg,lengthOfLegsInInches,isAlive);
     this.backLeftLeg= new Leg (nameOfBackLeftLeg,lengthOfLegsInInches,isAlive);
     this.backRightLeg= new Leg ( nameOfBackRightLeg,lengthOfLegsInInches,isAlive);
     this.tail = new Tail (tailLengthInCm,isAlive,nameOfTail);
     this.butt = new Butt(cheekSizeInch,anusSizeInch,poopSizeInch,texture,isHairy,isAlive);


}
public Mule(String name,  int currentAge, boolean isAlive,
double weightOfBrain, String rightEyeColor, 
String  leftEyeColor,  int noseSensitivity,String leftEarSize
, String rightEarSize, double  mouthSizeInInches, 
String colorOfHeart,String nameOfNose, 
String  nameOfRightEye,String  nameOfLeftEye, 
String  nameOfLeftEar, String nameOfRightEar 
){
super(name,currentAge, isAlive, weightOfBrain, 
     rightEyeColor,  leftEyeColor,  nameOfNose, isAlive,  noseSensitivity,leftEarSize, 
   rightEarSize,  mouthSizeInInches,  colorOfHeart, 
     nameOfRightEye,  nameOfLeftEye,nameOfLeftEar, nameOfRightEar,
     "mouth" ,  isAlive,isAlive,  isAlive, isAlive,  isAlive, isAlive);
     this.frontLeftLeg= new Leg ("front left leg",10,isAlive);
     this.frontRightLeg= new Leg ("front right leg",10,isAlive);
     this.backLeftLeg= new Leg ("back left leg",10,isAlive);
     this.backRightLeg= new Leg("back right leg",10,isAlive);
     this.tail = new Tail (5,isAlive,"tail");
     this.butt = new Butt(5,1,4,"smooth",true,isAlive);
     

}
@Override
public String weakAction(){

 return relax();
}
@Override
public String  normalAction(){

  return experienceSignificantEmotionalEvent();
}
@Override
public String  strongAction(){

 return attack();
}
@Override
public String toString(){
  return getName()+" "+super.toString();
}
public String visitHospital(){
      getLeftEar().heal();
       getRightEar().heal();
         getLeftEye().heal();
        getRightEye().heal();
        this.tail.heal();
        getBrain().heal();
        this.butt.heal();
        this.frontLeftLeg.heal();
          this.backLeftLeg.heal();
           this.frontRightLeg.heal();
            this.backRightLeg.heal();
          getMouth().heal();
          getNose().heal();
            getHeart().heal();
 
        return ("The Mule has been resuscitated.");
}

public String injure(){
  return super.setIsAlive(false);
}
public String experienceSignificantEmotionalEvent(){
       
  if(getBrain().getIsWorking()&& getHeart().getIsUsable()){
           return this.butt.fart()+ " "+ getHeart().heartAttack()+" "+getBrain().injure()+" " + getNose().injure();    
        }
        else{
         return " The Mule is already dead.";
         
        }
    }
public String relax(){
   if(getBrain().getIsWorking()&& getHeart().getIsUsable()){
           return getMouth().eat()+" "+this.tail.wag()+" " + this.butt.excrete()+this.butt.fart();    
        }
        else{
         return " The Mule has been dead.";
         
        }
}
public String attack(){
        
         if(getBrain().getIsWorking()&& getHeart().getIsUsable()){
           
            return getBrain().sendSignals()+" "+getHeart().beat()+" "+ this.frontLeftLeg.step()+" " +this.backLeftLeg.step()+" " 
            +this.backRightLeg.step()+" " +this.frontRightLeg.step();
        }
        else{
            return "Your Mule is dead.";
            
        } 
    }
  public Leg getFrontLeftLeg(){
      return this.frontLeftLeg;
  }
  public Leg getFrontRightLeg(){
      return this.frontRightLeg;
  } 
  public Leg getBackLeftLeg(){
      return this.backLeftLeg;
  }
  public Leg getBackRightLeg(){
      return this.backRightLeg;
  }
  public Tail tail(){
    return this.tail;

  }
  public Butt butt(){
    return this.butt;
    
  }










}