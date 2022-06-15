package com.bit_manipulation;

public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        int count = 0;
        while(num > 0)
        {

            if((num & 1) == 0) //  or if(num % 2 == 0)
            {
                num = num / 2;
                count++;
            }
            else
            {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}
