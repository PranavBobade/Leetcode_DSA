package com.binarysearchq.questions;

import java.util.Arrays;

public class FullySortedMatrix {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.toString(search(a,20)));
    }
    // search in  the row provided between the cols provided.
    static int[] BS(int [][]matrix,int row, int cStart, int cEnd,int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int matrix[][], int target)
    {
        int rows=matrix.length;
        int cols=matrix[0].length; //be cautious,matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if(rows==1)
            return BS(matrix,0,0,cols-1,target);

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run the loops till 2 rows are remaining
        while(rStart<(rEnd-1))  // while this is true it will have more than 2 rows
        {
            int mid=rStart+(rEnd-rStart)/2;

            if(matrix[mid][cMid]==target)
            {
                return new int []{mid,cMid};
            }
            if(matrix[mid][cMid]<target)
            {
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        // now we have 2 rows
        // check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid]==target)
        {
            return new int []{rStart,cMid};      //CHECKING FOR 2
        }

        if(matrix[rStart+1][cMid]==target)
        {
            return new int []{rStart+1,cMid};   // CHECKING FOR 6
        }


        // SEARCH IN 1ST HALF
        if(target<=matrix[rStart][cMid-1])
        {
            return BS(matrix,rStart,0,cMid-1,target);
        }
        // SEARCH IN 2ND HALF
        if(target>=matrix[rStart][cMid+1]   && target<=matrix[rStart][cols-1] )
        {
            return BS(matrix,rStart,cMid+1,cols-1,target);
        }
        // SEARCH IN 3RD HALF
        if(target<=matrix[rStart+1][cMid-1])
        {
            return BS(matrix,rStart+1,0,cMid-1,target);

        }
        // SEARCH IN 4TH HALF
       else
        {
            return BS(matrix,rStart+1,cMid+1,cols-1,target);

        }


    }
}
