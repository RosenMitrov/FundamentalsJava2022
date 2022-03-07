package fund07AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> recourseMap = new LinkedHashMap<>();

        String recourse = scanner.nextLine();
        while (!recourse.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!recourseMap.containsKey(recourse)) {
                recourseMap.put(recourse, quantity);
            } else {
                int currentQuantity = recourseMap.get(recourse);
                recourseMap.put(recourse, currentQuantity + quantity);
            }
            recourse = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : recourseMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
/*
2.	A Miner Task
Until you receive the "stop" command,
you will be given a sequence of strings,
each on a new line. Every odd line on the console is representing a resource (e.g. Gold, Silver, Copper, etc.)
and every even - quantity.
Your task is to collect the resources and print them each on a new line.
Print the resources and their quantities in format: {resource} –> {quantity}
The quantities inputs will be in the range [1 … 2 000 000 000].

 */