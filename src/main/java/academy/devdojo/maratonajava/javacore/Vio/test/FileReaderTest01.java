package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)){
//            char[] in = new char[1000];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            }
            int i;
            while((i = fileReader.read()) != -1){
                System.out.println((char) i); // Casting for char
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
