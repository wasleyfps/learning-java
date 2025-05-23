package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s start: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finished %d%n", Thread.currentThread().getName());
    }
}

public class ExecutorTest01 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        //executorService.execute(new Printer(1));
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        //ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.shutdown();
        executorService.isTerminated();
        System.out.println("Executor service if off");
    }
}
