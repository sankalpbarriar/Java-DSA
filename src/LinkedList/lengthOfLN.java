package LinkedList;

public class lengthOfLN {
   public static int findLength(Nodee heads){
        int count=0;
        while(heads!=null){
            count+=1;
            heads=heads.next;
        }
        return count;
    }
    static class Nodee {
        int data;
        Nodee next;

        public Nodee(int data) {
            this.data = data;
        }
    }

        public static void main(String[] args) {
            Nodee a=new Nodee(2);
            Nodee b=new Nodee(3);
            Nodee c=new Nodee(6);
            Nodee d=new Nodee(1);
            Nodee e=new Nodee(9);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            System.out.println(findLength(a));

        }

}
