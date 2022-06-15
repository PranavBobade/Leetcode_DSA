package com.string_stringbuilder;

public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
      String  s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    static  String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();
  //      "10#11#12"
        for(int i=0;i<s.length();i++)
        {
            if((i+2)<s.length() && s.charAt(i+2)=='#') // check if # is present at 2nd index
            {
                int val=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0'); //get 0-9 values before #
                // sub from '0' bec. it gives int value 1 and 0
                sb.append((char)('a'+val-1));
                // -1 as 'a' starts from 1
                i+=2;
            }
            else
                sb.append((char)('a'+s.charAt(i)-'1'));
        }
        return sb.toString();

    }
}
