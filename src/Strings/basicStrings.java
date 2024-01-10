package Strings;
import java.util.*;
public class basicStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str="physics Wallah";
//        System.out.println(str);
        int idx=str.indexOf('a');
        System.out.println(idx);

        //COMPARE TO FXN
        String s="Hello";
        String g="Dello";
//        System.out.println(s.compareTo(g));
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.startsWith("llo"));
//        System.out.println(s.endsWith("llo"));
        System.out.println(s.concat(g));


    }
}
