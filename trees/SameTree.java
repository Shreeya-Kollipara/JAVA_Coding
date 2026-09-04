public class SameTree {

    static class Node {
        int data;
        Node left,right;

        Node(int data) {
            this.data=data;
        }
    }

    static boolean same(Node a,Node b) {
        if(a==null||b==null)
            return a==b;

        return a.data==b.data&&same(a.left,b.left)&&same(a.right,b.right);
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);

        System.out.println(same(a,b));
    }
}
