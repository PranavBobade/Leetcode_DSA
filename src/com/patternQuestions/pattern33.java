package com.patternQuestions;
//         a
//         B c
//         D e F
//         g H i J
//         k L m N o
public class pattern33 {
    public static void main(String[] args) {
        int n = 5;
        AlphabetSequence_Pattern(n);
    }

     static void AlphabetSequence_Pattern(int n) {

         int count=1;
         for (int i = 1; i <=n ; i++) {
             for (int j = 1; j <=i; j++) {
                   if(count%2!=0) {
                       System.out.print((char) (count + 96));
                       System.out.print(" ");
                       count++;
                   }
                   else {
                       System.out.print((char) (count+ 64));
                       System.out.print(" ");
                       count++;
                   }
             }
             System.out.println();
         }
    }
}
