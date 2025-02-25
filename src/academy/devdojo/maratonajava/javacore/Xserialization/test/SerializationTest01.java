package academy.devdojo.maratonajava.javacore.Xserialization.test;

import academy.devdojo.maratonajava.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Wasley Carvalho", "123456");
        serialization(student);
        unrealize();
    }
    
    private static void serialization(Student student){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutput oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e){
            e.printStackTrace();
        };
    }

    private static void unrealize(){
        Path path = Paths.get("pasta/subpasta");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
//            Student student = (Student) objectInputStream.readObject();
        } catch(IOException | ClassCastException e){
            e.printStackTrace();
        }
    }
}
