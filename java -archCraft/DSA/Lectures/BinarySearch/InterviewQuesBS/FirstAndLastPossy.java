package BinarySearch.InterviewQuesBS;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1177211211/

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPossy {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = returnIndex(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = returnIndex(nums, target, false);
        }
        return ans;
    }

    // This func will return the initial and end index of target ele
    int returnIndex(int[] arr, int target, boolean findInitial) {
        int start = 0;
        int end = arr.length-1;
        // Default ans
        int ans = -1;

        //Finding First occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                // Potential ans
                ans = mid;
                if (findInitial) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
