package com.patternQuestions;

//        *
//        **
//        ***
//        ****
//        *****
public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        UpTriangle_Pattern(n);
    }
    static void UpTriangle_Pattern (int n)
    {
        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
