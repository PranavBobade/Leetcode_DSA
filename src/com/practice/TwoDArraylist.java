package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        //initialisation
       
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(s.nextInt());
// to get lists at 0, 1, 2nd index and add elements at particular index of multidimensional arraylist
            }
        }
        System.out.print( list);


    }
}
