package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sm {
    public static void main(String[] args) {
        int a[]={1 ,5 ,9, 17, 1, 1, 9, 5, 0, 8, 6, 8, 15, 2, 0, 7, 13, 1, 4, 4};
        int n=20;
        System.out.println(seq(a,n));

    }
    static int seq(int[] A, int N) {
        if(N==0)
            return 0;
        if(N==1 && A[0]==0)
            return 1;
        Arrays.sort(A);
        Set<Integer> set=new HashSet<Integer>();

        for(int x:A)
        {
            set.add(x);
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int i:set)
        {   
            list.add(i);

        }
        for(int K:list)
        {
            System.out.print(K+ " ");;

        }

        for(int j=0;j<list.size();j++)
        {
            if(list.get(j)!=j)
                return j;
        }
        return 0;

    }
}
