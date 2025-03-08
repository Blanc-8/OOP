package Step8.Step8_Link1.Step8_Link1_1;
/*
Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.

Напишите Java-программу для создания базового Java-потока, который при выполнении печатает «Hello, World!».
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        }).start();
    }
}
