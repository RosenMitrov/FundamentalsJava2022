package basicSyntaxConditionalStatementsLoops.lab;

//created by R.M.
public class Fun08DivisibleBy3_2 {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;
        while (start < end) {
            if (start % 3 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
