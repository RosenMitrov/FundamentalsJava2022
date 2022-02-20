package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] rotated = new String[input.length];

        int n = 2;


        for (int i = 0; i < input.length; i++) {


            if (n + i < input.length) {
                rotated[n + i] = input[i];
            } else if ((n + i) >= input.length) {
                rotated[(n + i) - input.length] = input[i];
            }
        }
        System.out.println(Arrays.toString(rotated));
    }
}

