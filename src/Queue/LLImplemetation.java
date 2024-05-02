package Queue;

public class LLImplemetation {
    public static class Node
    {  //User defined data type
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        //add function
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        //remove function
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int x=head.val;
                head=head.next;
                size--;
                return x;
            }
        }
        //peek function
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                return head.val;
            }
        }
        //display function
        public void display(){
            if(head==null){
                System.out.println("Empty Queue");
            }
            else{
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
        }
        //isEmpty function
        public boolean isEmpty(){
            if(size==0) return true;
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.size);



    }
}
