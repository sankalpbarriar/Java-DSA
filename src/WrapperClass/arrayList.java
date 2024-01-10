package WrapperClass;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();  // it only accepts objects but not p.d.t
        // adding new elements
        l1.add(6);  //6
        l1.add(7);  //6 7
        l1.add(8);  //6 7 8
        l1.add(9);  //6 7 8 9

        //printing with for loop
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i)+" ");
        }
        //print list directly
        System.out.println(l1);

        //adding element at some index
        l1.add(1,100);
        System.out.println(l1);

        //modify element at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing an elemtn at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists
        boolean ans=l1.contains(60);
        System.out.println(ans);

        //If we don't specify class we can put anything inside l
        ArrayList l=new ArrayList();
        l.add("Pappu");
        l.add(4);
        l.add(true);
        System.out.println(l);

    }
}
