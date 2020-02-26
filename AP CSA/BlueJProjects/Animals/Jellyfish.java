/**
 * Jellyfish can eat, spit, be afraid, and hunt
 *
 * @author Josh Huang  
 * @version 1/8/2020
 */
public class Jellyfish
{
    private Tentacle tentacle1;
    private Tentacle tentacle2;
    private Tentacle tentacle3;
    private Tentacle tentacle4;
    private Mouth mouth;
    private Tentacle tentacles[];

    public Jellyfish() {

        this.mouth = new Mouth(12, true);
        tentacles = new Tentacle[10];
        for(int i = 0; i < tentacles.length ; i++) {
            tentacles[i] = new Tentacle("black");
        }
    }

    /**
     * Jellyfish will attempt to eat using mouth and tentacle
     *
     * 
     * @return a String describing if the jellyfish ate or not
     */
    public String eatWithTentacles(){
        int workingTentacles = 0;
        for (int i = 0; i < tentacles.length; i++) {
            boolean working = tentacles[i].getIsAttatched();
            if (working == true)
                workingTentacles ++;
        }

        if (workingTentacles > 6) {
            return mouth.eat();
        } else {
            return "The jellyfish does not have enogh tentacles to eat";
        }
    }

    /**
     * Jellyfish will attempt to spit using mouth and tentacle
     *
     * 
     * @return    String describing if the Jellyfish was able to spit
     */
    public String spit() {
        int workingTentacles = 0;
        for (int i = 0; i < tentacles.length; i++) {
            boolean working = tentacles[i].getIsAttatched();
            if (working = true)
                workingTentacles ++;
        }

        if (workingTentacles == tentacles.length) {
            return mouth.spit();
        } else {
            return "The jellyfish's tentacles are hurt and refused to spit";
        }
    }

    /**
     * Jellyfish displays fear by curing its tentacles
     *
     * @return each tentacle curling
     */
    public String fear() {
        String curl = "";
        for (int i = 0; i < tentacles.length; i++) {
            curl += tentacles[i].constrict() + "\n";
        }
        return "The jellyfish is curled up due to fear\n" + curl;
    }

    /**
     * Jellyfish attempts to hunt with tentacles and then eat
     *
     * @return whether or not the Jellyfish can eat and if each tentacle attacked
     */
    public String hunt() {
        String attack = "";
        for (int i = 0; i < tentacles.length; i++) {
            attack += tentacles[i].constrict() + "\n";
        }
        return attack + eatWithTentacles();
    }

    /**
     * heal the Jellyfish
     *
     * @return String confirming if Jellyfish has been healed
     */
    public String heal() {
        for (int i = 0; i < tentacles.length; i++) {
            tentacles[i].heal();
        }
        mouth.heal();
        return "The jellyfish is now healthy";
    }
}
