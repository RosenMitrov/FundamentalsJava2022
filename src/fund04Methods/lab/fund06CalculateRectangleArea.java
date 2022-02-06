package fund04Methods.lab;

import java.util.Scanner;

//created byt R.M.
public class Fund06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int result = getRectangleArea(width, length);
        System.out.println(result);
    }

    public static int getRectangleArea(int width, int length) {
        return width * length;
    }
}
/*
6.	Calculate Rectangle Area
Create a method that calculates and returns the area of a rectangle by given width and length.

 */