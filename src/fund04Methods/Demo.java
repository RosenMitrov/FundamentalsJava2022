package fund04Methods;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> test = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("ok")){

            test.add(Integer.parseInt(input));

            input = scanner.nextLine();
        }
        Collections.reverse(test);

        System.out.println(test);
    }
}
