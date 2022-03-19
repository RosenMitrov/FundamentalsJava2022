package fund09RegularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        List<String> phonesList = new ArrayList<>();
        while (matcher.find()) {
            String phone = matcher.group(0);
            phonesList.add(phone);
        }
        System.out.println(String.join(", ", phonesList));
    }
}
/*
2.	Match Phone Number
Write a regular expression to match a valid phone number from Sofia.
After you find all valid phones, print them on the console, separated by a comma and a space ", ".
Compose the Regular Expression
A valid number has the following characteristics:
•	It starts with "+359".
•	Then, it is followed by the area code (always 2).
•	After that, it’s followed by the number itself:
o	The number consists of 7 digits (separated into two groups of 3 and 4 digits respectively).
•	The different parts are separated by either a space or a hyphen ('-').

 */