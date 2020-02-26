/**
 * Write a description of class Jellyfish here.
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

    public String spit() {
        int workingTentacles = 0;
        for (int i = 0; i < tentacles.length; i++) {
            boolean working = tentacles[i].getIsAttatched();
            if (working = true)
                workingTentacles ++;
        }
        
        if (workingTentacles == tentacles.length) {
            return mouth.eat();
        } else {
            return "The jellyfish's tentacles are hurt and refused to spit";
        }
    }
    
    public String fear() {
        String curl = "";
        for (int i = 0; i < tentacles.length; i++) {
            curl += tentacles[i].constrict() + "\n";
        }
        return "The jellyfish is curled up due to fear" + curl;
    }
    public String hunt() {
        String attack = "";
        for (int i = 0; i < tentacles.length; i++) {
            attack += tentacles[i].constrict() + "\n";
        }
        return attack + eatWithTentacles();
    }
    
    public String heal() {
        for (int i = 0; i < tentacles.length; i++) {
            tentacles[i].heal();
        }
        mouth.heal();
        return "The jellyfish is now healthy";
    }
}
