package com.bridgelabz.algorithm;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {90,29,101,45,65,23,67,89,34,27};
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        //printing sorted array
        System.out.println("\nSorted array");
        for (int j : arr) {
            System.out.println(j + "");
        }
    }

    // method for sorting
    void sort(int[] arr, int beg, int end) {
        if (beg<end)
        {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }

    //method for merge sort
    public void merge(int[] arr, int beg, int mid, int end)
    {
        // l for left array String r=right array String
        int l = mid - beg + 1;
        int r = end - mid;

        //Divide the array of string into two part
        int[] LeftArray = new int [l];
        int[] RightArray = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];
        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];

        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
