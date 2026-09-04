public class MinCostPath {

    public static void main(String[] args) {
        int[][] cost={
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };

        for(int i=1;i<cost.length;i++)
            cost[i][0]+=cost[i-1][0];

        for(int j=1;j<cost[0].length;j++)
            cost[0][j]+=cost[0][j-1];

        for(int i=1;i<cost.length;i++) {
            for(int j=1;j<cost[0].length;j++) {
                cost[i][j]+=Math.min(cost[i-1][j],cost[i][j-1]);
            }
        }

        System.out.println(cost[2][2]);
    }
}
