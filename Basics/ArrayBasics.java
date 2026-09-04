import java.util.*;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;

        for(int x:arr)
            sum+=x;

        System.out.println("Sum = "+sum);
        System.out.println("Maximum = "+Arrays.stream(arr).max().getAsInt());
    }
}
