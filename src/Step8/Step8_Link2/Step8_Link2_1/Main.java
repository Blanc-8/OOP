package Step8.Step8_Link2.Step8_Link2_1;

import java.util.concurrent.atomic.AtomicInteger;

/*
Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.

Напишите программу на Java для создания и запуска нескольких потоков, которые одновременно увеличивают общую переменную-счетчик.
 */
public class Main {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void inc1() {
        for (int i = 0; i < 20000; i++) {
            counter.incrementAndGet();
        }
    }

    public static void inc2() {
        for (int i = 0; i < 30000; i++) {
            counter.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        System.out.println(counter.get());
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
        System.out.println(counter.get());
    }


}
