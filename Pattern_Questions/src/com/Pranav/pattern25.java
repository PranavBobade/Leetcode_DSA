package com.Pranav;
//         *****
//        *   *
//       *   *
//      *   *
//     *****
public class pattern25 {
    public static void main(String[] args) {
        int n = 5;
        star_Pattern(n);
    }

    private static void star_Pattern(int n) {
        for (int i = 1; i <=n ; i++) {

            for (int s = n-i; s >0 ; s--) {
                System.out.print(" ");
            }

            if(i==1 ||i==n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }

                 else
                {
                    for (int j = 1; j <=n ; j++) {
                        if(j==1 || j==n)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
            System.out.println();
        }
    }
}
