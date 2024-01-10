package LinkedList;

public class doublyLL {
    public static class Node{
        int val;
        Node next;  //null
        Node prev;  //prev

        public Node(int val) {
            this.val = val;
        }
    }
    public static void display_all(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void display_rev(Node Tail){
        Node temp=Tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    //Displaying a LN when any random node is given
    static void display_2(Node random){
        Node temp=random;
        //move temp towards head node
        while(temp.prev!=null){
            temp=temp.prev;
        }
        //now print the list
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        //One side connection is estatblised
        a.prev=null;
        a.next=b;  //a-->b
        b.prev=a;  //b<--a
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display_all(a);
        display_rev(e);   //  display using tail node
        display_2(c);

    }
}
