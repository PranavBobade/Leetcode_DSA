package com.string_stringbuilder;

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
     int   columnNumber = 27;
        System.out.println(convertToTitle(columnNumber));

    }
    static String convertToTitle(int columnNumber) {
//  int n=columnNumber;
//        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        int n=columnNumber;
//        StringBuilder result = new StringBuilder();
//
//        while(n>0){
//            n--;
//            result.insert(0, (char)('A' + n % 26));
//            n /= 26;
//        }
//
//        return result.toString();
 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        String col = "";

        while(columnNumber > 0){
            int rem = columnNumber % 26;
            if(rem == 0){
                col = 'Z' + col;
                columnNumber = columnNumber/26 - 1;
            }
            else{
                char ch =(char)('A' + rem - 1);
                col = ch + col;
                columnNumber = columnNumber/26;
            }
        }

        return col;

    }
}
