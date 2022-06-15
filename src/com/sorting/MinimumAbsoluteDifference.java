package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int [] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++)
        {
            minDiff = Math.min(arr[i] - arr[i - 1], minDiff); // first find the min-diff from the array
        }

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] - arr[i - 1] == minDiff)  // check the pairs which have diff == min-diff
            {
                List<Integer> pair = new ArrayList();
                pair.add(arr[i - 1]);   // add elements into 1d list in asc order
                pair.add(arr[i]);
                result.add(pair);  // add pairs into 2d list
            }
        }
        return result;
    }
}
