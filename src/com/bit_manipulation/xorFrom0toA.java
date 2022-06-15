package com.bit_manipulation;

public class xorFrom0toA {
    public static void main(String[] args) {
        int a = 2;
        if ( a % 4 == 0)
            System.out.println(a);
        if ( a % 4 == 1)
            System.out.println(1);
        if ( a % 4 == 2)
            System.out.println(a+1);
        if ( a % 4 == 3)
            System.out.println(0);
    }
}
