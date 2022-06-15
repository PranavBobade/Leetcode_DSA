package com.bit_manipulation;

public class BinaryNumberwithAlternatingBits {
    public static void main(String[] args) {
       int  n = 6;
        System.out.println(hasAlternatingBits(n));
    }
    static boolean hasAlternatingBits(int n) {
        while(n > 0)
        {
            int last = n & 1;
            int last2 = (n >> 1) & 1;

            if(last == last2)
                return false;

            n = n >> 1;
        }
        return true;
    }
}
