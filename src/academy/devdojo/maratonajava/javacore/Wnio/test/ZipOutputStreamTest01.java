package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("pasta/arquivo.zip");
        Path filesToZip = Paths.get("pasta/subpasta");

    }
    private static void zip(Path fileZip, Path filesToZip) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip))) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip);
            for (Path file : directoryStream) {
                ZipEntry zipentry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipentry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println(" File created Sucess! ");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
