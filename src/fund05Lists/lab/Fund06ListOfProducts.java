package fund05Lists.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Fund06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLines = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        while (countLines > 0) {
            String productFromInput = scanner.nextLine();
            products.add(productFromInput);
            countLines--;
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
/*
List of Products
Read a number n and n lines of products. Print a numbered list of all the products ordered by name.

 */