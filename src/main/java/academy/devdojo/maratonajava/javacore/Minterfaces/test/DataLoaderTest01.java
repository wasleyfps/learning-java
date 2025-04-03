package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

import javax.xml.crypto.Data;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();
        
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();        
    }
}
