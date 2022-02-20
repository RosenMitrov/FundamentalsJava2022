package algorithms;

import java.util.Scanner;

public class FirstElementGoesLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = new int[]{10, 20, 30, 40, 50};
        System.out.print("Enter the number of rotations: ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        System.out.print("Old Array: ");
        for (int num : numbersArray) {
            System.out.printf("%d ", num);
        }
        System.out.println();

//          NESTED LOOPS
//        for (int eachRotation = 0; eachRotation < countRotations; eachRotation++) {
//            int tempNum = numbersArray[0];
//            for (int index = 0; index < numbersArray.length - 1; index++) {
//                numbersArray[index] = numbersArray[index + 1];
//            }
//            numbersArray[numbersArray.length - 1] = tempNum;
//        }

        int tempNum = 0;
        for (int index = 0; index < numbersArray.length - 1; index++) {
            if (index == 0) {
                tempNum = numbersArray[0];
            }
            numbersArray[index] = numbersArray[index + 1];
            if (index == numbersArray.length - 2) {
                numbersArray[numbersArray.length - 1] = tempNum;
                countRotations--;

                index = -1;
            }
            if (countRotations == 0) {
                break;
            }
        }

        System.out.print("New Array: ");
        for (int num : numbersArray) {
            System.out.printf("%d ", num);
        }


    }

}
