package Stacks;

public class MinSwaps {
    public static void main(String[] args) {
        int close=0,open=0;
        String s="[[]]][]]][[[]]][[[][";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[') open++;
            else{
                //if(st.isEmpty() || st.peek()==']'
                if(open<=0) close++;
                else open--;
            }
        }
        System.out.println((close+1)/2);
    }

}
