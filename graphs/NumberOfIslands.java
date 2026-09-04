public class NumberOfIslands {

    static int[][] grid={
        {1,1,0},
        {0,1,0},
        {1,0,1}
    };

    static void dfs(int row,int col) {
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0)
            return;

        grid[row][col]=0;

        dfs(row+1,col);
        dfs(row-1,col);
        dfs(row,col+1);
        dfs(row,col-1);
    }

    public static void main(String[] args) {
        int count=0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==1) {
                    count++;
                    dfs(i,j);
                }
            }
        }

        System.out.println(count);
    }
}
