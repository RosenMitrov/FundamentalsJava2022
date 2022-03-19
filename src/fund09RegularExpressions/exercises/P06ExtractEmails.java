package fund09RegularExpressions.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b([a-z](?:_?[a-z0-9\\-\\.]+@[a-z\\-]+\\.[a-z]+([\\.a-z]+)?))\\b";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group(0).trim());
        }
    }
}
