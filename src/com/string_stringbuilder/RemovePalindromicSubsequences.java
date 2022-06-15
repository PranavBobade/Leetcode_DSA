package com.string_stringbuilder;


//Daily Leet-Code Challenge, June 8, solved on 8th june
public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
       String s = "ababa";
        System.out.println(removePalindromeSub(s));
    }

    static int removePalindromeSub(String s) {
        //Idea:
//The trick to this problem is realizing that since we're dealing with subsequences and only 2 possible characters,
// the answer cannot possible be larger than 2. In fact, the answer will always be 2 unless S is already a palindrome,
// in which case the answer is 1, or S is an empty string, in which case the answer is 0.
        if(s.length() == 0)
            return 0;
        for(int i = 0, j = s.length() - 1; i < j; i++, j-- )
            if(s.charAt(i) != s.charAt(j)) return 2;
        return 1;
    }
}
