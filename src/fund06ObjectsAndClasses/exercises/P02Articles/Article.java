package fund06ObjectsAndClasses.exercises.P02Articles;

import java.util.Scanner;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void nLinesCommands(Scanner scanner, Article article) {
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(": ");
            String command = data[0];
            String infoToChange = data[1];
            changeValue(article, command, infoToChange);
        }
    }

    private static void changeValue(Article article, String command, String infoToChange) {
        switch (command) {
            case "Edit":
                article.setContent(infoToChange);
                break;
            case "ChangeAuthor":
                article.setAuthor(infoToChange);
                break;
            case "Rename":
                article.setTitle(infoToChange);
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
/*
2.	Articles
Create an article class with the following properties:
•	Title – a string
•	Content – a string
•	Author – a string
The class should have a constructor and the following methods:
•	Edit (new content) – change the old content with the new one
•	ChangeAuthor (new author) – change the author
•	Rename (new title) – change the title of the article
•	override ToString – print the article in the following format:
"{title} - {content}: {author}"
Write a program that reads an article in the following format "{title}, {content}, {author}".
On the next line, you will get a number n.
On the next n lines,
you will get one of the following commands:
"Edit: {new content}"; "ChangeAuthor: {new author}"; "Rename: {new title}".
At the end, print the final article.

 */