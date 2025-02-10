package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
//        BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10);
        File file = new File("folder2/new.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder2/new_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(dateTime.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
