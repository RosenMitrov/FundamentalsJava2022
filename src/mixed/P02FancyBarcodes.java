package mixed;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regexBarcode = "(@#+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        String regexDigits = "\\d";

        Pattern patternBarcode = Pattern.compile(regexBarcode);
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Matcher matcherBarcode = patternBarcode.matcher(line);

            StringBuilder groupNumber = new StringBuilder();
            if (matcherBarcode.find()) {
                String barcodeCurrent = matcherBarcode.group("barcode");

                Pattern patternDigits = Pattern.compile(regexDigits);
                Matcher matcherDigits = patternDigits.matcher(barcodeCurrent);
                if (matcherDigits.find()) {
                    matcherDigits = patternDigits.matcher(barcodeCurrent);
                    while (matcherDigits.find()) {
                        int currentDigit = Integer.parseInt(matcherDigits.group());
                        groupNumber.append(currentDigit);
                    }
                } else {
                    groupNumber.append("00");
                }
                System.out.printf("Product group: %s%n", groupNumber);
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
