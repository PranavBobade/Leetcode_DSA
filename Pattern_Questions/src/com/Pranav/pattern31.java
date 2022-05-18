package com.Pranav;
//
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

public class pattern31 {
    public static void main(String[] args) {
        int n = 4;
     //   Spiral_Number_Pattern1(n);
        //Spiral_Number_Pattern2(n);
        Spiral_Number_Pattern3(n);

    }

     static void Spiral_Number_Pattern1(int n) {
        n=2*n;
         for (int row = 0; row <= n; row++) {
             for (int col = 0; col <=n ; col++) {
                 int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                 System.out.print(atEveryIndex +" ");
             }
             System.out.println();
         }
    }

    static void Spiral_Number_Pattern2(int n) {
        int originalN=n;
        n=2*n;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <=n ; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }
    }
    static void Spiral_Number_Pattern3(int n) {
        int originalN=n;
        n=2*n;
        for (int row = 1; row <n; row++) {
            for (int col = 1; col <n ; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col))+1;
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }
    }
}
