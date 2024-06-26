package HashSets;

import java.util.HashSet;

             //    T.C ~ O(n) -> because we are not traversing a number twice
public class longestSubsequence {
    static int findLongestSubsequence(int[] arr){
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int maxLen=0;       //msx length of streak
        for(int key:st){
            int len=1;
            if(!st.contains(key-1)){      //key is the starting point
                while(st.contains(key+1)){
                    len+=1;
                    key++;
                }
                maxLen=Math.max(maxLen,len);
            }
            else continue;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(findLongestSubsequence(arr));
    }
}
