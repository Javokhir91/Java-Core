package ru.homeWork5;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteNumbersToFile {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 1, 0, 2, 2, 1, 0};

        try (OutputStream os = new FileOutputStream("numbers.bin")) {
            for (int i = 0; i < numbers.length; i++) {
                os.write(numbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
