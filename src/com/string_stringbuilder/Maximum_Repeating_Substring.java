package com.string_stringbuilder;

public class Maximum_Repeating_Substring {
    public static void main(String[] args) {
       String sequence = "ababc", word = "ab";
        System.out.println(maxRepeating(sequence,word));
    }
    static int maxRepeating(String sequence, String word) {

        int i = 0;
        int index = sequence.indexOf(word,i);
        int count = 0;
        String str = word;

        while(index != -1){
            count++;
            str += word;
            index = sequence.indexOf(str);
        }

        return count;

//~~~~~~~~~~~~~~~~~~~~~~~~
//        String tbf = word;
//        int ans=0;
//        while(sequence.contains(tbf))
//        {
//            tbf+=word;
//            ans++;
//
//        }
//        return ans;
    }

}
