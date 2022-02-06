package fund02dataTypesAndVariables.MoreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund04RefactoringPrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 2; currentNum <= range; currentNum++) {
            boolean isPrime = true;
            for (int check = 2; check < currentNum; check++) {
                if (currentNum % check == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", currentNum, isPrime);
        }
    }
}
/*
. Refactoring: Prime Checker
You are given a program that checks if numbers in a given range [2...N] are prime.
For each number is printed "{number} -> {true or false}". The code, however,
is not very well written.
Your job is to modify it in a way that is easy to read and understand.
 */