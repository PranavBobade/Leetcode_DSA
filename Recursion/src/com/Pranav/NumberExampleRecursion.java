package com.Pranav;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        //base condition
        if(n==5)
        {
            System.out.println(5);
            return;
        }
  //body
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        print(n+1);
        //this is called tail recursion
        //this is the last function call
    }
}
