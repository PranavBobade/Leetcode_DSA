package com.patternQuestions;
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
       DownXmasTree_Pattern(n);
    }

     static void DownXmasTree_Pattern(int n) {
         for (int i = 0; i <n ; i++) {
             int spaces=i;
             for(int k=0;k<spaces;k++)
             {
                 System.out.print(" ");
             }
             for (int j = n-i; j >0; j--) {
                 System.out.print("* ");
             }

             System.out.println();
         }
    }
}
