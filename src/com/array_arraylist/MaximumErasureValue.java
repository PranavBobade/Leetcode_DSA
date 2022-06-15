package com.array_arraylist;

import java.util.HashSet;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int []nums = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
    }
    // TC - O(N) SC - O(N)
    static int maximumUniqueSubarray(int[] nums) {
        int currentSum = 0, ans = 0;
        HashSet<Integer> set = new HashSet();

        for(int i = 0, j = 0; j < nums.length; j++)
        {
            while(set.contains(nums[j])) // if element already in set remove it subtract it from current sum and increase i
            {
                set.remove(nums[i]);
                currentSum -= nums[i];
                i++;
            }
            set.add(nums[j]);          // if element is not in set add to set and currentsum
            currentSum += nums[j];
            ans = Math.max(ans,currentSum); // give max. sum from current sub-array-sum and ans
        }
        return ans;
    }

}
