package fund03Arrays.Exercises;

import java.util.Scanner;

//created by R.M.
public class fund02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {

                if (secondElement.equals(firstElement)) {
                    System.out.printf("%s ", secondElement);
                }
            }
        }
    }
}
/*
2.	Common Elements
Write a program, which prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.
 */