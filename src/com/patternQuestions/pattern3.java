package com.patternQuestions;

//        *****
//        ****
//        ***
//        **
//        *
public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        DownTriangle_Pattern(n);
    }
    static void DownTriangle_Pattern (int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
