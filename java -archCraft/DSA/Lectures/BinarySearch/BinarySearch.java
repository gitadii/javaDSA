package BinarySearch;

class BinarySearch {
    public static void main(String[] args) {
//        int[] arr1 = {-12,-9,-2,0,2,6,8,12,35,45,51,60,69};
//
//        System.out.println("Target ele found at - " + binarySearch(arr1, -69));

        int[] arr2 = {69,51,35,12,6,2,0,-3,-6,-10,-45};

        System.out.println("Output of descendingBS - " + binarySearch(arr2, -10));
    }

    static int binarySearch(int[] arr, int target) {
        // If array is empty
        if (arr == null) {
            return Integer.MIN_VALUE;
        }

            int start = 0;
            int end = arr.length - 1;


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
            return Integer.MIN_VALUE;

    }

    // For descending ordered array
    static int descendingBinarySearch(int[] arr, int target) {
        if (arr == null) {
            return Integer.MIN_VALUE;
        }

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                // found
                return mid;
            }
        }
        //Not found
        return Integer.MIN_VALUE;

    }
}
