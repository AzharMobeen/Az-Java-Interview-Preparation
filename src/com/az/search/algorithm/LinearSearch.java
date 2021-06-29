package com.az.search.algorithm;

public class LinearSearch {
    
    public static void main(String[] arg) {
        int[] intArray = new int[]{1,2,3,4,5,6,7};
        System.out.println("Final result :: "+ findElementByLinearSearch(intArray, 2));
    }

    private static int findElementByLinearSearch(int[] intArray, int i) {

        for (int index = 0; index < intArray.length; index++) {
            // The worst case it will execute whole loop and best case it will find start of the loop.
            // So We'll call this Big O Notion wise linear Growth Rate O(n)
            System.out.println("Linear Growth rate O(n)"+ intArray[index]);
            if(intArray[index] == i) {
                return intArray[index];
            }
        }
        return -1;
    }
}
