package fund02dataTypesAndVariables.lab;

import java.util.Scanner;
//created by R.M.

public class Fund11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length;
        double width;
        double height;
        double volume;

        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
/*
volume of a pyramid
 */