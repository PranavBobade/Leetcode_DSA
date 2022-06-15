package com.math_for_dsa;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
       int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left,right));
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>res=new ArrayList();

        for(int i = left; i <= right; i++)
        {
            if(isDivide(i))
                res.add(i);
        }
        return res;
    }

    static boolean isDivide(int num)
    {
        int n=num;
        while(n > 0)
        {
            int rem = n % 10;
            if(rem == 0 || (num % rem) != 0)  // by rem == 0 we are avoiding no.s having zeros in them.
                return false;
            n = n / 10;
        }
        return true;
    }
}
