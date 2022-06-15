package com.sorting;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
       int [] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < salary.length; i++)
        {
            if(salary[i] > max)
                max = salary[i];

            if(salary[i] < min)
                min = salary[i];

            sum += salary[i];
        }
        sum = sum - max - min;
        avg = sum /(salary.length - 2);

        return avg;
    }
}
