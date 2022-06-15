package com.array_arraylist;
//
//Logic
//Initially, this question might look like a DP problem: pick either left or right recursively and collect the number of operations along the way. A brute force approach would result in an O(2^n) complexity which isn't great. Memoization would improve this but we'll exceed the memory limit as I've tested. Besides, we can do better.
//
//By simply reframing the question, we can come up with an O(n) complexity solution. The difficulty in this question arises from deciding whether to choose the left or the right element to remove at any given point. However, while we're removing elements from the array, we're definitely going to be letting some elements remain as well. In particular, the middle elements.
//
//Key observation:
//
//The number of elements removed equals n minus the number of elements that aren't removed.
//
//Therefore, to find the minimum number of elements to remove, we can find the maximum number of elements to not remove!
//
//So, instead of trying to find the minimum number of operations, why don't we focus on finding the longest subarray in the middle. One main thing to note is that our subarray should sum to sum - x (where sum is the sum of all elements in our array).
//Why? because the middle elements are technically the ones we don't want. If the sum of the outer elements equals x, then we're looking for a middle sum of sum - x. If this doesn't quite make sense, pay attention to the below diagram with nums = [1,5,3,9,1,7,1,3], x = 12:
//image
//
//Finding our max middle subarray length
//We can find this using a two-pointer / sliding window approach. Start left and right both at index 0.
//
//Increment right until the current window sum is > sum - x
//Update our maxLength if and only if our current window sum == sum - x
//Repeat the above steps until we reach the end of the array.
//image
//
//Awesome! Now we have everything we need to start coding


public class MinimumOperationstoReduceXtoZero {
    public static void main(String[] args) {
      int []  nums = {3,2,20,1,1,3};
      int x = 10;
        System.out.println(minOperations(nums, x));
    }
    static int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int num: nums) sum += num;

        int maxLength = -1, currSum = 0;
        for (int l=0, r=0; r<nums.length; r++) {
            currSum += nums[r];
            while (l <= r && currSum > sum - x)
            {
                currSum -= nums[l++];
            }
            if (currSum == sum - x) maxLength = Math.max(maxLength, r-l+1);
        }

        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}
