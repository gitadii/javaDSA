package BinarySearch.InterviewQuesBS;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,7,8};
        System.out.println("No. of rotations - " + countRotations(arr1));
    }

    //finding Pivot
    static public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;           // At this point start = end
    }

    // Finding No of rotations
    static int countRotations(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[end] > arr[start]) {
            return 0;
        }else {
            int pivot = findPivot(arr);
            return pivot + 1;
        }
    }
}
