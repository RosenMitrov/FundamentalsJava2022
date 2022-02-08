package fund04Methods.moreExercises;

import java.util.Scanner;

public class Fund02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosestToTheCenter(x1, y1, x2, y2);
    }

    private static void printClosestToTheCenter(int x1, int y1, int x2, int y2) {

        int result1 = Math.abs(x1) + Math.abs(y1);
        int result2 = Math.abs(x2) + Math.abs(y2);

        if (result1 <= result2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }

    }
}
/*
2.	Center Point
You are given the coordinates of two points on a Cartesian coordinate system - X1, Y1, X2, and Y2.
Create a method that prints the point that is closest to the center of the coordinate system (0, 0) in the format (X, Y).
If the points are at the same distance from the center, print only the first one.

 */