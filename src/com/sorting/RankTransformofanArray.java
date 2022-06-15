package com.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray {
    public static void main(String[] args) {
        int [] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
        int [] res = new int [arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            res[i] = arr[i];
        }

        Arrays.sort(arr);

        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 1;
        for(int i : arr)
        {
            if(!hm.containsKey(i))
            {
                hm.put(i,rank);
                rank++;
            }
        }

        for(int i = 0; i < res.length; i++)
        {
            res[i] = hm.get(res[i]); //gives rank value
        }
        return res;
    }
}
