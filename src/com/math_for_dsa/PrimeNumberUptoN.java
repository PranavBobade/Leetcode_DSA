package com.math_for_dsa;


// O(n * sqrt(n))
public class PrimeNumberUptoN {
    public static void main(String [] args)
    {
        int n = 40;
        for (int i = 2; i <= n ; i++) {
            if(prime(i) == true)
                System.out.println(i);
        }
    }

    static boolean prime(int n) {
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

