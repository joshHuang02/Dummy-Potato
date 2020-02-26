
public class CreatingObjects{
    public static void main(String[] args) {       
       // Dog is the class, new Dog() is creating a new space in memory for the new dog
       Dog husky = new Dog();
       Dog shiba = new Dog();
       Dog doge = new Dog(5, 6.7);
       Dog cat = new Dog(69, 6.9);
       
       //confirming existence of dog
       System.out.println("Dog Reference:");
       System.out.println(husky);
       System.out.println(shiba);
       System.out.println(doge + "\n");
       
       //setting the size
       husky.setAgeInYears(56);
       husky.setSizeInPounds(56.6);
       shiba.setAgeInYears(420);
       shiba.setSizeInPounds(66.6);
       
       //testing our variables
       System.out.println("Husky age: " + husky.getAgeInYear());
       System.out.println("Husky size: " + husky.getSizeInPounds());
       System.out.println("Husky's legs: " + husky.numberOfLegs);
       System.out.println("Doge age: " + doge.getAgeInYear());
       System.out.println("Doge size: " + doge.getSizeInPounds());
       System.out.println("Cat size: " + cat.getSizeInPounds());
       
      
    }
}
