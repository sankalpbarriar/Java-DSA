package BInaryTree;
import java.util.*;
public class uniqueDigitCnt {
    static int unique2(int n){
        int[] freq = new int[10];
        while(n > 0){
            int num = n%10;
            freq[num]++;
            n/=10;
        }
        int cnt = 0;
        for(int ele : freq){
            if(ele >= 1) cnt++;
        }
        return cnt ;
    }
    static int unique(int n){
        HashSet<Integer> st = new HashSet<>();
        while(n != 0){
            int num = n%10;
            st.add(num);
            n/=10;
        }
        return st.size();
    }

    public static void main(String[] args) {
        int n = 304545260;
        System.out.println(unique(n));
        System.out.println(unique2(n));

    }
}
