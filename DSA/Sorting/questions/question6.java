package DSA.Sorting.questions;

//https://leetcode.com/problems/first-missing-positive/
public class question6 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println("missing no - " + firstMissingPositive(arr));
    }

    static public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i] - 1 && nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] -1]) {
                swap(nums, i, nums[i] - 1);
            }else {
                i ++;
            }
        }
        if (nums[0] > nums.length) return 1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j +1;
            }
        }
        return nums.length ;
    }

    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
