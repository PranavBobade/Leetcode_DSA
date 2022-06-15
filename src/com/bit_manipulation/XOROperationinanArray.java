package com.bit_manipulation;

public class XOROperationinanArray {
    public static void main(String[] args) {
       int  n = 5, start = 0;
        System.out.println(xorOperation(n,start));
    }
    static int xorOperation(int n, int start) {
        int arr [] = new int [n];
        int xor = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = start + 2 * i;
        }


        for(int j = 0; j < n; j++)
        {
            xor ^= arr[j];
        }
        return xor;
    }
}
