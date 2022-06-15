package com.bit_manipulation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=8;
        System.out.println(evenOrOdd(n));
    }

    static boolean evenOrOdd(int n) {
      return (n&1)==1;
    }
}
