package fund06ObjectsAndClasses.exercises.P04ArticlesTwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static fund06ObjectsAndClasses.exercises.P04ArticlesTwo.Article.printList;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articlesList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article currentArticle = new Article(title, content, author);
            articlesList.add(currentArticle);
        }
        String input = scanner.nextLine();
        switch (input) {
            case "title":
                articlesList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articlesList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articlesList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        printList(articlesList);
    }
}
/*
4.	Articles 2.0
Change the program from the second problem,
so you can store a list of articles.
You will not need the methods anymore (except the ToString method).
On the first line, you will get a number n.
On the next n lines, you will get some articles in the same format as the previous task
("{title}, {content}, {author}"). Finally, you will get one of the three inputs: "title", "content", "author".
You need to order the articles alphabetically based on the command and print them sorted by the given criteria.

 */