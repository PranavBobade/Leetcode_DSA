package com.array_arraylist;

public class CheckIfTheSentenceIsPanagram {

    public static void main(String[] args) {
	// write your code here
      //  String s="thequickbrownfoxjumpsoverthelazydog";
       String s="leetcode";

        System.out.println(checkIfPangram(s));
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] list = new boolean[26];

        for(char index : sentence.toCharArray())
            list[index - 'a'] = true;    // to get the index of current character m-a=109-97=12
        //if any position in the list of 26 is empty (means filled with false)  its not a pangram

        for(boolean check : list)
            if(check == false) return false;

        return true;
    }
}
