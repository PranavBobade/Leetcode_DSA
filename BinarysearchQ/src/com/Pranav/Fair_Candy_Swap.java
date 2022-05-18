package com.Pranav;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Fair_Candy_Swap {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    //O(n^2)
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//        int n=aliceSizes.length;
//        int m=bobSizes.length;
//        int []ans=new int [2];
//        int sum1=0;
//        int sum2=0;
//
//        for(int i:aliceSizes)
//        {
//            sum1=sum1+i;
//        }
//        for(int j:bobSizes)
//        {
//            sum2=sum2+j;
//        }
//        int target=(sum2-sum1)/2;
//
//
//        ans=takeFairCandySwap(aliceSizes,bobSizes,target);
//        return ans;
//    }
//    static int[] takeFairCandySwap(int []a,int []b,int target)
//    {
//        for(int i=0;i<a.length;i++)
//        {
//            for(int j=0;j<b.length;j++)
//            {
//                if(b[j]==a[i]+target)            // we have to satisfy this condition for fair candy swap //---(y=x+(sb-sa)/2)
//                    return new int[]{a[i],b[j]};
//            }
//        }
//        return new int[] {-1,-1};
//    }

        int sa = 0, sb = 0;  // sum of A, B respectively
        for (int x : aliceSizes) sa += x;
        for (int x : bobSizes) sb += x;
        int delta = (sb - sa) / 2;
        // If Alice gives x, she expects to receive x + delta

        Set<Integer> setB = new HashSet();
        for (int x : bobSizes) setB.add(x);

        for (int x : aliceSizes)
            if (setB.contains(x + delta)) {
                return new int[]{x, x + delta};  // return alice candy, bob candy
            }
        return new int[]{-1, -1};
    }
}
