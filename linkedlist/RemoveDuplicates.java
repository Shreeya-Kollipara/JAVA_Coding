public class RemoveDuplicates {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);

        Node current=head;

        while(current!=null&&current.next!=null) {
            if(current.data==current.next.data)
                current.next=current.next.next;
            else
                current=current.next;
        }

        for(Node temp=head;temp!=null;temp=temp.next)
            System.out.print(temp.data+" ");
    }
}
