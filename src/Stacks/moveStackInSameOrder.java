package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack rt=new Stack();
        while (st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
//            rt.push(st.pop());  will do the same operation
        }
        System.out.println(rt);
        Stack gt=new Stack();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);

    }
}
