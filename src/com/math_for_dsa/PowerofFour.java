package com.math_for_dsa;

public class PowerofFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
    static boolean isPowerOfFour(int n) {
//
//        for(int i = 0; i < 30; i++)
//        {
//            if((Math.pow(4,i)) == n)
//                return true;
//
//        }
//        return false;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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

            if(n % 4 != 0) return false;
        }

        return checkPower(n/4);
    }
}
