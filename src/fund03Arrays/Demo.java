package fund03Arrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] name = new int[5];
        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.nextInt();
        }
        System.out.println();
        char[] symbols = scanner.nextLine().toCharArray();
    }

}
