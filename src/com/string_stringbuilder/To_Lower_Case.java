package com.string_stringbuilder;

public class To_Lower_Case {
    public static void main(String[] args) {
       String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        return s.toLowerCase();

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
        //ASCII Value
        //a - > 97  & z -> 122 if convert toUpper case then add  32
        //A - > 65  & Z -> 90  if convert toLower case then subtract 32

//        StringBuilder str = new StringBuilder();
//
//        for(int i = 0; i < s.length(); i++){
//            int value = (int)s.charAt(i);
//            if(value >= 65 && value <= 90){
//                char ch = (char)(value + 32);
//                str.append(ch);
//            } else {
//                str.append(s.charAt(i));
//            }
//        }
//
//        return str.toString();
    }
}
