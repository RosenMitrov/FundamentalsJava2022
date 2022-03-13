package fund08TextProcessing.moreExercises;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titleAnArticle = scanner.nextLine();
        String contentArticle = scanner.nextLine();
        String comment = scanner.nextLine();
        System.out.printf("<h1>%n   %s%n</h1>%n", titleAnArticle);
        System.out.printf("<article>%n   %s%n</article>%n", contentArticle);

        while (!comment.equals("end of comments")) {
            System.out.printf("<div>%n   %s%n</div>%n", comment);
            comment = scanner.nextLine();
        }
    }
}
