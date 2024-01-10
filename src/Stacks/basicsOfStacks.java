package Stacks;
import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();  //Creating a Stack
        System.out.println(st.isEmpty());
        System.out.println(st);
        st.push(1);
        System.out.println(st.isEmpty());
        System.out.println("size is: "+st.size());
        st.push(23);
        System.out.println("size is: "+st.size());
        st.push(90);
        System.out.println("size is: "+st.size());
        st.push(5);
        System.out.println("size is: "+st.size());
        st.push(94);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("size is: "+st.size());

    }
}
