package academy.devdojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
