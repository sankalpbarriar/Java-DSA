package Arrays;
import java.util.HashSet;
public class reomoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j< nums.length;j++){
            if(nums[i]!=nums[j]) i++;
            nums[i]=nums[j];    //duplicate hata ke uniquw rakh do
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
