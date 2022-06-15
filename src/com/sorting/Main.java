package com.sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[]={3,1,5,4,2};
        bubble(a);
       System.out.print(Arrays.toString(a));
    }
//O(n^2) complexity
     static void bubble(int []a) {
        //run the steps n-1 times
          boolean swapped;
         for (int i = 0; i < a.length; i++) {
             swapped=false;
             //for each step, max item will come at the last respective index

             for (int j = 1; j <a.length-i ; j++) {
//           swap if the item is smaller than the previous item
                 if(a[j]<a[j-1])
                 {//swap
                     int temp=a[j];
                     a[j]=a[j-1];
                     a[j-1]=temp;
                   swapped=true;
                 }
             }
             // if you did not swap for a particular value of i, it means the array is sorted hence stop the program // O(n) complexity
             if(!swapped) // i.e. !false=true
             {
                 break;
             }
         }
    }


}
