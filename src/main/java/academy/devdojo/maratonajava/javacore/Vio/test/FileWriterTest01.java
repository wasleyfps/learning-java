package academy.devdojo.maratonajava.javacore.Vio.test;
// File
// FileWriter
// BufferedWriter
// PrintWriter
// FileReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fileWriter = new FileWriter(file, true);) {
            fileWriter.write("Writing data to a file\nAnd another line");
            fileWriter.flush();
            System.out.println("File created successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
