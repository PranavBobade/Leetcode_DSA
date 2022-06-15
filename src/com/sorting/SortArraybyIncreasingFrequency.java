package com.sorting;


import java.util.*;

public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
      int []  nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    static int[] frequencySort(int[] nums) {

//        Map<Integer, Integer> map = new HashMap<>();
//        // count frequency of each number
//        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
//        // custom sort
//        return Arrays.stream(nums).boxed()
//                .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
//                .mapToInt(n -> n)
//                .toArray();

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); // stored array value and there count in map
        }

        List<Integer> list = new ArrayList<>(map.keySet());  // created list of size = no. of keys i.e here 3

        Collections.sort(list, (a, b) -> {
            return (map.get(a) == map.get(b))? b - a : map.get(a) - map.get(b); //If frequencies are the same, sort by descending numeric value which is b - a,
            // if frequency of two numbers are not the same, sort by ascending frequency which is map.get(a) - map.get(b).
        });


        int[] res = new int[nums.length];
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < map.get(num); j++) { // we are printing elements from list no. of count times
                res[i++] = num;
            }
        }
        return res;
    }
}

//
//    custom sort explanation:
//        .stream(nums)
//        iterates through the nums array
//
//        .boxed()
//        converts each int to Integer object, this is because .sorted() can only operate on objects
//
//        .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
//        if frequency of two numbers are not the same, sort by ascending frequency. If frequencies are the same, sort by decending numeric value
//
//        .mapToInt(n -> n)
//        converts Integer to int
//
//        .toArray()
//        returns array