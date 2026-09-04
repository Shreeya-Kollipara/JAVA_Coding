import java.util.*;

public class Bipartite {

    public static void main(String[] args) {
        int[][] graph={{1},{0,2},{1}};
        int[] color=new int[3];
        boolean possible=true;

        for(int start=0;start<3;start++) {
            if(color[start]!=0)
                continue;

            Queue<Integer> queue=new LinkedList<>();
            queue.add(start);
            color[start]=1;

            while(!queue.isEmpty()) {
                int node=queue.remove();

                for(int next:graph[node]) {
                    if(color[next]==0) {
                        color[next]=-color[node];
                        queue.add(next);
                    } else if(color[next]==color[node]) {
                        possible=false;
                    }
                }
            }
        }

        System.out.println(possible);
    }
}
