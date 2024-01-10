package Recursion;
import java.util.Scanner;
public class checkPalindrome {

    static String reverse(String s, int idx){
        if(idx==s.length()) return "";
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }

    public static void main(String[] args) {

            System.out.println("Enter a String: ");
            Scanner sc= new Scanner(System.in);
            String s=sc.nextLine();
            String rev=reverse(s,0);
            if (rev.equals(s)){
                System.out.printf("%s is A PALINDROME ",s);
            }
            else System.out.printf("%s is not a PALINDROME ",s);
        }
}
