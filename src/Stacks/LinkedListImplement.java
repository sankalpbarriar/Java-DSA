package Stacks;


                              //LINKED LIST IMPLEMENTATION OF STACK

//USER defined Data type
public class LinkedListImplement {
    public static class Node{
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
    //USER defined data structure
    public static class Stacks {
        private Node head=null;
        private int size=0;

        //PUSH
        void push(int val){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            size++;
        }
        //Helper fx. -->we need to print the reverse of the linked list
        void displayRec(Node h) {
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        //DISPLAY FXN.
        void displayRev() {
            displayRec(head);
            System.out.println();
            }


            //POP FXN.
        int pop(){
            if(head==null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }

        //PEAK FXN.
        int peak(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        //SIZE FXN.
        public int size(){   //getter fxn
            int cnt=0;
            Node temp=head;
            while(temp!=null){
                cnt++;
                temp=temp.next;
            }
            return cnt;
        }

        //IS EMPTY FXN.
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }


    public static void main(String[] args) {
        Stacks st=new Stacks();
        st.push(4);
        st.displayRev();  //4
        st.push(5);
        st.displayRev();   //4 5
        st.push(1);
        st.displayRev();  // 4 5 1
        System.out.println("size is "+st.size);
        st.pop();
        st.displayRev();
        System.out.println(st.isEmpty());
    }

}
