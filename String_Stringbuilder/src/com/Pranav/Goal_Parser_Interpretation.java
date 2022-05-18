package com.Pranav;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
      String  command = "G()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < command.length(); i++) {
//            if (command.charAt(i)=='(' && command.charAt(i+1)==')' ) {
//                s.append('o');
//            } else if (command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')') {
//                s.append("al");
//            } else if(command.charAt(i)=='G'){
//                s.append('G');
//            }
//        }
//        return s.toString();

        return command.replaceAll("[(][)]", "o").replaceAll("[(]al[)]","al");

    }
}
