package fund09RegularExpressions.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<customer>[A-Z][a-z]+)%[^\\|$%.]*?<(?<product>\\w+)>[^\\|$%.]*?\\|[^\\|$%.]*?(?<count>\\d+)[^\\|$%.]*?\\|[^\\|$%.]*?(?<price>\\d+.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0.00;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n", customer, product, count * price);
                totalIncome += (price * count);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
/*
3.	*SoftUni Bar Income
Let`s take a break and visit the game bar at SoftUni.
It is about time for the people behind the bar to go home,
and you are the person who has to draw the line and calculate the money from the products that were sold throughout the day.
Until you receive a line with the text "end of shift" you will be given lines of input.
But before processing that line you have to do some validations first.
Each valid order should have a customer, product, count, and a price:
•	Valid customer's name should be surrounded by '%' and must start with a capital letter, followed by lower-case letters
•	Valid product contains any word character and must be surrounded by '<' and '>'
•	The valid count is an integer, surrounded by '|'
•	The valid price is any real number followed by '$'
The parts of a valid order should appear in the order given: customer, product, count, and price.
Between each part there can be other symbols, except ('|', '$', '%' and '. ')
For each valid line print on the console: "{customerName}: {product} - {totalPrice}"
When you receive "end of shift" print the total amount of money for the day rounded to 2 decimal places in the following format: "Total income: {income}".

 */