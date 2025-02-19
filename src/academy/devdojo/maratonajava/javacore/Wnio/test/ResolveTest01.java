package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {

//        Path dir = Paths.get("home/wasley");
        Path file = Paths.get("dev/file.txt");
//        Path resolve = dir.resolve(file);
//        System.out.println(resolve);
        System.out.println("---------------------------------");
        
        Path absolute = Paths.get("/home/wasley");
        Path relative = Paths.get("dev");
        Path file2 = Paths.get("file.txt");
        System.out.println(absolute.resolve(relative));
        System.out.println(absolute.resolve(file2));
        System.out.println(relative.resolve(absolute));
        System.out.println(relative.resolve(file2));
        System.out.println(file2.resolve(absolute));
        System.out.println(file2.resolve(relative));
    }
}
