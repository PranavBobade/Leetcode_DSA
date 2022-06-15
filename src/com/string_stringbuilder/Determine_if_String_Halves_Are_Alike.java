package com.string_stringbuilder;

public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
//        int first=0;
//        int second=s.length()/2;
//        int count=0;
//
//        while(second<s.length())
//        {
//            // for 1st half
//            char ch=s.toLowerCase().charAt(first);
//            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
//                count++;
//
//            char c=s.toLowerCase().charAt(second);
//            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
//                count--;
//
//            first++;
//            second++;
//        }
//        return count==0;
 //       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int first = 0;
        int second = s.length() / 2;
        int count = 0;

        while(second < s.length()){
            //for first half
            char ch = Character.toLowerCase(s.charAt(first));
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

            //for second half
            char temp = Character.toLowerCase(s.charAt(second));
            if(temp == 'a' || temp == 'e'|| temp == 'i' || temp == 'o' || temp == 'u'){
                count--;
            }

            first++;
            second++;
        }

        return count == 0;
    }
}
