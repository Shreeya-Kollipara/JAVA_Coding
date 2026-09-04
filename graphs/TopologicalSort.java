import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {
        int n=4;

        int[][] edges={{0,1},{0,2},{1,3},{2,3}};

        ArrayList<Integer>[] graph=new ArrayList[n];
        int[] indegree=new int[n];

        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();

        for(int[] edge:edges) {
            graph[edge[0]].add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<n;i++) {
            if(indegree[i]==0)
                queue.add(i);
        }

        while(!queue.isEmpty()) {
            int node=queue.remove();

            System.out.print(node+" ");

            for(int next:graph[node]) {
                indegree[next]--;

                if(indegree[next]==0)
                    queue.add(next);
            }
        }
    }
}
