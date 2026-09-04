public class UnionFind {

    static int[] parent;

    static int find(int x) {
        if(parent[x]==x)
            return x;

        parent[x]=find(parent[x]);
        return parent[x];
    }

    static void union(int a,int b) {
        int rootA=find(a);
        int rootB=find(b);

        if(rootA!=rootB)
            parent[rootB]=rootA;
    }

    public static void main(String[] args) {
        parent=new int[]{0,1,2,3};

        union(0,1);
        union(1,2);

        System.out.println(find(0)==find(2));
    }
}
