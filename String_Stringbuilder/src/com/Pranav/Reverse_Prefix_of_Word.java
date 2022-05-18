package com.Pranav;

import java.io.OutputStream;

public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {
       String  word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
  static String reversePrefix(String word, char ch) {
//        StringBuilder s= new StringBuilder();
//        int i=0;
//        i=word.indexOf(ch);
//        String a;
//        a=word.substring(0,i+1);
//        String d=new StringBuffer(a).reverse().toString();
//        s.append(d);
//        s.append(word.substring(i+1));
//        return s.toString();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      StringBuilder sb=new StringBuilder();
      int index=word.indexOf(ch);
      sb.append(word.substring(0,index+1));
      sb.reverse();
      sb.append(word.substring(index+1));
      return sb.toString();

    }
}
