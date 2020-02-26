//Josh Huang, so lonely...
public class Cnidaria extends Animal {
    //instance variables
    private Mouth mouth;
    private Tentacle tentacles[];

    //constructors
    //Simple version
    public Cnidaria() {
        super("Jellyfish", 2.3, true, .5);
        mouth = new Mouth(2.5);
        tentacles = new Tentacle[10];
        for(int i = 0; i < tentacles.length ; i++) {
            tentacles[i] = new Tentacle("black", "tentacle", tue);
        }
    }
    //complete version
    public Cnidaria (String name, double currentAgeInYears, boolean isAlive, double weightOfBrain, String nameOfMouth, double mouthSizeInInches, boolean mouthIsWorking, String tentaclesColor){
        super(name, currentAgeInYears, isAlive, weightOfBrain);
        mouth = new Mouth(nameOfMouth, mouthSizeInInches, mouthStatus);
        tentacles = new Tentacle[10];
        for(int i = 0; i < tentacles.length ; i++) {
            tentacles[i] = new Tentacle(tentaclesColor);
        }
    }

    //----------------------------------------------------------------------------------------//
    //methods
    public Mouth getMouth() {
        return this.mouth;
    }

    public tentacles[] getTentacles() {
        return this.tentacles;
    }

    @Override
    public String toString() {
        int workingTentacles = 0;
        for(int i = 0; i < tentacles.length ; i++) {
            if (tentacle[i].getIsWorking()) workingTentacles ++;
        }
        String message = "This is a cnidaria, basically just jellyfishes. It has one mouth and " + tentacles.length + " tentacles, " + workingTentacles + " of which is working.";
        return message;
    }
}