package com.string_stringbuilder;

public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
     String   s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
//        String [] str=s.split(" ");
//        StringBuilder sb=new StringBuilder(s.length());
//        int j=0;
//        for(String st:str )
//        {
//            for (int i = 0; i < st.length(); i++) {
//
//                sb.append(st.charAt(st.length() - 1 - i));
//            }
//            if(j<str.length-1)
//                sb.append(" ");
//            j++;
//        }
//        return sb.toString();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String words[]=s.split(" ");
        StringBuilder res=new StringBuilder();

        for(String word: words)
        {
            res.append(new StringBuffer(word).reverse().toString()+" ");
        }
        return res.toString().trim();

    }
}
