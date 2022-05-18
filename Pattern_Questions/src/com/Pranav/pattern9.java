package com.Pranav;
//     *********
//      *******
//       *****
//        ***
//         *
public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        Down_pyramid_Pattern(n);
    }

    static void Down_pyramid_Pattern(int n) {
        for (int row = 0; row <n ; row++) {

            for (int s = 1; s <=row; s++)
            {
                System.out.print(" ");
            }
            for (int col =n-row; col >0 ; col--) {
                System.out.print("*");
            }
            for (int col = 2; col <=n-row ; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

