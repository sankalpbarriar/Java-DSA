package HashSets;

import java.util.HashSet;

public class methods {
    public static void main(String[] args) {
        HashSet<Integer>st=new HashSet<>();
        st.add(4);
        st.add(3);
        st.add(6);
        System.out.println(st);
        for(int key:st){
            System.out.print(key+" ");
        }
        System.out.println();
        System.out.println(st.contains(2));
    }


}
