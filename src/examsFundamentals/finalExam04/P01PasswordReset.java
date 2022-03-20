package examsFundamentals.finalExam04;

import java.util.Scanner;

//created by R.M.
public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "TakeOdd":
                    text = new StringBuilder(getOdd(text));
                    System.out.println(text);
                    break;
                case "Cut":
                    int fromIndex = Integer.parseInt(data[1]);
                    int lengthForCut = Integer.parseInt(data[2]);
                    //FIRST SOLUTION FOR DELETING
                    //text.replace(fromIndex, fromIndex + lengthForCut, "");
                    //SECOND SOLUTION FOR DELETING
                    text.delete(fromIndex, fromIndex + lengthForCut);
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substring = data[1];
                    String substituteString = data[2];
                    if (text.toString().contains(substring)) {
                        while (text.toString().contains(substring)) {
                            int index = text.indexOf(substring);
                            text.delete(index, index + substring.length());
                            text.insert(index, substituteString);
                        }
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", text);
    }


    private static String getOdd(StringBuilder text) {
        StringBuilder oddPositionLetters = new StringBuilder();
        for (int index = 0; index < text.length(); index++) {
            if (index % 2 != 0) {
                oddPositionLetters.append(text.charAt(index));
            }
        }
        return oddPositionLetters.toString();
    }
}


