package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class maxnoOfSubsetWithMaxOr {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5};
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        System.out.println("Maximum OR value: " + maxOr);

        int count = countSubsetsWithMaxOr(nums, maxOr);
        System.out.println("Number of subsets with maximum OR: " + count);
    }
    public static int countSubsetsWithMaxOr(int[] nums, int maxOr) {
        int count = 0;
        int n = nums.length;

        for (int subsetMask = 0; subsetMask < (1 << n); subsetMask++) {
            int currentOr = 0;

            for (int i = 0; i < n; i++) {
                if ((subsetMask & (1 << i)) != 0) {
                    currentOr |= nums[i];
                }
            }
            if (currentOr == maxOr) {
                count++;
            }
        }

        return count;
    }
}

