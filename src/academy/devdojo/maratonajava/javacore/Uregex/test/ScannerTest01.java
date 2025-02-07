package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa, Armin, Historia, Erwin";
        System.out.println("Text: " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Splitting by comma:");
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
