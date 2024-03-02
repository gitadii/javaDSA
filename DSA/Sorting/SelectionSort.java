package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {-22,0,1,36,-12,2,-2};
        selectionSort(arr1);
        System.out.println("sorted array = " + Arrays.toString(arr1));
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Finding max ele in the remaining array and swapping it with the last ele
            int last = arr.length - 1 - i;
            int max = maxEle(arr, 0, arr.length - 1 - i);
            swap(arr, max, last);
        }
    }

    static int maxEle(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
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
