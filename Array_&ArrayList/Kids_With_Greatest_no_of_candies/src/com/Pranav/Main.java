package com.Pranav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<Boolean>();
        int max=0;
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]>max)
                max=candies[i];
        }
        for (int i = 0; i <candies.length ; i++) {
           if(candies[i]+extraCandies>=max)
               list.add(true);
           else
               list.add(false);
        }

        return list;
    }
}
