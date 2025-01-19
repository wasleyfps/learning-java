package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    // This class must implement the method load() from DataLoader interface
    
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }
    
    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }
    
    @Override
    public void checkPermission() {
        System.out.println("Checking permission in database");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Max data size in class DataBaseLoader: " + MAX_DATA_SIZE);
    }
}
