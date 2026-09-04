public class NthFromEnd {

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
        head.next.next.next=new Node(4);

        int n=2;

        Node first=head;
        Node second=head;

        for(int i=0;i<n;i++)
            first=first.next;

        while(first!=null) {
            first=first.next;
            second=second.next;
        }

        System.out.println(second.data);
    }
}
