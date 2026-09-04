public class CountNodes {

    static class Node {
        Node left,right;
    }

    static int count(Node root) {
        if(root==null)
            return 0;

        return 1+count(root.left)+count(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node();
        root.left=new Node();
        root.right=new Node();

        System.out.println(count(root));
    }
}
