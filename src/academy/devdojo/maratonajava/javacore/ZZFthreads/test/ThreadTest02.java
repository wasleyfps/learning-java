package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExampleRunnable2 implements Runnable{
    private char c;

    public ThreadExampleRunnable2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable2('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable2('C'));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join();
        t2.start();
    }
}
