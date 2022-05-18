package com.Pranav;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
      String[]  word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String  string1="";
//        String  string2="";
//        for(int i=0;i<word1.length;i++)
//        {
//            string1+=word1[i];
//        }
//        for(int j=0;j<word2.length;j++)
//        {
//            string2+=word2[j];
//        }
//        return string1.equals(string2);
 //       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();

        for(String word: word1)
            s1.append(word);

        for(String word: word2)
            s2.append(word);


        return s1.toString().equals(s2.toString());

    }
}
