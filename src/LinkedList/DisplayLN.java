package LinkedList;

class DisplayLN {
    static void display(Nodey head){
         Nodey temp=head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
    }
    public static class Nodey {
        int data;   //value
        Nodey next;    //ad of next node

        public Nodey(int data) {
            this.data = data;
        }
    }

        public static void main(String[] args) {
            Nodey a = new Nodey(56);
            Nodey b = new Nodey(35);
            Nodey c = new Nodey(45);
            Nodey d = new Nodey(25);
            Nodey e = new Nodey(15);

            a.next = b;   //next of a pointing to b
            b.next = c;
            c.next = d;
            d.next = e;
            display(a);


//            //CODE FOR DISPLAYING LINKED LIST
//            Nodey temp = a; //just pointing to a not a new node
//            while(temp!=null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
        }

}
