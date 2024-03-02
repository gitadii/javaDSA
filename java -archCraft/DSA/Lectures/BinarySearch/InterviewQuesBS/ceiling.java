package BinarySearch.InterviewQuesBS;

public class ceiling {
    public static void main(String[] args) {
        int[] arr1 = {-2, 3, 7, 10, 13, 19, 25};

        System.out.println("Ceiling ele of target is - " + ceilingOfArray(arr1, -10));
    }

    // My approach
    static int ceilingOfArray(int[] arr, int target) {
        //If empty
        if (arr == null) return Integer.MIN_VALUE;

        // If target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) return Integer.MIN_VALUE;

        // Finding ceiling using BS
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (start == end && arr[start] > target) {
                return arr[start];
            } else if (arr[mid] > target) {
                end = mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        // Not found
        return Integer.MIN_VALUE;
    }


    //KK approach
    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
