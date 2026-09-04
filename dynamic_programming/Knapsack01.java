public class Knapsack01 {

    public static void main(String[] args) {
        int[] weight={1,3,4,5};
        int[] value={1,4,5,7};

        int capacity=7;
        int[] dp=new int[capacity+1];

        for(int i=0;i<weight.length;i++) {
            for(int j=capacity;j>=weight[i];j--) {
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }

        System.out.println(dp[capacity]);
    }
}
