
/**
 *
 * 
 * @author Tong Su      
 * @version 1/7/2020
 * 
 * 
 * 
 */
public class Tiger
{
    
  private String name;
  private int age;
  
  private Eye rightEye;
  private Eye leftEye;
  
  private Ear leftEar;
  private Ear rightEar;
  
  private Mouth mouth;
  
  private Nose nose;
  
  
  
  
  private Whiskers whisker;
  
  private Leg leg;
  //constructor
  public Tiger(String name , int age)
  {
    this.name = name;
    this.age = age;
   
    
    
    
    }

  
   
  //action
  
  public String eat()
  {
    rightEye.heal();
    leftEye.heal();
    rightEar.heal();
    leftEar.heal();
    mouth.heal();
    nose.clear();
    whisker.heal();
    leg.heal();
    
    
    return"the tiger is healing itself";
    
    }
   
  public String running()
  {
    leg.kick();
    
    rightEar.listenToMusic();
    leftEar.listenToMusic();
    
    if(this.leg.getIsUsable()==false)
    {
    return "the tiger has already dead";
    
    
    }
    else
    return"the tiger is running happily";
    
    
    }
    
  public String smell()
  {
      nose.breath();
      if(nose.getIsStuffed()==false)
      {return"the tiger is allergic";}
      else
      {return"the tiger is smling";}
    }





}
   

