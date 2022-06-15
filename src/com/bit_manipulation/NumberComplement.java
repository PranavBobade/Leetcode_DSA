package com.bit_manipulation;
//Idea:
//
//        Flip all bits using negation operator (~) [read more here]
//        Bitwise AND (&) with a bit mask of size n whose all bits are set, where n = number of bits in num
//        Example:
//        num = 5
//        num binary = 0...0101
//        ~num binary = 1...1010
//
//        * Now we've flipped all the bits but it also flipped previously insignificant bits (0s),
//        so to revert them back to 0s, we need to only keep the significant bits and turn off the insignificant bits
//        * This can be done by using mask of 1s having size equal to number of bits in num. This mask is (1 << nBits) - 1
//        * This is a standard mask in bit manipulation problems
//
//        ~num binary & mask = (1...1010) & (0...0111) = 0...0010 [Ans]
//        T/S: O(1)/O(1)


public class NumberComplement {
    public static void main(String[] args) {
          int num = 5;
        System.out.println(findComplement(num));
    }
    static int findComplement(int num) {
//        var nBits = (int) Math.floor((Math.log(num) / Math.log(2)) + 1);
//        var mask = (1 << nBits) - 1;
//
//        return ~num & mask;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        return ~num & (Integer.highestOneBit(num) - 1);   //Integer.highestOneBit(num) - 1 ==> 4-1=3

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// here we are counting weights of zeros/ZERO BITS which gives desired complement of given number
        int ans = 0;
        int power = 1;

        while(num > 0){
            int last = num & 1;

            if(last == 0){
                ans += power * 1;
            }

            power = power * 2;
            num = num >> 1;
        }

        return ans;
    }
}
