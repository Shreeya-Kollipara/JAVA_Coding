import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        String s="banana";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        System.out.println(map);
    }
}
