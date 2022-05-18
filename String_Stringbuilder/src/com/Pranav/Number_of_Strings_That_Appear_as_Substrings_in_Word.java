package com.Pranav;

public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {
      String[]  patterns = {"a","abc","bc","d"};
      String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
    static int numOfStrings(String[] patterns, String word) {
//        int count=0;
//
//        for(String str: patterns)
//        {
//            if(word.contains(str))
//                count++;
//        }
//        return count;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int count = 0;

        for(String str:patterns){
            if(word.indexOf(str) >= 0)
                count++;
        }

        return count;
    }
}
