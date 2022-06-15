package com.array_arraylist;

import static java.lang.Integer.min;

public class MinimumCostToMoveChipsToTheSamePosition {

    public static void main(String[] args) {
	// write your code here
      int[]  position ={1,2,3,6,7,7,8,9,9};
        System.out.println(minCostToMoveChips(position));
    }
//if p[i] is even and F.P is even no cost
// if p[i] is odd and F.P is even  cost=1
//if p[i] is even and F.P is odd cost=1
// if p[i] is odd and F.P is odd  no cost
// fix F.P to even and calculate cost by how many odd p[i] we need to shift similarly fix F.P to odd---- v.v.
    static int minCostToMoveChips(int[] position) {
        int even=0,odd=0;

        for (int chip:position)
        {
            if(chip%2==0)
                even++;
            else
                odd++;
        }

        if(even>odd)
            return odd;
        else
            return  even;

    }
}
