import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {
        String s="aabc";

        int[] freq=new int[26];
        Queue<Character> queue=new LinkedList<>();

        for(char c:s.toCharArray()) {
            freq[c-'a']++;
            queue.add(c);

            while(!queue.isEmpty()&&freq[queue.peek()-'a']>1)
                queue.remove();

            System.out.println(queue.isEmpty()?-1:queue.peek());
        }
    }
}
