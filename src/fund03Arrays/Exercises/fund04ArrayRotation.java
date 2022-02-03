package fund03Arrays.Exercises;

import java.util.Scanner;

//created by R.M.
public class fund04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstElement = array[0];
            for (int index = 0; index < array.length - 1; index++) {// iterations to the penultimate index
                array[index] = array[index + 1];                    //because (index + 1) will be outOFBound
            }
            array[array.length - 1] = firstElement;
        }
        System.out.println(String.join(" ", array));
    }
}
/*
4.	Array Rotation
Write a program that receives an array and the number of rotations you have to perform
(the first element goes at the end) Print the resulting array.

 */