package fund06ObjectsAndClasses.exercises.P04ArticlesTwo;

import java.util.List;

//created by R.M.
public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    public static void printList(List<Article> articlesList) {
        for (Article article : articlesList) {
            System.out.printf("%s - %s: %s%n", article.getTitle(), article.getContent(), article.getAuthor());
        }
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