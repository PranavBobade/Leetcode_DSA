package com.math_for_dsa;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
     int n = 40;
     boolean[] primes = new boolean[n+1];  // n+1 as we are starting from zero
      sieve(n,primes);
    }
    //assume false in array means number is prime
    static void sieve(int n, boolean[] primes )
    {
        for(int i = 2; i*i <=n; i++)
        {
            if(primes[i]==false)
            {
                for (int j = i*2; j <=n ; j+=i) { // we are checking multiples of each i till (n)
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if(primes[i] == false)
                System.out.print(i+ " ");
        }
    }

}
