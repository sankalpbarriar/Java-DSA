package Recursion;
import java.util.Scanner;
public class reverseString {
    static String reverse(String s, int idx){
        if(idx==s.length()) return "";
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }


    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s,0));
    }

}
