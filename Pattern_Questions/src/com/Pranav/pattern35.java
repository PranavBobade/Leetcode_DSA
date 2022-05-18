package com.Pranav;
//          1      1
//          12    21
//          123  321
//          12344321
public class pattern35 {
    public static void main(String[] args) {
        int n = 9;
        Number_Pattern(n);
    }

    static void Number_Pattern(int n) {
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <= i; j++) {       // for 1 st half cols
                System.out.print(j);
            }
            for (int s = 0; s <2*n-2*i ; s++) {    // for inside spaces
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {      // for 2nd  half cols
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
