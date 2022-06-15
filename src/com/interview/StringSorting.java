package com.interview;

import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String a[] = {"robert", "john", "cristina", "vijay", "abrahim"};
        selection(a);
        for(String i : a) // to print sorted string array
        {
            System.out.print(i+ " ");
        }
        System.out.println();
        Arrays.sort(a);
        for (String x:a
             ) {
            System.out.print(x+" ");
        }}

    static void selection(String[] a) {
// One by one move boundary of unsorted subarray
        for (int i = 0; i < a.length - 1; i++)
        {
            // Find the minimum element in unsorted array
            int min_index = i;
            String minStr = a[i];
            for(int j = i+1; j < a.length; j++)
            {
                  /*compareTo() will return a -ve value,
            if string1 (arr[j]) is smaller than string2 (minStr)*/
                // If arr[j] is smaller than minStr

                if(a[j].compareTo(minStr) < 0)  // each time we will find min.string from unsorted array
                {
                    // Make arr[j] as minStr and update min_idx
                    minStr = a[j];
                    min_index = j;
                }
            }
            // Swapping the minimum element
            // found with the first element.
            if(min_index != i)      // means string is not sorted so we will swap min. string at current index
            {
                String temp = a[min_index];
                a[min_index] = a[i];
                a[i] = temp;
            }
        }
    }
}
