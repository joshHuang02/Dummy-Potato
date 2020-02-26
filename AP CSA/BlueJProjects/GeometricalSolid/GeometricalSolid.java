/**
 * This class will calculate information about a geometric solid - the Rhombicosidodecahedron
 *
 * @author Josh Huang
 * @version 9/9/2019
 */
public class GeometricalSolid
{
    public static void main() {
        //introductory statement and alert
        System.out.println("My Geometrical Solid");
        System.out.println("*The Rhombicosidodecahedron has 120 edges of equal length\nPlease note that the Rhombicosidodecahedron\nonly has one variable, the length of one edge.*");
        
        //creating and setting the solid
        Rhombicosidodecahedron solid1 = new Rhombicosidodecahedron(6);
        solid1.setEdgeLenCM(46.9);
        
        //output
        System.out.println("\nEdge Length: " + solid1.getEdgeLenCM() + " cm");
        System.out.println("Surface Area: " + solid1.getAreaCM2() + " cm² or " + solid1.getAreaIN2() + " in²");
        System.out.println("Volume: " + solid1.getVolumeCM3() + " cm³ or " + solid1.getVolumeIN3() + " in³");
        System.out.println("Lateral Area: " + solid1.getLateralAreaCM2() + " cm² or " + solid1.getLateralAreaIN2() + " in²");
    }
}
