import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(5);

        // Taking as many input as we want
        for (int i = 0; i < 9; i ++) {
            numbers.add(in.nextInt());
        }

        // Printing
        System.out.println(numbers);
    }
}
