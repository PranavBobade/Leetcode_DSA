package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []digits = {1,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int n=digits.length;
        for (int i = n-1; i >=0 ; i--) {
            if (digits[i] < 9) {  // when our last digit is not 9 then we can just add 1 to last digit
                digits[i]++;
                return digits;
            }

            digits[i] = 0;   // if some last digits are 9 ,9 then we can make them as 0 and add 1 to not 9 digit
        }
        int a[]=new int[n+1];  // if all elements are 9 then create new array n+1 and add 1 at first element to get result
        a[0]=1;
        return a;
    }
}
