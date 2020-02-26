import java.util.*;

public class StringList {
    public ArrayList<String> strings;
    private int size =0;

    public StringList() {
        strings = new ArrayList<String>();
        strings.add("c");
        strings.add("b");
        strings.add("a");
        strings.add("d");
        size = 4;
    }

    public void sortStrings() {
        boolean isSorted = false;
        while (!isSorted) {
            
            isSorted = true;
            System.out.println("aaa"); 
            for ( int i = 1; i < strings.size(); i ++) {
                //System.out.println(strings.get(i).compareTo(strings.get(i - 1)));
                if ( strings.get(i).compareTo(strings.get(i - 1)) < 0) {
                    // System.out.println(strings.get(i));
                    // System.out.println(strings.get(i - 1));
                    isSorted = false;
                    String largerStr = strings.get(i - 1);
                    strings.set(i-1, strings.get(i));
                    strings.set(i, largerStr);
                }
            }
        }
        System.out.println(strings);
    }
}