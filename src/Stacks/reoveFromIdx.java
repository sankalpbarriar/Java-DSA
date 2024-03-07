package Stacks;

import java.util.Stack;

public class reoveFromIdx {
    static void deleteFromIdx(Stack<Integer> st,int idx){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        deleteFromIdx(st,4);
        System.out.println(st);

    }
}
