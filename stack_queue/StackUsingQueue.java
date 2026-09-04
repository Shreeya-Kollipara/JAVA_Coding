import java.util.*;

public class StackUsingQueue {

    static Queue<Integer> queue=new LinkedList<>();

    static void push(int x) {
        queue.add(x);

        for(int i=0;i<queue.size()-1;i++)
            queue.add(queue.remove());
    }

    static int pop() {
        return queue.remove();
    }

    public static void main(String[] args) {
        push(10);
        push(20);

        System.out.println(pop());
    }
}
