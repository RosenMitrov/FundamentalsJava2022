package algorithms;

import java.util.Scanner;

public class LastElementGoesFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{10, 20, 30, 40, 50};
        System.out.print("Enter the number of rotations: ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        System.out.print("Old Array: ");
        for (int num : array) {
            System.out.printf("%d ", num);
        }
        System.out.println();
//        for (int eachRotation = 0; eachRotation < countRotations; eachRotation++) {
//
//            for (int index = 0; index < array.length - 1; index++) {
//                int temp = array[array.length - 2 - index];
//                array[array.length - 2 - index] = array[array.length - 1 - index];
//                array[array.length - 1 - index] = temp;
//
//            }
//        }


        for (int index = 0; index < array.length - 1; index++) {
            int temp = array[array.length - 2 - index];
            array[array.length - 2 - index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
            if (index == array.length - 2) {
                countRotations--;
                index = -1;
            }
            if (countRotations == 0) {
                break;
            }
        }


        System.out.print("New Array: ");
        for (int num : array) {
            System.out.printf("%d ", num);
        }
    }
}
