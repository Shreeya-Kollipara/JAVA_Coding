import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        while(!queue.isEmpty())
            System.out.print(queue.remove()+" ");
    }
}
