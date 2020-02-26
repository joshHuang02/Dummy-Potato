
/**
 * Write a description of class Bat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bat
{
    //instance variables
    private Eye leftEye;
    private Eye rightEye;
    private Ear leftEar;
    private Ear rightEar;
    private Nose nose;
    private Mouth mouth;
    private Wing leftWing;
    private Wing rightWing;
    private Heart heart;
    private Brain brain;
    private Leg leftLeg;
    private Leg rightLeg;
    private Tail tail;

    //constructor
    public Bat(boolean isAlive)
    {
        this.leftEye = new Eye("Brown", true);
        this.rightEye = new Eye("Brown", true);
        this.leftEar = new Ear("Large", true);
        this.rightEar = new Ear("Large", true);
        this.nose = new Nose(false, 7);
        this.mouth = new Mouth(3.0, true);
        this.leftWing = new Wing("Brown", true);
        this.rightWing = new Wing("Brown", true);
        this.heart = new Heart("Red", true);
        this.brain = new Brain(0.5, true);
        this.leftLeg = new Leg(5, true);
        this.rightLeg = new Leg(5, true);
        this.tail = new Tail(10, true);
    }

    //methods

    public String fly()
    {
        if(this.heart.getIsWorking() && this.brain.getIsWorking())
        {
            return this.leftWing.flap() + this.rightWing.flap();
        }
        else
        {
            return "The bat is dead.";
        }
    }

    public String findFood()
    {
        if(this.heart.getIsWorking() && this.brain.getIsWorking())
        {
            if(this.leftEye.getIsUsable() && this.rightEye.getIsUsable() == true)
            {
              return "The bat has found food.";
            }
            else
            {
              return "The bat cannot see to find food.";
            }
        }
        else
        {
          return "The bat is dead.";
        }
    }

    public String heal()
    {
      if(!this.heart.getIsWorking() || !this.brain.getIsWorking())
      {
        return "The bat is injured." + "The bat has been healed.";
      }
      else if(this.heart.getIsWorking() && this.brain.getIsWorking())
      {
        if(this.leftWing.getAbleToFly() && this.leftWing.getAbleToFly())
        {
            return "The bat is okay.";
        }
        else
        {
            return "The bat has been healed.";
        }
      }
      else
      {
          return "The bat is healed.";
      }
    }
    }

