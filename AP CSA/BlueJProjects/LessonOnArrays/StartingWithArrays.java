
/**
 * Initial testing of arrays
 *
 * @author Josh Huang
 * @version 11/12/2019
 */
public class StartingWithArrays
{
    private int[] arrayOfNum;
    public static void main () {
        int[] numList = new int[45]; //creates the local object numlist array

        String[] nameList = {"Sam", "Potato", "Baked Potato", "Superman"};
        nameList[nameList.length - 1] = "Clark";
        String[] newNameList = new String[nameList.length + 1];
        for (int i = 0; i <= nameList.length; i++) {
            try {
                newNameList[i] = nameList[i];
            } catch (Exception e) {
                newNameList[i] = "Josh Huang";
            }
        }
        nameList = newNameList;
        System.out.println(nameList[nameList.length - 1]);
        /*
        for (String name : nameList) {
        System.out.print(name + ", ");
        }
         */

        int[] studentGradeLevels;
        studentGradeLevels = new int[100]; //reservig space in RAM for 100 ints and getting a storage location
        //studentGradeLevel = numList; //studentGradeLevel is now the same object sa numList
        for (int i = 0; i < studentGradeLevels.length; i++) {
            studentGradeLevels[i] = i + 1;
        }
        for (int i : studentGradeLevels) {
            System.out.print(i + " ");
        }

        System.out.println();
        Dogs[] listOfDogs = new Dogs[5];
        // or Dogs[] listOfDogs = {new Dogs("Dog Type 1", 12345), new Dogs("Dog Type 2", 23456)};(
        listOfDogs[0] = new Dogs();
        listOfDogs[1] = new Dogs("Huskey", 43783);
        listOfDogs[2] = new Dogs("Doge", 43783);
        listOfDogs[3] = new Dogs("Cat", 43783);
        listOfDogs[4] = new Dogs("JJBA", 43783);
        for (Dogs currectDog : listOfDogs) {
            currectDog.setType("Poodle");
        }
        for (Dogs currectDog : listOfDogs) {
            try {
                System.out.print(currectDog.getType() + ", ");
            } catch (Exception e) {}
        }
        
        //ArrayList
        //ArrayList<Integer> numbers = new ArrayList<Integer>(5);

    }
}