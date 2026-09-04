public class DetectCycle {

    static class Node {
        Node next;
    }

    public static void main(String[] args) {
        Node a=new Node();
        Node b=new Node();
        Node c=new Node();

        a.next=b;
        b.next=c;
        c.next=a;

        Node slow=a;
        Node fast=a;
        boolean cycle=false;

        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) {
                cycle=true;
                break;
            }
        }

        System.out.println(cycle);
    }
}
