package com.string_stringbuilder;


import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="pranav Bobade hello world";
        System.out.println(Arrays.toString(name.toCharArray())); // prints string to char-array
        System.out.println(name.toLowerCase());// prints string to lowercase
        System.out.println(name.indexOf('a'));// gives first index of 'a'
        System.out.println("            pranav   ".strip());// removes white spaces
        System.out.println(Arrays.toString(name.split(" ")));// split where space is
    }
}
