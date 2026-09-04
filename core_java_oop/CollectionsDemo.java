import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(4);
        list.add(1);
        list.add(3);

        Collections.sort(list);

        HashSet<Integer> set=new HashSet<>(list);

        HashMap<String,Integer> map=new HashMap<>();
        map.put("Java",1);

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
