package com.Pranav;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
//        String actual=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        String rev=new StringBuffer(actual).reverse().toString();
//        return actual.equals(rev);
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (s.length() == 0)
            return true;
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isAlphaNumeric(s.charAt(i)) && isAlphaNumeric(s.charAt(j)))
            {
                i++;
                j--;
            }
            else if(isAlphaNumeric(s.charAt(i)))
                i++;
            else if(isAlphaNumeric(s.charAt(j)))
                j--;
            else {
                char ch1 = toLowerCase(s.charAt(i));
                char ch2 = toLowerCase(s.charAt(j));
                if(ch1!=ch2) return false;
                i++;
                j--;
            }
        }
        return true;

    }

    static char toLowerCase(char c) {
        if (c >= 65 && c <= 90)
            return (char) (c + 32);
        return c;
    }

    static boolean isAlphaNumeric(char ch) {
        if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            return false;
        return true;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


//        int i=0;
//        int j=s.length()-1;
//        while(i<j)
//        {
//            while(i<j && !(Character.isLetterOrDigit(s.charAt(i))))
//            {
//                i++;
//            }
//            while(i<j && !(Character.isLetterOrDigit(s.charAt(j))))
//            {
//                j--;
//            }
//            if(i<j && Character.toLowerCase(s.charAt(i++))!=(Character.toLowerCase(s.charAt(j--))))
//            {
//                return false;
//            }
//        }
//        return true;
    }
    }



