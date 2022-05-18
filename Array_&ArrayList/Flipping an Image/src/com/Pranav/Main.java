package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for(int x[]:flipAndInvertImage(a))
        {
            System.out.println(Arrays.toString(x));                                // to print 2d array

        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;

        for (int i = 0; i < m; i++) {                           // to traverse whole array
            for (int j = 0; j < (n + 1) / 2; j++) {             // to take elements from row to swap
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - j - 1] ^ 1;           // invert before swap to get final result
                image[i][n - j - 1] = temp;

            }
        }
        return image;
    }
}


