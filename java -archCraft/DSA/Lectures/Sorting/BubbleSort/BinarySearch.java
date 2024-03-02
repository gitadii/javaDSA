package Sorting.BubbleSort;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {};
        System.out.println("Sorted array is - " + Arrays.toString(bubbleSort(arr1)));
    }
    static int[] bubbleSort(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            // after each iteration, the max item will come at the respective last index
            for (int j = 1; j < arr.length - i; j ++) {
                if (arr[j - 1] > arr[j]) {
                    isSorted = false;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            // best case : if swapping didnt occur for a value of i, this implies that the array is already swapped
            // returning the arr after N comparisons best case complexity
            if(isSorted) {
                return arr;
            }
        }
        return arr;
    }
}
