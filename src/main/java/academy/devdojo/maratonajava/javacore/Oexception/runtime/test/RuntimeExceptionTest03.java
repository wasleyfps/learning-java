package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }
    
    private static void openConnection(){
        try {
            System.out.println("Oppening connection");
            System.out.println("Writing to the database");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally close");
        }
    }
}
