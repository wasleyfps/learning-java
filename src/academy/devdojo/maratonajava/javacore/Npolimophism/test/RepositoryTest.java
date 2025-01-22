package academy.devdojo.maratonajava.javacore.Npolimophism.test;

import academy.devdojo.maratonajava.javacore.Npolimophism.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimophism.services.RepositoryMemory;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryMemory();
        repository.save();
        List<String> list = new ArrayList<>();
        list.add("Wasley");
        list.add("DevDojo");
        list.add("Carvalho");
        System.out.println(list);
    }
}
