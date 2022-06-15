package com.sorting;

import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
       int[] g = {1,2};
       int s[] = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int i = g.length-1; // points to greediest child
        int j = s.length-1; // points to largest cookie

        while(i>=0 && j>=0)   // for maximum greediest child we will try to give largest cookie
        {
            if(s[j]>=g[i]){


                contentChildren++;
                i--;
                j--;
            }
            else       // if we don't have enough cookies for current greedy child we will move to less greediest child
            {
                i--;
            }
        }
        return contentChildren;
    }
}
