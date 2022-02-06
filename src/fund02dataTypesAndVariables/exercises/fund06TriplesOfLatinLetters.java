package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < range + 97; i++) {
            for (int j = 97; j < range + 97; j++) {
                for (int k = 97; k < range + 97; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
/*
6.	Triples of Latin Letters
Write a program to read an integer n and print all triples of the first n small Latin letters, ordered alphabetically:
 */