package examsFundamentals.midExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P03HeartDelivery02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringEven = scanner.nextLine();

        List<Integer> integerList = Arrays.stream(stringEven.split("@")).map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();

        int currentPosition = 0;
        while (!input.equals("Love!")) {
            String[] commands = input.split(" ");
            int jumpLength = Integer.parseInt(commands[1]);

            currentPosition += jumpLength;

            if (currentPosition < 0 || currentPosition >= integerList.size()) {
                currentPosition = 0;
            }

            if (integerList.get(currentPosition) != 0) {
                int currentElement = integerList.get(currentPosition);
                currentElement -= 2;
                integerList.set(currentPosition, currentElement);
                if (integerList.get(currentPosition) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            }
            input = scanner.nextLine();
        }


        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        int countZeros = 0;

        for (Integer integer : integerList) {
            if (integer == 0) {
                countZeros++;
            }
        }
        if (countZeros == integerList.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", integerList.size() - countZeros);
        }

    }
}

/*
Valentine's day is coming, and Cupid has minimal time to spread some love across the neighborhood. Help him with his mission!
You will receive a string with even integers, separated by a "@" - this is our neighborhood.
fter that, a series of Jump commands will follow until you receive "Love!".
Every house in the neighborhood needs a certain number of hearts delivered by Cupid so it can celebrate Valentine's day.
The integers in the neighborhood indicate those needed hearts.
Cupid starts at the position of the first house (index 0) and must jump by a given length.
The jump commands will be in this format: "Jump {length}".
Every time he jumps from one house to another, the needed hearts for the visited house are decreased by 2:
•	If the needed hearts for a certain house become equal to 0, print on the console "Place {house_index} has Valentine's day."
•	If Cupid jumps to a house where the needed hearts are already 0, print on the console "Place {house_index} already had Valentine's day."
•	Keep in mind that Cupid can have a larger jump length than the size of the neighborhood,
and if he does jump outside of it, he should start from the first house again (index 0)
For example, we are given this neighborhood: 6@6@6. Cupid is at the start and jumps with a length of 2.
He will end up at index 2 and decrease the needed hearts by 2: [6, 6, 4].
Next, he jumps again with a length of 2 and goes outside the neighborhood,
so he goes back to the first house (index 0) and again decreases the needed hearts there: [4, 6, 4].
Input
•	On the first line, you will receive a string with even integers separated by "@" – the neighborhood and the number of hearts for each house.
•	On the next lines, until "Love!" is received, you will be getting jump commands in this format: "Jump {length}".
Output
In the end, print Cupid's last position and whether his mission was successful or not:
•	"Cupid's last position was {last_position_index}."
•	If each house has had Valentine's day, print:
o	"Mission was successful."
•	If not, print the count of all houses that didn't celebrate Valentine's Day:
o	"Cupid has failed {houseCount} places."

 */