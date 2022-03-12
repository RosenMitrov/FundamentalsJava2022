package fund08TextProcessing.exercises;

import java.util.Scanner;

//created by R.M.
public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int indexFile = input.lastIndexOf("\\") + 1;
        int indexExtension = input.lastIndexOf(".") + 1;
        String fileName = input.substring(indexFile, indexExtension - 1);
        String extension = input.substring(indexExtension);


        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
/*
3.	Extract File
Write a program that reads the path to a file and subtracts the file name and its extension.

 */