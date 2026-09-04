public class ConnectedComponents {

    static int[][] graph={{1},{0},{3},{2}};
    static boolean[] visited=new boolean[4];

    static void dfs(int node) {
        visited[node]=true;

        for(int next:graph[node]) {
            if(!visited[next])
                dfs(next);
        }
    }

    public static void main(String[] args) {
        int components=0;

        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                components++;
                dfs(i);
            }
        }

        System.out.println(components);
    }
}
