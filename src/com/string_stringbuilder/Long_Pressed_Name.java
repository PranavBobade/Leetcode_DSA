package com.string_stringbuilder;

public class Long_Pressed_Name {
    public static void main(String[] args) {
     String   name = "a", typed = "b";
        System.out.println(isLongPressedName(name,typed));
    }
    static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length())
            return false;

        int i = 0;
        int j = 0;

        while (i < name.length() && j < typed.length()) {

            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) { //i>0 index out of (i-1)
                j++;
            } else {
                return false;
            }
        }

        while (j < typed.length()) { // aabbc aabbccd      // name ends still typed remains so check last char from name till typed ends
            if (name.charAt(i - 1) != typed.charAt(j)) return false;
            j++;
        }

        if (i < name.length()) //aabbcc aaabbb // typed ends still name remains so we can't able to create name with typed so return false
            return false;

        return true;
    }
}
