import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<Object> intList = new ArrayList();
        intList.add((1));
        List<String> nameList = new ArrayList<String>();
        nameList.add("Josh");
        nameList.add("Tony");
        nameList.add("Edmund");
        nameList.add(nameList.set(1, "Unknown"));
        // System.out.println(nameList.get(0));
        System.out.println(nameList);
        System.out.println(nameList.size());
    }
}