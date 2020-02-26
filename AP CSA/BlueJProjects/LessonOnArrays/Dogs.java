
/**
 * class for objects to go in a array
 *
 * @author Josh Huang
 * @version 11/14/2019
 */
public class Dogs
{
    private String type;
    private int birth;
    
    public Dogs() {
        type = "UNKNOWN";
        birth = 99999;
    }
    
    public Dogs(String type, int birth) {
        this.type = type;
        this.birth = birth;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
