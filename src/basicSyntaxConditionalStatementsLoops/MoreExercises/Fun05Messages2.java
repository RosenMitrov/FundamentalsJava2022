package basicSyntaxConditionalStatementsLoops.MoreExercises;
//created by R.M

import java.util.Scanner;

public class Fun05Messages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String word = "";
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();

            int inputAsDigit = Integer.parseInt(input);
            int numberOfDigits = input.length();
            int mainDigit = inputAsDigit % 10;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = offset + 1;
            }
            int letterIndex = offset + numberOfDigits - 1;
            int letterAsciiCode = letterIndex + 97;
            char letter = (char) letterAsciiCode;
            if (mainDigit == 0) {
                letter = (char) 32;
            }
            word += letter;
        }
        System.out.println(word);

    }

}
