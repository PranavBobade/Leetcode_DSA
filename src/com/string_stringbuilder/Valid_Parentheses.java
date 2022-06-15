package com.string_stringbuilder;

public class Valid_Parentheses {
    public static void main(String[] args) {

       String s = "";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
            int length;

            do {
                length = s.length();
                s = s.replace("()", "").replace("{}", "").replace("[]", "");
            } while(length != s.length());

            return s.length() == 0;
        }
    }
  //  In this solution you essentially can remove parentheses that you know are valid until the string is empty. If the string is not empty, that means that the parentheses were malformed.

