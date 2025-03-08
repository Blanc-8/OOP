package Step8.Step8_Link1.Step8_Link1_2;
/*
Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

Напишите программу на Java, которая создает два потока для поиска и печати четных и нечетных чисел от 1 до 20.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Object monitor = new Object();

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            integers.add(i);
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i : integers) {
                        if (i % 2 == 0) {
                            System.out.println("четное - " + i);
                           monitor.notifyAll();
                        } else {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i : integers) {
                        if (i % 2 == 1) {
                            System.out.println("НЕчётное - " + i);
                           monitor.notifyAll();
                        } else {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        }).start();

    }
}
