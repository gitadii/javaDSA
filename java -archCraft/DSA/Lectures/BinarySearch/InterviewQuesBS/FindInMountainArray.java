package BinarySearch.InterviewQuesBS;
//https://leetcode.com/problems/find-in-mountain-array/submissions/1177811822/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,3,1};

        System.out.println(findInMountainArray(5, arr1));
    }

    static public int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray2(mountainArr);
        int firstTry = binarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    //Finding peak ele
    static public int peakIndexInMountainArray2(int[] mountainArray) {
        int start = 0;
        int end = mountainArray.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArray[mid] > mountainArray[mid + 1]) {
                // You are in decreasing part of the array
                end = mid;
            } else {
                // You're in ascending part
                start = mid + 1;
            }
        }

        return start;      // Here end == start thus can return any
    }

    // Searching in either part of the array using BS
    static public int binarySearch(int[] mountainArr, int target, int start, int end) {

        boolean isAsc = mountainArr[0] < mountainArr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == mountainArr[mid]) {
                // found
                return mid;
            }
            // Asc
            if (isAsc) {
                if (target > mountainArr[mid]) {
                    start = mid + 1;
                } else if (target < mountainArr[mid]) {
                    end = mid - 1;
                }
            }
            // Desc
            else {
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else if (target < mountainArr[mid]) {
                    start = mid + 1;
                }
            }
        }
        // Not found
        return -1;
    }
}
