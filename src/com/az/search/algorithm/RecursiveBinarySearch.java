package com.az.search.algorithm;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String[] arg) {
        int[] intArray = new int[]{1,2,3,99,55,70,34,88,100,45};

        sortArray(intArray);
        //After sorting it should be
        //{1,2,3,34,45,55,70,88,99,100}
        // As I explained README for binary Search, first we need to sort array then apply binary search
        System.out.println(findElementByRecursiveBinarySearch(intArray,0, intArray.length-1,70));
        // It should be 6.
    }

    private static void sortArray(int[] intArray) {
        Arrays.sort(intArray);
    }

    // Will return index of requiredElement
    private static int findElementByRecursiveBinarySearch(int[] intArray,int startElement, int lastElement, int requiredElement) {
        System.out.println("Start "+startElement+" ... End "+ lastElement);
        int middleElement = (startElement+lastElement) / 2;
        if(startElement > lastElement)
            return -1;
        else {
             if(intArray[middleElement] > requiredElement){
                return findElementByRecursiveBinarySearch(intArray,startElement, middleElement-1, requiredElement);
            } else if(intArray[middleElement] < requiredElement){
                return findElementByRecursiveBinarySearch(intArray,middleElement+1, lastElement, requiredElement);
            } else
                 return middleElement;
        }
    }
}
