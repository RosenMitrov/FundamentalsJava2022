package fund02dataTypesAndVariables;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            Scanner sc = new Scanner(input);
            if (sc.hasNextInt()) {
                System.out.printf("%s is integer type%n", input);
            } else if (sc.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (sc.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            } else if (sc.hasNextLine()) {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }

}


