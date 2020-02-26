//kenzo khowdee
public class Worm extends Annelids
{
    //instance variables
    private Heart heart1;
    private Heart heart2;
    private Heart heart3;
    private Heart heart4;
    private Heart heart5;
    //constructors
    public Worm(String name, int currentAgeInYears, double ageInyears,  boolean isAlive, double weightOfBrain, String colorOfHeart, double mouthSizeInInches, 
    int sizeOfTailInCM){
        super(name, currentAgeInYears, ageInyears, isAlive, weightOfBrain, colorOfHeart, mouthSizeInInches, sizeOfTailInCM);
        this.heart1= new Heart(colorOfHeart, isAlive);
        this.heart2= new Heart(colorOfHeart, isAlive);
        this.heart3= new Heart(colorOfHeart, isAlive);
        this.heart4= new Heart(colorOfHeart, isAlive);
        this.heart5= new Heart(colorOfHeart, isAlive);

    }

    public Worm(String name, int currentAgeInYears, double ageInyears,   double weightOfBrain, String colorOfHeart, double mouthSizeInInches, 
    int sizeOfTailInCM){
        super(name, currentAgeInYears, ageInyears, true, weightOfBrain, colorOfHeart, mouthSizeInInches, sizeOfTailInCM);
        this.heart1= new Heart(colorOfHeart, true);
        this.heart2= new Heart(colorOfHeart, true);
        this.heart3= new Heart(colorOfHeart, true);
        this.heart4= new Heart(colorOfHeart, true);
        this.heart5= new Heart(colorOfHeart, true);

    }
    //methods
    @Override
    public String weakAction(){
        return wiggle();
    }

    @Override
    public String toString(){
        String message = "";
        message += super.toString();
        message+= "/n" + "The first heart is";
        if(this.heart1.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message+= "/n" + "The second heart is";
        if(this.heart2.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message+= "/n" + "The third heart is";
        if(this.heart3.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message+= "/n" + "The fourth heart is";
        if(this.heart4.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        message+= "/n" + "The fifth heart is";
        if(this.heart5.getIsWorking())
            message += "working.";
        else
            message += "not working.";
        return message;
    }

    @Override
    public String normalAction(){
        return eat();
    }

    @Override
    public String strongAction(){
        return burrow();
    }

    @Override
    public String revive(){
        return heal();
    }

    public Heart getHeart1(){
        return this.heart1;
    }

    public Heart getHeart2(){
        return this.heart2;
    }

    public Heart getHeart3(){
        return this.heart3;
    }

    public Heart getHeart4(){
        return this.heart4;
    }

    public Heart getHeart5(){
        return this.heart5;
    }

    public String burrow(){
        String burrow= "";
        if(super.getMouth().getIsWorking() && super.getBrain().getIsWorking() &&this.heart1.getIsWorking() && this.heart2.getIsWorking() &&this.heart3.getIsWorking() &&this.heart4.getIsWorking() &&this.heart5.getIsWorking() ){
            burrow+= "The animal is healthy and is burrowing it's self.";
        }
        else{
            burrow+= "The animal is not in a condition to burrow.";
        }
        return burrow;
    }

    public String eat(){
        String eat = "";
        if(super.getMouth().getIsWorking() && super.getBrain().getIsWorking() &&this.heart1.getIsWorking() && this.heart2.getIsWorking() &&this.heart3.getIsWorking() &&this.heart4.getIsWorking() &&this.heart5.getIsWorking() ){
            eat+= "Your mouth is prepared and eats some worm food.";

        }
        else{
            eat+= "You are broken and can not eat the worm food";
        }
        return eat;
    }

    public String wiggle(){
        String wiggle = "";
        if (super.getTail().getIsWorking() && super.getMouth().getIsWorking() && super.getBrain().getIsWorking() &&this.heart1.getIsWorking() && this.heart2.getIsWorking() &&this.heart3.getIsWorking() &&this.heart4.getIsWorking() &&this.heart5.getIsWorking()){
            wiggle+= "You wiggle all round in the mud";
        }
        else{
            wiggle+= "Your body is so frail that you are unable to wiggle";
        }
        return wiggle;
    }

    public String heal(){
        return "You have been revived." + "/n" +super.getBrain().heal() + "/n" +super.getTail().heal() +"/n" + super.getMouth().heal() +"/n" +  this.getHeart1().heal()
        + "/n" +this.getHeart2().heal() + "/n" +this.getHeart3().heal() +"/n" + this.getHeart4().heal() + "/n" +this.getHeart5().heal();
    }
}
