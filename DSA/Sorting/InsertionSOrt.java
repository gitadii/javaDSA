package DSA.Sorting;

import java.util.Arrays;

public class InsertionSOrt {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
