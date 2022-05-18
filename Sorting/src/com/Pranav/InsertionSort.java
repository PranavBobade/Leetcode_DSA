package com.Pranav;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={4,5,1,2,3};
        insertion(a);
        System.out.print(Arrays.toString(a));
    }

     static void insertion(int[] a) {
         for (int i = 0; i <a.length-1 ; i++) {
             for (int j = i+1; j >0 ; j--) {
                 if(a[j]<a[j-1])
                 {
                     swap(a,j,j-1);
                 }
                 else
                 {
                     break;
                 }
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
