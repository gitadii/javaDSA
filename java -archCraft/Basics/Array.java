import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[5];

        // Taking input
        for (int i = 0; i < 5; i ++) {
            names[i] = in.nextLine();
        }

        // Printing String array
        for (String i : names) {
            System.out.println(i);
        }

    }
}
