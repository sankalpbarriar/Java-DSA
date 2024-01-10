package WrapperClass;
import java.util.*;
public class reverseArray {
    static void reverseList(ArrayList<Integer>list){
        int i=0,j=list.size()-1;

        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(22);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }
}
