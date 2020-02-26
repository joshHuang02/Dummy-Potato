
/**
 * Write a description of class AltGeometricalSolid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AltGeometricalSolid
{
    public static void main() {
        Rhombicosidodecahedron solid1 = new Rhombicosidodecahedron(5);
        System.out.println(solid1.getAreaCM2()+ "\n" + solid1.getVolumeCM3() + "\n" + solid1.getLateralAreaCM2());
    }
}
