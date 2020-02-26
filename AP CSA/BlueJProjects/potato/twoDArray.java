
/**
 * Write a description of class twoDArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class twoDArray
{
    public static void main() {
        int[][] numbers = {{1,2,9,9,9,9,9,9,9,9,9}, {3,4,9,9,9,9,9,9,9,899,}};
  
        for ( int[] n : numbers) {
            for ( int m : n){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
