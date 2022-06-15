package com.string_stringbuilder;

public class IsStringPalindrome {
    public static void main(String[] args) {
        String str=null;
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str)
    {   //O(n)
        if(str==null || str.length()==0 )   // we need to first check for null condition else gives null pointer exception for null value
        {
            return true;
        }
        str=str.toLowerCase();
        for (int i = 0; i <str.length()/2 ; i++) {
            char start= str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start!=end)
                return false;

        }
        return true;
    }
}
