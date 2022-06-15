package com.math_for_dsa;

import java.util.ArrayList;

public class Factors {
    public static void main(String Args[]) {
      //  factors1(20);
        //factors2(20);
        factors3(20);
    }

    // O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // O(sqrt(n))
    // here ans is not sorted
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                if (n / i == i) {   // e.g for 36 it will print 6 twice so added if condition
                    System.out.print(i+ " ");
                }
                else {
                    System.out.print(i+" "+ n/i+ " "); // we get 2 factors at each time n/i and n%i
                }
            }
        }
    }
    // both time and space will be O(sqrt(n))
    // here ans is  sorted
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                if (n / i == i) {   // e.g for 36 it will print 6 twice so added if condition
                    System.out.print(i+ " ");
                }
                else {
                    System.out.print(i+" "); // we get 2 factors at each time n/i and n%i
                    list.add( n / i ); // we will print first half and store 2nd half in arraylist
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }
}

