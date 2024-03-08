package DSA.Sorting.questions;
//https://leetcode.com/problems/missing-number/
public class question1 {
    public static void main(String[] args) {
        int[] arr1 = {4,1,0,3,5};
        System.out.println("missing number is - " + missingNumber(arr1));
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i] && arr[i] < arr.length) {
                swap(arr, i, arr[i]);
            } else {
                i ++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
