package com.sorting;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
       int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));

    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> mp = new HashMap();

        for(int i = 0; i < arr1.length; i++)
        {
            if(mp.containsKey(arr1[i])) // stored arr1 elements with their count
            {
                mp.put(arr1[i],mp.get(arr1[i]) + 1);
            }
            else
            {
                mp.put(arr1[i],1);
            }
        }

        int index = 0;
        for(int i = 0; i < arr2.length; i++)  //as per array2 elements are stored in arr1 count times
        {
            for(int j = 0; j < mp.get(arr2[i]); j++)
            {
                arr1[index++] = arr2[i];
            }
            mp.remove(arr2[i]); //those elements are added remove them from map
        }
        List<Integer> remainingElements = new ArrayList<Integer>();
        for(int k : mp.keySet())              //add remaining elements which are not in arr2 into list
        {
            for(int j = 0; j < mp.get(k); j++)
            {
                remainingElements.add(k);
            }
        }
        Collections.sort(remainingElements); // sort the list
        for(int element : remainingElements)  arr1[index++] = element; //add the list to arr1
        return arr1;
    }
}
