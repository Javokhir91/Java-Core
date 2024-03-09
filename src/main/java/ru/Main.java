package ru;

import ru.example.CreateFile;


import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {
        String filePath = "/Users/macjava/Desktop/untitled/src/main/java/ru/example.txt";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите заметку:");
        String text = scanner.nextLine();

        CreateFile.openFile(filePath, text);

    }
}