package finalExamReal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([!])(?<first>[A-Z][a-z]{2,})\\1[:]\\[(?<second>[A-Za-z]{8,})\\]";
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                List<Integer> integerList = new ArrayList<>();
                String secondWord = matcher.group("second");
                for (int index = 0; index < secondWord.length(); index++) {
                    integerList.add((int) secondWord.charAt(index));
                }
                System.out.printf("%s: ", matcher.group("first"));
                for (int asciNUm : integerList) {
                    System.out.printf("%d ", asciNUm);
                }
                System.out.println();

            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
