public class Seat

{

    private boolean available;

    private int tier;

    public Seat(boolean isAvail, int tierNum)

    {

        available = isAvail;

        tier = tierNum;public class Seat

{

private boolean available;

private int tier;

public Seat(boolean isAvail, int tierNum)

{

available = isAvail;

tier = tierNum;

}

public boolean isAvailable()

{  return available;  }

public int getTier()

{  return tier;  }

public void setAvailability(boolean isAvail)

{  available = isAvail;  }

}

    }

    public boolean isAvailable()

    {
        return available;
    }

    public int getTier()

    {
        return tier;
    }

    public void setAvailability(boolean isAvail)

    {
        available = isAvail;
    }

}