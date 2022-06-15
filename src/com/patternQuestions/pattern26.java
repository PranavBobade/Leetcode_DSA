package com.patternQuestions;
//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6
public class pattern26 {
    public static void main(String[] args) {
        int n = 6;
        number_Pattern(n);
    }

     static void number_Pattern(int n) {
         for (int i = 1; i <= n; i++) {
             for (int j = i; j <=n ; j++) {
                 System.out.print(i+" ");
             }
             System.out.println();
         }
    }
}
