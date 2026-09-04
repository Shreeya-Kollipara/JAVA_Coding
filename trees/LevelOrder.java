import java.util.*;

public class LevelOrder {

    static class Node {
        int data;
        Node left,right;

        Node(int data) {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node current=queue.remove();

            System.out.print(current.data+" ");

            if(current.left!=null)
                queue.add(current.left);

            if(current.right!=null)
                queue.add(current.right);
        }
    }
}
