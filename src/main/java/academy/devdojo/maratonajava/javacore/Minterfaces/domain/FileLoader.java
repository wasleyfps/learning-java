package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    // This class must implement the method load() from DataLoader interface
    
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file");
    }
    
    @Override
    public void checkPermission() {
        System.out.println("Checking permission in file");
    }
}
