package com.Pranav;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4};
        cyclic(a);
        System.out.print(Arrays.toString(a));
    }

     static void cyclic(int[] a) {
        int i=0;
        while(i<a.length)
        {
            int correct=a[i]-1;  //for sorted // index=value-1;
            if(a[i]!=a[correct])  //check if current index = correct index  // if not swap
            {
                swap(a,i,correct);
            }
            else
            {
                i++;
            }
        }

    }
    static void swap(int a[],int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
