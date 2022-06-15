package com.binarysearchq.questions;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Roof_top {
    public static void main(String[] args) {
      int N = 5;
       int[] A = {1,2,2,3,2};
        System.out.println(maxStep(A,N));
    }
    static int maxStep(int A[], int N) {
        if (N == 1)
            return 0;

        int maxGain = 0;
        int gain = 0;
        int temp = 0;
        int diff = 0;

        for (int i = 1; i < N; i++) {
            diff = A[i] - A[temp];

            if (diff > 0) {
                gain++;
                if (gain > maxGain)
                    maxGain = gain;
            } else {
                gain = 0;
            }
            temp = i; // to store previous i value.
        }

        return maxGain;
    }
}
