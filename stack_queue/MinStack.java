import java.util.*;

public class MinStack {

    static Stack<Integer> stack=new Stack<>();
    static Stack<Integer> minStack=new Stack<>();

    static void push(int x) {
        stack.push(x);

        if(minStack.isEmpty())
            minStack.push(x);
        else
            minStack.push(Math.min(x,minStack.peek()));
    }

    static int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        push(5);
        push(2);
        push(4);

        System.out.println(getMin());
    }
}
