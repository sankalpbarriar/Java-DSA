package HashSets;

import java.util.HashSet;

public class Ques2 {
    static int findMaxPairs(int[] arr){
        HashSet<Integer>st=new HashSet<>();
        int maxLen=0;
        for (int i = 0; i < arr.length; i++) {
            if (!st.contains(arr[i])) {
                st.add(arr[i]);
            } else {
                // If the element is already in the set, remove it
                st.remove(arr[i]);
            }
            maxLen = Math.max(maxLen, st.size());
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(findMaxPairs(arr));
    }
}
