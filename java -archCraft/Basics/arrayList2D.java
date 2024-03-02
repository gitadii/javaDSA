import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // INITIALIZING list2D
        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<>());
        }                                       // = arr[3][] in 2D array

        // Taking I/P
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2D.get(i).add(in.nextInt());
            }
        }

        // Printing
        for (ArrayList<Integer> x : list2D) {
            System.out.println(x);
        }
    }
}
