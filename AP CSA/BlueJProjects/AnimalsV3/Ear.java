// Cecilia Li and Tong Su
// FIXED: Issue with super not called
// Removed 2 constructors

/**
 * This animal has-a ear.
 *
 * @Cecilia Li
 * @1/6/2020
 */
public class Ear extends AnimalPart
{
    //instance variable
    private String size;

    //constructor(s)
    public Ear(String size, String name, boolean isWorking){
        super(name, isWorking);
        this.size = size;
    }

    //method, accecors, and mutators
    @Override
    public String action1(){
        return listenToMusic();
    }

    @Override
    public String heal(){
        return healEar();
    }

    @Override
    public String injure(){
        return injureEar();
    }

    public String listenToMusic(){
        if(getIsWorking()){
            if(Math.random()*100 + 1 < 50)
                return injure() + getNameOfPart() + " cannot listen to music.";
            else
                return getNameOfPart() + "is listening to music.";
        }
        else
            return getNameOfPart() + " cannot listen to music.";
    }

    public String injureEar(){
        if (getIsWorking()){
            setIsWorking(false);
            return getNameOfPart() +"'s hearing is lost.";}
        else
            return getNameOfPart() + "'s hearing was already lost.";
    }

    public String healEar(){
        if(getIsWorking())
            return getNameOfPart() + " was already fine.";
        else{
            setIsWorking(true);
            return getNameOfPart() + " is now working";
        }
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

}
