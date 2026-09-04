public class Diameter {

    static class Node {
        Node left,right;
    }

    static int diameter=0;

    static int height(Node root) {
        if(root==null)
            return 0;

        int left=height(root.left);
        int right=height(root.right);

        diameter=Math.max(diameter,left+right+1);

        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        Node root=new Node();
        root.left=new Node();
        root.right=new Node();

        height(root);

        System.out.println(diameter);
    }
}
