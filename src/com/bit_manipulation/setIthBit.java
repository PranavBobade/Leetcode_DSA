package com.bit_manipulation;

public class setIthBit {
    public static void main(String[] args) {
        //0->1
        //1->1
        int n=10;//1010
        int i=3;// let's we have to set(1) 3rd bit
        Integer ans=(n|(1<<i-1));
        System.out.println(Integer.toBinaryString(ans));
    }

}
