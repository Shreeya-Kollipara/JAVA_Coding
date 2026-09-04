public class UniquePaths {

    public static void main(String[] args) {
        int rows=3;
        int cols=7;

        int[] dp=new int[cols];
        dp[0]=1;

        for(int i=0;i<rows;i++) {
            for(int j=1;j<cols;j++)
                dp[j]+=dp[j-1];
        }

        System.out.println(dp[cols-1]);
    }
}
