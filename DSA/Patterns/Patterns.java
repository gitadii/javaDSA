package DSA.Patterns;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Patterns {
    public static void main(String[] args) {
        // pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        kkPattern28(5);
//        pattern30(5);
        pattern17(5);
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print("*");
            }
            // when one line is completed change to next line
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = (2 * n) - i; j > 0; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    // COMPLEX approach (Mine)
    static void pattern28(int n) {
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= n + i - 1; j++) {
                    if (j <= n - i) {
                        System.out.print(" ");
                    } else {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print("* ");
                            }
                        } else {
                            if (j % 2 != 0) {
                                System.out.print("* ");
                            }
                        }
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= (2 * n) - (i - n + 1); j++) {
                    if (j <= i - n) {
                        System.out.print(" ");
                    } else {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print("* ");
                            }
                        } else {
                            if ((j % 2) != 0) {
                                System.out.print("* ");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    //KK's approach
    static void kkPattern28(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpace = n - row;
            for (int space = 0; space < noOfSpace; space++) {
                System.out.print("  ");
            }
            for (int j = row; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= row; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfColInRow = row <= n ? row : 2 * n - row + n - 1;

            int noOfSpaces = row <= n ? n - row : row - n;

            for(int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }

            if (row <= n) {
                for (int j = row; j > 0; j--) {
                    System.out.print(j + " ");
                }
                for (int k = 2; k <= row; k++) {
                    System.out.print(k + " ");
                }
            } else {
                for (int j = 2 * n - row; j > 0; j--) {
                    System.out.print(j + " ");
                }
                for (int k = 2; k <= 2 * n - row; k++) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}