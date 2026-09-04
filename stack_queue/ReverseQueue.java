import java.util.*;

public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        Stack<Integer> stack=new Stack<>();

        while(!queue.isEmpty())
            stack.push(queue.remove());

        while(!stack.isEmpty())
            queue.add(stack.pop());

        System.out.println(queue);
    }
}
