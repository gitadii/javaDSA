package DSA.Sorting.questions;

import java.util.ArrayList;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i] -1 && nums[nums[i]-1] != nums[i]) {
                swap(nums, i, nums[i] -1);
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                result.add(j + 1);
            }
        }
        return result;
    }
    static void swap(int[] arr, int firstIndex, int destinationIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
}
