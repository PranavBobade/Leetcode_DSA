package com.bit_manipulation;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
       String allowed = "ab";
       String []words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }

    static int countConsistentStrings(String allowed, String[] words) {

//        int count = words.length;
//        int [] store = new int [26];
//
//        for(char c : allowed.toCharArray())
//        {
//            store[c-'a']++;  // stores count of each character alphabetically
//        }
//        for(String word : words) {
//            for (char c : word.toCharArray())
//            {
//                if(store[c-'a'] <= 0) {      //check count of each character for each word if it is <=0 means that string from word has extra char so it is non consistent so we decrease count
//                    count--;
//                    break;
//                }
//            }
//
//        }
//       return count;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        char[] arr = new char[26];

        for(char ch: allowed.toCharArray()){
            arr[ch - 'a'] = ch;
        }

        int count = 0;

        for(String word: words){
            if(isConsistent(arr,word))
                count++;
        }

        return count;
    }

    static boolean isConsistent(char[] arr, String str){

        for(char ch:str.toCharArray()){
            if(arr[ch - 'a'] != ch)
                return false;
        }

        return true;
    }
}
