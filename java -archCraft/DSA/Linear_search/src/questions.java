public class questions {
    public static void main(String[] args) {
        String name = "Aditya!!";
        char target = '!';

//        System.out.println("Character present at - " + stringSearch2(name, target));

        int[] arr1 = {121,3,4,89,6,10,69,7,-8,-69,-5,-12,5};
        System.out.println("Element found at index - " + searchInIndexRange(arr1, 2, 8, -5));
    }

    static int stringSearch ( String str, char target) {
        if (str.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }

        return Integer.MIN_VALUE;
    }

    //Using For each loop
    static boolean stringSearch2 ( String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if ( ch == target) {
                return true;
            }
        }

        return false;
    }

    // Searching in the given index range
    static int searchInIndexRange( int[] arr, int start, int end, int target) {
        if (arr == null) {
            return Integer.MIN_VALUE;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return Integer.MIN_VALUE;
    }
}
