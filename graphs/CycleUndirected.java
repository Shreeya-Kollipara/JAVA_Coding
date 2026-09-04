import java.util.*;

public class CycleUndirected {

    static ArrayList<Integer>[] graph;

    static boolean hasCycle(int node,int parent,boolean[] visited) {
        visited[node]=true;

        for(int next:graph[node]) {
            if(!visited[next]) {
                if(hasCycle(next,node,visited))
                    return true;
            } else if(next!=parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        graph=new ArrayList[3];

        for(int i=0;i<3;i++)
            graph[i]=new ArrayList<>();

        graph[0].add(1);
        graph[1].add(0);
        graph[1].add(2);
        graph[2].add(1);

        System.out.println(hasCycle(0,-1,new boolean[3]));
    }
}
