package examsFundamentals.finalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validRegex = "(@#+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern validationPattern = Pattern.compile(validRegex);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher validationMatcher = validationPattern.matcher(barcode);

            if (validationMatcher.find()) {
                String productGroup = getGroup(barcode);
                System.out.printf("Product group: %s%n", productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String getGroup(String barcode) {
        StringBuilder group = new StringBuilder();
        String digitRegex = "([0-9])";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(barcode);
        while (digitMatcher.find()) {
            group.append(digitMatcher.group(0));
        }

        if (!group.toString().isEmpty()) {
            return group.toString();
        } else {
            return "00";
        }
    }
}

/*
Problem for exam preparation for the Programming Fundamentals Course @SoftUni.
Submit your solutions in the SoftUni judge system at https://judge.softuni.org/Contests/Practice/Index/2303#1.

Your first task is to determine if the given sequence of characters is a valid barcode or not.
Each line must not contain anything else but a valid barcode. A barcode is valid when:
•	It is surrounded by a "@" followed by one or more "#"
•	It is at least 6 characters long (without the surrounding "@" or "#")
•	It starts with a capital letter
•	It contains only letters (lower and upper case) and digits
•	It ends with a capital letter
Examples of valid barcodes: @#FreshFisH@#, @###Brea0D@###, @##Che46sE@##, @##Che46sE@###
Examples of invalid barcodes: ##InvaliDiteM##, @InvalidIteM@, @#Invalid_IteM@#
Next, you have to determine the product group of the item from the barcode.
The product group is obtained by concatenating all the digits found in the barcode.
If there are no digits present in the barcode, the default product group is "00".
Examples:
@#FreshFisH@# -> product group: 00
@###Brea0D@### -> product group: 0
@##Che4s6E@## -> product group: 46
Input
On the first line, you will be given an integer n – the count of barcodes that you will be receiving next.
On the following n lines, you will receive different strings.
Output
For each barcode that you process, you need to print a message.
If the barcode is invalid:
•	"Invalid barcode"
If the barcode is valid:
•	"Product group: {product group}"

 */