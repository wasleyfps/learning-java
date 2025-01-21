package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.RepositoryDataBase;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.RepositoryFiles;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.RepositoryMemory;

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
