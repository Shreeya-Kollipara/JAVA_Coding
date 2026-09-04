public class MinBST {

    static class Node {
        int data;
        Node left,right;

        Node(int data) {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(3);
        root.left.left=new Node(1);

        Node current=root;

        while(current.left!=null)
            current=current.left;

        System.out.println(current.data);
    }
}
