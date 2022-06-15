package com.patternQuestions;
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        XmasTree_Pattern(n);
    }

     static void XmasTree_Pattern(int n) {
         for (int i = 1; i <=n; i++) {
             int spaces=n-i;
             for(int k=0;k<spaces;k++)
             {
                 System.out.print(" ");
             }
             for (int j = 1; j <=i ; j++) {
                 System.out.print("* ");
             }
             System.out.println();
             
         }
    }
}
