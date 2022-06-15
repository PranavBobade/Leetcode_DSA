package com.math_for_dsa;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(climbStairs(n));
    }
     static int climbStairs(int n) {
         //bottom - up approach

//         int [] dp = new int[n+1]; // to store subproblems
//         dp[0] = 1; // for 0 step 1 way
//         dp[1] = 1; // for 1 step 1 way
//         for(int i = 2; i <= n; i++)
//         {
//             dp[i] = dp[i - 1] + dp[i - 2];
//
//         }
//         return dp[n];

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//
         int[] ans = new int[n+1];

         return climbStairsDP(n,ans);
    }
    static int climbStairsDP(int n, int[] ans){
        if(n <= 1){
            return 1;
        }

        if(ans[n] > 0) return ans[n];

        ans[n] = climbStairsDP(n - 1,ans) + climbStairsDP(n-2,ans);

        return climbStairsDP(n - 1,ans) + climbStairsDP(n-2,ans);
    }
}
