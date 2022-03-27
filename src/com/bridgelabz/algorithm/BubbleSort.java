package com.bridgelabz.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("--- Bubble Sort ---");
        int[] array = {1,8,4,9,2,3,7};
        System.out.println("The array to sort is " + Arrays.toString(array));

        // SORT
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0 ; j < array.length - i - 1; j++){
                if (array[j] > array [j + 1]){
                    // SWAP THE ELEMENTS
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printSortedArray(array);
    }

    private static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
