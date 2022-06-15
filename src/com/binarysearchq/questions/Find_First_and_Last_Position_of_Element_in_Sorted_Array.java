package com.binarysearchq.questions;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
// log(n)
    static int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        // check for the first occurrence if target first
       ans[0]=search(nums,target,true);
       if(ans[0]!=-1) {        // if target is not present in array i.e. ans[0]=-1 no need to find for ans[1].
           ans[1] = search(nums, target, false);
       }

        return ans;
        }
    // this function just returns index value of target
   static  int search(int []nums,int target, boolean findStartIndex)
    {
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                // potential ans found
                ans=mid;
                if(findStartIndex) {  // to find 1st occurrence
                    end=mid-1;
                }
                else {                // to find 1st occurrence
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}






//------------------------------------------------------------------------------------------------------------------------------
        //0(n)
//        int ans[] = {-1,-1};
//        for (int i = 0; i <nums.length ; i++) {
//            if(target==nums[i]) {
//                ans[0] = i;
//                break;
//            }
//
//        }
//        for (int i = nums.length-1; i >0 ; i--) {
//            if(target==nums[i]) {
//                ans[1] = i;
//                break;
//            }
//
//        }
//        return ans;
//    }
//}
