package examsFundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        if (groceries.contains("test")) {
            groceries.add("ok");
        }
        System.out.println();
    }
}
