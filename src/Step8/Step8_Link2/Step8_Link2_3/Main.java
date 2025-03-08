package Step8.Step8_Link2.Step8_Link2_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Write a Java program that uses the ReentrantLock class to synchronize access to a shared resource among multiple threads.

Напишите программу на Java, которая использует класс ReentrantLock для синхронизации доступа к общему ресурсу между несколькими потоками.
 */
public class Main {
    private static int counter = 0;
    private static final Lock lock = new ReentrantLock();

    public static void inc1() {
        for (int i = 0; i < 20000; i++) {
            lock.lock();
            try {
                counter++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void inc2() {
        for (int i = 0; i < 30000; i++) {
            lock.lock();
            try {
                counter++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(counter);
        Thread thread1 = new Thread(() -> inc1());
        Thread thread2 = new Thread(() -> inc2());

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }

}
