package academy.devdojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in database");
    }
}
