package com.Pranav;
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        number_Pattern(n);
    }

    private static void number_Pattern(int n) {
        int start=1;
        for (int row = 1; row <=n ; row++) {
            if (row % 2 != 0)
                start = 1;
            else
                start = 0;

            for (int col = 1; col <=row ; col++) {
                int num=1;
               if(start==1)
               {
                   num=col%2!=0 ?1:0;
               }
               else
                   num=col%2!=0 ?0:1;
                System.out.print(num+" ");

            }
            System.out.println();
        }

    }
}
