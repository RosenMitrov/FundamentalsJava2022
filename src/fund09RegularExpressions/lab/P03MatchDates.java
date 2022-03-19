package fund09RegularExpressions.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //date format
        //dd{separator}MMM{separator}yyyy
        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
/*
3.	Match Dates
Write a program, which matches a date in the format "dd{separator}MMM{separator}yyyy".
Use named capturing groups in your regular expression.
Compose the Regular Expression
Every valid date has the following characteristics:
•	Always starts with two digits, followed by a separator.
•	After that, it has one uppercase and two lowercase letters (e.g. Jan, Mar).
•	After that, it has a separator and exactly 4 digits (for the year).
•	The separator could be either of three things: a period ("."), a hyphen ("-") or a forward-slash ("/").
•	The separator needs to be the same for the whole date (e.g. 13.03.2016 is valid, 13.03/2016 is NOT).
Use a group back reference to check for this.
You can follow the table below to help with composing your RegEx:
Match ALL of these	Match NONE of these
13/Jul/1928, 10-Nov-1934, 25.Dec.1937	01/Jan-1951, 23/sept/1973, 1/Feb/2016
Use named capturing groups for the day, month, and year.
Since this problem requires more complex RegEx, which includes named capturing groups, we’ll take a look at how to construct it:

 */