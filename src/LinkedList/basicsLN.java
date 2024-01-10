package LinkedList;

public class basicsLN {
    public static class Node{
        int data;   //value
        Node next;    //ad of next node

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(6);
        Node e=new Node(8);
        // 5 3 9 6 8
        a.next=b;    //5->3 9 6 8
        b.next=c;    //5->3->9 6 8
        c.next=d;    //5->3->9->6 8
        d.next=e;    //5->3->9->6->8
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
    }
}














