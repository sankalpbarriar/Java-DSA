package Strings;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        // A->65  a->97   0->48      PhySicS--> pHYsICs
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string:");
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        for (int i=0;i<str.length();i++){
            //check the alphabet is small or capital
            boolean flag=true;   //true-> capital
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci >=97)  flag=false;    // small
            if (flag==true){
                asci+=32;             // A(65) +32= a(97)
                char dh=(char)asci;   //typecast the character
                str.setCharAt(i,dh);  //set new car at that position
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
