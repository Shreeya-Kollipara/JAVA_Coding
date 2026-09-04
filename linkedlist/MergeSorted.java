public class MergeSorted {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
        }
    }

    static Node merge(Node a,Node b) {
        Node dummy=new Node(0);
        Node current=dummy;

        while(a!=null&&b!=null) {
            if(a.data<=b.data) {
                current.next=a;
                a=a.next;
            } else {
                current.next=b;
                b=b.next;
            }

            current=current.next;
        }

        current.next=a!=null?a:b;

        return dummy.next;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        a.next=new Node(3);

        Node b=new Node(2);
        b.next=new Node(4);

        Node head=merge(a,b);

        while(head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
