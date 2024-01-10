package LinkedList;

public class reverseLN {
    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    static Node DeepCopy(Node head){
        Node temp=head;
        Node h=new Node(-1);
        Node temp1=h;
        while(temp!=null){
            Node t=new Node(temp.val);
            temp1.next=t;
            temp=temp.next;
            temp1=temp1.next;
        }
        return h.next;
    }
    static void display(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }
    static void revDisplay(Node head){
        if (head==null) return ;
        revDisplay(head.next);
        System.out.print(head.val+" ");
    }
    static Node rev(Node head){
        //BASE CASE
        if(head==null || head.next==null) return head;
        Node newNode=rev(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        display(a);
//        System.out.println();
////        revDisplay(a);
//        Node r=rev(a);
//        display(r);
        DeepCopy(a);
        display(a);
    }
}
