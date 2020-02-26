/**
 * This class holds information about the Rhombicosidodecahedron, CM means centimenters, IN means inches, 2 and 3 after unit means squared and cubed respectively
 * The formulas are aquired from https://rechneronline.de/pi/rhombicosidodecahedron.php
 * 
 * @author Josh Huang
 * @version 9/9/2019
 * 
 */
public class Rhombicosidodecahedron
{
    //instance variable
    double edgeLenCM;

    //constructors
    /**
     * This constructor sets the default values of the Rhombicosidodecahedron
     */
    public Rhombicosidodecahedron() {
        edgeLenCM = 0;
    }

    /**
     * This constructor sets the required value of edgelenCM
     * @param edgeLenCM Accepts a double
     */
    public Rhombicosidodecahedron(double edgeLenCM){
        if (edgeLenCM < 0) {
            this.edgeLenCM = 0;
            System.out.println("\n*Your edge length is set to 0!*");
        } else {
            this.edgeLenCM = edgeLenCM;
        }
    }

    /**
     * This method allows the user to set edgeLenCM after the object has been created
     * @param edgeLen Accepts a double
     */
    public void setEdgeLenCM(double edgeLenCM) {
        if (edgeLenCM < 0) {
            this.edgeLenCM = 0;
            System.out.println("\n*Your edge length is set to 0!*");
        } else {
            this.edgeLenCM = edgeLenCM;
        }
    }

    //methods
    /**
     * This method calculates the surface area in centimeters squared
     * @param edgeLenCM Accepts a double
     * @return the surface area in centimeters squared
     */
    public double calcAreaCM2(double edgeLenCM) {
        //a² * ( 30 + 5√3 + 3√ 25 + 10√5 )
        double areaCM2 = (edgeLenCM * edgeLenCM) * (30 + 5 * Math.sqrt(3) + 3 * Math.sqrt(25 + 10 * Math.sqrt(5)));
        areaCM2 = Math.round(areaCM2 * 1000.0) / 1000.0;
        return areaCM2;
    }

    /**
     * This method calculates the volume in centimeters cubed
     * @param edgeLenCM Accepts a double
     * @return the volume in centimeters cubed
     */
    public double calcVolumeCM3(double edgeLenCM) {
        //a³/3 * ( 60 + 29√5 ) 
        double volumeCM3 = (edgeLenCM * edgeLenCM * edgeLenCM) / 3 * (60 + 29 * Math.sqrt(5));
        volumeCM3 = Math.round(volumeCM3 * 1000.0) / 1000.0;
        return volumeCM3;
    }

    /**
     * This method calculates the lateral area in centimeters squared
     * @param edgeLenCM Accepts a double
     * @return the lateral area in centimeters squared
     */
    public double calcLateralAreaCM2(double edgeLenCM) {
        //1/4 * 5(5+25) * a^2
        double areaBaseAndTopCM2 = 1.720477401* edgeLenCM * edgeLenCM;
        //surface area - base and top area
        double lateralAreaCM2 = calcAreaCM2(edgeLenCM) - areaBaseAndTopCM2;
        lateralAreaCM2 = Math.round(lateralAreaCM2 * 1000.0) / 1000.0;
        return lateralAreaCM2;
    }

    /**
     * This method returns the edge length set by user
     * @return the edge length, edgeLenCM
     */
    public double getEdgeLenCM() {
        return edgeLenCM;
    }

    /**
     * This method returns the calculated surface area in centimeters squared
     * @return the surface area, areaCM2
     */
    public double getAreaCM2() {
        return calcAreaCM2(edgeLenCM);       
    }

    /**
     * This method returns the calculated volume in centimeters cubed
     * @return the volume, volumeCM3
     */
    public double getVolumeCM3() {
        return calcVolumeCM3(edgeLenCM);       
    }

    /**
     * This method returns the calculated lateral area in centimeters squared
     * @return the lateral area, lateralAreaCM2
     */
    public double getLateralAreaCM2() {
        return calcLateralAreaCM2(edgeLenCM);
    }

    //Extra Credit
    //If it wasn't for the instructions asking for calculation methods I would just return the calculations
    /**
     * This method converts surface area in cm squared to inches squared
     * @return the surface area in inches squared
     */
    public double areaIN2() {
        return Math.round(calcAreaCM2(edgeLenCM) / 6.452 * 1000.0) / 1000.0;
    }

    /**
     * This method converts volume in cm cubed to inches cubed
     * @return the volume inches in cubed
     */
    public double volumeIN3() {
        return Math.round(calcVolumeCM3(edgeLenCM) / 16.387 * 1000.0) / 1000.0;
    }

    /**
     * This method converts lateral area in cm squared to inches squared
     * @return the lateral area in inches squared
     */
    public double lateralAreaIN2() {
        return Math.round(calcLateralAreaCM2(edgeLenCM) / 6.452 * 1000.0) / 1000.0;
    }

    /**
     * This method returns surface area in inches squared
     * @return the surface area in inches squared
     */
    public double getAreaIN2() {
        return areaIN2();
    }

    /**
     * This method returns volume in inches cubed
     * @return the volume in inches cubed
     */
    public double getVolumeIN3() {
        return volumeIN3();
    }

    /**
     * This method returns lateral area in inches squared
     * @return the lateral area in inches squared
     */
    public double getLateralAreaIN2() {
        return lateralAreaIN2();
    }
}