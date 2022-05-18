package com.Pranav;
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        UpTriangle_Pattern_Number(n);
    }

    static void UpTriangle_Pattern_Number(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

