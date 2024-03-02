package BinarySearch.InterviewQuesBS;

public class findPivotWithDuplicate {
    public static void main(String[] args) {

    }
    static public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            // If the starting ele and the ending ele and the middle ele are all the same
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // What if these ele are the pivot
                // Check if start is the pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if ( arr[end] < arr[end-1]) {
                    return end - 1;
                }
                end--;
            }
            // If left side is sorted then and start is less then mid then, pivot is in LHS
            else if (arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;           // At this point start = end
    }
}
