public class Main {
    public static void main(String[] args) {
        int[] arr1 = {121,3,4,89,6,10,69,7,-8,-69,-5,-12,5};
        int[] arr2 = new int[3];

        System.out.println("Item found at - " + linearSearch(arr1, -69));
    }

    static int linearSearch(int[] arr, int target) {
        if ( arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                return i;
            }
        }
        // If the target is not found
        return -1;
    }
}