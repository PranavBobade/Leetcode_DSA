package com.Pranav;

public class Shuffle_String {
    public static void main(String[] args) {
     String s = "codeleet";
     int []indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder();
        char[] arr = new char[s.length()];

        for(int i = 0; i < s.length();i++){
            arr[indices[i]] = s.charAt(i);
        }

        for(int i = 0; i < arr.length;i++){
            str.append(arr[i]) ;
        }


        return str.toString();
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        char a[]=new char[s.length()];
//
//        for(int i=0;i<s.length();i++)
//        {
//            a[indices[i]]=s.charAt(i);
//        }
//        return new String(a);
    }
}
