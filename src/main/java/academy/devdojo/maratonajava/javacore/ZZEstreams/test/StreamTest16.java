package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.security.PrivateKey;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        longFor(num);
        sumStreamIterate(num);
        sumParallelsumStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }
    
    private static void longFor(long num){
        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + "  " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        
        long end = System.currentTimeMillis();
        System.out.println(result + "  " + (end - init) + "ms");
    }
    
    private static void sumParallelsumStreamIterate(long num){
        System.out.println("sum sumParallelsumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + "  " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("sum sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + "  " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num){
        System.out.println("sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + "  " + (end - init) + "ms");
    }
}
