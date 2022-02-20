package midExamReal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P0303SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> shelfList = Arrays.stream(line.split("&")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] data = input.split(" \\| ");
            String commandMain = data[0];
            switch (commandMain) {
                case "Add Book":
                    String bookToAdd = data[1];
                    if (!shelfList.contains(bookToAdd)) {
                        shelfList.add(0, bookToAdd);
                    }
                    break;
                case "Take Book":
                    String bookToRemove = data[1];
                    shelfList.remove(bookToRemove);
                    break;
                case "Swap Books":
                    String bookOne = data[1];
                    String bookTwo = data[2];
                    if (shelfList.contains(bookOne) && shelfList.contains(bookTwo)) {
                        int indexOne = shelfList.indexOf(bookOne);
                        int indexTwo = shelfList.indexOf(bookTwo);
                        shelfList.set(indexOne, bookTwo);
                        shelfList.set(indexTwo, bookOne);
                    }
                    break;
                case "Insert Book":
                    String bookToInsert = data[1];
                    if (!shelfList.contains(bookToInsert)) {
                        shelfList.add(bookToInsert);
                    }
                    break;
                case "Check Book":
                    String checkBook = data[1];
                    int indexToCheck = Integer.parseInt(checkBook);
                    if (indexToCheck >= 0 && indexToCheck < shelfList.size()) {
                        System.out.printf("%s%n", shelfList.get(indexToCheck));
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", shelfList));

    }
}
