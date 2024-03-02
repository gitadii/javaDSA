package BinarySearch.BSin2D;

import java.util.Arrays;

public class BSin2D {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        System.out.println("Result of 2DBS is " + Arrays.toString(eliminateROW(matrix1, 19)));
    }

    // Eliminating the rows
    static int[] eliminateROW(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int cMid = (column - 1) / 2;

        int rStart = 0;
        int rEnd = row - 1;

        // if there is only one row
        if (row == 1) {
            return binarySearch(matrix, 0, 0, column - 1, target);
        }

        // checking the mid-column
        // if the target is in the middle col
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        } else if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        //Elimination
        // at this point there will be only 2 rows left after elimination
        while (rStart <= rEnd) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            } else if (matrix[rMid][cMid] < target) {
                rStart = rMid + 1;
            } else {
                rEnd = rMid - 1;
            }
        }// if ele found it will be returned

        // else checking all the sections
        //section 1
        if (target <= matrix[rStart][cMid]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //section 2
        else if (target >= matrix[rStart][cMid]) {
            return binarySearch(matrix, rStart, cMid + 1, column - 1, target);
        }
        //section 3
        else if (target <= matrix[rEnd][cMid]) {
            return binarySearch(matrix, rEnd, 0, cMid - 1, target);
        }
        //section 4
        else {
            return binarySearch(matrix, rEnd, cMid + 1, column - 1, target);
        }

    }

    // searching the target element in the provided (row, column) range
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

}
