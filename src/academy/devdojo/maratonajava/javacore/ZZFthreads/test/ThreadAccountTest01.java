package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();
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

    public void withdrawal(int amount){
        if (account.getBalance() >= 10) {
            System.out.println(Thread.currentThread().getName() + " Cash Out ");
            account.withdrawal(amount);
            System.out.println(Thread.currentThread().getName() + " Completed the Withdrawal, Current Value: " + account.getBalance());
        } else {
            System.out.println("No money for " + Thread.currentThread().getName() + " make the withdrawal " + account.getBalance());
        }
    }
}
