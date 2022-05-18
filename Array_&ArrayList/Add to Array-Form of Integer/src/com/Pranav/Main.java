package com.Pranav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int [] num = {2,1,5};
       int k = 806;
        System.out.println(addToArrayForm(num,k));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        int n=num.length;
        int i=n-1;
        List<Integer>list=new ArrayList<>();

        while(i >=0 || k>0)
        {
            if(i>=0)
            {
                list.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }
            else
            {
                list.add(k%10);
                k/=10;
            }
            i--;
        }

        Collections.reverse(list);
           return list;
    }

}
