package BinarySearch.InterviewQuesBS;
// AKA Bitonic array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakOfMountainArray {
    public static void main(String[] args) {
        int[] arr1 ={3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr1));
    }

    // My approach
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid-1]) {
                // You are in decreasing part of the array
                // mid - 1 might be = -1 index which is outOfBound thus end != mid -1
                end = mid;
            }else if (arr[mid] < arr[mid + 1]) {
                // You are in ascending part of the array
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return 0;
    }

    // KK approach
    public int peakIndexInMountainArray2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                // You are in decreasing part of the array
                end = mid;
            }else {
                // You're in ascending part
                start = mid + 1;
            }
        }

        return start;      // Here end == start thus can return any
    }
}
