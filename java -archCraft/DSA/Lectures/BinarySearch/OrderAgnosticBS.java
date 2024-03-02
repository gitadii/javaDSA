package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr2 = {69, 51, 35, 12, 6, 2, 0, -3, -6, -10, -45};
//
//        System.out.println("Output of descendingBS - " + binarySearch(arr2, -10));

        int[] arr1 = {-12,-9,-2,0,2,6,8,12,35,45,51,60,69};

        System.out.println("Target ele found at - " + agnoBinarySearch(arr1, 69));
    }

    static int agnoBinarySearch(int[] arr, int target) {
        // If array is empty
        if (arr == null) {
            return Integer.MIN_VALUE;
        }

        boolean isAsc = arr[0] < arr[arr.length - 1];

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                // found
                return mid;
            }
            // Asc
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            // Desc
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        // Not found
        return Integer.MIN_VALUE;
    }
}
