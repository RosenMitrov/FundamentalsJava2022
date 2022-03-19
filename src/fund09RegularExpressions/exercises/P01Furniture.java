package fund09RegularExpressions.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSpentMoney = 0.00;
        List<String> furnitureList = new ArrayList<>();
        String regex = ">{2}(?<furnitureName>[A-Za-z]+)<{2}(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);


        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher purchases = pattern.matcher(input);
            if (purchases.find()) {
                String nameFurniture = purchases.group("furnitureName");
                double price = Double.parseDouble(purchases.group("price"));
                int quantity = Integer.parseInt(purchases.group("quantity"));
                totalSpentMoney += (price * quantity);
                furnitureList.add(nameFurniture);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSpentMoney);
    }
}

/*
1.	Furniture
Write a program to calculate the total cost of different types of furniture.
You will be given some lines of input until you receive the line "Purchase".
For the line to be valid it should be in the following format:
">>{furniture name}<<{price}!{quantity}"
The price can be a floating-point number or a whole number.
Store the names of the furniture and the total price.
At the end print each bought furniture on a separate line in the format:
"Bought furniture:
{1st name}
{2nd name}
…"
And on the last line print, the following: "Total money spend: {spend money}" formatted to the second decimal point.

 */
