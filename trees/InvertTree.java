public class InvertTree {

    static class Node {
        Node left,right;
    }

    static void invert(Node root) {
        if(root==null)
            return;

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        invert(root.left);
        invert(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node();
        root.left=new Node();
        root.right=new Node();

        invert(root);

        System.out.println("Tree inverted");
    }
}
