import java.util.Arrays;

public class questions {
    public static void main(String[] args) {
        int[] arr1 = {106, 56, 1, 45, 3, 100};
//        swapElement(arr1, 2, 5);
//        System.out.println(maxEle(arr1));
        System.out.println("Reversed array is - " + reverse(arr1));
    }


    static void swapElement (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }

    static int maxEle (int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static String reverse (int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return Arrays.toString(arr);
    }
}
