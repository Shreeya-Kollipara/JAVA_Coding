public class ReverseLinkedList {

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

        Node prev=null;
        Node curr=head;

        while(curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        while(prev!=null) {
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
    }
}
