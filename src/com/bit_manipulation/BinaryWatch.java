package com.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static void main(String[] args) {
       int turnedOn = 1;
        System.out.println(readBinaryWatch(turnedOn));
    }
    static List<String> readBinaryWatch(int turnedOn) {
//        List<String> ans = new ArrayList<String>();
//
//        for(int hrs = 0; hrs < 12; hrs++)
//        {
//            for(int mins = 0; mins < 60; mins++)
//            {
//                if(countSetsBit(hrs)+countSetsBit(mins) == turnedOn)
//                {
//                    String time = hrs + ":" + String.format("%02d",mins);
//                    ans.add(time);
//                }
//            }
//        }
//        return ans;
//    }
//
//    static int countSetsBit(int n){
//        int count = 0;
//
//        while(n > 0)
//        {
//            int last = n & 1;
//            if(last == 1)
//                count++;
//            n = n >> 1;
//        }
//        return count;


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//Idea: Generate all possible times and filter in those that satisfy the set bit-count using Integer.bitCount method.
//            var times = new ArrayList<String>();
//
//            for (var hour = 0; hour < 12; hour++)
//                for (var minute = 0; minute < 60; minute++)
//                    if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn)
//                        times.add(String.format("%d:%02d", hour, minute));
//
//            return times;
//        }
        //   Same approach using streams
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``

//
//            var times = new ArrayList<String>();
//
//            IntStream.range(0, 12).forEach(hour ->
//                    IntStream.range(0, 60).forEach(minute -> {
//                        if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn)
//                            times.add(String.format("%d:%02d", hour, minute));
//                    }));
//
//            return times;
//        }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~```
        List<String> allPossibleTimes = new ArrayList();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    // INBUILT bitcount fn gives no. of set bits
                    StringBuilder time = new StringBuilder(); // used as we want mutable string
                    time.append(hour).append(":");
                    if (minute < 10) {     // if minute in betn 0-9 add 0 at prefix
                        time.append("0");
                    }
                    time.append(minute);
                    allPossibleTimes.add(time.toString()); // convert string builder to string
                }
            }
        }
        return allPossibleTimes;


    }

}
