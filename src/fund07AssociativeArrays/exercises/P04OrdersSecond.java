package fund07AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P04OrdersSecond {
    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Product> ordersMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] data = input.split(" ");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!ordersMap.containsKey(name)) {
                ordersMap.put(name, new Product(name, price, quantity));
            } else {
                ordersMap.get(name).setPrice(price);
                ordersMap.get(name).setQuantity(ordersMap.get(name).getQuantity() + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Product> entry : ordersMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().getPrice() * entry.getValue().getQuantity());
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