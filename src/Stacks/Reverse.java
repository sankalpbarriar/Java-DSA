package Stacks;

import java.util.Stack;

public class Reverse {
    static void reverseSt(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        reverseSt(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseSt(st);
        System.out.println(st);


    }
}
