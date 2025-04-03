package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    
    public static final int MAX_DATA_SIZE = 10;
    
    
    public abstract void load();
    public abstract void remove();
    
    default void checkPermission(){
        System.out.println("Checking permission");
    }
    
    public static void retrieveMaxDataSize(){
        System.out.println("Max data size is: " + MAX_DATA_SIZE);
    }
    
    
}
