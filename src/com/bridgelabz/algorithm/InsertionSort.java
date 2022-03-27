package com.bridgelabz.algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        System.out.println("--- Insertion Sort ---");
        int[] array = {1,8,4,9,2,3,7};
        System.out.println("The array to sort is " + Arrays.toString(array));

        // SORT array elements. Take first element as a sorted array and remaining as unsorted array.
        for (int i = 1 ; i < array.length; i++ ){
            int current = array[i];
            int j = i - 1;
            // Compare current with each element on the left of it until an element smaller than it is found.
            while(j >= 0 && current < array[j] ) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array [j + 1] = current;
        }
        printSortedArray(array);
    }
    static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
