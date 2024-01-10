package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    //DATA STRUCTURE
   public static class linkedList{
        Node head=null;   //contains head and tail pointers to keep the track of the LL
        Node tail=null;

        //Inserting node at end
        void insertAtEnd(int val){
            Node temp=new Node(val);   //creating a temp node
            if (head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        //Inserting at Head
        void insertAtHead(int val){
            Node temp=new Node(val);
            //empty list
            if(head==null){
                insertAtEnd(val);
            }
            else{
                temp.next=head;   //store add of temp at head
                head=temp;
            }
//            tail=temp;
        }
        //Inserting at a given idx
        void insertAt(int idx,int val) {
            Node t = new Node(val);    //temp. node of given val
            Node temp=head;            //temp node for iterating through the LL
            if (idx == 0){
                insertAtHead(val);    //if to add at begin
                return;
            }
            else if (idx == size()) {
                insertAtEnd(val);  //if to add at last
                return;
            }
            else if (idx<0 || idx>size()) System.out.println("Invalid index:");
            for (int i = 1; i <= idx - 1; i++) {          //iterating through the LL
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        //Get element at given idx
        int getAt(int idx){
            Node temp=head;
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        //Delete element at given idx
        void deleteAt(int idx){
            Node temp=head;
            if (idx==0){
                head=head.next;
                return;
            }
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            int cnt=0;
            Node temp=head;
            while (temp!=null){
                cnt+=1;
                temp=temp.next;
            }
            return cnt;
        }
   }
    public static void main(String[] args) {
         linkedList ll=new linkedList();
         ll.insertAtEnd(4);
         ll.display();
         ll.insertAtEnd(5);
         ll.display();
         ll.insertAtEnd(6);
         ll.display();
         ll.insertAtEnd(8);
         ll.display();
        ll.insertAt(1,2);
        ll.display();
        ll.insertAt(5,7);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        System.out.println();
        System.out.println("the size is "+ll.size());
        System.out.println("The element is "+ll.getAt(3));


    }
}
