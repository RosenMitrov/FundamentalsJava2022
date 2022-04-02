package mixed;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "TakeOdd":
                    password = getOdd(password);
                    break;
                case "Cut":
                    int indexForCut = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    password.delete(indexForCut, indexForCut + length);
                    break;
                case "Substitute":
                    String substring = data[1];
                    String substitute = data[2];
                    getReplacement(password, substring, substitute);
                    break;
            }
            if (!command.equals("Substitute")) {
                System.out.println(password);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);

    }

    private static StringBuilder getOdd(StringBuilder password) {
        StringBuilder passNew = new StringBuilder();
        for (int index = 1; index < password.length(); index += 2) {
            passNew.append(password.charAt(index));
        }
        return passNew;
    }

    private static void getReplacement(StringBuilder password, String substring, String substitute) {
        int index = password.indexOf(substring);
        if (index != -1) {
            while (index != -1) {
                password.delete(index, index + substring.length());
                password.insert(index, substitute);
                index = password.indexOf(substring);
            }
            System.out.println(password);
        } else {
            System.out.println("Nothing to replace!");
        }

    }
}
