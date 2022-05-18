package com.Pranav;
/*        1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5

 */
public class pattern30 {
    public static void main(String[] args) {
        int n = 5;
        Number_Triangle_Pattern(n);
    }

     static void Number_Triangle_Pattern(int n) {
         for (int row = 0; row <=n ; row++) {

             for (int s = 0; s < n-row; s++)
             {
                 System.out.print("  ");
             }
             for (int col = row; col >=1 ; col--) {
                 System.out.print(col+" ");
             }
             for (int col = 2; col <=row ; col++) {
                 System.out.print(col+" ");
             }
             System.out.println("");
         }
    }
}
