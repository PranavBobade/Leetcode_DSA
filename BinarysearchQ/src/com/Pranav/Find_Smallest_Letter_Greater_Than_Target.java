package com.Pranav;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target = 'd';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
//        for (char i = 0; i <letters.length ; i++) {
//            if(letters[i]>target)
//                return letters[i];
//        }
//        return letters[0]; // when we don't have larger character than target in array return first character

        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < letters[mid])
                end = mid - 1;
            else
                start=mid+1;
        }
        return letters[start%letters.length];  //when we don't have element greater than target return first element. i.e 4%4=0
    }
    }

