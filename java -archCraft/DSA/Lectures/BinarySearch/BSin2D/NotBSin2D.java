package BinarySearch.BSin2D;

import java.util.Arrays;

public class NotBSin2D {
    public static void main(String[] args) {
        int[][] arr1 = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println("Ele found at - " + Arrays.toString(binarySearchIn2D(arr1, 10)));
    }
    static int[] binarySearchIn2D (int[][] arr, int target) {
        int row = 0;
        int column = arr.length - 1;

        while (column >=  0 && row < arr.length) {
            if (arr[row][column] == target) {
                return new int[] {row,column};
            }
            if (arr[row][column] < target) {
                row ++;
            }else {
                column --;
            }
        }
        return new int[]{-1,-1};
    }
}
