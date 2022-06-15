package com.string_stringbuilder;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
      String   word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
    }
    static String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder s=new StringBuilder();
        int l=Math.min(word1.length(),word2.length());
        while(i<l)
        {
            if(i<word1.length() && i<word2.length())
            {
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
                i++;
            }
        }
        if(word1.length()<word2.length())
        {
            s.append(word2.substring(i));
        }
        else
        {
            s.append(word1.substring(i));

        }
        return s.toString();
    }
}
