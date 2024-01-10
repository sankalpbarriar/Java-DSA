package Recursion;
import java.util.Scanner;
public class removeAlla {
    static String removeChar2(String s){
        if (s.length()==0) return " ";
        String smallAns=removeChar2(s.substring(1));
        char currChar=s.charAt(0);
        if (currChar!='a')  return currChar+smallAns;
        else return smallAns;

    }
    static String removeChar(String s, char a,int idx){      //s=dbacx
        //Base CASE
        if(idx==s.length())   return " ";              //return empty string
        String smallAns=removeChar(s,a,idx+1);     //smallAns=bcx
        //SELF WORK
        if (s.charAt(idx)==a)  return smallAns;
        else return s.charAt(idx)+smallAns;              // d+smallAns
    }

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeChar(s,'a',0));
        System.out.print(removeChar2(s));
    }
}
