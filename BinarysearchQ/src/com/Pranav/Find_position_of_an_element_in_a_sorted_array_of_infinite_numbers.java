package com.Pranav;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static  int ans(int[]arr,int target)
    {
        //first find the range
        //first start with the box of size 2
        int start=0;
        int end=1;

        // condition for the target to lie in the range
        while(target>arr[end])
        {
            int temp=end+1;  //this is my new start
            //double the box value
            //end=previous end+sizeofBox*2
            //end-start+1 gives size of array
            end=end+(end-start+1)*2;
            start=temp;
        }
        return searchInsert(arr,target,start,end);

    }
        static int searchInsert ( int[] nums, int target,int start,int end){

            int mid = 0;
            while (start <= end) {
                mid = start + (end - start) / 2;

                if (target < nums[mid])
                    end = mid - 1;
                else if (target > nums[mid])
                    start = mid + 1;
                else
                    return mid;
            }
            return -1;

        }
    }
