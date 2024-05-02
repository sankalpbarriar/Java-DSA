package CollectionFramework;

import java.util.HashSet;

public class setInterface {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();  //unique and unordered
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(23);
        st.add(22);
        st.add(8);
        System.out.println(st);
    }
}
