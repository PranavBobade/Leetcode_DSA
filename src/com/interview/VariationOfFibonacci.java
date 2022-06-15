package com.interview;
//RSL -5
//A-5: Variation of Fibonacci
//        The Fibonacci sequence is constructed by adding the last two numbers of the sequence so far to get the next number in the sequence. The first and the second numbers of the sequence are defined as 0 and 1. We get:
//        0, 1, 1, 2, 3, 5, 8, 13, 21…

// Write a function which takes input as a number:
// If the given number is a Fibonacci number, print the number
// If the given number is NOT Fibonacci number, print the sum of all even Fibonacci numbers less than the given number.


//
//        Example
//        (21 is a Fibonacci number)
//        Input: 21 Output: 21
//        (20 is NOT a Fibonacci number so, output is 10 (2+8))
//        Input: 20 Output: 10

public class VariationOfFibonacci {
    public static void main(String[] args) {
        int sum = 0;
        int n = 21;
        if(getFibOutput(n))
            System.out.println(n);
        else {
            for (int i = 1; i < n; i++) {
                if (getFibOutput(i) && i % 2 == 0)
                    sum += i;
            }
            System.out.println(sum);
        }
    }
   static boolean getFibOutput(int n) {
        int a = 0;
        int b = 1;

        if(n == a || n == b) return true;
        int c = a + b;

        while(c <= n)
        {
            if(c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return  false;

    }
}
