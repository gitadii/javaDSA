package DSA.Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr1 = {3,5,2,1,4};
        cycleSort(arr1);
        System.out.println("sorted array = " + Arrays.toString(arr1));
    }
    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (i != correct) {
                swap(arr, i, correct);
            } else {
                i ++;
            }
        }
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
