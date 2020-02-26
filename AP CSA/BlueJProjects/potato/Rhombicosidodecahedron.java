
/**
 * Write a description of class Rhombicosidodecahedron here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rhombicosidodecahedron
{
    //instance variable
    double areaCM2;
    double volumeCM3;
    double lateralAreaCM2;

    public Rhombicosidodecahedron(double edgeLenCM){
        if (edgeLenCM < 0) {
            edgeLenCM = 0;
            System.out.println("\n*Your edge length is set to 0!*");
        }

        //surface area
        areaCM2 = (edgeLenCM * edgeLenCM) * (30 + 5 * Math.sqrt(3) + 3 * Math.sqrt(25 + 10 * Math.sqrt(5)));
        areaCM2 = Math.round(areaCM2 * 1000.0) / 1000.0;
        //volume
        volumeCM3 = (edgeLenCM * edgeLenCM * edgeLenCM) / 3 * (60 + 29 * Math.sqrt(5));
        volumeCM3 = Math.round(volumeCM3 * 1000.0) / 1000.0;
        //lateral area
        double areaBaseAndTopCM2 = 1.720477401* edgeLenCM * edgeLenCM;
        lateralAreaCM2 = Math.round((areaCM2 - areaBaseAndTopCM2) * 1000.0) / 1000.0;
    }
    
    public String getAreaCM2() {
        return "Surface area: " + Double.toString(areaCM2);
    }
    
    public String getVolumeCM3() {
        return "Volume :" + Double.toString(volumeCM3);
    }
    
    public String getLateralAreaCM2() {
        return "Lateral Area: " + Double.toString(volumeCM3);
    }
}
