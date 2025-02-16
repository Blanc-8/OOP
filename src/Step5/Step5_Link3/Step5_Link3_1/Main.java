package Step5.Step5_Link3.Step5_Link3_1;
/*
Write a Java program that throws an exception and catch it using a try-catch block.

Напишите программу на Java, которая выбрасывает исключение и перехватывает его с помощью блока try-catch.
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println("Результат" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Перехватили" + e.getMessage());
        } finally {
            System.out.println("Продолжаем выполнять программу");
        }

    }
}
