package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directoryProject = "home/wasley/dev";
        String fileTxt = "../../file.txt";
        
        Path path1 = Paths.get(directoryProject, fileTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        
        Path path2 = Paths.get("home/./wasley/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
