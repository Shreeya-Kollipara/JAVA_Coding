import java.util.*;

public class BFS{
    public static void bfs(ArrayList<ArrayList<Integer>> graph,int start){
        boolean[] visited=new boolean[graph.size()];
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int next:graph.get(node)){
                if(!visited[next]){
                    visited[next]=true;
                    q.add(next);
                }
            }
        }
    }
}
