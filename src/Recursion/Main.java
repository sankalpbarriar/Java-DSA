package Recursion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
//              s="college"
//                 0123456       n=7
//            s.charAt(0)='c'
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        //SUBSTRING
        System.out.print(s.substring(2));
        System.out.print(s.substring(2,6));

    }
}
