package HashMaps;

import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);

        }
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if (mp.containsKey(more) && mp.get(more) != i) {
                return new int[]{i, mp.get(more)};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] res=twoSum(arr,target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
