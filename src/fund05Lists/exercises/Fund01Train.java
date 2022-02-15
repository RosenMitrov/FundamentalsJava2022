package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            if (data[0].equals("Add")) {
                int passengersToAdd = Integer.parseInt(data[1]);
                train.add(passengersToAdd);
            } else {
                int passengers = Integer.parseInt(data[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + passengers <= maxCapacity) {
                        train.set(i, train.get(i) + passengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int wagon : train) {
            System.out.printf("%d ", wagon);
        }

    }
}
/*
1.	Train
On the first line, you will be given a list of wagons (integers).
Each integer represents the number of passengers that are currently in each wagon.
On the next line, you will get the max capacity of each wagon (single integer).

Until you receive "end" you will be given two types of input:
•	Add {passengers} - add a wagon to the end with the given number of passengers
•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
At the end print the final state of the train (all the wagons separated by a space)

 */