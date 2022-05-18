package com.Pranav;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={4,5,1,2,3};
        selection(a);
        System.out.print(Arrays.toString(a));

    }
    static void selection(int []a)
    {
        for (int i = 0; i <a.length ; i++) {
            // find the max item in the remaining array and swap with correct index
            int last=a.length-i-1;
            int maxIndex=getMaxIndex(a,0,last);

            swap(a,maxIndex,last);
        }
    }
    static void swap(int a[],int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
    static int getMaxIndex(int []a,int start,int end)
    {  int max=start;
        for (int i = start; i <=end ; i++) {
            if(a[i]>a[max])
                max=i;
        }
        return max;
    }
}
