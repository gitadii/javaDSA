package DSA.Sorting.questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class question4 {
    public static void main(String[] args) {

    }
    static public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i] - 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }else {
                i ++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j ++) {
            if ( j != nums[j] -1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
