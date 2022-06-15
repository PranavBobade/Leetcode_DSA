package com.interview;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String args[]) {
        int[] a = {34, 56, 78, 98, 99, 67};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int a[]) {

        for(int i = 0; i < a.length; i++)
        {
            int last = a.length - i -1;
            int maxIndex = getMaxIndex(a,0,last);

            swap(a,maxIndex,last);
        }

    }

     static void swap(int[] a, int first, int second) {
        int temp = a[second];
        a[second] = a[first];
        a[first] = temp;
    }

    static int getMaxIndex(int[] a, int i, int last) {
        int max = i;
        for (int j = i; j <= last ; j++) {
            if(a[j]>a[max])
                max = j;
        }
        return max;
    }
}


