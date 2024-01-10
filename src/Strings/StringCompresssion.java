package Strings;
import java.util.*;
public class StringCompresssion {
    public static void main(String[] args) {
        String str="aaabbbcddeeee";
        String ans=""+str.charAt(0);    //initalizing ans
        int cnt=1;                      // 1 kyuki pehle hi ans me first character to daal hi chuke hai
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                cnt++;
            }
            else{
                if(cnt>1) ans += cnt;
                cnt=1;
                ans+=curr;
            }
        }
        if (cnt>1 )ans+=cnt;
        System.out.println(ans);
    }
}
