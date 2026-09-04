public class Intersection {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node common=new Node(3);

        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=common;

        Node b=new Node(4);
        b.next=common;

        Node p=a;
        Node q=b;

        while(p!=q) {
            p=p==null?b:p.next;
            q=q==null?a:q.next;
        }

        System.out.println(p.data);
    }
}
