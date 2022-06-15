package com.patternQuestions;
//       1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11
public class pattern27 {
    public static void main(String[] args) {
        int n = 4;
        number_Pattern(n);
    }

     static void number_Pattern(int n) {
        int count=1;
        int count2=n*n+1;
         for (int i = 1; i <= n; i++) {
             for (int s = i; s >=1 ; s--) {
                 System.out.print("  ");
             }
             for (int j = i; j <= n; j++) {
                 System.out.print(count+" ");
                 count++;
             }
//             for (int k = n; k>0 ;k--) {
//                 for (int j = n-k; j <= n; j++) {
//                     System.out.print(count + " ");
//                     count++;
//                 }


             System.out.println();
         }

    }
}
