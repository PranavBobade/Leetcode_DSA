package com.bit_manipulation;

public class PrimeNumberofSetBitsinBinaryRepresentation {
   static public void  main(String[] args) {
        int left = 6, right = 10;
        System.out.println(countPrimeSetBits(left,right));
    }
    static int countPrimeSetBits(int left, int right) {
        int c, count = 0;
        boolean ans = false;
        for(int i = left ; i <= right; i++)
        {
            c = Integer.bitCount(i);
            ans = isPrime(c);
            if(ans == true)
            {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) // check is the no. of bits in given range is prime or not
    {
        if(n < 2)
            return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
