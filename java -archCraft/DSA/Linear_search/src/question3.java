// Leetcode questions

import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        int[] arr1 = {121,3,4,89,6,10,69,7,-8,-69,-5,-12,5};
        System.out.println("Number of elements with even number of digits are - " + numOfEvenDigitElement(arr1));
    }

    static int numOfEvenDigitElement ( int[] arr ) {
        //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
        if (arr == null) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( Integer.toString(arr[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }


//    static boolean isEven ( int x) {
//        return x % 2 == 0;
//    }
//    static int numOfEvenDigitElement2 ( int[] arr ) {
//        //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//        if (arr == null) {
//            return -1;
//        }
//
//        int count = 0;
//        for ( int i : arr) {
//            while ( i/10 > 0) {
//                count++;
//                i/=10;
//            }
//        }
//
//        return count;
//    }

}
