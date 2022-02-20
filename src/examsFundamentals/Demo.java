package examsFundamentals;


import java.util.*;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] neighborhood = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split(" ");
        int index = 0;

        while (!command[0].equals("Love!")) {
            index += Integer.parseInt(command[1]);
            if (index > neighborhood.length - 1) {
                index = 0;

            }
            if (neighborhood[index] > 0) {
                neighborhood[index] -= 2;
                if (neighborhood[index] == 0) {
                    System.out.println("Place " + index + " has Valentine's day.");
                }
            } else {
                System.out.println("Place " + index + " already had Valentine's day.");
            }

            command = scanner.nextLine().split(" ");
        }
        int failed = 0;
        for (int i = 0; i < neighborhood.length; i++) {
            if (neighborhood[i] != 0) {
                failed++;
            }

        }
        System.out.println("Cupid's last position was " + index + ".");
        if (failed > 0) {
            System.out.println("Cupid has failed " + failed + " places.");
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
