package LinkedList;

public class DispalyRecursively {
    static void display(Node head){
        if (head==null)  return;
        System.out.print(head.data+"  ");
        display(head.next);
    }
    static int findLength(Node head){
        int count=0;
        while(head!=null){
            count+=1;
            head=head.next;
        }
        return count;
    }
    static void displayReverse(Node head){
        if (head==null)  return;
        displayReverse(head.next);
        System.out.print(head.data+"  ");

    }
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println();
        System.out.println(findLength(a));
    }
}
