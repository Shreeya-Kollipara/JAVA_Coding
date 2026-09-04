import java.util.*;

public class BFS {

    public static void main(String[] args) {
        int[][] graph={{1,2},{0,3},{0,3},{1,2}};
        boolean[] visited=new boolean[4];

        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;

        while(!queue.isEmpty()) {
            int node=queue.remove();

            System.out.print(node+" ");

            for(int next:graph[node]) {
                if(!visited[next]) {
                    visited[next]=true;
                    queue.add(next);
                }
            }
        }
    }
}
