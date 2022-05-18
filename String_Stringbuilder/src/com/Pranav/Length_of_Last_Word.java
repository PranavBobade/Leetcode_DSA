package com.Pranav;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        String[] ans = s.split(" ");

        return ans[ans.length - 1].length();
    }
}
