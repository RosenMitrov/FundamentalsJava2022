package fund03Arrayss.Exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class fund10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filedSize = Integer.parseInt(scanner.nextLine());
        int[] initialPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] ladyBugFiled = new int[filedSize];

        for (int i = 0; i < initialPositions.length; i++) {
            if (initialPositions[i] >= 0 && initialPositions[i] <= ladyBugFiled.length - 1) {
                ladyBugFiled[initialPositions[i]] = 1;
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split(" ");

            int index = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int flyingLength = Integer.parseInt(commands[2]);

            if (index < 0 || index >= ladyBugFiled.length || ladyBugFiled[index] != 1) {
                input = scanner.nextLine();
                continue;
            }
            ladyBugFiled[index] = 0;
            switch (direction) {
                case "right":
                    index += flyingLength;
                    while (index < filedSize && ladyBugFiled[index] == 1) {
                        index += flyingLength;
                    }
                    if (index < filedSize) {
                        ladyBugFiled[index] = 1;
                    }
                    break;
                case "left":
                    index -= flyingLength;
                    while (index >= 0 && ladyBugFiled[index] == 1) {
                        index -= flyingLength;
                    }
                    if (index >= 0) {
                        ladyBugFiled[index] = 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int position : ladyBugFiled) {
            System.out.printf("%d ", position);
        }


    }
}
