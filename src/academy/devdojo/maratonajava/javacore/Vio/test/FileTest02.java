package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean fileDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Directory created? " + fileDirectoryCreated);
        
        File fileDirectories = new File("C:\\Users\\wasle\\Documents\\GitHub\\learning-java\\folder\\file.txt");
        boolean isFileCreated = fileDirectories.createNewFile();
        System.out.println("File Created ?" + isFileCreated);
        
        File fileRenamed = new File(fileDirectory, "file_renamed.txt");
        boolean renamed = fileDirectories.renameTo(fileRenamed);
        System.out.println("File Renamed ?" + renamed);
        
        File directoryRenamed = new File("folder2");
        boolean directoryRenamedCreated = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Folder Renamed ?" + directoryRenamedCreated);
    }
}
