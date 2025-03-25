package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock reentrantReadWriteLock;

    MapReadWrite(ReentrantReadWriteLock reentrantReadWriteLock) {
        this.reentrantReadWriteLock = reentrantReadWriteLock;
    }

    public void put(String key, String value) {
        reentrantReadWriteLock.readLock().lock();
        try {
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public Set<String> allKeys() {
        reentrantReadWriteLock.readLock().lock();
        try {
            return map.keySet();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock reentrantReadWriteLock1 = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(reentrantReadWriteLock1);
        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };
        Runnable reader = () -> {
            if (reentrantReadWriteLock1.isWriteLocked()) {
                System.out.println("Write Locked!");
            }
            reentrantReadWriteLock1.readLock().lock();
            System.out.println("Finnaly I've got the damn read lock");
            try {
                System.out.println(Thread.currentThread().getName() + mapReadWrite.allKeys());
            } finally {
                reentrantReadWriteLock1.readLock().unlock();
            }
        };

        Thread thread1 = new Thread(writer);
        Thread thread2 = new Thread(reader);
        Thread thread3 = new Thread(reader);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
