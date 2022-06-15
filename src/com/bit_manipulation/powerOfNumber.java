package com.bit_manipulation;

public class powerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;

        int ans = 1;

        while(power > 0) {
          if ((power & 1) == 1) {
              ans *= base; //we are multiplying only for set bits

          }
          base *= base;
          power = power >> 1;
        }
        System.out.println(ans);

    }
}
