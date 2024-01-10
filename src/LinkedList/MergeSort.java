package LinkedList;

public class MergeSort {
    public static class Node{
        int val;
        Node next;  //null
        Node prev;  //prev

        public Node(int val) {
            this.val = val;
        }
    }
    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node mergeSort(Node head){
        return sort(head);
    }
    static Node sort(Node head){
        //BASE CASE
        if(head==null || head.next==null){
            return head;
        }
        //finding middle
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        //seperating two lists and using recursion sort them
        Node head1=mergeSort(head);
        Node head2=mergeSort(slow);
        Node ans=merge(head1,head2);
        return ans;
    }
    static Node merge(Node head1,Node head2){
        //Creating dummy nodes
        Node ansHead=new Node(-1);
        Node ansTail=ansHead;
        while(head1!=null && head2!=null){
            if(head1.val< head2.val){
                ansTail.next=new Node(head1.val);
                head1=head1.next;
            }
            else{
                ansTail.next=new Node(head2.val);
                head2=head2.next;
            }
            ansTail=ansTail.next;
        }
        while(head1!=null){
            ansTail.next=new Node(head1.val);
            head1=head1.next;
            ansTail=ansTail.next;
        }
        while(head2!=null){
            ansTail.next=new Node(head2.val);
            head2=head2.next;
            ansTail=ansTail.next;
        }
        Node t1=ansHead;
        ansHead=ansHead.next;
        t1.next=null;
        return ansHead;

    }
    public static Node insertionAtHead(Node head,int val){
        Node t=new Node(val);
        t.next=head;
        head.prev=t;
        head=t;
        return t;
    }
    static void insertAtTail(Node head,int val){
        Node add=new Node(val);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=add;
        add.prev=temp;
    }
    static void insertAtIds(Node head,int idx,int val){
        Node temp=head;
        for (int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node t=new Node(val);
        Node nxt=temp.next;
        temp.next=t;
        t.prev=temp;
        t.next=nxt;
        nxt.prev=t;
    }
    static Node deleteHead(Node head){
        Node temp=head;
        head=temp.next;
        head.prev=null;
        return head;
    }
    static void deleteTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
    }
    static void deleteAtIdx(Node head,int idx){
        Node temp=head;
        for (int i=0;i<idx;i++){
            temp=temp.next;
        }
        Node prev=temp.prev;
        Node nxt=temp.next;
        prev.next=nxt;
        nxt.prev=prev;

    }
    static boolean isPalindrome(Node head){
        Node h=head;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node t=tail;
        while(h!=t && h.prev!=t){
            if(h.val!=t.val) return false;
            h=h.next;
            t=t.prev;
        }
        return true;
    }
    static void twoSum(Node head, int target){
        Node h=head;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node t=tail;
        while(h != null && t != null && h != t && h.val <= t.val){
            int sum=h.val+t.val;
            if(sum==target){
                System.out.println("Sum found");
                return;
            }
            else if(sum>target) t=t.prev;
            else{
                h=h.next;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(13);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
//        Node q=mergeSort(a);
//        display(q);
        Node q=insertionAtHead(a,59);
        display(q);
        insertAtTail(q,32);
        display(q);
        insertAtIds(q,3,210);
        display(q);
        Node r=deleteHead(q);
        display(r);
        deleteTail(r);
        display(r);;
        deleteAtIdx(r,3);
        display(r);
        System.out.println(isPalindrome(r));
        twoSum(r,16);
    }
}
