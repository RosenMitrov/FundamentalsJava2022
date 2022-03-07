package fund07AssociativeArrays.exercises;

import java.util.*;

//created by R.M.
public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> ordersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] currentProduct = input.split(" ");
            String name = currentProduct[0];
            double price = Double.parseDouble(currentProduct[1]);
            double quantity = Double.parseDouble(currentProduct[2]);

            if (!ordersMap.containsKey(name)) {
                ordersMap.put(name, new ArrayList<>());
                ordersMap.get(name).add(price);
                ordersMap.get(name).add(quantity);
            } else {
                ordersMap.get(name).set(0, price);
                Double currentQuantity = ordersMap.get(name).get(1);
                ordersMap.get(name).set(1, currentQuantity + quantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : ordersMap.entrySet()) {
            double totalPriceCurrentProduct = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPriceCurrentProduct);
        }

    }
}
/*
4.	Orders
Write a program, which keeps the information about products and their prices.
Each product has a name, a price, and its quantity.
If the product doesn't exist yet, add it with its starting quantity.
If you receive a product, which already exists, increases its quantity by the input quantity
and if its price is different, replace the price as well.
You will receive products' names, prices, and quantities on new lines.
Until you receive the command "buy", keep adding items. When you do receive the command "buy",
print the items with their names and the total price of all the products with that name.
Input
•	Until you receive "buy", the products come in the format: "{name} {price} {quantity}".
•	The product data is always delimited by a single space.
Output
•	Print information about each product, following the format:
"{productName} -> {totalPrice}"
•	Format the average grade to the 2nd decimal place.

 */