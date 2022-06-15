package com.math_for_dsa;

public class PowerofTwo {
    public static void main(String[] args) {
       int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {

//        for(int i = 0; i < 31; i++) // 31 as i should be greater than or equal to input
//        {
//            if((Math.pow(2,i)) == n)
//                return true;
//
//        }
//        return false;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if(n == 0) return false;
        boolean ans = checkPower((long) n);

        return ans;

    }
    static boolean checkPower(long n){

        //this is while break condition
        //and recursion base condition
        if(n == 0) {
            return true;
        }

        if(Math.abs(n) > 0){
            if(n == 1) return true;

            if(n % 2 != 0) return false;
        }

        return checkPower(n/2);
    }
}
