package fund04Methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

//created by R.M.
public class fund08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat result = new DecimalFormat("0.####");

        System.out.println(result.format(mathPower(number, power)));
    }

    private static double mathPower(double num, int power) {
        double result = 1.00;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}
/*
8.	Math Power
Create a method that calculates and returns the value of a number raised to a given power.

 */