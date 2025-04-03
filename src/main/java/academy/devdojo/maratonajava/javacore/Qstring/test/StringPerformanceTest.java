package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();
        System.out.println("Time spent on string  " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent on stringBuilder  " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent on stringBuffer  " + (end - start) + "ms");
    }
    
    private static void concatString(int size) {
        String text = "";
        for(int i = 0; i < size; i++) {
            text += i;
        }
    }
    
    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for(int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer sbuffer = new StringBuffer(size);
        for(int i = 0; i < size; i++) {
            sbuffer.append(i);
        }
    }
}
