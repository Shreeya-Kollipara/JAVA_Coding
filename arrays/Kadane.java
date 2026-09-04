public class Kadane {

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};

        int curr=arr[0];
        int best=arr[0];

        for(int i=1;i<arr.length;i++) {
            curr=Math.max(arr[i],curr+arr[i]);
            best=Math.max(best,curr);
        }

        System.out.println(best);
    }
}
