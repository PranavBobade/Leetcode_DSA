package com.interview;

// RSL -3
//A-3: Write a program to print the frequency of these characters b, f, j, p, v in a given string
// and also print the total count of these characters. (Ignore the character cases, it can be lower or upper case)
// The function will take 1 parameter which will be a String (you do not have to write code to get the input parameter from the user).
// You can also choose to take a character array as input parameter, instead of string, if you like.
//
//        Example:
//        Input: rajasoftwarelabs Output: b=1, f=1, j=1, Total=3
//        Input: Buffet Output: b=1, f=2, Total=3

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "rajasoftwarelabs";
        System.out.println("Total = " +frequencyOfCharacters(s));
    }

    static int frequencyOfCharacters(String input) {
        int ans [] = new int [input.length()];

        for (int i = 0; i <input.length() ; i++) {
             char ch = input.charAt(i);
            if( ch >= 65 && ch <= 90)
            {
                ch = (char) (ch + 32); // convert to lower-case
            }
            if(ch == 'b' || ch == 'f' || ch == 'j' || ch == 'p' || ch == 'v' )
            {
                ans[ch-'a']++;
            }
        }
        int total = 0;

        for (int i = 0; i <ans.length ; i++) {
            char ch = (char) ( 'a' + i ); // gives current character

            if(ans[i] > 0)          // if count > 0 then only print
            {
                System.out.print(ch + "=" + ans[i]+" ");
                total += ans[i];
            }
        }

        return total;
       }
}
