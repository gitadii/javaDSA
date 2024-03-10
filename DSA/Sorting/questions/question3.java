package DSA.Sorting.questions;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/1197386838/

public class question3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("missing number is - " + findDuplicate(arr));
    }

    static public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i] - 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }else {
                i ++;
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j ++) {
            if ( j != nums[j] -1) {
                ans = nums[j];
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
