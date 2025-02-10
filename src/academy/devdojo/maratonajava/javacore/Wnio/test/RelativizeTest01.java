package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/wasley");
        Path clazz = Paths.get("/home/wasley/dev/HelloWorld.java");
        Path pathToClass = dir.relativize(clazz);
//        System.out.println(pathToClass);
        
        Path absolute1 = Paths.get("/home/wasley");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/wasley/dev/HelloWorld.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/employees");
        
        System.out.println(absolute1.relativize(absolute3));
        System.out.println(absolute3.relativize(absolute1));
        System.out.println("---------------------------------");
        System.out.println(absolute1.relativize(absolute2));
        System.out.println(absolute2.relativize(absolute1));
        System.out.println("---------------------------------");
        System.out.println(relative1.relativize(relative2));
        
        
    }
}
