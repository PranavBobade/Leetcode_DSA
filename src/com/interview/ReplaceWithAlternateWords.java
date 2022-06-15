package com.interview;

// RSL -2
//A-2: Write a function that takes an input parameter as a String. The function should replace the alternate words in it with “xyz” and print it.
// Words are separated by dots. (Avoid using inbuilt functions)
//
//        If input is “i.like.this.program.very.much”
//        Output will be “i.xyz.this.xyz.very.xyz”

public class ReplaceWithAlternateWords {

    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println(alternateStr(str));
    }

    static String alternateStr(String str) {
        int i = 0;
        int count = 0;
        StringBuilder s = new StringBuilder();
        while (i < str.length())
        {
            if (str.charAt(i) == '.')
            {
                count++;
                if (count % 2 != 0)
                {
                    s.append(".xyz");
                }
                else
                    {
                    s.append(str.charAt(i));
                    }
            }

            else
                {
                if (count % 2 == 0)  ////skip the even '.' part string  e.g like, program, much
                    s.append(str.charAt(i));
                }
            i++;


        }
        return s.toString();

    }
}