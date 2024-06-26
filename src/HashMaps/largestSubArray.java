package HashMaps;

import java.util.HashMap;

public class largestSubArray {
    static int larestSubarrayWith0Sum(int[]arr){
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);  //khud se add karo
        int prefSum=0;
        int maxLength=0;   //to be returned
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            if(mp.containsKey(prefSum)){
                int len=i-mp.get(prefSum);
                if(len>maxLength) maxLength=len;
            }
            else mp.putIfAbsent(prefSum,i);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr={-15,-2,2,-8,1,7,10,23};
        System.out.println(larestSubarrayWith0Sum(arr));
    }
}
