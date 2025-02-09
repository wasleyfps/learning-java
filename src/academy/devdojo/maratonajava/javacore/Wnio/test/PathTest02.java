package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            Path folderDirectory = Files.createDirectory(folderPath);
        }
        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");
        Path subFolderDirectory = Files.createDirectories(subFolderPath);
        Path filePath = Paths.get(subFolderDirectory.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path file = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.move(source, target);
    }
}
