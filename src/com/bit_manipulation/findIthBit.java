package com.bit_manipulation;
//ctrl+alt+l


public class findIthBit {
    public static void main(String[] args) {
        //find ith index at given number
        int n = 10110110;
        String num=String.valueOf(n);
        int i=3;
        char ch=num.charAt(num.length()-i);
        System.out.println((int)ch-48);


    }

    static int ithBit(int n, int i) {
//        int y = (1 << i - 1);
//        System.out.println(y);

//        int x = (n & y);
//        System.out.println(x);
//        return x >> i - 1;
//        return (n&(1<<i-1));

//        while (i > 1) {
//            n = n / 10;
//
//            i--;
//
//        }


        System.out.println(n);
        return n % 10;
    }


}
