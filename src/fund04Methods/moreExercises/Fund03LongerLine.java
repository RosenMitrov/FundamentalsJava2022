package fund04Methods.moreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int b1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());

        int a3 = Integer.parseInt(scanner.nextLine());
        int b3 = Integer.parseInt(scanner.nextLine());
        int a4 = Integer.parseInt(scanner.nextLine());
        int b4 = Integer.parseInt(scanner.nextLine());

        printClosestToTheCenter(a1, b1, a2, b2, a3, b3, a4, b4);
    }

    public static void printClosestToTheCenter(int a1, int b1, int a2, int b2, int a3, int b3, int a4, int b4) {
        double z1 = Math.pow((a1 - a2), 2) + Math.pow((b1 - b2), 2);
        double z2 = Math.pow((a3 - a4), 2) + Math.pow((b3 - b4), 2);

        if (z1 >= z2) {
            closer(a1, b1, a2, b2);
        } else {
            closer(a3, b3, a4, b4);
        }
    }

    public static void closer(int x, int y, int z, int p) {
        if (x * x + y * y <= z * z + p * p) {
            System.out.printf("(%d, %d)(%d, %d)", x, y, z, p);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", z, p, x, y);
        }
    }
}
/*
3.	Longer Line
You are given the coordinates of four points in the 2D plane.
The first and the second pair of points form two different lines.
Print the longer line in the format "(X1, Y1)(X2, Y2)"
starting with the point that is closer to the center of the coordinate system (0, 0)
(You can reuse the method that you wrote for the previous problem).
If the lines are of equal length, print only the first one.

 */