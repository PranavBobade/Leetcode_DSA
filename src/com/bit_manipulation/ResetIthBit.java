package com.bit_manipulation;

public class ResetIthBit {
    public static void main(String[] args) {
        //1->0
        //0->0
        int n=10;//1010
        int i=2;// let's we have to reset(0) 2nd bit
        Integer ans=(n& ~(1<<i-1));
        System.out.println(Integer.toBinaryString(ans));
    }

}
