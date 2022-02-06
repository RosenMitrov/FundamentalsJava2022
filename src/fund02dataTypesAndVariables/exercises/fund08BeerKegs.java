package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggestKegName = "";

        for (int i = 0; i < kegs; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentKegVolume = Math.PI * Math.pow(radius, 2) * height;
            if (currentKegVolume > maxVolume) {
                maxVolume = currentKegVolume;
                biggestKegName = modelKeg;
            }
        }
        System.out.println(biggestKegName);
    }
}
/*
8.	Beer Kegs
Write a program, which calculates the volume of n beer kegs.
You will receive in total 3 * n lines. Every three lines will hold information for a single keg.

First up is the model of the keg,
after that is the radius of the keg,
and lastly is the height of the keg.

Calculate the volume using the following formula: π * r^2 * h.
In the end, print the model of the biggest keg.

Input
You will receive 3 * n lines. Each group of lines will be on a new line:
•	First – model – string
•	Second –radius – floating-point number
•	Third – height – integer number
Output
Print the model of the biggest keg.

 */