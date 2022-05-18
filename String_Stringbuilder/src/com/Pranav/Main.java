package com.Pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Integer(56)+"pranav");
      StringBuilder builder = new StringBuilder(); // it will not create new object each time it will add every time in this object only
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);                              // this is immutable
        }
        System.out.println(builder.toString());

        builder.reverse();  // reverse string
        System.out.println(builder);

        builder.deleteCharAt(0);   //deletes char. at index 0
        System.out.println(builder);

    }
}
