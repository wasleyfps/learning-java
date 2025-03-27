package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Wasley");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }
}
