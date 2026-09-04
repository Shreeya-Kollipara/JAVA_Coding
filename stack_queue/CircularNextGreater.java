import java.util.*;

public class CircularNextGreater {

    public static void main(String[] args) {
        int[] arr={1,2,1};
        int[] result=new int[arr.length];

        Arrays.fill(result,-1);

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<2*arr.length;i++) {
            int index=i%arr.length;

            while(!stack.isEmpty()&&arr[stack.peek()]<arr[index])
                result[stack.pop()]=arr[index];

            if(i<arr.length)
                stack.push(index);
        }

        System.out.println(Arrays.toString(result));
    }
}
