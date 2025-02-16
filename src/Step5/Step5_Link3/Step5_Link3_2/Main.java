package Step5.Step5_Link3.Step5_Link3_2;
/*
Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

Напишите программу на Java для создания метода,
который принимает целое число в качестве параметра и выбрасывает исключение, если число нечетное.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(method(7));
        } catch (ArithmeticException e) {
            System.out.println("перехват: неправильное число");
        } finally {
            System.out.println("Продолжаем выполнять программу");
        }
    }

    public static int method (int number) {
        if (number % 2 != 0) {
            throw new ArithmeticException("Разобрался, что это сообщение нужно для логов и разбора полётов");
        }
        return number;
    }
}
