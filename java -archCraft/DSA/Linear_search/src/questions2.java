import java.util.Arrays;

public class questions2 {
    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6},
                {45, 20, 36, 96, 7}
        };

        System.out.println(Arrays.toString(searchIn2D_2(arr1, 7)));
    }

    // Searching in 2Darray
    static String searchIn2D(int[][] arr, int target) {
        if (arr == null) {
            return "The array is empty!";
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return "The target found at - " + i + ", " + j;
                }
            }
        }
        return "Element not found!";

    }

    static int[] searchIn2D_2(int[][] arr, int target) {
        int[] ans = {-1,-1};
        if (arr == null) {
            return ans;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;

    }
}