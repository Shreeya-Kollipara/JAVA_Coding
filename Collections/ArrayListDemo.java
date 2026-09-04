import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("C");

        names.remove("B");

        System.out.println(names);
    }
}
