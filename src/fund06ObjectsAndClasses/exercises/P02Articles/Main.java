package fund06ObjectsAndClasses.exercises.P02Articles;

import java.util.Scanner;

import static fund06ObjectsAndClasses.exercises.P02Articles.Article.nLinesCommands;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(", ");
        String title = inputArray[0];
        String content = inputArray[1];
        String author = inputArray[2];
        Article article = new Article(title, content, author);
        nLinesCommands(scanner, article);
        System.out.println(article);


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