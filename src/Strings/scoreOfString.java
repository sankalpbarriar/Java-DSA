
package Strings;
import java.util.*;

public class scoreOfString {
    public static int scoreOfStrings(String s) {
       char[] arr=s.toCharArray();
       int ans=0;
       for(int i=0;i<arr.length-1;i++){
           int asci1=(int)arr[i];
           int acci2=(int)arr[i+1];
           int diff=Math.abs(asci1-acci2);
           ans+=diff;
       }
       return ans;

    }

    public static void main(String[] args) {
        String str="hello";
        int res=scoreOfStrings(str);

        System.out.println(res);
    }
}
