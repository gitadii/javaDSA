package BinarySearch.InterviewQuesBS;

public class BSInInfiniteArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,10,19,99,120,155,230,245,269,300,350,441,587,600};
        System.out.println("Target is present at infiniteArray Index - " + ans(arr1, 441));
    }

    static int ans(int[] arr, int target) {
        // Finding the start and end
        // Initially
        int start = 0;
        int end = 1;

        int windowSize = 2;

        // Increasing the windowSize
        while (target > arr[end]) {
            // My approach
            /*
            windowSize *= 2;
            start = end + 1;
            end = start + (windowSize - 1);
             */

            // KK approach
            int newStart = end + 1;
            // end = end + windowSize*2
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // found
                return mid;
            }
        }
        //Not found
        return Integer.MIN_VALUE;

    }
}
