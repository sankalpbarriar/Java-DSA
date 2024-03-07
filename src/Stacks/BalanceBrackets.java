package Stacks;
import java.util.*;
import java.util.Stack;

public class BalanceBrackets {

    static boolean isBalanced(String st) {
        Stack<Character> gt = new Stack<>();
        int n = st.length();
        for (int i = 0; i < n; i++) {
            char ch = st.charAt(i);
            if (ch == '(') {
                gt.push(ch);
            } else {
                if (gt.size() == 0) return false;   //Matlab pehla element hi ')' braket hai that can never be balanced
                else if (gt.peek() == '(') gt.pop();
            }
        }
        if(gt.size()==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter you string of Brackets");
        String st=sc.nextLine();
        System.out.println(isBalanced(st));
    }
}
