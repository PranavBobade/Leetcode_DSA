package com.math_for_dsa;
// O(n * sqrt(n))


public class PrimeNumber {
    public static void main(String args[])
    {
     int n = 20;
        for (int i = 1; i <= n ; i++) {
            System.out.println(i + " " + isPrime(i));
        }
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
