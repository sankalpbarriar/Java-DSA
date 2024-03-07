package Stacks;
import java.util.*;
public class ValidParenthesis {
    static boolean isValid(String st){
        Stack <Character> gt=new Stack<>();
        int n=st.length();
        for (int i=0;i<n;i++){
            char ch=st.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                gt.push(ch);
            }
            else{
                if(gt.size()==0) return false;
                char top=gt.peek();
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                   gt.pop();
                }
                else{
                    return false;
                }
            }


        }
        return gt.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you parenthesis string");
        String st=sc.nextLine();
        System.out.println(isValid(st));
    }
}
