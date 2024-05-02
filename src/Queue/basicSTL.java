package Queue;

import java.util.*;

public class basicSTL {
    public static void main(String[] args) {

        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>r=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        for(int i=0;i<q.size();i++){
            int ele= q.remove();
            System.out.println(q);
        }




    }
}
