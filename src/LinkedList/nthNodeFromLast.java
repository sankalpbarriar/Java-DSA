package LinkedList;

public class nthNodeFromLast {
    //return middle element Even->right middle
    public static Node findMiddleEle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;  //move slow 1 time
            fast=fast.next.next;  //move fast 2 times
        }
        return slow;
    }
    //return middle element Even->left middle
    public static Node findMiddleEle2(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next!=null){
            slow=slow.next;  //move slow 1 time
            fast=fast.next.next;  //move fast 2 times
        }
        return slow;
    }
    //Deleting middle element from LN
    public static Node DeleteMiddle(Node head){
        Node slow=head;
        Node fast=head;
        if(slow.next==null) return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;  //move slow 1 time
            fast=fast.next.next;  //move fast 2 times
        }
        slow.next=slow.next.next;
        return head;
    }

    public static Node nthNode(Node head,int x) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int m=size-x+1;  //now find mth node from start
        temp=head;
        for (int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;

    }
    public static Node nthNode2(Node head, int n){
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node deleteNthfromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        if (fast==null){   //if fast become null
            head=head.next;    //remove head
            return head;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // 100 13 4 5 12 10
//        Node q=nthNode(a,2);
//        System.out.println(q.data);
//        Node r=nthNode2(a,2);
//        System.out.println(r.data);
        display(a);
//        a=deleteNthfromEnd(a,6); //changing hed in main function also
//        display(a);
//        Node q=findMiddleEle2(a);
//        display(q);
        Node q=DeleteMiddle(a);
        display(a);
    }
}
