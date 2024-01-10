package Strings;

public class interning {
    public static void main(String[] args) {
        String s="Hello";
        String x="Hello";
        x="Mello";  // s ?
        System.out.println(x);
        System.out.println(s);
        s=s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);
    }
}
