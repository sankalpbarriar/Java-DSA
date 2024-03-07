package Stacks;

import java.util.Stack;

public class DisplayStack {
    static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    static void displayRecRev(Stack<Integer> st){
        //BASE CASE
        if(st.size()==0) return ;
        int top=st.pop();
        System.out.print(top+" ");   //SELF WORK
        displayRecRev(st);  //RECURSIVE WORK
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int x=rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }
//        System.out.println();
//        //Same thing with the Array
//        int n=st.size();
//        int[] arr=new int[n];
//        for (int i=n-1;i>=0;i--){
//            int x=st.pop();
//            arr[i]=x;
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
        //empty the array and print
        displayRecRev(st);
        System.out.println();
        displayRec(st);
    }
}
