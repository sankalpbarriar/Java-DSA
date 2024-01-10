package Strings;

public class checkPaliWithRev {
    static String reverse(String s){
        if(s.length()==0) return " ";
        String smallAns=reverse(s.substring(1));
        return smallAns+s.charAt(0);
    }
    static boolean isPalindrome(String s, int l, int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));
    }

    public static void main(String[] args) {
        String s="dady";
        System.out.println(isPalindrome(s,0,s.length()-1));
        System.out.println(reverse(s));
    }
}
