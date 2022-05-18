package com.Pranav;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones {
    public static void main(String[] args) {
      String   s = "1001";
        System.out.println(checkOnesSegment(s));
    }
    static boolean checkOnesSegment(String s) {
       // return !s.contains("01");
//~~~~~~~~~~~~~~~~~~~~~~~~~
        int count = 0;
        char ch = '1';

        for (char c : s.toCharArray()) {
            if ((c ^ ch) == 1) {
                ++count;
                ch = c;
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }

}
