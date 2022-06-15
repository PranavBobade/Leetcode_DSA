package com.array_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountItemsMatchingRule {

    public static void main(String[] args) {
	// write your code here
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     int ans=0;
     if(ruleKey.equals("type"))
     {
         for (int i = 0; i <items.size() ; i++) {
             if(items.get(i).get(0).equals(ruleValue))//getting type value from items and comparing with ruleValue
                 ans++;
         }
     }
        if(ruleKey.equals("color"))
        {
            for (int i = 0; i <items.size() ; i++) {
                if(items.get(i).get(1).equals(ruleValue))//getting type value from items and comparing with ruleValue
                    ans++;
            }
        }
        if(ruleKey.equals("name"))
        {
            for (int i = 0; i <items.size() ; i++) {
                if(items.get(i).get(2).equals(ruleValue))//getting type value from items and comparing with ruleValue
                    ans++;
            }
        }
        return ans++;
    }
}
