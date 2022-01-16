package basicSyntaxConditionalStatementsLoops.MoreExercises;
//created by R.M.
import java.util.Scanner;

public class Fun05Messages {
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
            char letter = ' ';
            switch (letterIndex) {
                case 0:
                    letter = 'a';
                    break;
                case 1:
                    letter = 'b';
                    break;
                case 2:
                    letter = 'c';
                    break;
                case 3:
                    letter = 'd';
                    break;
                case 4:
                    letter = 'e';
                    break;
                case 5:
                    letter = 'f';
                    break;
                case 6:
                    letter = 'g';
                    break;
                case 7:
                    letter = 'h';
                    break;
                case 8:
                    letter = 'i';
                    break;
                case 9:
                    letter = 'j';
                    break;
                case 10:
                    letter = 'k';
                    break;
                case 11:
                    letter = 'l';
                    break;
                case 12:
                    letter = 'm';
                    break;
                case 13:
                    letter = 'n';
                    break;
                case 14:
                    letter = 'o';
                    break;
                case 15:
                    letter = 'p';
                    break;
                case 16:
                    letter = 'q';
                    break;
                case 17:
                    letter = 'r';
                    break;
                case 18:
                    letter = 's';
                    break;
                case 19:
                    letter = 't';
                    break;
                case 20:
                    letter = 'u';
                    break;
                case 21:
                    letter = 'v';
                    break;
                case 22:
                    letter = 'w';
                    break;
                case 23:
                    letter = 'x';
                    break;
                case 24:
                    letter = 'y';
                    break;
                case 25:
                    letter = 'z';
                    break;

            }
            word += letter;

        }
        System.out.println(word);
    }
}
