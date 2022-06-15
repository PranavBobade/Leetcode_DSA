package com.math_for_dsa;
//In order to find a rule to break out the loop, I start calculating 2 and find a loop at 4, then 3,5,6,9 will all go into that loop. So in 1-9, only 1 and 7 are happy numbers. Also I find all numbers' calculation will goes into a single digit at some time.
// So what I did is just calculate happy sum and when it is a single digit, check if it is 1 or 7.


import java.util.HashSet;

//In this question, we check for the case n==7 as well as if n==7, the square sum of the numbers digits is 7²= 49, then 9²+4²=97, then 9²+7²=130, followed by 1²+3²+0²=10
// which finally gives out the result as 1²+0²=1.For all other integers between 2 to 9, the square and add operation inevitably leads to an infinite loop.
public class HappyNumber {
    public static void main(String[] args) {
      int n = 19;
        System.out.println(isHappy(n));
    }

    static  boolean isHappy(int n) {
//        if (n <= 0) return false;
//
//        while (n >= 10) {
//            int sum = 0;
//            while (n != 0) {
//                sum += (n%10)*(n%10);
//                n /= 10;
//            }
//            n = sum;
//        }
//        return n == 1 || n == 7; // if n is 1 or 7 return true else false

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//
//        HashSet<Integer> seen = new HashSet<Integer>();
//
//        while(n != 1)
//        {
//            int current = n;
//            int sum = 0;
//            while(current != 0)
//            {
//                sum += (current % 10) * (current % 10);
//                current /= 10;
//
//            }
//            if(seen.contains(sum))
//            {
//                return false; // if we are in infinite loop we will get same numbers again
//            }
//            seen.add(sum);
//            n = sum;
//        }
//        return true;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //Floyd's cycle detection algorithm
        int fast = n, slow = n; // slow(moves 1 step) and fast(moves 2 step) pointer

        do {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        } while(slow != fast);

        return slow == 1;
    }

    static int squareOfDigits(int num){
        int ans =  0;

        while(num > 0){
            int rem  = num % 10;
            ans += rem*rem;
            num /= 10;
        }

        return ans;



    }

}
