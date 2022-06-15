package com.math_for_dsa;

public class BinarySearchSQRT {
    public static void main(String args[])
    {
        int n = 40;
        int p = 3;  //precision

        System.out.printf("%.3f",sqrt(p,n));
    }

// Time complexity :  O(log(N))

     static double sqrt(int p, int n) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while(s <= e)
        {
            int m = s + (e - s) /  2;

            if(m * m == n) {
                return m;
            }

            if(m * m > n) {
                e = m - 1;
            }
            else{
                s = m + 1;
            }

        }
        double incr = 0.1;
         for (int i = 0; i < p; i++) {
             while(root * root <= n) {
                 root += incr;
             }
             root -= incr; // when condition fails we need previous value
             incr /= 10;   // we will again start checking by adding 0.01, 0.02............... i.e we will check for 2nd decimal place

         }
        return root;

    }

}
