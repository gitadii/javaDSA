package BinarySearch.InterviewQuesBS;

public class FloorEle {
    public static void main(String[] args) {
        int[] arr1 = {-2, 3, 7, 10, 13, 19, 25};

        System.out.println("floor ele of target is - " + floorEle(arr1, 10));
    }

    static int floorEle(int[] arr, int target) {
        // If target is smaller than the smallest ele of array
        if (target < arr[0]) return Integer.MIN_VALUE;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];

    }
}
