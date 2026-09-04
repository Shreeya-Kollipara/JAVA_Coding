import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> marks=new HashMap<>();

        marks.put("Java",90);
        marks.put("Python",85);
        marks.put("C++",88);

        System.out.println(marks.get("Java"));

        for(Map.Entry<String,Integer> entry:marks.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
