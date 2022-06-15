package com.array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        // write your code here
        int nums[] = {0, 1, 2, 3, 4};
        int index[] = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<index.length;i++){
//            list.add(index[i],nums[i]);
//        }
//        int []arr=new int[list.size()];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=list.get(i);
//        }
//        return arr;
        int[] result = new int[nums.length];
        int left, right = 0;
        for (int i = 0; i < index.length; i++) {
            if (i > index[i]) {
                right = i;
                left = index[i];
                while (left < right) {
                    result[right] = result[--right]; // to shift array elements to right
                }
                result[left] = nums[i];           // to insert element at given index after shifting
            } else {
                result[index[i]] = nums[i];      // if index is continuous/correct add directly to result
              //  left = right = i;
            }

        }
        return result;
    }
}
