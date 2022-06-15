package com.patternQuestions;
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
public class pattern29 {
    public static void main(String[] args) {
        int n = 5;
        Butterfly_Pattern(n);
    }

    static void Butterfly_Pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int insideSpaces=row > n ? row-totalColsInRow : 2*n-2*row;

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }

            for (int s = 0; s <insideSpaces ; s++) {// for inside spaces
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                    System.out.print("*");
            }

            System.out.println();
        }

        }
    }

