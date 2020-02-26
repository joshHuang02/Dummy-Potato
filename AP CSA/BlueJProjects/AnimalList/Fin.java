class Fin extends AnimalPart
{
    //instance variables

    //constructors
    public Fin(String name, boolean isWorking)
    {
        super(name, isWorking);

    }

    // method(s), accessor(s), mutator(s)

    public String swim()
    {
        if(getIsWorking())
        {
            if(((int)(Math.random()*100+1)<=45))
            {
                return injure() + "So you can not swim";
            }
            return "The fish swam";
        }
        else
        {
            return "The fish can not swim";
        }
    }

    @Override
    public String injure()
    {
        setIsWorking(false);
        return "The fin is damaged.";
    }

    @Override
    public String heal()
    {
        if(getIsWorking())
        {
            return "The fin was already good.";
        }
        else
        {
            setIsWorking(true);
            return "The fin is now working.";
        }

    }

    @Override
    public String toString()
    {
        String message = "";
        message += "The" + getNameOfPart() + " is ...";
        if(getIsWorking())
        {
            message += " working.";
        }
        else
        {
            message += " not working.";
        }
        return message;
    }
}
