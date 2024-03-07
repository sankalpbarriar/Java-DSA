package Stacks;

import java.util.Stack;

public class minAddToMakePareValid {
    public static void main(String[] args) {
        Stack <Character> st=new Stack<>();
        String str="{{}{{}}{{{";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='{') st.push(ch);
            else{
                if(st.isEmpty()||st.peek()=='}') st.push(ch);
                else{
                    st.pop();
                }
            }
        }
        System.out.println(st.size());


    }
}
