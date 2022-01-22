package fund02dataTypesAndVariables.lab;
//created by R.M.

import java.util.Scanner;

public class fun01ConvertMetersToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());
        double kilometers = distanceInMeters * 1.0 / 1000;

        System.out.printf("%.2f", kilometers);
    }
}
//1.	Convert Meters to Kilometers
//You will be given an integer that will be a distance in meters. Write a program that converts meters to kilometers formatted to the second decimal point.
//Examples
//Input	Output
//1852	1.85
//798	0.80