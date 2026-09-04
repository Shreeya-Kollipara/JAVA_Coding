import java.util.*;

public class ShortestPathBFS {

    public static void main(String[] args) {
        int[][] graph={{1,2},{0,3},{0,3},{1,2}};
        int[] distance={0,-1,-1,-1};

        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);

        while(!queue.isEmpty()) {
            int node=queue.remove();

            for(int next:graph[node]) {
                if(distance[next]==-1) {
                    distance[next]=distance[node]+1;
                    queue.add(next);
                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }
}
