public class DFS {

    static int[][] graph={{1,2},{0,3},{0,3},{1,2}};
    static boolean[] visited=new boolean[4];

    static void dfs(int node) {
        visited[node]=true;

        System.out.print(node+" ");

        for(int next:graph[node]) {
            if(!visited[next])
                dfs(next);
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
