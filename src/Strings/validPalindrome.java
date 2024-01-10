package Strings;
import java.util.*;
public class validPalindrome {
    static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int i=0,j=s.length()-1;
        while (i<j){
            char currFirst=s.charAt(i);
            char currLast=s.charAt(j);
            if(!Character.isLetterOrDigit(currFirst)){
                i++;
            }
            else if(!Character.isLetterOrDigit(currLast)){
                j--;

            }
            else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panam";
        System.out.println(isPalindrome(str));
    }

}
