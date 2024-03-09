package ru.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CreateFile {
    public static void openFile(String filePath, String text){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            java.time.LocalDate currentDate = LocalDate.now();
            bufferWriter.write(currentDate + "-> ");
            bufferWriter.write(text);
            bufferWriter.write("\n");
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}
