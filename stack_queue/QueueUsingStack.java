import java.util.*;

public class QueueUsingStack {

    static Stack<Integer> first=new Stack<>();
    static Stack<Integer> second=new Stack<>();

    static void add(int x) {
        first.push(x);
    }

    static int remove() {
        if(second.isEmpty()) {
            while(!first.isEmpty())
                second.push(first.pop());
        }

        return second.pop();
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);

        System.out.println(remove());
    }
}
