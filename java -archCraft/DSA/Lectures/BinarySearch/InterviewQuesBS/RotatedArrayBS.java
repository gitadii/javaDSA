package BinarySearch.InterviewQuesBS;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedArrayBS {
    public static void main(String[] args) {
        int[] arr1 = {1};
        System.out.println("Ele in rotated array found at - " + search(arr1, 3));
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (nums[pivot] == target) {
            return pivot;
        }else {
            int firstTry = rotatedBS(nums, target, 0, pivot - 1);
            if (firstTry == -1) {
                return rotatedBS(nums, target, pivot + 1, nums.length - 1);
            }
            return firstTry;
        }
    }
    static public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            } else if (arr[start] >= arr[mid]) {
                end = mid -1;
            } else{
                start = mid + 1;
            }
        }
        return start;           // At this point start = end
    }

    // Searching using BS
    static public int rotatedBS(int[] arr, int target, int start, int end) {
            // If array is empty
            if (arr == null) {
                return -1;
            }

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
            return -1;
    }
}
