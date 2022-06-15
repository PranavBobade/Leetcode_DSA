package com.bit_manipulation;

import java.util.ArrayList;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(binaryGap(n));
    }
    static int binaryGap(int n) {
        if ((n & (n-1)) == 0) // if no. is power of 2 ans is zero as it contains only one 1
            return 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int i = 0;

        while(n > 0)
        {
            int last = n & 1;

            if(last == 1)
                arr.add(i);    // we are adding index's of 1 bit position

            i++;
            n = n >> 1;

        }

        int max = 0;

        for(int index = 0; index < arr.size() - 1; index++)
        {
            int diff = Math.abs(arr.get(index) - arr.get(index+1));

            if(max < diff)     // we take max. difference/distance of 1's from aarraylist
                max = diff;
        }

        return max;
    }
}
