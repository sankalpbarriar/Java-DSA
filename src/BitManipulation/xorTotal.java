package BitManipulation;

public class xorTotal {
    static int subsetXORTotal(int[] nums){
        return findXORTotal(nums,0,0);
    }
    static int findXORTotal(int[] nums,int idx, int xor){
        //BASE CASE
        if(idx == nums.length) return xor;
        int pick = findXORTotal(nums,idx+1,xor^nums[idx]);
        int noPick = findXORTotal(nums,idx+1,xor);
        return pick+noPick;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,6};
        int res = subsetXORTotal(arr);
        System.out.println(res);
    }
}
