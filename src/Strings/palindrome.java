package Strings;

public class palindrome {
//    static boolean isPalindrome2(String s, int l, int r){
//        if(l>=r) return true;
//        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));
//    }
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j))  return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abcba";
        int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nthe no. of palindromic substrings are "+count);
    }
}
