package com.array_arraylist;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
	// write your code here
       int  gain[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int max=0;
        int current=0;
        for(int i=0;i<gain.length;i++)
        {
            current=current+gain[i];
            if(current>max)
                max=current;
        }
        return max;
    }
}
