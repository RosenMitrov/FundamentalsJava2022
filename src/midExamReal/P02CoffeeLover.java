package midExamReal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesOfCoffee = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(" ");
            String commandMain = data[0];

            switch (commandMain) {
                case "Include":
                    String coffeeToInclude = data[1];
                    namesOfCoffee.add(coffeeToInclude);
                    break;
                case "Remove":
                    String firstOrLast = data[1];
                    int numberOfCoffees = Integer.parseInt(data[2]);
                    removeFirstOrLastElement(numberOfCoffees,namesOfCoffee, firstOrLast);
                    break;
                case "Prefer":
                    int indexOne = Integer.parseInt(data[1]);
                    int indexTwo = Integer.parseInt(data[2]);
                    changePlaces(indexOne, indexTwo, namesOfCoffee);
                    break;
                case "Reverse":
                    Collections.reverse(namesOfCoffee);
                    break;
            }
        }
        System.out.println("Coffees:");
        for (String s : namesOfCoffee) {
            System.out.printf("%s ", s);
        }

    }

    private static void changePlaces(int indexOne, int indexTwo, List<String> namesOfCoffee) {
        if (isValidIndex(indexOne, indexTwo, namesOfCoffee)) {
            String tempOne = namesOfCoffee.get(indexOne);
            namesOfCoffee.set(indexOne, namesOfCoffee.get(indexTwo));
            namesOfCoffee.set(indexTwo, tempOne);
        }
    }

    private static void removeFirstOrLastElement(int numberOfCoffees, List<String> namesOfCoffee, String firstOrLast) {
        if (numberOfCoffees < namesOfCoffee.size()) {
            if (firstOrLast.equals("first")) {
                for (int j = 0; j < numberOfCoffees; j++) {
                    namesOfCoffee.remove(0);
                }
            } else if (firstOrLast.equals("last")) {
                for (int j = 0; j < numberOfCoffees; j++) {
                    namesOfCoffee.remove(namesOfCoffee.size() - 1);
                }
            }
        }
    }


    private static boolean isValidIndex(int indexOne, int indexTwo, List<String> namesOfCoffee) {
        return indexOne >= 0 && indexOne < namesOfCoffee.size() && indexTwo >= 0 && indexTwo < namesOfCoffee.size();
    }


}
