package fund05Lists;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1, 20, 23, 5, 17, 15, 13, 45, 5, 2, 8, 9, 91,};
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));

        System.out.println("less or 5 top numbers greater than FIVE");
        array = getTopFiveGreaterThan5(array);
        System.out.println(Arrays.toString(array));

        System.out.println("less or 5 top numbers greater than FIFTEEN");
        array = getTopFiveGreaterThan15(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Print array in ascending order");
        ascendingOrderArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Print array in descending order");
        descendingOrderArray(array);
        System.out.println(Arrays.toString(array));


    }

    private static void descendingOrderArray(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] < array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                index = -1;
            }
        }
    }

    private static void ascendingOrderArray(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                index = -1;
            }
        }
    }

    private static int[] getTopFiveGreaterThan15(int[] array) {
        int countGreaterThanFive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 15) {//над 15
                countGreaterThanFive++;
            }
        }
        int index = 0;
        int[] allGreaterThanFive = new int[countGreaterThanFive];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 15) {//над 15
                allGreaterThanFive[index] = array[i];
                index++;
            }
        }
        return allGreaterThanFive;
    }

    private static int[] getTopFiveGreaterThan5(int[] array) {
        int countGreaterThanFive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {//над 5
                countGreaterThanFive++;
                if (countGreaterThanFive == 5) {
                    break;
                }
            }
        }
        int index = 0;
        int[] allGreaterThanFive = new int[countGreaterThanFive];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {// над 5
                allGreaterThanFive[index] = array[i];
                index++;
                if (index == 5) {
                    break;
                }
            }
        }
        return allGreaterThanFive;
    }
}
