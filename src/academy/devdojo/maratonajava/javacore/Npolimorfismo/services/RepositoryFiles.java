package academy.devdojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryFiles implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in files");
    }
}
