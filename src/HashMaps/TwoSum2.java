package HashMaps;
import java.util.HashMap;

public class TwoSum2 {
    static int[] twoSum(int[] arr, int target){
        int[] res={-1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int pair=target-arr[i];
            if(mp.containsKey(pair)){
                return new int[]{i,mp.get(pair)};
            }
            else mp.put(arr[i],i);
        }
        return res;
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
