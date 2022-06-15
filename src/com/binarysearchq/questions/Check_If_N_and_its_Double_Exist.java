package com.binarysearchq.questions;

public class Check_If_N_and_its_Double_Exist {
    public static void main(String[] args) {
        int a[] = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(a));
    }

    static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if ((searchElement(arr, element / 2, i + 1) && element % 2 == 0) ||
                    (searchElement(arr, element * 2, i + 1))) {
                return true;
            }
        }
        return false;
    }

    static boolean searchElement(int[] arr, int element, int index) {
        for (int i = index; i < arr.length; i++) {
            if (element == arr[i]) {
                return true;
            }
        }
    return false;
    }


        //O(n^2)
//           for(int i=0;i<arr.length-1;i++)
//    {
//        for(int j=0;j<arr.length;j++)
//        {
//            if(arr[i]==2*arr[j]&&i!=j)
//                return true;
//        }
//    }
//        return false;



    }

