package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursion();
    }
    public static void recursion(){
        recursion();
    }
}
