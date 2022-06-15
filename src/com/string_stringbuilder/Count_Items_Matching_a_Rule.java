package com.string_stringbuilder;

import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {

    }

//    class Solution {
//        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//            {
//                int ans=0;
//                if(ruleKey.equals("type"))
//                {
//                    for (int i = 0; i <items.size() ; i++) {
//                        if(items.get(i).get(0).equals(ruleValue))//getting type value from items and comparing with ruleValue
//                            ans++;
//                    }
//                }
//                else if(ruleKey.equals("color"))
//                {
//                    for (int i = 0; i <items.size() ; i++) {
//                        if(items.get(i).get(1).equals(ruleValue))//getting color value from items and comparing with ruleValue
//                            ans++;
//                    }
//                }
//                else
//                {
//                    for (int i = 0; i <items.size() ; i++) {
//                        if(items.get(i).get(2).equals(ruleValue))//getting name value from items and comparing with ruleValue
//                            ans++;
//                    }
//                }
//                return ans++;
//            }
//
//        }
//    }


//    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//    class Solution {
//        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//
//            int count=0;
//            int valuecheck=0; // for type
//
//            if(ruleKey.equals("color"))
//            {
//                valuecheck=1;
//            }
//            if(ruleKey.equals("name"))
//            {
//                valuecheck=2;
//            }
//
//            for(int row=0;row<items.size();row++)
//            {
//                if( (items.get(row).get(valuecheck)).equals(ruleValue))
//                    count++;
//            }
//            return count;
//        }
//    }
}
