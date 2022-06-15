package com.bit_manipulation;
//pascal triangle
//1
//1  1
//1  2  1
//1  3  3  1
//1  4  6  4  1
//1  5  10 10 5  1
//1  6  15 20 15 6  1


public class pascalTriangleNthRowSum {
    public static void main(String[] args) {
        int n=7;
        System.out.println(1<<(n-1));
        System.out.println((int)Math.pow(2,n-1));
    }
}
