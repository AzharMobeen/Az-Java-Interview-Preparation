package com.az.search.algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] arg) {
        int[] intArray = new int[]{1,2,3,99,55,70,34,88,100,45};

        sortArray(intArray);
        //After sorting it should be
        //{1,2,3,34,45,55,70,88,99,100}
        // As I explained README for binary Search, first we need to sort array then apply binary search
        System.out.println(findElementByBinarySearch(intArray, 70));
        // It should be 6.
    }

    private static void sortArray(int[] intArray) {
        Arrays.sort(intArray);
    }

    // Will return index of requiredElement
    private static int findElementByBinarySearch(int[] intArray, int requiredElement) {

        int firstElement = 0;
        int lastElement = intArray.length-1;
        while (firstElement <= lastElement) {
            int middleElement = (firstElement+lastElement) / 2;
            if(requiredElement < intArray[middleElement])
                lastElement = middleElement-1;
            else if(requiredElement > intArray[middleElement])
                firstElement = middleElement+1;
            else if(requiredElement == intArray[middleElement])
                return middleElement;
        }
        return -1;
    }
}
