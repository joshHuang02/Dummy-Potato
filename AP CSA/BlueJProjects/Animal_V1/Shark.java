public class Shark
{
    //instance variables
    private String name;
    private int age;
    private Eye rightEye;
    private Eye leftEye;
    private Gills rightSideGill;
    private Gills leftSideGill;
    private Mouth mouth;
    private Nose nose;
    private Heart heart;
    private Brain brain;
    private Tail tail;
    private Fin rightPectoralFin;
    private Fin leftPectoralFin;
    private Fin rightDorsalFin;
    private Fin leftDorsalFin;

    //constructors
    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
        this.rightEye = new Eye("black");
        this.leftEye = new Eye("black");
        this.rightSideGill = new Gills(10);
        this.leftSideGill = new Gills(10);
        this.mouth = new Mouth(36, true);
        this.nose = new Nose(3);
        this.heart = new Heart("red", true);
        this.brain = new Brain(35);
        this.tail = new Tail(30, true);
        this.rightPectoralFin = new Fin("Right Pectoral");
        this.leftPectoralFin = new Fin("Left Pectoral");
        this.rightDorsalFin = new Fin("Right Dorsal");
        this.leftDorsalFin = new Fin("Left Dorsal");
    }

    public Shark(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.rightEye = new Eye("black", isAlive);
        this.leftEye = new Eye("black", isAlive);
        this.rightSideGill = new Gills(10, isAlive);
        this.leftSideGill = new Gills(10, isAlive);
        this.mouth = new Mouth(36, isAlive);
        this.nose = new Nose(!isAlive, 3);
        this.heart = new Heart("red", isAlive);
        this.brain = new Brain(35, isAlive);
        this.tail = new Tail(30, isAlive);
        this.rightPectoralFin = new Fin("Right Pectoral", isAlive);
        this.leftPectoralFin = new Fin("Left Pectoral", isAlive);
        this.rightDorsalFin = new Fin("Right Dorsal", isAlive);
        this.leftDorsalFin = new Fin("Left Dorsal", isAlive);
    }

    //methods
    public String swim() {
        String response;
        String finStatus;
        rightPectoralFin.swim();
        leftPectoralFin.swim();
        rightDorsalFin.swim();
        leftDorsalFin.swim();
        if (rightPectoralFin.getIsWorking() == true && leftPectoralFin.getIsWorking() == true && rightDorsalFin.getIsWorking() == true && leftDorsalFin.getIsWorking() == true) {
            finStatus = "All fins are working, and the shark is swimming.";
        }
        else {
            finStatus = "One or more fins are not working, and the shark cannot swim.";
        }
        if(!heart.getIsWorking() || !brain.getIsWorking()) {
            response = "The animal is dead.";
        }
        else {
            response = rightSideGill.breathe() + "\n" + leftSideGill.breathe() + "\n" + tail.wag() + "\n" + finStatus + "\n" + nose.breath() + "\n" + heart.beat() + "\n" + brain.sendSignals();
        }
        return response;
    }

    public String blink() {
        String response;
        if(!heart.getIsWorking() || !brain.getIsWorking()) {
            response = "The animal is dead.";
        }
        else {
            response = rightEye.blink() + "\n" + leftEye.blink() + "\n" + heart.beat() + "\n" + brain.sendSignals();
        }
        return response;
    }

    public String feast() {
        String response;
        String finStatus;
        rightPectoralFin.swim();
        leftPectoralFin.swim();
        rightDorsalFin.swim();
        leftDorsalFin.swim();
        if (rightPectoralFin.getIsWorking() == true && leftPectoralFin.getIsWorking() == true && rightDorsalFin.getIsWorking() == true && leftDorsalFin.getIsWorking() == true) {
            finStatus = "All fins are working, and the shark is swimming.";
        }
        else {
            finStatus = "One or more fins are not working, and the shark cannot swim.";
        }
        if(!heart.getIsWorking() || !brain.getIsWorking()) {
            response = "The animal is dead.";
        }
        else {
            response = rightSideGill.breathe() + "\n" + leftSideGill.breathe() + "\n" + tail.wag() + "\n" + finStatus +  "\n" + mouth.eat() + "\n" + heart.beat() + "\n" + brain.sendSignals();
        }
        return response;
    }

    public String regenerate() {
        rightEye.heal();
        leftEye.heal();
        rightSideGill.heal();
        leftSideGill.heal();
        mouth.heal();
        nose.clear();
        heart.heal();
        brain.heal();
        tail.heal();
        rightPectoralFin.heal();
        leftPectoralFin.heal();
        rightDorsalFin.heal();
        leftDorsalFin.heal();
        return "The shark has been healed.";
    }
}
