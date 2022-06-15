package com.bit_manipulation;

public class AddBinary {
    public static void main(String[] args) {
      String   a = "11", b = "1";
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a, String b) {
//       StringBuilder sb = new StringBuilder();
// // we want string to be mutable because we want to perform continuous changes in the answer String and those operations are expensive if performed on string,
//        // so it is preferred to use StringBuilder instead of String. here if String was used it would require O(N) to append but in StringBuilder it is O(1) time work.
//       int i = a.length() - 1;
//       int j = b.length() - 1; ////two pointers starting from the back, just think of it as adding two regular integer values from back
//       int carry = 0;
//
//       while(i >= 0 || j >= 0)
//       {
//           int sum = carry; //if there is a carry from the last addition, add it to sum
//
//           if (i >= 0) sum += a.charAt(i--) - '0'; //we subtract '0' to get the int value of the char from the ascii
//           if (j >= 0) sum += b.charAt(j--) - '0';
//
//           sb.insert(0,sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0 and 0+0=0  and if sum==1  append 1  cause 0+1,1+0 =1
//           // we are inserting sum at oth index if we append we have reverse sb at end
//           carry = sum / 2; //if sum==2  i.e 1+1 =2 we have a carry, else no carry
//
//
//       }
//       if(carry > 0)
//           sb.insert(0,1); // if last MSB bits generate carry i.e leftover carry, add it
//
//       return sb.toString();


   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        boolean carry = false;
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Create a buffer with length equal to the bigger input String  + 1 to carry overflow
        // Result of '11' + '1' = '100', so length('11') + 1 = 3
        StringBuilder result = new StringBuilder(((i > j) ? i : j) + 1);

        while (i >= 0 || j >= 0) {
            // if one of the input is shorter, use '0' as operand. '11' + '1' = '11' + '01'
            char charA = (i >= 0) ? a.charAt(i--) : '0';
            char charB = (j >= 0) ? b.charAt(j--) : '0';

            // Cases when adding Binary
            // 0 + 0 = 0
            // 1 + 0 = 1
            // 1 + 1 = 10
            // 1 + 1 + 1 = 11
            if (charA == '1' && charB == '1') { // 1 + 1
                result = (carry) ? result.append('1') : result.append('0'); // result is 11 or 10 ?
                carry = true;
            } else if (charA == '0' && charB == '0') { // 0 + 0
                result = (carry) ? result.append('1') : result.append('0'); // result is 1 or 0 ?
                carry = false;
            } else { // 1 + 0 or 0 + 1
                result = (carry) ? result.append('0') : result.append('1'); // result is 10 or 1 ?
            }
        }

        // carry overflow : '11' + '1' = '00' + 1 overflow = '001'
        if (carry) result.append('1');

        // reverse the result string : '11' + '1' = '001' , so reverse it to obtain '100'
        return result.reverse().toString();

    }
}
