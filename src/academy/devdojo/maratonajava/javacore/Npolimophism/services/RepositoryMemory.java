package academy.devdojo.maratonajava.javacore.Npolimophism.services;

import academy.devdojo.maratonajava.javacore.Npolimophism.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
