import java.util.*;

public class NextGreater {

    public static void main(String[] args) {
        int[] arr={2,1,2,4,3};
        int[] result=new int[arr.length];

        Arrays.fill(result,-1);

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i])
                result[stack.pop()]=arr[i];

            stack.push(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
