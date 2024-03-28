package ru.homeWork5;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadNumbersFromFile {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("numbers.bin")) {
            int data;

            while ((data = is.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
