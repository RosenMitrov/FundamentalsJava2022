package fund03Arrays.moreExercises;

import java.util.Scanner;

//created by R.M.
public class fund02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] arrays = new int[rows];

        //fo Pascal Triangle
        for (int i = 0; i < rows; i++) {
            arrays[i] = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", arrays[i]);
                arrays[i] = arrays[i] * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
/*
2.	Pascal Triangle
The triangle may be constructed in the following manner:
In row 0 (the topmost row), there is a unique nonzero entry 1.
Each entry of each subsequent row is constructed by adding the number above and to the left with the number above and to the right,
treating blank entries as 0. For example,
the initial number in the first (or any other) row is 1 (the sum of 0 and 1),
whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.

 */