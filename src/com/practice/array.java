package com.practice;

public class array {
    public static void main(String[] args) {
        int a []= {1,2,3,4,5}; // 23451 // 5 1234
        for (int i = 2; i <a.length-1 ; i++) {
            a[i] =a[i+1];
        }
        a[a.length-1] =0;
        for (int x:a
             ) {
            System.out.print(x + " ");
        }
    }
}
