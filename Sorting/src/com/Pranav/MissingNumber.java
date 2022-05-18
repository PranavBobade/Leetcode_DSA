package com.Pranav;
//https://leetcode.com/problems/missing-number/
// amazon interview question

public class MissingNumber {
    public static void main(String[] args) {
int a[]={4,0,2,1};

        System.out.println(MissingNumber(a));
    }
    static int MissingNumber(int[] a) {
        int i=0;
        while(i<a.length)
        {
            int correct=a[i];  //for sorted // index=element;
            if(a[i]<a.length && a[i]!=a[correct])  //check if current index = correct index  // if not swap
            {
                swap(a,i,correct);
            }
            else
            {
                i++;
            }


        }
        // search for first missing number
        for (int index = 0; index <a.length ; index++) {
            if (a[index] != index)
              return index;
        }
        //case 2
       return a.length; // return N
    }
    static void swap(int a[],int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }







}
