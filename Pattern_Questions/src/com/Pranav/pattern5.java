package com.Pranav;
//
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        UpDown_Triangle_Pattern(n);
    }

    static void UpDown_Triangle_Pattern(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow=row>n? 2*n-row:row;

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
