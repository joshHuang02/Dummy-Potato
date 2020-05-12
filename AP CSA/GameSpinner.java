public class GameSpinner {
    int currentRun;
    int lastSpin;
    int sectors;

    public GameSpinner(int sectors) {
        this.sectors = sectors;
        this.currentRun = 0;
        this.lastSpin = 0;
    }

    public int spin() {
        int spin = (Math.random()*sectors) + 1;
        if (spin == lastSpin) {
            this.currentRun ++;
        } else {
            this.currentRun = 1;
        } 
        return spin;
    }

    public currentRun() {
        return this.currentRun;
    }
}