package com.string_stringbuilder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// The idea is use a hash set to track the longest substring without repeating characters so far,
// use a fast pointer j to see if character j is in the hash set or not, if not, great,
// add it to the hash set, move j forward and update the max length, otherwise,
// delete from the head by using a slow pointer i until we can put character j to the hash set.
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
       String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
//        int i = 0, j = 0, max = 0;
//        Set<Character> set = new HashSet<>();
//
//        while (j < s.length()) {
//            if (!set.contains(s.charAt(j))) {
//                set.add(s.charAt(j++));
//                max = Math.max(max, set.size());
//            } else {
//                set.remove(s.charAt(i++));
//            }
//        }
//
//        return max;
//
//      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int left = 0, right = 0; // left and right pointer
        int n = s.length();
        int len = 0;
        while(right < n) // iterate right pointer till it < string length
        {
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right)) + 1, left); // if we found char in map we update left pointer to char's previous occurence +1

            map.put(s.charAt(right), right); // putting current char to right
            len = Math.max(len, right - left + 1); // updating length if it's greater than previous length
            right++;

        }
        return len;
    }
}
