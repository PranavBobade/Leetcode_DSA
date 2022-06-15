package com.interview;
// RSL -4
//A-4: Write a function which takes an input parameter as an array of integers and
// prints the sum of all non prime numbers
// from the given array. If all integers present in the input array are prime the program should print sum as 0.
//Example:
//        Input1: [1, 14, 5, 7] Output: sum=15
//        Input2: [2, 10, 13, 9] Output: sum=19

public class PrimeNumberVariation {
    public static void main(String[] args) {
        int []a = {2, 10, 13, 9};
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
           if(!isPrime(a[i]))
               sum += a[i];
        }
        System.out.println(sum);

    }
    static boolean isPrime(int n)
    {
        if(n<2) {
            return false;
        }
        int c = 2;
        while(c*c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}
