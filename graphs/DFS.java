import java.util.*;

public class DFS{
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int node,boolean[] visited){
        visited[node]=true;
        System.out.print(node+" ");
        for(int next:graph.get(node)){
            if(!visited[next])
                dfs(graph,next,visited);
        }
    }
}
