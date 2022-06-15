package com.string_stringbuilder;

public class Robot_Return_to_Origin {
    public static void main(String[] args) {
       String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
    static boolean judgeCircle(String moves) {
//        int x=0;
//        int y=0;
//        for(int i=0;i<moves.length();i++)
//        {
//            if(moves.charAt(i)=='L')
//                x++;
//            else if(moves.charAt(i)=='R')
//                x--;
//            else if(moves.charAt(i)=='U')
//                y++;
//            else
//                y--;
//        }
//        return (x==0 &&y==0);
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        char[] c = moves.toCharArray();

        int[] count = new int[91];

        for (char ch : c) {
            count[ch]++;
        }

        return count['U'] == count['D'] && count['R'] == count['L'];
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        int x = 0, y = 0;
//
//        for (char ch : moves.toCharArray()) {
//            if (ch == 'U')
//                y++;
//            else if (ch == 'D')
//                y--;
//            else if (ch == 'L')
//                x++;
//            else x--;
//        }
//        return (x == 0 && y == 0);
    }
}
