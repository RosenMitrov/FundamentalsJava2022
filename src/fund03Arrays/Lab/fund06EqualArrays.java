
package fund03Arrays.Lab;
import java.util.Scanner;

public class fund06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        boolean isIdentical = true;
        int diffIndex = -1;
        int sum = 0;
        for (int i = 0; i < firstArr.length; i++) {
            String first = firstArr[i];
            String second = secondArr[i];
            if (!first.equals(second)) {
                isIdentical = false;
                diffIndex = i;
                break;
            }
            sum += Integer.parseInt(first);

        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
/*
6.	Equal Arrays
Read two arrays and print on the console whether they are identical or not.
Arrays are identical if their elements are equal.
If the arrays are identical find the sum of the first one and print on the console the following message:
"Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ and print on the console following message:
"Arrays are not identical. Found difference at {index} index."

 */
