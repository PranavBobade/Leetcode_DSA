package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    static int[] sumZero(int n) {
      int a[]=new int[n];
      int count=1;
      int c=0;
      a[0]=count;
      if(n%2!=0) {
          for (int i = 1; i < n / 2; i++) {
              a[i] = ++count;
              System.out.println(count
              );
          }
          for (int i = n / 2; i < n; i++) {
              a[i] = -c++;
          }
      }
      else
      { count=0;
      c=1;
          for (int i = 0; i < n / 2; i++) {
              a[i] = ++count;
              System.out.println(count
              );
          }
          for (int i = n / 2; i < n; i++) {
              a[i] = -c++;
          }
      }
        return a;
    }
}
