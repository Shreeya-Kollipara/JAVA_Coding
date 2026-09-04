import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {
        int n=4;

        int[][] edges={
            {0,1,4},
            {0,2,1},
            {2,1,2},
            {1,3,1},
            {2,3,5}
        };

        ArrayList<int[]>[] graph=new ArrayList[n];

        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();

        for(int[] edge:edges)
            graph[edge[0]].add(new int[]{edge[1],edge[2]});

        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0,0});

        while(!pq.isEmpty()) {
            int[] current=pq.remove();
            int node=current[0];
            int distance=current[1];

            if(distance!=dist[node])
                continue;

            for(int[] edge:graph[node]) {
                int next=edge[0];
                int weight=edge[1];

                if(dist[next]>distance+weight) {
                    dist[next]=distance+weight;
                    pq.add(new int[]{next,dist[next]});
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
