public class DeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);

        Node node=head.next;

        node.data=node.next.data;
        node.next=node.next.next;

        for(Node temp=head;temp!=null;temp=temp.next)
            System.out.print(temp.data+" ");
    }
}
