public class Height {

    static class Node {
        Node left,right;
    }

    static int height(Node root) {
        if(root==null)
            return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        Node root=new Node();
        root.left=new Node();
        root.right=new Node();

        System.out.println(height(root));
    }
}
