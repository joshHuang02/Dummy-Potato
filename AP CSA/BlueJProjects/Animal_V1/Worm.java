public class Worm
{
  
    private Brain brain;
    private Heart heart1;
    private Heart heart2;
    private Heart heart3;
    private Heart heart4;
    private Heart heart5;
    private Tail tail;
    private Mouth mouth;
    private int size;
    private String color;
    private boolean lifeStatus;
    private double weight;
    public Worm(int size , String color,boolean lifeStatus, double weight ){
        this.color = color;
        this.size = size;
        this.lifeStatus = lifeStatus;
        this.weight = weight;
         heart1 = new Heart(color, lifeStatus);
        heart2 = new Heart(color, lifeStatus);
       heart3 = new Heart(color, lifeStatus);
       heart4 = new Heart(color, lifeStatus);
       heart5 = new Heart(color, lifeStatus);
       tail = new Tail(5 , lifeStatus);
       brain = new Brain(2 , lifeStatus);
         mouth = new Mouth(0.0001 , lifeStatus);
    }

    public Worm(String color, boolean lifeStatus){
         heart1 = new Heart(color, lifeStatus);
        heart2 = new Heart(color, lifeStatus);
       heart3 = new Heart(color, lifeStatus);
       heart4 = new Heart(color, lifeStatus);
       heart5 = new Heart(color, lifeStatus);
       tail = new Tail(5 , lifeStatus);
       brain = new Brain(2 , lifeStatus);
         mouth = new Mouth(0.0001 , lifeStatus);
    }

    public String restore(){
        return this.heart1.heal() + 
        this.heart2.heal() +
        this.heart3.heal() +
        this.heart4.heal()+
        this.heart5.heal() +
        this.brain.heal() +this.tail.heal() + this.mouth.heal();
    }

    public String consume(){
       if(!this.heart1.getIsWorking() || !this.brain.getIsWorking() ||!this.heart2.getIsWorking() || !this.heart3.getIsWorking() || !this.heart4.getIsWorking() || !this.heart5.getIsWorking()){
         return "The worm is dead.";
        }
       else{
            return this.mouth.eat();
        }
    }

    public String wiggle(){
        if(!this.heart1.getIsWorking() || !this.brain.getIsWorking() ||!this.heart2.getIsWorking() || !this.heart3.getIsWorking() || !this.heart4.getIsWorking() || !this.heart5.getIsWorking()){
            return "The worm is dead.";
        }
        else if(!this.tail.getIsWorking()){
            return "you can not wiggle when you have a broken tail.";
        }
        else{
            return tail.wag() + " and your worm travels through the dirt." ;
        }
    }

    public String thinkAboutLife(){
        if(!this.heart1.getIsWorking() || !this.brain.getIsWorking() ||!this.heart2.getIsWorking() || !this.heart3.getIsWorking() || !this.heart4.getIsWorking() || !this.heart5.getIsWorking()){
            return "The worm is dead.";
        }
        else{
            return "You countinue living and think about your life as a worm";
        }
    }
}




