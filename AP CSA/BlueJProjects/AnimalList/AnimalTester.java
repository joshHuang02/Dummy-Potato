import java.util.*;

public class AnimalTester {
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Dog sprinter = new Dog("sprinter", 1.5, true, 1.1, "RGB", "Rainbow", 2, "Hughmongus", "Giant", 6.9, "violet",
                "sniffer", "light sensor", "proton impactor", "righty", "lefty", "thigh", "limb", "chungus", "stick",
                "swiper", 4, 9, 9, 9, 9, false);
        Jellyfish blobby = new Jellyfish("Blobby", 1.2, true, .1, "consumer", 6.9, true, "rainbow");
        Panda panda = new Panda("Jacanda", 2.1, true, 3.2, "hazel", "light green", "o↓o", true, 3, "small",
                "slightly small", 14.0, "violent red", "optical right circle ┘", "optical left circle├", "L ear",
                "R ear", "existential hole", true, true, true, true, true, true, 12, 12, 12, 12.5, 12.5, "walkerR",
                "walkerL", "stubsR", "stubsL", "short stubs", true, true, true, true, true);
        Shark shark = new Shark("blue", 10, 20, "red", 50, "Bill", 1.5, 3.0, true, false, 2);
        Parrot parrot = new Parrot("carrot", 0.2, true, 2.22, "left eye", "blue", true, "right eye", "green", true, 1.2,
                true, "red", true, true, "red", true, "orange", "left leg", 1, true, "right leg", 1, true);
        Cat cat = new Cat("test", 12, true, 3, "blue", "blue", 2, "big", "big", 4, "red", "right ear", "left ear",
                "left eye", "right eye", "back right leg", "back left leg", "front right leg", "front left leg", 4, 2,
                "tail", true, 1, true);
        Worm worm = new Worm("John", 20, 20.0, true, 0.0001, "red", 0.0001, 4);
        Cow cow = new Cow(10.2, 5, 10, 10, 10, 10, "cow", true, 2.3, "blue", "blue", 5, "big", "big", 7, "red",
                "left eye", "left ear", "right ear", "mouth");
        Bunny bunny = new Bunny("qt", 0.5, true, 0.3, "brown", "brown", "pointy", true, 4, "long", "long", 0.3, "red",
                2.5, 2.5, 4, 4, 3, 3, 2);
        Donkey donkey = new Donkey("Andrew", 5, true, 3.0, "red", "red", "sharp nose", true, 2, "large", "large", 5,
                "red", "keen right eye", "keen left eye", "happy left ear", "happy right ear", "huge mouth", true, true,
                true, true, true, true, 6, true, "long tail", 8, 8, 12, 12, "ferocious front right leg",
                "sad back right leg", "scrumptious front left leg", "unknown back left leg", true, true, true, true);
        List<Animal> animals = new ArrayList();
        animals.add(sprinter);
        animals.add(blobby);
        animals.add(panda);
        animals.add(shark);
        animals.add(parrot);
        animals.add(cat);
        animals.add(worm);
        animals.add(cow);
        animals.add(bunny);
        animals.set(5, animals.get(7));
        animals.add(3, donkey);
        if (animals.contains(sprinter)) {
            // unnecessarily redundant way to give number of elements
            int numberOfElements = 0;
            for (int i = 0; i < animals.size(); i++) {
                numberOfElements++;
            }
            System.out.println("Array List size: " + numberOfElements);
        }
        animals.forEach(animal -> System.out.println(animal.weakAction()));
        animals.forEach(animal -> System.out.println(animal.normalAction()));
        animals.forEach(animal -> System.out.println(animal.revive()));
        animals.forEach(animal -> System.out.println(animal.strongAction()));
        animals.forEach(animal -> System.out.println(animal.toString()));
    }
}
