package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private final Lock lock = new ReentrantLock(true);
    
    void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        } finally {
            lock.unlock();
        }
    }
    
    int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
    Thread thread = new Thread(r);
    Thread thread1 = new Thread(r);
    thread.start();
    thread1.start();
    thread.join();
    thread1.join();
    System.out.println(counter.getCount());
    System.out.println(counter.getAtomicInteger());
    }
    
}
