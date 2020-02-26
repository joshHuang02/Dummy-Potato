
/**
 * Write a description of class Salmon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salmon
{
    private String name;
    private Eye leftEye;
    private Eye rightEye;
    private Brain brain;
    private Heart heart;
    private Mouth mouth;
    private Gills leftGills;
    private Gills rightGills;
    private Tail tail;

    public Salmon(String name)
    {
        leftEye = new Eye("Left Eye", "Gray", true);
        rightEye = new Eye("Right Eye", "Gray", true);
        brain = new Brain(0.2, true);
        heart = new Heart("Red", true);
        mouth = new Mouth(2, true);
        leftGills = new Gills(3, true);
        rightGills = new Gills(3, true);
        tail = new Tail(30, true);
    }

    public String swim()
    {
        if(!this.heart.getIsWorking() || !this.brain.getIsWorking() || !this.leftGills.getIsUsable() || !this.rightGills.getIsUsable() || !this.tail.getIsWorking())
        {
            return "The salmon is injured and cannot swim.";
        }
        return "The salmon can swim.";
    }
    
    public String swallow()
    {
       if(!this.heart.getIsWorking() || !this.brain.getIsWorking() || !this.leftGills.getIsUsable() || !this.rightGills.getIsUsable() || !this.mouth.getIsUsable())
        {
            return "The salmon is injured and cannot swallow..";
        } 
       return "The salmon can swallow.";
    }
    
    public String jump()
    {
    if(!this.heart.getIsWorking() || !this.brain.getIsWorking() || !this.leftGills.getIsUsable() || !this.rightGills.getIsUsable() || !this.leftEye.getIsUsable() || !this.rightEye.getIsUsable())
        {
            return "The salmon is injured and cannot jump.";
        }
        return "The salmon can jump.";
    }
    
    public String goToFishHospital()
    {
        return this.leftEye.heal() + " " + this.rightEye.heal() + " " + this.heart.heal() + " " + this.brain.heal() + " " + this.leftGills.heal() + " " + this.rightGills.heal() + " " + this.mouth.heal() + " " + this.tail.heal();
    }
}
