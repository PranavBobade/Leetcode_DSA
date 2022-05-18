package com.Pranav;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
          int num=16;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num/2;

        if(num == 1)
            return true;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            long m=(long)mid*(long)mid;
            if (m== num)
                return true;
            else if (m > num)
                end = mid - 1;
            else
            {
                start=mid+1;
            }

        }
        return false;
    }
}
