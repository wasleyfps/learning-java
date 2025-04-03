package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();
        System.out.println(transferQueue.add("Wasley"));
        System.out.println(transferQueue.offer("Wasley"));
        System.out.println(transferQueue.offer("Wasley",10, TimeUnit.SECONDS));
        transferQueue.put("Carvalho");
        if (transferQueue.hasWaitingConsumer()){
            transferQueue.transfer("Wasley");
        }
        System.out.println(transferQueue.tryTransfer("Carvalho"));
        System.out.println(transferQueue.tryTransfer("Carvalho",5, TimeUnit.SECONDS));
        System.out.println(transferQueue.element());
        System.out.println(transferQueue.peek());
        System.out.println(transferQueue.poll());
        System.out.println(transferQueue.remove());
        System.out.println(transferQueue.take());
        System.out.println(transferQueue.remainingCapacity());
        
    }
}
