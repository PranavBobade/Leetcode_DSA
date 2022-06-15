package com.patternQuestions;
//        E
//        D E
//        C D E
//        B C D E
//        A B C D E
public class pattern32 {
    public static void main(String[] args) {
        int n = 5;
        ReverseAlphabetSequence_Pattern(n);
    }

     static void ReverseAlphabetSequence_Pattern(int n) {
         for (int i = 0; i <5 ; i++) {
             for (int j = n-i; j<=n; j++) {
                 System.out.print((char)(64+j));
                 System.out.print(" ");
             }
             System.out.println();
         }
    }
}
