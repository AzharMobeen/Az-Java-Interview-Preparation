package com.az.search.algorithm;

public class RecursionSearch {

    public static void main(String[] arg) {

        int[] intArray = new int[]{1,2,3,99,55,70,34,88,100,45};
        int index = findElementByRecursionSearch(intArray, 0, 70);
        System.out.println(" Request index :: "+index);
    }

    public static int findElementByRecursionSearch(int[] intArray, int index, int requiredElement) {
         if(index > intArray.length -1 )
             return -1;
         else if (intArray[index] == requiredElement)
             return index;
         else {
             System.out.println("Index at :: "+ index);
             return findElementByRecursionSearch(intArray, index+1, requiredElement);
         }
    }
}
