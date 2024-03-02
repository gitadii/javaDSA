package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {4,5,1,2,3};
        System.out.println("sorted array = " + Arrays.toString(selectionSort(arr1)));
    }
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Finding max ele in the remaining array and swapping it with the last ele
            int last = arr[arr.length - 1 - i];
            int max = maxEle(arr, 0, arr.length - 1 - i);
        }
    }

    static int maxEle(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
