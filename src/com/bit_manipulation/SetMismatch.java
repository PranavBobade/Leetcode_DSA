package com.bit_manipulation;

//
//
//Useful XOR properties:
//        a ^ a = 0
//        a ^ b = b ^ a
//        a ^ 0 = 0 ^ a = 0
//        a ^ (b ^ c) = (a ^ b) ^ c = any other order of applying XOR among a, b and c
//
//        Suppose the array contained each number from 1 to n and we took a bitwise XOR with all the numbers from 1 to n, the result would be 0 since pairs would get cancelled out.
//
//        (1 ^ 2 ^ 3 .... ^ n) ^ (1 ^ 2 ^ 3 .... ^ n) = (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3) .... (n ^ n) = 0 ^ 0 ^ 0 ... ^ 0 = 0
//        Now, say one number a is duplicated and another number b is removed, the result would be a ^ b since one a and one b would be left without a pair.
//        (1 ^ 2 ^ 3 ... a ^ a (a is duplicated).... (b-1) ^ (b+1) (b is missing) ... ^ n) ^ (1 ^ 2 ^ 3 .... ^ n) = (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3) .... (a ^ a ^ a) (3 a's while pairing).... ^ b (only 1 b) .... (n ^ n) = 0 ^ 0 ^ 0 ... ^ (0 ^ a) ... ^ b ... ^ 0 = a ^ b
//
//        Since, a and b are different, a ^ b is non-zero hence it must have a 1 bit somewhere in its binary form. This 1 bit implies that a and b differ at this bit position. In other words, a has a bit 0 at that position and b has a bit 1 OR a has a bit 1 at that position and b has a bit 0.
//
//        If we were to take a XOR of only those numbers which have at a bit 1 at the same place where a ^ b also has a bit 1 (this applies to both the array and the sequence of 1 to n), then we'd get either a or b as the result.
//        Reason is that we have segregated all the numbers into 2 piles (ones that have a bit 1 and the ones that don't) where all the pairs still get cancelled out barring a and b but this time, a and b don't get mixed up -- they belong to different piles.
//
//        Once we have one number be it a or b, we can take XOR with the original a ^ b value to get the other number.
//
//        We can calculate rightmost 1 bit (although any 1 bit would work) by doing n & (~(n - 1)). Here is how it works:
//
//        n              b b ... b b 1 0 0 0 0
//        n-1            b b ... b b 0 1 1 1 1
//        ~(n-1)         b'b'... b'b'1 0 0 0 0
//        n & (~(n-1))   0 0 ... 0 0 1 0 0 0 0
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
      int [] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ (i + 1);
        }
        int diffBit = xor & (~(xor - 1)), a = 0;
        for(int i = 0; i < nums.length; i++) {
            if((diffBit & nums[i]) != 0) {
                a ^= nums[i];
            }
            if((diffBit & (i + 1)) != 0) {
                a ^= (i + 1);
            }
        }
        for(int num: nums) {
            if(num == a) {
                return new int[] {a, xor ^ a};
            }
        }
        return new int[] {xor ^ a, a};
    }

}
