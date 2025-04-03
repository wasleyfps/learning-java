package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Last Modified: " + Instant.ofEpochMilli(file.lastModified()));
            System.out.println("Last Modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            System.out.println("Can read: " + file.canRead());
            
            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
