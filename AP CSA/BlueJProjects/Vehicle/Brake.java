public class Brake extends CarComponent
{
    private int discSizeInInches;
    private double brakePadThicknessInInches;
        public Brake(String Name, int discSizeInInches, double brakePadThicknessInInches, boolean isWorking, double chanceOfFailure)
        {
            super(Name, isWorking, chanceOfFailure);
            this.discSizeInInches = discSizeInInches;
            this.brakePadThicknessInInches = brakePadThicknessInInches;
            
        }
        
        public Brake(int discSizeInInches, double brakePadThicknessInInches, boolean isWorking)
        {
            super("Brakes", isWorking);
            this.discSizeInInches = discSizeInInches;
            this.brakePadThicknessInInches = brakePadThicknessInInches;
            
        }
        
        public void setDiscSize(int discSizeInInches)
        {
            this.discSizeInInches = discSizeInInches;
        }
        public void setBrakePadThickness(double brakePadThicknessInInches)
        {
            this.brakePadThicknessInInches = brakePadThicknessInInches;
        }
        public int getDiscSizeInInches()
        {
            return this.discSizeInInches;
        }
        public double getBrakePadThicknessInInches()
        {
            return this.brakePadThicknessInInches;
        }
        
        @Override
        public String damage()
        {
            setIsWorking(false);
            return "The " +  getNameOfComponent() + " stopped working and is unable to brake";
        }
        
        @Override
        public String fix()
        {
            if (getIsWorking())
            {
            return "The " + getNameOfComponent() + " was already fine.";
            }
            else
            {
            setIsWorking(true);
            return "The " + getNameOfComponent() + " is now working.";
            }
        }

        public String startBraking()
        {
            if(getIsWorking() && brakePadThicknessInInches > 2)
            {
                if(!super.conditionalCheck())
                {
                    return damage();
                }
                brakePadThicknessInInches = brakePadThicknessInInches - 0.01;
                return "Brake Pad clamps onto the Disc braking the car";
            }
            return "The " + getNameOfComponent() + " is not working";
        }
        
        public String stopBraking()
        {
            if(getIsWorking())
            {
                if(!super.conditionalCheck())
                {
                    return damage();
                }
                return "Brake Pad releases from the Disc letting the car roll";
            }
            return "The "+ getNameOfComponent() + " is not working";
        }
        
        @Override
        public String action1()
        {
            return startBraking();
        }
        
        @Override
        public String action2()
        {
            return stopBraking();
        }
        @Override
        public String toString()
        {
        String message = "";
        message += "The " + getNameOfComponent() + " can ";
        if(getIsWorking())
        {
            message += "brake.";
        }
        else
        {
            message += "not brake.";
        }
        return message;
        }

}

