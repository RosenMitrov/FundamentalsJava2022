package fund02dataTypesAndVariables.lab;
//created by R.M.

import java.util.Scanner;

public class Fund05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.printf("%s%s%s", firstName, delimiter, lastName);
    }
}
/*
5.	Concat Names
Read two names and a delimiter. Print the names joined by the delimiter.

 */