import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println(matrix.length);

        // Taking input for 2D array
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // Printing a 2D array
//        for (int i = 0; i < matrix.length; i ++) {
//            for (int j = 0; j < matrix[i].length; j ++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        for ( int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
