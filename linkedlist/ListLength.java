public class ListLength {

    static class Node {
        Node next;
    }

    public static void main(String[] args) {
        Node head=new Node();
        head.next=new Node();
        head.next.next=new Node();

        int count=0;

        for(Node current=head;current!=null;current=current.next)
            count++;

        System.out.println(count);
    }
}
