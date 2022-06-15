package com.recursion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        method();
    }

     static void method() {
         System.out.println("Hello world");
         method1();

    }

    static void method1() {
        System.out.println("Hello world");
        method2();
    }

   static void method2() {
       System.out.println("Hello world");
       method3();
   }
    static void method3() {
        System.out.println("Hello world");
        method4();
    }
    static void method4() {
        System.out.println("Hello world");

    }
}
