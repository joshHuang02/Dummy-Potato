public class AirConditioner extends CarComponent {
    private int numberOfVents;
    private boolean ventIsNotClogged;
    private double refrigerantLevelInOunces;

    public AirConditioner(int numberOfVents, boolean ventIsNotClogged, double refrigerantLevelInOunces,
            String nameOfComponent, boolean isWorking) {
        super(nameOfComponent, isWorking);
        this.numberOfVents = numberOfVents;
        this.ventIsNotClogged = ventIsNotClogged;
        this.refrigerantLevelInOunces = refrigerantLevelInOunces;
    }

    public AirConditioner(int numberOfVents, boolean ventIsNotClogged, double refrigerantLevel) {
        super("air conditioner", true);
        this.numberOfVents = numberOfVents;
        this.ventIsNotClogged = ventIsNotClogged;
    }

    public AirConditioner(int numberOfVents, double refrigerantLevelInOunces) {
        super("air conditioner", true);
        this.numberOfVents = numberOfVents;
        this.ventIsNotClogged = true;
        this.refrigerantLevelInOunces = refrigerantLevelInOunces;
    }

    public String damage() {
        setIsWorking(false);
        this.ventIsNotClogged = false;
        return "The " + getNameOfComponent() + " is damaged.\n";
    }

    public String fix() {
        setIsWorking(true);
        this.ventIsNotClogged = true;
        return "The " + getNameOfComponent() + " is working.\n";
    }

    @Override
    public String action1() {
        return transferHeatOut();
    }

    @Override
    public String action2() {
        return pressurizeAir();
    }

    public String transferHeatOut() {
        if (getIsWorking() && ventIsNotClogged) {
            if (!super.conditionalCheck()) {
                return "The " + getNameOfComponent() + " failed to transfer heat out.\n";
            } else {
                return "The " + getNameOfComponent() + " transfered heat out.\n";
            }
        } else {
            return " The " + getNameOfComponent() + " cannot transfer heat out.\n";
        }
    }

    public String pressurizeAir() {
        if (getIsWorking()) {
            if (!super.conditionalCheck()) {
                return "The " + getNameOfComponent() + " failed to pressurize air.\n";
            } else {
                return "The " + getNameOfComponent() + " pressurized air.\n";
            }
        } else {
            return " The " + getNameOfComponent() + " cannot pressurize air.\n";
        }
    }

    @Override
    public String toString() {
        String message = "";
        if (getIsWorking()) {
            message += "The " + getNameOfComponent() + " is working.\n";
        } else {
            message += "The " + getNameOfComponent() + " is not working.\n";
        }
        if (numberOfVents == 1) {
            message += "   The " + getNameOfComponent() + " has one vent.\n";
        } else {
            message += "   The " + getNameOfComponent() + " has " + numberOfVents + " vents.\n";
        }
        if (ventIsNotClogged) {
            message += "   The vent is not clogged.\n";
        } else {
            message += "   The vent is clogged.\n";
        }
        if (refrigerantLevelInOunces == 1) {
            message += "   There is one ounce of refrigerant in the " + getNameOfComponent() + ".\n";
        } else {
            message += "   There are " + refrigerantLevelInOunces + " ounces of refrigerant in the "
                    + getNameOfComponent() + ".\n";
        }

        return message;
    }

    public void setNumberOfVents(int amount) {
        this.numberOfVents = amount;
    }

    public int getNumberOfVents() {
        return this.numberOfVents;
    }

    public void setVentIsNotClogged(boolean clogged) {
        this.ventIsNotClogged = clogged;
    }

    public boolean getVentIsNotClogged() {
        return this.ventIsNotClogged;
    }

    public void setRefrigerantLevelInOunces(double level) {
        this.refrigerantLevelInOunces = level;
    }

    public double getRefrigerantLevelInOunces() {
        return this.refrigerantLevelInOunces;
    }
}
