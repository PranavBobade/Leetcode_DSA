package com.Pranav;
//            *
//           * *
//          *   *
//         *     *
//        *********
public class pattern13 {
    public static void main(String[] args) {
        int n = 5;
        InblankXmasTree_Pattern(n);
    }

    static void InblankXmasTree_Pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            if(row == 1 || row == n){
                for (int col = 1; col <= n; col++) {
                    if(col==1 && col==n)
                    System.out.print("*");
                    else
                        System.out.print(" ");

                }
            } else {
                for (int col = 1; col <= n; col++) {
                    if (col == 1 || col == n) {
                        System.out.print("*");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println("");
        }
    }
}
