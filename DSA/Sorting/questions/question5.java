package DSA.Sorting.questions;
//https://leetcode.com/problems/set-mismatch/description/
public class question5 {
    public static void main(String[] args) {

    }
    static public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i] - 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }else {
                i ++;
            }
        }

        for (int j = 0; j < nums.length; j ++) {
            if ( j != nums[j] -1) {
                return new int[] {nums[j], j + 1};
            }
        }
        return new int[] {};
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
