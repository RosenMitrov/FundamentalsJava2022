package examsFundamentals.MidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Shoot":
                    int indexToShoot = Integer.parseInt(data[1]);
                    int giverPower = Integer.parseInt(data[2]);
                    getShotList(indexToShoot, giverPower, targetsList);
                    break;
                case "Add":
                    int indexToAdd = Integer.parseInt(data[1]);
                    int valueToAdd = Integer.parseInt(data[2]);
                    getIndexWithAddedValue(indexToAdd, valueToAdd, targetsList);
                    break;
                case "Strike":
                    int indexStrike = Integer.parseInt(data[1]);
                    int radius = Integer.parseInt(data[2]);
                    if (isValidIndex(indexStrike, targetsList)) {
                        int startIndex = indexStrike - radius;
                        int endIndex = indexStrike + radius;

                        if (startIndex < 0 || endIndex >= targetsList.size() - 1) {
                            System.out.println("Strike missed!");
                        } else {
                            for (int i = startIndex; i <= endIndex; i++) {
                                targetsList.remove(startIndex);
                            }
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(targetsList);
    }

    private static void printList(List<Integer> targetsList) {
        for (int index = 0; index < targetsList.size(); index++) {
            if (index != targetsList.size() - 1) {
                System.out.printf("%d%s", targetsList.get(index), "|");
            } else {
                System.out.printf("%d", targetsList.get(index));
            }
        }

//          System.out.println(targetsList.toString().replaceAll("[\\[\\] ]", "").trim().replaceAll(",", "|"));
    }

    private static void getIndexWithAddedValue(int indexToAdd, int valueToAdd, List<Integer> targetsList) {
        if (isValidIndex(indexToAdd, targetsList)) {
            targetsList.add(indexToAdd, valueToAdd);
        } else {
            System.out.println("Invalid placement!");
        }


    }

    private static void getShotList(int indexToShoot, int giverPower, List<Integer> targetsList) {
        if (isValidIndex(indexToShoot, targetsList)) {
            int currentTargetValue = targetsList.get(indexToShoot);
            currentTargetValue = targetsList.set(indexToShoot, currentTargetValue - giverPower);
            currentTargetValue = currentTargetValue - giverPower;
            if (currentTargetValue <= 0) {
                targetsList.remove(indexToShoot);
            }
        }
    }

    private static boolean isValidIndex(int indexToShoot, List<Integer> targetsList) {
        return indexToShoot >= 0 && indexToShoot < targetsList.size();
    }
}
/*
You are at the shooting gallery again, and you need a program that helps you keep track of moving targets.
On the first line, you will receive a sequence of targets with their integer values, split by a single space.
Then, you will start receiving commands for manipulating the targets until the "End" command.

The commands are the following:
•	"Shoot {index} {power}"
o	Shoot the target at the index if it exists by reducing its value by the given power (integer value).
o	Remove the target if it is shot. A target is considered shot when its value reaches 0.
•	"Add {index} {value}"
o	Insert a target with the received value at the received index if it exists.
o	If not, print: "Invalid placement!"
•	"Strike {index} {radius}"
o	Remove the target at the given index and the ones before and after it depending on the radius.
o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.
 Example:  "Strike 2 2"
	{radius}	{radius}	{strikeIndex}	{radius}	{radius}

•	"End"
o	Print the sequence with targets in the following format and end the program:
"{target1}|{target2}…|{target n}"
Input / Constraints
•	On the first line, you will receive the sequence of targets – integer values [1-10000].
•	On the following lines, until the "End" will be receiving the command described above – strings.
•	There will never be a case when the "Strike" command would empty the whole sequence.
Output
•	Print the appropriate message in case of any command if necessary.
•	In the end, print the sequence of targets in the format described above.

 */