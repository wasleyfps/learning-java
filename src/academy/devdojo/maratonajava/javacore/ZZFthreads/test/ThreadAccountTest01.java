package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Wasley");
        Thread t2 = new Thread(threadAccountTest01, "Saitama");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("F");
            }
        }
    }
    private static void print(){
        synchronized (ThreadAccountTest01.class){
            System.out.println(Thread.currentThread().getName());
        }
    }
    
    public void withdrawal(int amount){
        System.out.println("******* Outside Synchronized " + Thread.currentThread().getName());
        synchronized (account) {
            System.out.println("******* Inside Synchronized " + Thread.currentThread().getName());
            
            if (account.getBalance() >= 10) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw money ");
                account.withdrawal(amount);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " Completed the Withdrawal, Current Value: " + account.getBalance());
            } else {
                System.out.println("No money for " + Thread.currentThread().getName() + " make the withdrawal " + account.getBalance());
            }
        }
    }
}
