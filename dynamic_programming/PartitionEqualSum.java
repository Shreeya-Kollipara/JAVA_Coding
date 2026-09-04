public class PartitionEqualSum {

    public static void main(String[] args) {
        int[] arr={1,5,11,5};

        int sum=0;

        for(int x:arr)
            sum+=x;

        if(sum%2!=0) {
            System.out.println(false);
            return;
        }

        int target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;

        for(int x:arr) {
            for(int j=target;j>=x;j--)
                dp[j]=dp[j]||dp[j-x];
        }

        System.out.println(dp[target]);
    }
}
