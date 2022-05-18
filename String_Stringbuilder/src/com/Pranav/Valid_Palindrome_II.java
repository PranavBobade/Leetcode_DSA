package com.Pranav;

public class Valid_Palindrome_II {
    public static void main(String[] args) {
      String  s = "abcad";
        System.out.println(validPalindrome(s));
    }
    static boolean validPalindrome(String s) {
        //0(n)
        if (s.length() == 0)
            return true;
        int i = 0;
        int j = s.length() - 1;

        while (i < j)
        {
            if ((s.charAt(i))!=(s.charAt(j)))
            {
                return isPalindrome(s,i+1,j)||  isPalindrome(s,i,j-1); // we are skip-ing ith(i+1)or jth(j-1) and check if palindrome
            }
            i++;
            j--;
        }

        return true;

    }
    static boolean isPalindrome(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i++)!=s.charAt(j--))
            {
                return false;
            }
        }
        return true; // we can only delete at most one char so no need to check again
    }

}


//
////class Solution {
//    public boolean validPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//
//
//        while(i < j){
//
//            if(s.charAt(i) != s.charAt(j)){
//                if(isPalindrome(s.substring(i+1,j+1))
//                        || isPalindrome(s.substring(i,j)))
//                    return true;
//                else
//                    return false;
//            }
//
//            i++;
//            j--;
//
//        }
//
//        return true;
//    }
//
//    boolean isPalindrome(String str){
//        int i = 0;
//        int j = str.length() - 1;
//
//        while(i < j){
//            if(str.charAt(i) != str.charAt(j)) return false;
//
//            i++;
//            j--;
//        }
//
//        return true;
//    }
//}