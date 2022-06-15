package com.string_stringbuilder;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
     String[]   strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        int min=findMinLength(strs);
        char current = ' ';

        for (int i = 0; i < min; i++) {
            current=strs[0].charAt(i);
            for (int j = 1; j <strs.length ; j++) {
               if(current!=strs[j].charAt(i))
               {
                   return result.toString();
               }
            }
            result.append(current);
        }

      return result.toString();
    }
    static int findMinLength(String[] strs)
    {
        int min=strs[0].length();
        for(String s: strs)
        {
            if(s.length()<min)
                min=s.length();

        }
        return min;
    }
}
