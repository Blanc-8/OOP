package Step8.Step8_Link2.Step8_Link2_8;

import java.util.concurrent.ConcurrentHashMap;

/*
Write a Java program demonstrating how to access a map concurrently using the ConcurrentHashMap class.

Напишите программу на Java, демонстрирующую одновременный доступ к карте с помощью класса ConcurrentHashMap.
 */
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Human, Integer> readers = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                readers.put(new Human(i, "Reader" + i), (int) (Math.random() * 10));
            }
        } );
        Thread thread3 = new Thread(() ->
        {
            for (int i = 10; i < 20; i++) {
                readers.put(new Human(i, "Reader" + i), (int) (Math.random() * 100));
            }
        } );
        Thread thread2 = new Thread(() -> {
            for (Human human : readers.keySet()) {
                System.out.println(human + " посещал библиотеку " + readers.get(human) + " раз.");
            }
        } );
        thread1.start();
        thread3.start();
        try {
            thread1.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
