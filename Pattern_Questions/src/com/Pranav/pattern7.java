package com.Pranav;

//       *****
//        ****
//         ***
//          **
//           *
public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        downTrianglePattern(n);
    }

     static void downTrianglePattern(int n) {
         for (int i = 0; i <n; i++) {
             int spaces=i;
             for(int k=0;k<spaces;k++)
             {
                 System.out.print("  ");
             }
             for (int j = n-i; j >0 ; j--) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
