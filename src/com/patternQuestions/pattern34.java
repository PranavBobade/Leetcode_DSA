package com.patternQuestions;
//        E D C B A
//        D C B A
//        C B A
//        B A
//        A

public class pattern34 {
    public static void main(String[] args) {
        int n = 5;
        DownAlphabet_Pattern(n);
    }

   static void DownAlphabet_Pattern(int n) {
       for (int i = 0; i < n; i++) {
           for (int j = n-i; j >0 ; j--) {
               System.out.print((char)(j+64));
               System.out.print(" ");
           }
           System.out.println();

       }
    }
}

