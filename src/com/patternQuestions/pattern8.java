package com.patternQuestions;
//         *
//        ***
//       *****
//      *******
//     *********
public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        pyramid_Pattern(n);
    }

    static void pyramid_Pattern(int n) {
        for (int row = 1; row <=n ; row++) {

            for (int s = 0; s < n-row; s++)
            {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print("*");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
